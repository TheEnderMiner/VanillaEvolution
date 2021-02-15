package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAncientLocket extends Item{
	
	public ItemAncientLocket(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("Could harness near infinite power");
	     tooltip.add("Can be mined or looted from the Lord of Knowledge");
	}
	
	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return stack.getMetadata() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;
	    }
}
