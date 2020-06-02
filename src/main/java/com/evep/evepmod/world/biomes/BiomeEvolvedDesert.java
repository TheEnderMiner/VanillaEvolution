package com.evep.evepmod.world.biomes;

import com.evep.evepmod.entity.EntityAridSkeleton;
import com.evep.evepmod.entity.EntityBasilisk;
import com.evep.evepmod.entity.EntityCactusBug;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.init.VanillaEvolutionBlocks;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeEvolvedDesert extends Biome{
	
	public BiomeEvolvedDesert(){
		super(new BiomeProperties("Evolved Desert").setBaseHeight(0.2F).setHeightVariation(0.2F).setTemperature(3.0F).setRainDisabled().setWaterColor(3093213));
		
		topBlock = Blocks.SAND.getDefaultState();
		fillerBlock = Blocks.SANDSTONE.getDefaultState();
		
		this.decorator.diamondGen = new WorldGenMinable(VanillaEvolutionBlocks.ancient_ore.getDefaultState(), 1);
		this.decorator.treesPerChunk = 0;
        this.decorator.deadBushPerChunk = 1;
        this.decorator.cactiPerChunk = 1;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 25, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvoker.class, 10, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityBlaze.class, 50, 3, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityGhast.class, 30, 1, 3));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityPigZombie.class, 65, 5, 7));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitherSkeleton.class, 40, 2, 3));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityHusk.class, 80, 3, 10));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityAridSkeleton.class, 85, 4, 8));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityTurkey.class, 20, 3, 8));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCactusBug.class, 65, 5, 8));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCactusBug.class, 55, 3, 6));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityBasilisk.class, 8, 1, 1));
	}

}
