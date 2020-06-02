package com.evep.evepmod.items;

import java.util.List;

import com.evep.evepmod.entity.EntityFrostZombie;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemImmjiriTear extends Item{

	public ItemImmjiriTear(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setMaxDamage(1);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("\u00A74" + "The Lord of Darkness grows sad at the death of his Champion");
	}
	
	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return stack.getMetadata() == 0 ? EnumRarity.UNCOMMON : EnumRarity.EPIC;
	    }
	 

}
