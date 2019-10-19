package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityFrostZombie;
import com.evep.evepmod.init.VanillaEvolutionBiomes;
import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionEntities;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.IHasModel;
import com.evep.evepmod.world.gen.WorldGenCustomStructures;
import com.evep.evepmod.world.types.WorldTypeEvolvedDesert;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
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
	
	public static void preInitRegistries(){
		VanillaEvolutionBiomes.registerBiomes();
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
	}
	
	 public static void registerEntitySpawning() {
		 											//Weight (Bigger to Work), Min, Max
    //     EntityRegistry.addSpawn(EntityFrostZombie.class, 1, 2, 6, EnumCreatureType.MONSTER, Biome.getBiome(5));
  }
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		SoundsHandler.registerSounds();
	}
	
	
	public static void postInitRegistries(){
		WorldType EVOLVED_DESERT = new WorldTypeEvolvedDesert();
	}

}