package com.evep.evepmod.world.types;

import com.evep.evepmod.init.VanillaEvolutionBiomes;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeEvolvedDesert extends WorldType{

	public WorldTypeEvolvedDesert() {
		super("Evolved Desert");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) {
		return new BiomeProviderSingle(VanillaEvolutionBiomes.EVOLVED_DESERT);
	}

}
