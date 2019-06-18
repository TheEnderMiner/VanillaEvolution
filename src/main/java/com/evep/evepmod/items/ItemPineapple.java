package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPineapple extends ItemCustomFood {

	public ItemPineapple(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("Could be a house, if it were under the sea");
	}

}
