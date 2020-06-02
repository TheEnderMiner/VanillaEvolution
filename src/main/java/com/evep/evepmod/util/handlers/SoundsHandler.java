package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	
	public static SoundEvent 
	ENTITY_FROZEN_ZOMBIE_AMBIENT, ENTITY_FROZEN_ZOMBIE_HURT, ENTITY_FROZEN_ZOMBIE_DEATH, 
	ENTITY_ARID_SKELETON_AMBIENT, ENTITY_ARID_SKELETON_DEATH, ENTITY_ARID_SKELETON_HURT, 
	ENTITY_BEAST_AMBIENT, ENTITY_BEAST_DEATH, ENTITY_BEAST_HURT, 
	ENTITY_TURKEY_AMBIENT, ENTITY_TURKEY_DEATH, ENTITY_TURKEY_HURT, 
	ENTITY_KRAMPUS_AMBIENT, ENTITY_KRAMPUS_DEATH, ENTITY_KRAMPUS_HURT, 
	ENTITY_CACTUS_BUG_AMBIENT, ENTITY_CACTUS_BUG_DEATH, ENTITY_CACTUS_BUG_HURT, 
	ENTITY_BASILISK_AMBIENT, ENTITY_BASILISK_DEATH, ENTITY_BASILISK_HURT,
	ENTITY_MINOTAUR_AMBIENT, ENTITY_MINOTAUR_DEATH, ENTITY_MINOTAUR_HURT,
	ENTITY_DWARF_AMBIENT, ENTITY_DWARF_DEATH, ENTITY_DWARF_HURT,
	ENTITY_DWARVEN_GOLEM_AMBIENT, ENTITY_DWARVEN_GOLEM_DEATH, ENTITY_DWARVEN_GOLEM_HURT,
	ENTITY_WINTER_SQUIRE_AMBIENT, ENTITY_WINTER_SQUIRE_DEATH, ENTITY_WINTER_SQUIRE_HURT,
	ENTITY_LION_AMBIENT, ENTITY_LION_DEATH, ENTITY_LION_HURT, ENTITY_LION_SHED,
	ENTITY_DIREWOLF_AMBIENT, ENTITY_DIREWOLF_DEATH, ENTITY_DIREWOLF_HURT,
	ENTITY_IMMJIRI_CHAMPION_AMBIENT, ENTITY_IMMJIRI_CHAMPION_DEATH, ENTITY_IMMJIRI_CHAMPION_HURT,
	ENTITY_EARTH_GUARDIAN_AMBIENT, ENTITY_EARTH_GUARDIAN_DEATH, ENTITY_EARTH_GUARDIAN_HURT;
	
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
		
		ENTITY_TURKEY_AMBIENT = registerSound("entity.turkey.ambient");
		ENTITY_TURKEY_HURT = registerSound("entity.turkey.hurt");
		ENTITY_TURKEY_DEATH = registerSound("entity.turkey.death");
		
		ENTITY_KRAMPUS_AMBIENT = registerSound("entity.krampus.ambient");
		ENTITY_KRAMPUS_HURT = registerSound("entity.krampus.hurt");
		ENTITY_KRAMPUS_DEATH = registerSound("entity.krampus.death");
		
		ENTITY_CACTUS_BUG_AMBIENT = registerSound("entity.cactus_bug.ambient");
		ENTITY_CACTUS_BUG_HURT = registerSound("entity.cactus_bug.hurt");
		ENTITY_CACTUS_BUG_DEATH = registerSound("entity.cactus_bug.death");
		
		ENTITY_BASILISK_AMBIENT = registerSound("entity.basilisk.ambient");
		ENTITY_BASILISK_HURT = registerSound("entity.basilisk.hurt");
		ENTITY_BASILISK_DEATH = registerSound("entity.basilisk.death");
		
		ENTITY_MINOTAUR_AMBIENT = registerSound("entity.minotaur.ambient");
		ENTITY_MINOTAUR_HURT = registerSound("entity.minotaur.hurt");
		ENTITY_MINOTAUR_DEATH = registerSound("entity.minotaur.death");
		
		ENTITY_DWARF_AMBIENT = registerSound("entity.dwarf.ambient");
		ENTITY_DWARF_HURT = registerSound("entity.dwarf.hurt");
		ENTITY_DWARF_DEATH = registerSound("entity.dwarf.death");
		
		ENTITY_DWARVEN_GOLEM_AMBIENT = registerSound("entity.dwarven_golem.ambient");
		ENTITY_DWARVEN_GOLEM_HURT = registerSound("entity.dwarven_golem.hurt");
		ENTITY_DWARVEN_GOLEM_DEATH = registerSound("entity.dwarven_golem.death");
		
		ENTITY_WINTER_SQUIRE_AMBIENT = registerSound("entity.winter_squire.ambient");
		ENTITY_WINTER_SQUIRE_HURT = registerSound("entity.winter_squire.hurt");
		ENTITY_WINTER_SQUIRE_DEATH = registerSound("entity.winter_squire.death");
		
		ENTITY_LION_AMBIENT = registerSound("entity.lion.ambient");
		ENTITY_LION_HURT = registerSound("entity.lion.hurt");
		ENTITY_LION_DEATH = registerSound("entity.lion.death");
		ENTITY_LION_SHED = registerSound("entity.lion.shed");
		
		ENTITY_DIREWOLF_AMBIENT = registerSound("entity.direwolf.ambient");
		ENTITY_DIREWOLF_HURT = registerSound("entity.direwolf.hurt");
		ENTITY_DIREWOLF_DEATH = registerSound("entity.direwolf.death");
		
		ENTITY_IMMJIRI_CHAMPION_AMBIENT = registerSound("entity.immjiri_champion.ambient");
		ENTITY_IMMJIRI_CHAMPION_HURT = registerSound("entity.immjiri_champion.hurt");
		ENTITY_IMMJIRI_CHAMPION_DEATH = registerSound("entity.immjiri_champion.death");
		
		ENTITY_EARTH_GUARDIAN_AMBIENT = registerSound("entity.earth_guardian.ambient");
		ENTITY_EARTH_GUARDIAN_HURT = registerSound("entity.earth_guardian.hurt");
		ENTITY_EARTH_GUARDIAN_DEATH = registerSound("entity.earth_guardian.death");
	}
	
	private static SoundEvent registerSound(String name){
		ResourceLocation location = new ResourceLocation(VanillaEvolutionMod.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
