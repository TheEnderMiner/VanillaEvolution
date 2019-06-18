package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEggplant extends ItemCustomFood {

	public ItemEggplant(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("It may not be an egg, but it is a plant!");
	}

}
