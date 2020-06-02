package com.evep.evepmod.world.biomes;

import com.evep.evepmod.entity.EntityDirewolf;
import com.evep.evepmod.entity.EntityDwarvenGolem;
import com.evep.evepmod.entity.EntityDwarvenGuard;
import com.evep.evepmod.entity.EntityDwarvenHunter;
import com.evep.evepmod.entity.EntityDwarvenMiner;
import com.evep.evepmod.entity.EntityLion;
import com.evep.evepmod.entity.EntityMinotaur;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.entity.EntityWinterSquire;

import net.minecraft.world.biome.Biome;

public class BiomeWildlands extends Biome{
	
	public BiomeWildlands(){
		super(new BiomeProperties("Wildlands").setWaterColor(5320448).setTemperature(100F));
		
//		topBlock = VanillaEvolutionBlocks.earthen_dirt.getDefaultState();
//		fillerBlock = VanillaEvolutionBlocks.earthen_dirt.getDefaultState();
//		
//		this.decorator.diamondGen = new WorldGenMinable(VanillaEvolutionBlocks.ancient_ore.getDefaultState(), 1);
//		this.decorator.treesPerChunk = 0;
//        this.decorator.deadBushPerChunk = 1;
//        this.decorator.cactiPerChunk = 1;
//		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();

		this.spawnableMonsterList.add(new SpawnListEntry(EntityMinotaur.class, 50, 4, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDwarvenMiner.class, 100, 1, 3));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDwarvenHunter.class, 80, 2, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDwarvenGuard.class, 60, 1, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDwarvenGolem.class, 60, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWinterSquire.class, 45, 4, 6));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityLion.class, 65, 3, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDirewolf.class, 45, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityTurkey.class, 25, 3, 8));
	}

}
