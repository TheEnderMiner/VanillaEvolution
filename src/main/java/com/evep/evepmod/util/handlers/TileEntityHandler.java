package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.tileentities.TileEntityNickelFurnace;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities(){
	//	GameRegistry.registerTileEntity(TileEntityTestChest.class, new ResourceLocation(VanillaEvolutionMod.MODID + ":test_chest"));
	
		GameRegistry.registerTileEntity(TileEntityNickelFurnace.class, new ResourceLocation(VanillaEvolutionMod.MODID + ":nickel_furnace"));
	}

}
