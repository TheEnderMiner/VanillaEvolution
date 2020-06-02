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

public class ItemProminentArmor extends ItemArmor implements IHasModel{

	public ItemProminentArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		
		VanillaEvolutionItems.ITEMS.add(this);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack){
		return stack.getItem() == VanillaEvolutionItems.magnetite_ingot;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("A prominent suit that has many effects!"));

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		{
			if(player.inventory.armorInventory.get(0).getItem() == VanillaEvolutionItems.pexosuit_boots)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 1));
			}
			{
				if(player.inventory.armorInventory.get(1).getItem() == VanillaEvolutionItems.pexosuit_leggings)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 10, 1));
				}
			}
			{
				if(player.inventory.armorInventory.get(2).getItem() == VanillaEvolutionItems.pexosuit_chestplate)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 0));
				}
			}
			{
				if(player.inventory.armorInventory.get(3).getItem() == VanillaEvolutionItems.pexosuit_helmet)
				{
					player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1000, 0));
				}
			}
		  }
		}
	
	@Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerModel(this, 0);
		
	}

}
