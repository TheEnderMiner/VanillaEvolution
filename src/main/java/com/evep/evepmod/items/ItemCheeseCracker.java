package com.evep.evepmod.items;

import java.util.List;

import com.evep.evepmod.init.VanillaEvolutionPotions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCheeseCracker extends ItemCustomFood {

	public ItemCheeseCracker(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5*20, 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 10*20, 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 20*20, 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 15*20, 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10*20, 0, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10*20, 0, false, true));
			player.addPotionEffect(new PotionEffect(VanillaEvolutionPotions.MINOTAUR_EFFECT, 12*20, 0, false, true));
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("Subscribe to Mr. Crayfish");
	}

}
