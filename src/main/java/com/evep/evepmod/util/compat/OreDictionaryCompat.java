package com.evep.evepmod.util.compat;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	
	public static void registerOres(){
		OreDictionary.registerOre("oreCopper", VanillaEvolutionBlocks.copper_ore);
		OreDictionary.registerOre("oreLead", VanillaEvolutionBlocks.lead_ore);
		OreDictionary.registerOre("oreNickel", VanillaEvolutionBlocks.nickel_ore);
		OreDictionary.registerOre("oreAluminum", VanillaEvolutionBlocks.bauxite_ore);
		OreDictionary.registerOre("oreSilver", VanillaEvolutionBlocks.silver_ore);
		OreDictionary.registerOre("oreZinc", VanillaEvolutionBlocks.zinc_ore);
		OreDictionary.registerOre("oreCarbon", VanillaEvolutionBlocks.carbon_ore);
		OreDictionary.registerOre("oreTin", VanillaEvolutionBlocks.tin_ore);
		OreDictionary.registerOre("oreCobalt", VanillaEvolutionBlocks.cobalt_ore);
		
		OreDictionary.registerOre("blockCopper", VanillaEvolutionBlocks.copper_block);
		OreDictionary.registerOre("blockLead", VanillaEvolutionBlocks.lead_block);
		OreDictionary.registerOre("blockNickel", VanillaEvolutionBlocks.nickel_block);
		OreDictionary.registerOre("blockAluminum", VanillaEvolutionBlocks.aluminum_block);
		OreDictionary.registerOre("blockSilver", VanillaEvolutionBlocks.silver_block);
		OreDictionary.registerOre("blockZinc", VanillaEvolutionBlocks.zinc_block);
		OreDictionary.registerOre("blockCarbon", VanillaEvolutionBlocks.carbon_block);
		OreDictionary.registerOre("blockTin", VanillaEvolutionBlocks.tin_block);
		OreDictionary.registerOre("blockCobalt", VanillaEvolutionBlocks.cobalt_block);
		OreDictionary.registerOre("blockIridium", VanillaEvolutionBlocks.iridium_block);
		OreDictionary.registerOre("blockBronze", VanillaEvolutionBlocks.bronze_block);
		
		OreDictionary.registerOre("ingotCopper", VanillaEvolutionItems.copper_ingot);
		OreDictionary.registerOre("ingotLead", VanillaEvolutionItems.lead_ingot);
		OreDictionary.registerOre("ingotNickel", VanillaEvolutionItems.nickel_ingot);
		OreDictionary.registerOre("ingotAluminum", VanillaEvolutionItems.aluminum_ingot);
		OreDictionary.registerOre("ingotSilver", VanillaEvolutionItems.silver_ingot);
		OreDictionary.registerOre("ingotZinc", VanillaEvolutionItems.zinc_ingot);
		OreDictionary.registerOre("ingotCarbon", VanillaEvolutionItems.carbon_ingot);
		OreDictionary.registerOre("ingotTin", VanillaEvolutionItems.tin_ingot);
		OreDictionary.registerOre("ingotBronze", VanillaEvolutionItems.bronze_ingot);
		OreDictionary.registerOre("ingotIridium", VanillaEvolutionItems.iridium_ingot);
		OreDictionary.registerOre("ingotCobalt", VanillaEvolutionItems.cobalt_ingot);

		OreDictionary.registerOre("nuggetCarbon", VanillaEvolutionItems.carbon_nugget);
		
		//Atom 9 (Tin), Atom 8 (Iridium), Atom 4 (Aluminum), Atom 3 (Carbon), Atom 2 (Lead), Atom 14 (Cobalt), Atom 12 (Copper), Atom 11 (Zinc), Atom 10 (Silver)
	}
}
