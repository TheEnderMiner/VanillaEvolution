package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SuperTab extends CreativeTabs{
	public SuperTab(String label){
		super("supetab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(VanillaEvolutionItems.sugared_flesh);
	}

}
