package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemUltrafood extends ItemCustomFood {

	public ItemUltrafood(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("A food that replenishes your hunger completely");
	     tooltip.add("It also saturates you for quite a while");
	}

	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return stack.getMetadata() == 0 ? EnumRarity.UNCOMMON : EnumRarity.EPIC;
	    }
	
}
