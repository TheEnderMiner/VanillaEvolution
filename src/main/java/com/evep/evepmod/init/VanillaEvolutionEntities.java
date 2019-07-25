package com.evep.evepmod.init;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityFrostZombie;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class VanillaEvolutionEntities {
	
	public static void registerEntities(){
		registerEntities("frost_zombie", EntityFrostZombie.class, VanillaEvolutionMod.ENTITY_FROST_ZOMBIE, 75, 3112322, 53376);
		//registerEntities("lizard", EntityLizard.class, VanillaEvolutionMod.ENTITY_LIZARD, 50, 16777199, 8519424);
	}
	
	private static void registerEntities(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
		EntityRegistry.registerModEntity(new ResourceLocation(VanillaEvolutionMod.MODID + ":" + name), entity, name, id, VanillaEvolutionMod.instance, range, 1, true, color1, color2);
	}
}
