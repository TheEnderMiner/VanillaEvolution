package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs{
	public BlocksTab(String label){
		super("blockstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(VanillaEvolutionBlocks.selenite_block));
	}

}
