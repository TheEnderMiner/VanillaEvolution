package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	
	public static SoundEvent ENTITY_FROZEN_ZOMBIE_AMBIENT, ENTITY_FROZEN_ZOMBIE_HURT, ENTITY_FROZEN_ZOMBIE_DEATH;
	
	public static void registerSounds(){
		ENTITY_FROZEN_ZOMBIE_AMBIENT = registerSound("entity.frozen_zombie.ambient");
		ENTITY_FROZEN_ZOMBIE_HURT = registerSound("entity.frozen_zombie.hurt");
		ENTITY_FROZEN_ZOMBIE_DEATH = registerSound("entity.frozen_zombie.death");
	}
	
	private static SoundEvent registerSound(String name){
		ResourceLocation location = new ResourceLocation(VanillaEvolutionMod.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
