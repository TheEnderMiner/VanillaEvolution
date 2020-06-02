package com.evep.evepmod.world.dimension.earth;

import com.evep.evepmod.init.VanillaEvolutionBiomes;
import com.evep.evepmod.init.VanillaEvolutionDimensions;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.resource.VanillaResourceType;

public class DimensionEarth extends WorldProvider{

	
	public DimensionEarth() {
	this.biomeProvider = new BiomeProviderSingle(VanillaEvolutionBiomes.WILDLANDS);
	}
	
	@Override
	public DimensionType getDimensionType() {
		return VanillaEvolutionDimensions.EARTH;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorEarth(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

}
