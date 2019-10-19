package com.evep.evepmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaEvolutionCrafting {
	
	public static void init(){
		GameRegistry.addSmelting(VanillaEvolutionBlocks.malachite_ore, new ItemStack(VanillaEvolutionItems.malachite_ingot, 1), 0.5f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.bauxite_ore, new ItemStack(VanillaEvolutionBlocks.aluminum_ore, 1), 0.5f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.nickel_ore, new ItemStack(VanillaEvolutionItems.nickel_ingot, 1), 1f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.aluminum_ore, new ItemStack(VanillaEvolutionItems.aluminum_ingot, 1), 0.8f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.silver_ore, new ItemStack(VanillaEvolutionItems.silver_ingot, 1), 0.3f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.lead_ore, new ItemStack(VanillaEvolutionItems.lead_ingot, 1), 0.7f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.zinc_ore, new ItemStack(VanillaEvolutionItems.zinc_ingot, 1), 1f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.carbon_ore, new ItemStack(VanillaEvolutionItems.carbon_ingot, 1), 1f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.tin_ore, new ItemStack(VanillaEvolutionItems.tin_ingot, 1), 0.8f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.copper_ore, new ItemStack(VanillaEvolutionItems.copper_ingot, 1), 0.3f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.cobalt_ore, new ItemStack(VanillaEvolutionItems.cobalt_ingot, 1), 0.7f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.adamantium_ore, new ItemStack(VanillaEvolutionItems.adamantium_ingot, 1), 0.7f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.magnetite_ore, new ItemStack(VanillaEvolutionItems.magnetite_ingot, 1), 1f);
		GameRegistry.addSmelting(Blocks.CONCRETE_POWDER, new ItemStack(VanillaEvolutionItems.concrete_dust, 2), 0.8f);
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(VanillaEvolutionItems.cheese), 0.3f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.reinforced_sand, new ItemStack(VanillaEvolutionItems.silicon_chunk, 1), 0.8f);
		GameRegistry.addSmelting(VanillaEvolutionItems.silicon_chunk, new ItemStack(VanillaEvolutionItems.silicon, 1), 1f);
		GameRegistry.addSmelting(VanillaEvolutionItems.meteorite_shard, new ItemStack(VanillaEvolutionItems.iridium_ingot, 1), 0.8f);
		GameRegistry.addSmelting(VanillaEvolutionItems.carbon_ingot, new ItemStack(VanillaEvolutionItems.graphite, 1), 1f);
		GameRegistry.addSmelting(VanillaEvolutionItems.animal_fat, new ItemStack(VanillaEvolutionItems.grease, 2), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionItems.maple, new ItemStack(VanillaEvolutionItems.syrup), 0.1f);
		GameRegistry.addSmelting(VanillaEvolutionItems.funnel_cake_mixture, new ItemStack(VanillaEvolutionItems.funnel_cake), 1.5f);
		GameRegistry.addSmelting(VanillaEvolutionItems.blue_moon_quartz, new ItemStack(VanillaEvolutionBlocks.blue_moon_quartz_block), 0.5f);
		GameRegistry.addSmelting(VanillaEvolutionItems.frozen_flesh, new ItemStack(Items.LEATHER, 3), 1f);
		GameRegistry.addSmelting(VanillaEvolutionItems.dust_bone, new ItemStack(VanillaEvolutionItems.silicon_chunk, 2), 0.5f);
		GameRegistry.addSmelting(VanillaEvolutionItems.uncooked_caramel, new ItemStack(VanillaEvolutionItems.caramel), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionItems.jelly_bean_mold, new ItemStack(VanillaEvolutionItems.jelly_beans), 0.4f);
		GameRegistry.addSmelting(VanillaEvolutionItems.lead_ingot, new ItemStack(VanillaEvolutionBlocks.lead_bricks), 0.5f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.limestone, new ItemStack(VanillaEvolutionBlocks.marble, 1), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.basalt, new ItemStack(VanillaEvolutionBlocks.refined_basalt, 1), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.gneiss, new ItemStack(VanillaEvolutionBlocks.refined_gneiss, 1), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.marble, new ItemStack(VanillaEvolutionBlocks.refined_marble, 1), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.shale, new ItemStack(VanillaEvolutionBlocks.refined_shale, 1), 0.2f);
		GameRegistry.addSmelting(VanillaEvolutionBlocks.evolved_sand, new ItemStack(Blocks.GLASS, 1), 0.2f);
	}

}
