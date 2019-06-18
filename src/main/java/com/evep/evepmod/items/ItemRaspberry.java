package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRaspberry extends ItemCustomFood {

	public ItemRaspberry(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("Can't be made into a pi");
	}

}
