package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler {
	
	public static final ResourceLocation FROZEN_ZOMBIE = LootTableList.register(new ResourceLocation(VanillaEvolutionMod.MODID, "frozen_zombie"));
	public static final ResourceLocation BEAST = LootTableList.register(new ResourceLocation(VanillaEvolutionMod.MODID, "beast"));
	public static final ResourceLocation ARID_SKELETON = LootTableList.register(new ResourceLocation(VanillaEvolutionMod.MODID, "arid_skeleton"));

}
