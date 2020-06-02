package com.evep.evepmod.items;

import java.util.List;

import javax.annotation.Nonnull;

import org.lwjgl.input.Keyboard;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.util.handlers.GuiHandler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemNote extends Item{
	
	public ItemNote(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return stack.getMetadata() == 0 ? EnumRarity.UNCOMMON : EnumRarity.EPIC;
	    }
	 
//	    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
//	        if (worldIn.isRemote) {
//	            playerIn.openGui(VanillaEvolutionMod.instance, 0, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
//	        }
//	        return itemStackIn;
//	    }
	 
	 public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	    {
	        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
	        {
	        	tooltip.add("The " + "\u00A7e" + "Dwarves" + "\u00A77" + " discovered how to travel to another dimension.");
	        	tooltip.add("They call their device the " + "\u00A74" + "Dwarven Portal Block" + "\u00A77" + ". It can be fabricated with 8 Earth Blocks and an Earth Locket.");
	        	tooltip.add("Another device known as the " + "\u00A74" + "Block of Return" + "\u00A77" + " allows the user to return to the Overworld.");
	        	tooltip.add("These teleporters are very innaccurate and may teleport the user into blocks. They are most effective at y=28.");
	        	
	        }
	        else
	        {
	            tooltip.add("Obtainable by crafting an Earth Locket");
	            tooltip.add("Hold " + "\u00A74" + "Shift" + "\u00A77" + " for More Information"); //"\u00A7e" is a color code
	        }
	    }
}
