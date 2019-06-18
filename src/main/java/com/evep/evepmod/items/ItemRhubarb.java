package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRhubarb extends ItemCustomFood {

	public ItemRhubarb(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("Don't eat the leaves!");
	}

}
