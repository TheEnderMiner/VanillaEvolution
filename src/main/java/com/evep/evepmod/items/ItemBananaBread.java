package com.evep.evepmod.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBananaBread extends ItemCustomFood {

	public ItemBananaBread(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 30*20, 0, false, true));
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("Tastes like bananas, except much sweeter!");
	}

}
