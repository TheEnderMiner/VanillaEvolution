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
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemJediArmor extends ItemArmor implements IHasModel{

	public ItemJediArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		
		VanillaEvolutionItems.ITEMS.add(this);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

	//	tooltip.add(I18n.format("Embrace the Order and Power of the Light Side"));
		tooltip.add(I18n.format("Robes of a Master of the Force"));
		tooltip.add(I18n.format("Full Set Bonus: Jump Boost III, Speed I, & Regeneration I"));

	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		if(player.inventory.armorInventory.get(0) != null &&
			player.inventory.armorInventory.get(1) != null && 
			player.inventory.armorInventory.get(2) != null &&
			player.inventory.armorInventory.get(3) != null)
		{
			if(player.inventory.armorInventory.get(0).getItem() == VanillaEvolutionItems.jedi_boots &&
				player.inventory.armorInventory.get(1).getItem() == VanillaEvolutionItems.jedi_leggings && 
				player.inventory.armorInventory.get(2).getItem() == VanillaEvolutionItems.jedi_chestplate &&
				player.inventory.armorInventory.get(3).getItem() == VanillaEvolutionItems.jedi_helmet)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 12*20, 2));
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 12*20, 0));
				player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 12*20, 0));
			}
		  }
		if(player.inventory.armorInventory.get(0) != null &&
				player.inventory.armorInventory.get(1) != null && 
				player.inventory.armorInventory.get(2) != null &&
				player.inventory.armorInventory.get(3) != null)
			{
				if(player.inventory.armorInventory.get(0).getItem() == VanillaEvolutionItems.sith_boots &&
					player.inventory.armorInventory.get(1).getItem() == VanillaEvolutionItems.sith_leggings && 
					player.inventory.armorInventory.get(2).getItem() == VanillaEvolutionItems.sith_chestplate &&
					player.inventory.armorInventory.get(3).getItem() == VanillaEvolutionItems.sith_helmet)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 12*20, 2));
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 12*20, 0));
					player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 12*20, 0));
				}
			  }
		}
	
	@Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerModel(this, 0);
		
	}

}
