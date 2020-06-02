package com.evep.evepmod.world.biomes;

import java.util.Random;

import com.evep.evepmod.entity.EntityBeast;
import com.evep.evepmod.entity.EntityFrostZombie;
import com.evep.evepmod.entity.EntityKrampus;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.init.VanillaEvolutionBlocks;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;

public class BiomeEvolvedArctic extends Biome{
	
	public BiomeEvolvedArctic(){
		super(new BiomeProperties("Evolved Arctic").setBaseHeight(0.2F).setHeightVariation(0.2F).setTemperature(0.0F).setSnowEnabled().setWaterColor(40666));
		this.isSnowyBiome();
		
		topBlock = Blocks.SNOW.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.diamondGen = new WorldGenMinable(VanillaEvolutionBlocks.ancient_ore.getDefaultState(), 1);
		this.decorator.treesPerChunk = 2;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();

																//Weight (Lower = Less), Smallest Group, Largest Group
		this.spawnableMonsterList.add(new SpawnListEntry(EntityFrostZombie.class, 70, 3, 8));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityKrampus.class, 35, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityBeast.class, 2, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityVex.class, 50, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 1, 6));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCaveSpider.class, 20, 1, 10));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 30, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 20, 1, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvoker.class, 20, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 15, 1, 3));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityIllusionIllager.class, 10, 1, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityLlama.class, 5, 2, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPolarBear.class, 60, 3, 10));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 20, 1, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 20, 3, 6));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityStray.class, 50, 3, 8));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 25, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityVindicator.class, 25, 2, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 40, 2, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityTurkey.class, 30, 3, 8));
	}
	
	 public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	        return new WorldGenTaiga2(false);
	    }

}
