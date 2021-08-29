package com.evep.evepmod.items.tools;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemLightning extends ItemSword{

	public ItemLightning(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}
	
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
		final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

		if (slot == EntityEquipmentSlot.MAINHAND) {
			replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, 1);
			replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 1.1);
		}

		return modifiers;
	}
	private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id, double multiplier) {
		// Get the modifiers for the specified attribute
		final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());

		// Find the modifier with the specified ID, if any
		final Optional<AttributeModifier> modifierOptional = modifiers.stream().filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();

		if (modifierOptional.isPresent()) { // If it exists,
			final AttributeModifier modifier = modifierOptional.get();
			modifiers.remove(modifier); // Remove it
			modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier, modifier.getOperation())); // Add the new modifier
		}
	}
	
//	@Override
//	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
//		ItemStack item = playerIn.getHeldItem(handIn);
//		Vec3d aim = playerIn.getLookVec();
//		EntityLightningBolt lightning = new EntityLightningBolt(worldIn, 5, 0, 0, true);
//		
//		lightning.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 1D, playerIn.posZ + aim.z * 1.5D);
//		worldIn.spawnEntity(lightning);
//		item.damageItem(1, playerIn);
//		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
//	}
	
	 @Override
	    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
	        ItemStack stack = player.getHeldItem(hand);
	        Vec3d pos = new Vec3d(player.posX, player.posY + player.getEyeHeight(), player.posZ);
	        Vec3d look = player.getLook(1);
	        Vec3d vec32 = pos.addVector(look.x * 100, look.y * 100, look.z * 100);
	        RayTraceResult result = player.world.rayTraceBlocks(pos, vec32, false, false, true);

	        double i = result.getBlockPos().getX();
	        double j = result.getBlockPos().getY();
	        double k = result.getBlockPos().getZ();

	        if (world.getBlockState(result.getBlockPos()) != null) {
	            world.spawnEntity(new EntityLightningBolt(world, i, j, k, false));
	            if (!player.capabilities.isCreativeMode) {
	                stack.damageItem(1, player);
	            }
	        }

	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	    }

}
