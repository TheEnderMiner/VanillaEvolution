package com.evep.evepmod.items.armor;

import java.util.List;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.IHasModel;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEnergeticArmor extends ItemArmor implements IHasModel{

	public ItemEnergeticArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		
		VanillaEvolutionItems.ITEMS.add(this);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack){
		return stack.getItem() == VanillaEvolutionItems.energetic_orb;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("A suit powered with pure energy"));

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		{
			if(player.inventory.armorInventory.get(0).getItem() == VanillaEvolutionItems.energetic_boots)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 12*20, 1));
			}
			{
				if(player.inventory.armorInventory.get(1).getItem() == VanillaEvolutionItems.energetic_leggings)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 12*20, 1));
				}
			}
			{
				if(player.inventory.armorInventory.get(2).getItem() == VanillaEvolutionItems.energetic_chestplate)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 12*20, 0));
				}
			}
			{
				if(player.inventory.armorInventory.get(3).getItem() == VanillaEvolutionItems.energetic_helmet)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 12*20, 0));
				}
			}
		  }
		if(player.inventory.armorInventory.get(0) != null &&
				player.inventory.armorInventory.get(1) != null && 
				player.inventory.armorInventory.get(2) != null &&
				player.inventory.armorInventory.get(3) != null)
			{
				if(player.inventory.armorInventory.get(0).getItem() == VanillaEvolutionItems.energetic_boots &&
					player.inventory.armorInventory.get(1).getItem() == VanillaEvolutionItems.energetic_leggings && 
					player.inventory.armorInventory.get(2).getItem() == VanillaEvolutionItems.energetic_chestplate &&
					player.inventory.armorInventory.get(3).getItem() == VanillaEvolutionItems.energetic_helmet)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 12*20, 0));
				}
			  }
			}
	
	@Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerModel(this, 0);
		
	}

}
