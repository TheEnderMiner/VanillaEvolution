package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BuildingTab extends CreativeTabs{
	public BuildingTab(String label){
		super("buildingtab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(VanillaEvolutionBlocks.marble_bricks));
	}

}
