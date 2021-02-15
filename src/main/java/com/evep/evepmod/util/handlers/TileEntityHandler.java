package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.blocks.tileentity.TileEntityTitaniumVault;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityTitaniumVault.class, new ResourceLocation(VanillaEvolutionMod.MODID + ":titanium_vault"));
	}

}
