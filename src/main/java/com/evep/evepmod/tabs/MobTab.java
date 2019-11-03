package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MobTab extends CreativeTabs{
	public MobTab(String label){
		super("mobtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(VanillaEvolutionItems.pulsating_shard);
	}

}
