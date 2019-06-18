package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SeedTab extends CreativeTabs{
	public SeedTab(String label){
		super("seedtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(VanillaEvolutionItems.blueberry_seed);
	}

}
