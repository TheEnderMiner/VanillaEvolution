package com.evep.evepmod.init;

import com.evep.evepmod.potions.PotionMinotaur;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class VanillaEvolutionPotions {
	
	public static final Potion MINOTAUR_EFFECT = new PotionMinotaur("minotaur", false, 1612799, 1, 0).registerPotionAttributeModifier(SharedMonsterAttributes.ATTACK_SPEED, MathHelper.getRandomUUID().toString(), 1.0D, 2);
//	public static final Potion FLIGHT_EFFECT = new PotionMinotaur("flight", false, 1612799, 1, 0).registerPotionAttributeModifier(player.capabilities.allowFlying = true, MathHelper.getRandomUUID().toString(), 1.0D, 2);
	//7077930
	public static final PotionType MINOTAUR = new PotionType("minotaur", new PotionEffect[] {new PotionEffect(MINOTAUR_EFFECT, 120*20)}).setRegistryName("minotaur");
	public static final PotionType LONG_MINOTAUR = new PotionType("minotaur", new PotionEffect[] {new PotionEffect(MINOTAUR_EFFECT, 240*20)}).setRegistryName("long_minotaur");
	
	public static void registerPotions(){
		registerPotion(MINOTAUR, LONG_MINOTAUR, MINOTAUR_EFFECT);
		
		registerPotionMixes();
	}
	
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect){
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
	
	private static void registerPotionMixes(){
		PotionHelper.addMix(MINOTAUR, Items.REDSTONE, LONG_MINOTAUR);
		PotionHelper.addMix(PotionTypes.AWKWARD, VanillaEvolutionItems.minotaur_horn, MINOTAUR);
	}

}
