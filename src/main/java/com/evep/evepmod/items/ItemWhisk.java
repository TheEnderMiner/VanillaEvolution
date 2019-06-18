package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWhisk extends Item{
	
	public ItemWhisk(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("A tool for making food");
	     tooltip.add("Returns Steel Ingot after crafting");
	}

}
