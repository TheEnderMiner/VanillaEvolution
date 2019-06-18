package com.evep.evepmod.items.tools;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class ItemMalachiteAxe extends ItemAxe{
	
	public ItemMalachiteAxe(String name, ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack){
		return stack.getItem() == VanillaEvolutionItems.malachite_ingot;
	}
	
	

}
