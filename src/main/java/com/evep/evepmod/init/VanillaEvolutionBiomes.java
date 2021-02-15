package com.evep.evepmod.init;

import com.evep.evepmod.world.biomes.BiomeEvolvedArctic;
import com.evep.evepmod.world.biomes.BiomeEvolvedDesert;
import com.evep.evepmod.world.biomes.BiomeWildlands;

//import net.minecraft.block.BlockChest.Type;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class VanillaEvolutionBiomes {
	
	public static final Biome EVOLVED_ARCTIC = new BiomeEvolvedArctic();
	public static final Biome EVOLVED_DESERT = new BiomeEvolvedDesert();
//	public static final Biome WILDLANDS = new BiomeWildlands();
	
	public static void registerBiomes(){
		initBiome(EVOLVED_ARCTIC, "Evolved Arctic", BiomeType.ICY, Type.COLD, Type.SPARSE, Type.CONIFEROUS, Type.MAGICAL, Type.SNOWY, Type.PLAINS);
		initBiome(EVOLVED_DESERT, "Evolved Desert", BiomeType.DESERT, Type.HOT, Type.SPARSE, Type.DRY, Type.DEAD, Type.SANDY, Type.WASTELAND);
	//	initBiome(WILDLANDS, "Wildlands", BiomeType.WARM, Type.DEAD, Type.SPARSE, Type.DRY, Type.MESA, Type.WASTELAND);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types){
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 15));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}

}
