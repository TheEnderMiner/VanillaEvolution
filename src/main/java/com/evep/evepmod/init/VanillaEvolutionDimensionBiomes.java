package com.evep.evepmod.init;

import com.evep.evepmod.world.biomes.BiomeEvolvedArctic;
import com.evep.evepmod.world.biomes.BiomeEvolvedDesert;
import com.evep.evepmod.world.biomes.BiomeWildlands;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class VanillaEvolutionDimensionBiomes {

	
	public static final Biome WILDLANDS = new BiomeWildlands();
	
	public static void registerBiomes(){
		initBiome(WILDLANDS, "Wildlands", BiomeType.WARM, Type.DEAD, Type.SPARSE, Type.DRY, Type.MESA, Type.WASTELAND);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types){
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		System.out.println("Biome Added");
		return biome;
	}
	
}
