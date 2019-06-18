package com.evep.evepmod.tabs;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OresTab extends CreativeTabs{
	public OresTab(String label){
		super("orestab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(VanillaEvolutionBlocks.amethyst_ore));
	}


}
