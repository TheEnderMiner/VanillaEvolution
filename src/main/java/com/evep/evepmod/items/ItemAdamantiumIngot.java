package com.evep.evepmod.items;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAdamantiumIngot extends Item{
	
	public ItemAdamantiumIngot(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
//	@Override
//	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
//	{
//	     super.addInformation(stack, worldIn, tooltip, flagIn);
//
//	     tooltip.add("Almost unbreakable");
//	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("Almost Unbreakable");
        }
        else
        {
            tooltip.add("Hold " + "\u00A7e" + "Shift" + "\u00A77" + " for More Information"); //"\u00A7e" is a color code
        }
    }

}
