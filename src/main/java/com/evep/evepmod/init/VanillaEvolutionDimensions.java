package com.evep.evepmod.init;

import com.evep.evepmod.world.dimension.earth.DimensionEarth;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class VanillaEvolutionDimensions {

	public static final DimensionType EARTH = DimensionType.register("Earth", "_earth", 2, DimensionEarth.class, false);
	
	public static void registerDimensions(){
		DimensionManager.registerDimension(2, EARTH);
	}
}
