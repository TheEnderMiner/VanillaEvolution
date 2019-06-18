package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HeroTab extends CreativeTabs{
	public HeroTab(String label){
		super("herotab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(VanillaEvolutionItems.infinity_gauntlet);
	}

}
