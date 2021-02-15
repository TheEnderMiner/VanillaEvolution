package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.commands.CommandDimensionTeleport;
import com.evep.evepmod.init.VanillaEvolutionBiomes;
import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionDimensionBiomes;
import com.evep.evepmod.init.VanillaEvolutionDimensions;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.init.VanillaEvolutionPotions;
import com.evep.evepmod.util.IHasModel;
import com.evep.evepmod.util.compat.OreDictionaryCompat;
import com.evep.evepmod.world.gen.WorldGenDwarvenShrine;
import com.evep.evepmod.world.gen.WorldGenDwarvenTemple;
import com.evep.evepmod.world.gen.WorldGenDwarvenVillage;
import com.evep.evepmod.world.gen.WorldGenHunterCamp;
import com.evep.evepmod.world.gen.WorldGenIceTemple;
import com.evep.evepmod.world.types.WorldTypeEvolvedDesert;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(VanillaEvolutionItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(VanillaEvolutionBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : VanillaEvolutionItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event){
		
		for(Item item : VanillaEvolutionItems.ITEMS){
			if(item instanceof IHasModel){
				((IHasModel)item).registerModels();
			}
		}
		for(Block block: VanillaEvolutionBlocks.BLOCKS){
			if(block instanceof IHasModel){
				((IHasModel)block).registerModels();
			}		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event){
		VanillaEvolutionBiomes.registerBiomes();
		VanillaEvolutionDimensionBiomes.registerBiomes();
		VanillaEvolutionDimensions.registerDimensions();
		VanillaEvolutionPotions.registerPotions();
		GameRegistry.registerWorldGenerator(new WorldGenDwarvenShrine(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenIceTemple(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenDwarvenTemple(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenHunterCamp(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenDwarvenVillage(), 0);
	}
	
	 public static void registerEntitySpawning() {
		 											//Weight (Bigger to Work), Min, Max
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(1));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(4));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(5));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(19));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(27));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(28));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(129));
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biome.getBiome(133));
		 
		 
//   EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.BIRCH_FOREST);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.BIRCH_FOREST_HILLS);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS_EDGE);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS_WITH_TREES);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.FOREST);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.FOREST_HILLS);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.JUNGLE);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.JUNGLE_EDGE);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.JUNGLE_HILLS);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.PLAINS);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.ROOFED_FOREST);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.TAIGA);
//    EntityRegistry.addSpawn(EntityTurkey.class, 100, 3, 8, EnumCreatureType.CREATURE, Biomes.TAIGA_HILLS);
  }
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		SoundsHandler.registerSounds();
		OreDictionaryCompat.registerOres();
		NetworkRegistry.INSTANCE.registerGuiHandler(VanillaEvolutionMod.instance, new GuiHandler());
	}
	
	
	public static void postInitRegistries(){
		WorldType EVOLVED_DESERT = new WorldTypeEvolvedDesert();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event){
		event.registerServerCommand(new CommandDimensionTeleport());
	}

}