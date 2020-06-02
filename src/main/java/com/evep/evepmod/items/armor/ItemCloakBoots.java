package com.evep.evepmod.items.armor;

import java.util.List;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.items.models.ModelCloakBoots;
import com.evep.evepmod.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCloakBoots extends ItemArmor implements IHasModel{

	public ItemCloakBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		
		VanillaEvolutionItems.ITEMS.add(this);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack){
		return stack.getItem() == VanillaEvolutionItems.dusk_cloth;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("Depressing. Despondent. Woeful. Other synonyms for sad."));
		tooltip.add(I18n.format("Gives you Speed."));

	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		{
			if(player.inventory.armorInventory.get(0) != null)
			{
				{
					if(player.inventory.armorInventory.get(0).getItem() == VanillaEvolutionItems.cloak_boots)
					{
						player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2*20, 0));
					}
				}
			  }
			}
		}

	@Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerModel(this, 0);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		if(itemStack != ItemStack.EMPTY){
			if(itemStack.getItem() instanceof ItemArmor){
				ModelCloakBoots model = new ModelCloakBoots();
						
				model.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.FEET;
				model.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.FEET;
				
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.leftArmPose = _default.leftArmPose;
				model.rightArmPose = _default.rightArmPose;
				
				return model;
			}
		}
		return null;
	}

}
