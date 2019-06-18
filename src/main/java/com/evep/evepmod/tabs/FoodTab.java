package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FoodTab extends CreativeTabs{
	public FoodTab(String label){
		super("foodtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(VanillaEvolutionItems.blueberry);
	}

}
