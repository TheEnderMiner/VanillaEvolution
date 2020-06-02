package com.evep.evepmod.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.evep.evepmod.world.biomes.BiomeEvolvedArctic;
import com.evep.evepmod.world.gen.generators.WorldGenStructureIceTemple;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenIceTemple implements IWorldGenerator{
	
	public final WorldGenStructureIceTemple ICE_TEMPLE = new WorldGenStructureIceTemple("ice_temple");
//	public final WorldGenStructure DWARVEN_SHRINE = new WorldGenStructure("dwarven_shrine");
//	public final WorldGenStructureEarth DWARVEN_TEMPLE = new WorldGenStructureEarth("dwarven_temple");
//	public final WorldGenStructureEarth HUNTER_CAMP = new WorldGenStructureEarth("hunter_camp");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 2:
//			generateStructure(DWARVEN_TEMPLE, world, random, chunkX, chunkZ, 500, VanillaEvolutionBlocks.earthen_stone, BiomeWildlands.class);
//			generateStructure(HUNTER_CAMP, world, random, chunkX, chunkZ, 500, VanillaEvolutionBlocks.VanillaEvolutionBlocks, BiomeWildlands.class);
			
			break;
			
		case 1:
			
			break;
			
		case 0:
																		//WEIGHT, TOP BLOCK, BIOME
			generateStructure(ICE_TEMPLE, world, random, chunkX, chunkZ, 500, Blocks.SNOW, BiomeEvolvedArctic.class);
	//		generateStructure(DWARVEN_SHRINE, world, random, chunkX, chunkZ, 400, Blocks.SAND, BiomeEvolvedDesert.class);
			
			break;
			
		case -1:
			
		}
	}

	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes){
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15);
		int z = (chunkZ * 16) + random.nextInt(15);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT){
			if(classesList.contains(biome)){
				if(random.nextInt(chance) == 0){
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock){
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0){
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}

}
