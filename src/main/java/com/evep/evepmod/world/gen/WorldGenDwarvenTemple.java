package com.evep.evepmod.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.world.biomes.BiomeWildlands;
import com.evep.evepmod.world.gen.generators.WorldGenStructureDwarvenTemple;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenDwarvenTemple implements IWorldGenerator{
	
	public final WorldGenStructureDwarvenTemple DWARVEN_TEMPLE = new WorldGenStructureDwarvenTemple("dwarven_temple");
//	public final WorldGenStructureEarth HUNTER_CAMP = new WorldGenStructureEarth("hunter_camp");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 2:
			generateStructure(DWARVEN_TEMPLE, world, random, chunkX, chunkZ, 300, VanillaEvolutionBlocks.earthen_dirt, BiomeWildlands.class);
		//	generateStructure(HUNTER_CAMP, world, random, chunkX, chunkZ, 50, VanillaEvolutionBlocks.earthen_dirt, BiomeWildlands.class);
			
			break;
			
		case 1:
			
			break;
			
		case 0:
		
			break;
			
		case -1:
			
		}
	}

	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes){
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 8) + random.nextInt(8);
		int z = (chunkZ * 8) + random.nextInt(8);
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
