package com.evep.evepmod.init;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityAridSkeleton;
import com.evep.evepmod.entity.EntityBasilisk;
import com.evep.evepmod.entity.EntityBeast;
import com.evep.evepmod.entity.EntityCactusBug;
import com.evep.evepmod.entity.EntityDirewolf;
import com.evep.evepmod.entity.EntityDwarvenGolem;
import com.evep.evepmod.entity.EntityDwarvenGuard;
import com.evep.evepmod.entity.EntityDwarvenHunter;
import com.evep.evepmod.entity.EntityDwarvenMiner;
import com.evep.evepmod.entity.EntityEarthGuardian;
import com.evep.evepmod.entity.EntityFrostZombie;
import com.evep.evepmod.entity.EntityImmjiriChampion;
import com.evep.evepmod.entity.EntityKnowledgeLord;
import com.evep.evepmod.entity.EntityKrampus;
import com.evep.evepmod.entity.EntityLion;
import com.evep.evepmod.entity.EntityMinotaur;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.entity.EntityWinterSquire;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class VanillaEvolutionEntities {
	
	public static void registerEntities(){
		registerEntities("frost_zombie", EntityFrostZombie.class, VanillaEvolutionMod.ENTITY_FROST_ZOMBIE, 75, 3112322, 53376);
		registerEntities("beast", EntityBeast.class, VanillaEvolutionMod.ENTITY_BEAST, 100, 3124991, 16729905);
		registerEntities("arid_skeleton", EntityAridSkeleton.class, VanillaEvolutionMod.ENTITY_ARID_SKELETON, 75, 7426863, 15785306);
		registerEntities("turkey", EntityTurkey.class, VanillaEvolutionMod.ENTITY_TURKEY, 40, 8414464, 12071447);
		registerEntities("krampus", EntityKrampus.class, VanillaEvolutionMod.ENTITY_KRAMPUS, 85, 29, 7798784);
		registerEntities("cactus_bug", EntityCactusBug.class, VanillaEvolutionMod.ENTITY_CACTUS_BUG, 40, 19712, 16777190);
		registerEntities("basilisk", EntityBasilisk.class, VanillaEvolutionMod.ENTITY_BASILISK, 30, 5504896, 14768896);
		registerEntities("minotaur", EntityMinotaur.class, VanillaEvolutionMod.ENTITY_MINOTAUR, 80, 5250823, 10303540);
		registerEntities("dwarven_miner", EntityDwarvenMiner.class, VanillaEvolutionMod.ENTITY_DWARVEN_MINER, 45, 3219968, 15000576);
		registerEntities("dwarven_hunter", EntityDwarvenHunter.class, VanillaEvolutionMod.ENTITY_DWARVEN_HUNTER, 45, 3219968, 7813888);
		registerEntities("dwarven_guard", EntityDwarvenGuard.class, VanillaEvolutionMod.ENTITY_DWARVEN_GUARD, 45, 3219968, 6488064);
		registerEntities("dwarven_golem", EntityDwarvenGolem.class, VanillaEvolutionMod.ENTITY_DWARVEN_GOLEM, 65, 3219968, 14076160);
		registerEntities("winter_squire", EntityWinterSquire.class, VanillaEvolutionMod.ENTITY_WINTER_SQUIRE, 55, 45055, 15007743);
		registerEntities("lion", EntityLion.class, VanillaEvolutionMod.ENTITY_LION, 35, 4470272, 9268224);
		registerEntities("direwolf", EntityDirewolf.class, VanillaEvolutionMod.ENTITY_DIREWOLF, 65, 15595775, 6605564);
		registerEntities("immjiri_champion", EntityImmjiriChampion.class, VanillaEvolutionMod.ENTITY_IMMJIRI_CHAMPION, 45, 2886, 15335461);
		registerEntities("earth_guardian", EntityEarthGuardian.class, VanillaEvolutionMod.ENTITY_EARTH_GUARDIAN, 50, 2100736, 10114560);
		registerEntities("knowledge_lord", EntityKnowledgeLord.class, VanillaEvolutionMod.ENTITY_KNOWLEDGE_LORD, 100, 2293788, 2296320);
		//registerEntities("lizard", EntityLizard.class, VanillaEvolutionMod.ENTITY_LIZARD, 50, 16777199, 8519424);
	}
	
	private static void registerEntities(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
		EntityRegistry.registerModEntity(new ResourceLocation(VanillaEvolutionMod.MODID + ":" + name), entity, name, id, VanillaEvolutionMod.instance, range, 1, true, color1, color2);
	}

}
