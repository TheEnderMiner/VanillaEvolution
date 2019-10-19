package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	
	public static SoundEvent ENTITY_FROZEN_ZOMBIE_AMBIENT, ENTITY_FROZEN_ZOMBIE_HURT, ENTITY_FROZEN_ZOMBIE_DEATH, ENTITY_ARID_SKELETON_AMBIENT, ENTITY_ARID_SKELETON_DEATH, ENTITY_ARID_SKELETON_HURT, ENTITY_BEAST_AMBIENT, ENTITY_BEAST_DEATH, ENTITY_BEAST_HURT;
	
	public static void registerSounds(){
		ENTITY_FROZEN_ZOMBIE_AMBIENT = registerSound("entity.frozen_zombie.ambient");
		ENTITY_FROZEN_ZOMBIE_HURT = registerSound("entity.frozen_zombie.hurt");
		ENTITY_FROZEN_ZOMBIE_DEATH = registerSound("entity.frozen_zombie.death");
		
		ENTITY_ARID_SKELETON_AMBIENT = registerSound("entity.arid_skeleton.ambient");
		ENTITY_ARID_SKELETON_HURT = registerSound("entity.arid_skeleton.hurt");
		ENTITY_ARID_SKELETON_DEATH = registerSound("entity.arid_skeleton.death");
		
		ENTITY_BEAST_AMBIENT = registerSound("entity.beast.ambient");
		ENTITY_BEAST_HURT = registerSound("entity.beast.hurt");
		ENTITY_BEAST_DEATH = registerSound("entity.beast.death");
	}
	
	private static SoundEvent registerSound(String name){
		ResourceLocation location = new ResourceLocation(VanillaEvolutionMod.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
