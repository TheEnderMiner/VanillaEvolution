package com.evep.evepmod.init;

import java.util.ArrayList;
import java.util.List;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.blocks.BlockAdamantiumOre;
import com.evep.evepmod.blocks.BlockAluminumOre;
import com.evep.evepmod.blocks.BlockAmberOre;
import com.evep.evepmod.blocks.BlockAmethystOre;
import com.evep.evepmod.blocks.BlockAncientOre;
import com.evep.evepmod.blocks.BlockBaconOre;
import com.evep.evepmod.blocks.BlockBananaCrop;
import com.evep.evepmod.blocks.BlockBarleyCrop;
import com.evep.evepmod.blocks.BlockBasalt;
import com.evep.evepmod.blocks.BlockBauxiteOre;
import com.evep.evepmod.blocks.BlockBerylOre;
import com.evep.evepmod.blocks.BlockBlueberryCrop;
import com.evep.evepmod.blocks.BlockBuildingBlock;
import com.evep.evepmod.blocks.BlockCarbonOre;
import com.evep.evepmod.blocks.BlockCherryCrop;
import com.evep.evepmod.blocks.BlockCinnamonCrop;
import com.evep.evepmod.blocks.BlockCobaltOre;
import com.evep.evepmod.blocks.BlockCopperOre;
import com.evep.evepmod.blocks.BlockCornCrop;
import com.evep.evepmod.blocks.BlockCottonCrop;
import com.evep.evepmod.blocks.BlockDwarfStarAlloyOre;
import com.evep.evepmod.blocks.BlockEggplantCrop;
import com.evep.evepmod.blocks.BlockElementalOre;
import com.evep.evepmod.blocks.BlockEnderiteOre;
import com.evep.evepmod.blocks.BlockEnergeticOre;
import com.evep.evepmod.blocks.BlockGarlicCrop;
import com.evep.evepmod.blocks.BlockGingerCrop;
import com.evep.evepmod.blocks.BlockGneiss;
import com.evep.evepmod.blocks.BlockGreenBeanCrop;
import com.evep.evepmod.blocks.BlockLamp;
import com.evep.evepmod.blocks.BlockLeadOre;
import com.evep.evepmod.blocks.BlockLimestone;
import com.evep.evepmod.blocks.BlockMagnetiteOre;
import com.evep.evepmod.blocks.BlockMalachiteOre;
import com.evep.evepmod.blocks.BlockMapleCrop;
import com.evep.evepmod.blocks.BlockMarble;
import com.evep.evepmod.blocks.BlockMeteoriteOre;
import com.evep.evepmod.blocks.BlockMintCrop;
import com.evep.evepmod.blocks.BlockNickelOre;
import com.evep.evepmod.blocks.BlockOatCrop;
import com.evep.evepmod.blocks.BlockOnionCrop;
import com.evep.evepmod.blocks.BlockOnyxOre;
import com.evep.evepmod.blocks.BlockPeachCrop;
import com.evep.evepmod.blocks.BlockPeanutCrop;
import com.evep.evepmod.blocks.BlockPecanCrop;
import com.evep.evepmod.blocks.BlockPeridotOre;
import com.evep.evepmod.blocks.BlockPineappleCrop;
import com.evep.evepmod.blocks.BlockRaspberryCrop;
import com.evep.evepmod.blocks.BlockReinforcedSand;
import com.evep.evepmod.blocks.BlockResourcesBlock;
import com.evep.evepmod.blocks.BlockRhubarbCrop;
import com.evep.evepmod.blocks.BlockRubyOre;
import com.evep.evepmod.blocks.BlockRyeCrop;
import com.evep.evepmod.blocks.BlockScaffolding;
import com.evep.evepmod.blocks.BlockSeasonalOre;
import com.evep.evepmod.blocks.BlockSeleniteOre;
import com.evep.evepmod.blocks.BlockShale;
import com.evep.evepmod.blocks.BlockSilverOre;
import com.evep.evepmod.blocks.BlockSlimeOre;
import com.evep.evepmod.blocks.BlockStrawberryCrop;
import com.evep.evepmod.blocks.BlockSuperfoodOre;
import com.evep.evepmod.blocks.BlockTinOre;
import com.evep.evepmod.blocks.BlockTomatoCrop;
import com.evep.evepmod.blocks.BlockTorchOre;
import com.evep.evepmod.blocks.BlockUltrafoodOre;
import com.evep.evepmod.blocks.BlockVanillaCrop;
import com.evep.evepmod.blocks.BlockVibraniumOre;
import com.evep.evepmod.blocks.BlockWalnutCrop;
import com.evep.evepmod.blocks.BlockWoodOre;
import com.evep.evepmod.blocks.BlockZincOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=VanillaEvolutionMod.MODID)
public class VanillaEvolutionBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block malachite_ore;
	public static Block bacon_ore;
	public static Block torch_ore;
	public static Block wood_ore;
	public static Block limestone;
	public static Block basalt;
	public static Block gneiss;
	public static Block shale;
	public static Block marble;
	public static Block nickel_ore;
	public static Block bauxite_ore;
	public static Block aluminum_ore;
	public static Block silver_ore;
	public static Block lead_ore;
	public static Block zinc_ore;
	public static Block carbon_ore;
	public static Block tin_ore;
	public static Block copper_ore;
	public static Block cobalt_ore;
	public static Block meteorite_ore;
	public static Block enderite_ore;
	public static Block ultrafood_ore;
	public static Block superfood_ore;
	public static Block amber_ore;
	public static Block onyx_ore;
	public static Block seasonal_ore;
	public static Block ruby_ore;
	public static Block peridot_ore;
	public static Block amethyst_ore;
	public static Block adamantium_ore;
	public static Block vibranium_ore;
	public static Block dwarf_star_alloy_ore;
	public static Block slime_ore;
	public static Block energetic_ore;
	public static Block ancient_ore;
	public static Block elemental_ore;
	public static Block selenite_ore;
	public static Block beryl_ore;
	public static Block magnetite_ore;
	public static Block refined_basalt;
	public static Block refined_gneiss;
	public static Block refined_marble;
	public static Block refined_shale;
	public static Block basalt_bricks;
	public static Block gneiss_bricks;
	public static Block marble_bricks;
	public static Block shale_bricks;
	public static Block adamantium_block;
	public static Block aluminum_block;
	public static Block amber_block;
	public static Block amethyst_block;
	public static Block beryl_block;
	public static Block bronze_block;
	public static Block carbon_block;
	public static Block cobalt_block;
	public static Block copper_block;
	public static Block dwarf_star_alloy_block;
	public static Block elemental_block;
	public static Block enderite_block;
	public static Block energetic_block;
	public static Block iridium_block;
	public static Block lead_block;
	public static Block magnetite_block;
	public static Block malachite_block;
	public static Block nickel_block;
	public static Block onyx_block;
	public static Block peridot_block;
	public static Block ruby_block;
	public static Block selenite_block;
	public static Block silver_block;
	public static Block slimey_block;
	public static Block tin_block;
	public static Block vibranium_block;
	public static Block zinc_block;
	public static Block reinforced_sand;
	public static Block magenta_lamp;
	public static Block red_lamp;
	public static Block blue_lamp;
	public static Block green_lamp;
	public static Block yellow_lamp;
	public static Block white_lamp;
	public static Block scaffolding;
	public static Block blue_moon_quartz_block;
	public static Block blue_moon_quartz_bricks;
	public static Block lead_bricks;
	public static Block ultrafood_block;
	public static Block superfood_block;
	public static Block seasonal_block;
	public static Block evolved_sand;
	public static Block evolved_sandstone;
	
	static Block tomato_crop;
	static Block strawberry_crop;
	static Block cherry_crop;
	static Block blueberry_crop;
	static Block cotton_crop;
	static Block corn_crop;
	static Block mint_crop;
	static Block banana_crop;
	static Block vanilla_crop;
	static Block maple_crop;
	static Block cinnamon_crop;
	static Block barley_crop;
	static Block oat_crop;
	static Block rye_crop;
	static Block ginger_crop;
	static Block peanut_crop;
	static Block pecan_crop;
	static Block walnut_crop;
	static Block rhubarb_crop;
	static Block eggplant_crop;
	static Block peach_crop;
	static Block pineapple_crop;
	static Block raspberry_crop;
	static Block garlic_crop;
	static Block green_bean_crop;
	static Block onion_crop;
	
	public static void initSeeds(){
		
	}
	
	public static void init() {
		malachite_ore = new BlockMalachiteOre("malachite_ore", Material.ROCK).setHardness(1.5f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		malachite_ore.setHarvestLevel("pickaxe", 2);
		
		bacon_ore = new BlockBaconOre("bacon_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		bacon_ore.setHarvestLevel("pickaxe", 1);
		
		torch_ore = new BlockTorchOre("torch_ore", Material.ROCK).setHardness(1f).setLightLevel(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		torch_ore.setHarvestLevel("pickaxe", 1);
		
		wood_ore = new BlockWoodOre("wood_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		wood_ore.setHarvestLevel("pickaxe", 1);
		
		limestone = new BlockLimestone("limestone", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		limestone.setHarvestLevel("pickaxe", 1);
		
		basalt = new BlockBasalt("basalt", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		basalt.setHarvestLevel("pickaxe", 1);
		
		gneiss = new BlockGneiss("gneiss", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		gneiss.setHarvestLevel("pickaxe", 1);
		
		shale = new BlockShale("shale", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		shale.setHarvestLevel("pickaxe", 1);
		
		marble = new BlockMarble("marble", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		marble.setHarvestLevel("pickaxe", 1);
		
		nickel_ore = new BlockNickelOre("nickel_ore", Material.ROCK).setHardness(1.5f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		nickel_ore.setHarvestLevel("pickaxe", 2);
		
		bauxite_ore = new BlockBauxiteOre("bauxite_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		bauxite_ore.setHarvestLevel("pickaxe", 2);
		
		aluminum_ore = new BlockAluminumOre("aluminum_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		aluminum_ore.setHarvestLevel("pickaxe", 2);
		
		silver_ore = new BlockSilverOre("silver_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		silver_ore.setHarvestLevel("pickaxe", 2);
		
		lead_ore = new BlockLeadOre("lead_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		lead_ore.setHarvestLevel("pickaxe", 2);
		
		zinc_ore = new BlockZincOre("zinc_ore", Material.ROCK).setHardness(1.5f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		zinc_ore.setHarvestLevel("pickaxe", 2);
		
		carbon_ore = new BlockCarbonOre("carbon_ore", Material.ROCK).setHardness(1f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.orestab);
		carbon_ore.setHarvestLevel("pickaxe", 2);
		
		tin_ore = new BlockTinOre("tin_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		tin_ore.setHarvestLevel("pickaxe", 2);
		
		copper_ore = new BlockCopperOre("copper_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		copper_ore.setHarvestLevel("pickaxe", 2);
		
		cobalt_ore = new BlockCobaltOre("cobalt_ore", Material.ROCK).setHardness(1f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		cobalt_ore.setHarvestLevel("pickaxe", 2);
		
		meteorite_ore = new BlockMeteoriteOre("meteorite_ore", Material.ROCK).setHardness(1f).setResistance(10f).setLightLevel(1f).setCreativeTab(VanillaEvolutionMod.orestab);
		meteorite_ore.setHarvestLevel("pickaxe", 2);
		
		enderite_ore = new BlockEnderiteOre("enderite_ore", Material.ROCK).setHardness(8f).setResistance(25f).setCreativeTab(VanillaEvolutionMod.orestab);
		enderite_ore.setHarvestLevel("pickaxe", 3);
		
		ultrafood_ore = new BlockUltrafoodOre("ultrafood_ore", Material.ROCK).setHardness(4f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		ultrafood_ore.setHarvestLevel("pickaxe", 3);
		
		superfood_ore = new BlockSuperfoodOre("superfood_ore", Material.ROCK).setHardness(5f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		superfood_ore.setHarvestLevel("pickaxe", 3);
		
		amber_ore = new BlockAmberOre("amber_ore", Material.ROCK).setHardness(5f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		amber_ore.setHarvestLevel("pickaxe", 3);
		
		onyx_ore = new BlockOnyxOre("onyx_ore", Material.ROCK).setHardness(5f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		onyx_ore.setHarvestLevel("pickaxe", 3);
		
		seasonal_ore = new BlockSeasonalOre("seasonal_ore", Material.ROCK).setHardness(3f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		seasonal_ore.setHarvestLevel("pickaxe", 3);
		
		ruby_ore = new BlockRubyOre("ruby_ore", Material.ROCK).setHardness(3f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		ruby_ore.setHarvestLevel("pickaxe", 3);
		
		peridot_ore = new BlockPeridotOre("peridot_ore", Material.ROCK).setHardness(4f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		peridot_ore.setHarvestLevel("pickaxe", 3);
		
		amethyst_ore = new BlockAmethystOre("amethyst_ore", Material.ROCK).setHardness(3f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		amethyst_ore.setHarvestLevel("pickaxe", 3);
		
		adamantium_ore = new BlockAdamantiumOre("adamantium_ore", Material.ROCK).setHardness(4f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		adamantium_ore.setHarvestLevel("pickaxe", 3);
		
		vibranium_ore = new BlockVibraniumOre("vibranium_ore", Material.ROCK).setHardness(4f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		vibranium_ore.setHarvestLevel("pickaxe", 3);
		
		dwarf_star_alloy_ore = new BlockDwarfStarAlloyOre("dwarf_star_alloy_ore", Material.ROCK).setResistance(10f).setHardness(5f).setLightLevel(1f).setCreativeTab(VanillaEvolutionMod.orestab);
		dwarf_star_alloy_ore.setHarvestLevel("pickaxe", 3);
		
		slime_ore = new BlockSlimeOre("slime_ore", Material.ROCK).setHardness(3f).setResistance(10f).setCreativeTab(VanillaEvolutionMod.orestab);
		slime_ore.setHarvestLevel("pickaxe", 3);
		
		energetic_ore = new BlockEnergeticOre("energetic_ore", Material.ROCK).setHardness(10f).setResistance(2000f).setCreativeTab(VanillaEvolutionMod.orestab);
		energetic_ore.setHarvestLevel("pickaxe", 4);
		
		ancient_ore = new BlockAncientOre("ancient_ore", Material.ROCK).setHardness(15f).setResistance(2000f).setCreativeTab(VanillaEvolutionMod.orestab);
		ancient_ore.setHarvestLevel("pickaxe", 4);
		
		elemental_ore = new BlockElementalOre("elemental_ore", Material.ROCK).setHardness(12f).setResistance(2000f).setCreativeTab(VanillaEvolutionMod.orestab);
		elemental_ore.setHarvestLevel("pickaxe", 4);
		
		selenite_ore = new BlockSeleniteOre("selenite_ore", Material.ROCK).setHardness(10f).setResistance(2000f).setCreativeTab(VanillaEvolutionMod.orestab);
		selenite_ore.setHarvestLevel("pickaxe", 4);
		
		beryl_ore = new BlockBerylOre("beryl_ore", Material.ROCK).setHardness(6f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.orestab);
		beryl_ore.setHarvestLevel("pickaxe", 3);
		
		magnetite_ore = new BlockMagnetiteOre("magnetite_ore", Material.ROCK).setHardness(9f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.orestab);
		magnetite_ore.setHarvestLevel("pickaxe", 3);
		
		refined_basalt = new BlockBuildingBlock("refined_basalt", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		refined_basalt.setHarvestLevel("pickaxe", 1);
		
		refined_gneiss = new BlockBuildingBlock("refined_gneiss", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		refined_gneiss.setHarvestLevel("pickaxe", 1);
		
		refined_marble = new BlockBuildingBlock("refined_marble", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		refined_marble.setHarvestLevel("pickaxe", 1);
		
		refined_shale = new BlockBuildingBlock("refined_shale", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		refined_shale.setHarvestLevel("pickaxe", 1);
		
		basalt_bricks = new BlockBuildingBlock("basalt_bricks", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		basalt_bricks.setHarvestLevel("pickaxe", 1);
		
		gneiss_bricks = new BlockBuildingBlock("gneiss_bricks", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		gneiss_bricks.setHarvestLevel("pickaxe", 1);
		
		marble_bricks = new BlockBuildingBlock("marble_bricks", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		marble_bricks.setHarvestLevel("pickaxe", 1);
		
		shale_bricks = new BlockBuildingBlock("shale_bricks", Material.ROCK).setHardness(4f).setResistance(20f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		shale_bricks.setHarvestLevel("pickaxe", 1);
		
		adamantium_block = new BlockResourcesBlock("adamantium_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		adamantium_block.setHarvestLevel("pickaxe", 1);
		
		aluminum_block = new BlockResourcesBlock("aluminum_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		aluminum_block.setHarvestLevel("pickaxe", 1);
		
		amber_block = new BlockResourcesBlock("amber_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		amber_block.setHarvestLevel("pickaxe", 1);
		
		amethyst_block = new BlockResourcesBlock("amethyst_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		amethyst_block.setHarvestLevel("pickaxe", 1);
		
		beryl_block = new BlockResourcesBlock("beryl_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		beryl_block.setHarvestLevel("pickaxe", 1);
		
		bronze_block = new BlockResourcesBlock("bronze_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		bronze_block.setHarvestLevel("pickaxe", 1);
		
		carbon_block = new BlockResourcesBlock("carbon_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		carbon_block.setHarvestLevel("pickaxe", 1);
		
		cobalt_block = new BlockResourcesBlock("cobalt_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		cobalt_block.setHarvestLevel("pickaxe", 1);
		
		copper_block = new BlockResourcesBlock("copper_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		copper_block.setHarvestLevel("pickaxe", 1);
		
		dwarf_star_alloy_block = new BlockResourcesBlock("dwarf_star_alloy_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		dwarf_star_alloy_block.setHarvestLevel("pickaxe", 1);
		
		elemental_block = new BlockResourcesBlock("elemental_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		elemental_block.setHarvestLevel("pickaxe", 1);
		
		enderite_block = new BlockResourcesBlock("enderite_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		enderite_block.setHarvestLevel("pickaxe", 1);
		
		energetic_block = new BlockResourcesBlock("energetic_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		energetic_block.setHarvestLevel("pickaxe", 1);
		
		iridium_block = new BlockResourcesBlock("iridium_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		iridium_block.setHarvestLevel("pickaxe", 1);
		
		lead_block = new BlockResourcesBlock("lead_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		lead_block.setHarvestLevel("pickaxe", 1);
		
		magnetite_block = new BlockResourcesBlock("magnetite_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		magnetite_block.setHarvestLevel("pickaxe", 1);
		
		malachite_block = new BlockResourcesBlock("malachite_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		malachite_block.setHarvestLevel("pickaxe", 1);
		
		nickel_block = new BlockResourcesBlock("nickel_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		nickel_block.setHarvestLevel("pickaxe", 1);
		
		onyx_block = new BlockResourcesBlock("onyx_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		onyx_block.setHarvestLevel("pickaxe", 1);
		
		peridot_block = new BlockResourcesBlock("peridot_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		peridot_block.setHarvestLevel("pickaxe", 1);
		
		ruby_block = new BlockResourcesBlock("ruby_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		ruby_block.setHarvestLevel("pickaxe", 1);
		
		selenite_block = new BlockResourcesBlock("selenite_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		selenite_block.setHarvestLevel("pickaxe", 1);
		
		silver_block = new BlockResourcesBlock("silver_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		silver_block.setHarvestLevel("pickaxe", 1);
		
		slimey_block = new BlockResourcesBlock("slimey_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		slimey_block.setHarvestLevel("pickaxe", 1);
		
		tin_block = new BlockResourcesBlock("tin_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		tin_block.setHarvestLevel("pickaxe", 1);
		
		vibranium_block = new BlockResourcesBlock("vibranium_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		vibranium_block.setHarvestLevel("pickaxe", 1);
		
		zinc_block = new BlockResourcesBlock("zinc_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		zinc_block.setHarvestLevel("pickaxe", 1);
		
		reinforced_sand = new BlockReinforcedSand("reinforced_sand", Material.SAND).setHardness(10f).setResistance(2000f).setCreativeTab(VanillaEvolutionMod.blockstab);
		reinforced_sand.setHarvestLevel("shovel", -1);
		
		blue_moon_quartz_block = new BlockBuildingBlock("blue_moon_quartz_block", Material.ROCK).setHardness(8f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		blue_moon_quartz_block.setHarvestLevel("pickaxe", -1);
		
		blue_moon_quartz_bricks = new BlockBuildingBlock("blue_moon_quartz_bricks", Material.ROCK).setHardness(8f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		blue_moon_quartz_bricks.setHarvestLevel("pickaxe", -1);
		
		lead_bricks = new BlockBuildingBlock("lead_bricks", Material.ROCK).setHardness(10f).setResistance(2000f).setCreativeTab(VanillaEvolutionMod.buildingtab);
		lead_bricks.setHarvestLevel("pickaxe", 0);
		
		ultrafood_block = new BlockResourcesBlock("ultrafood_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		ultrafood_block.setHarvestLevel("pickaxe", 1);
		
		superfood_block = new BlockResourcesBlock("superfood_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		superfood_block.setHarvestLevel("pickaxe", 1);
		
		seasonal_block = new BlockResourcesBlock("seasonal_block", Material.ROCK).setHardness(4f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		seasonal_block.setHarvestLevel("pickaxe", 1);
		
		evolved_sand = new BlockReinforcedSand("evolved_sand", Material.SAND).setHardness(5f).setResistance(2f).setCreativeTab(VanillaEvolutionMod.blockstab);
		evolved_sand.setHarvestLevel("shovel", -1);
		
		evolved_sandstone = new BlockResourcesBlock("evolved_sandstone", Material.ROCK).setHardness(8f).setResistance(200f).setCreativeTab(VanillaEvolutionMod.blockstab);
		evolved_sandstone.setHarvestLevel("pickaxe", 0);
		
		magenta_lamp = new BlockLamp("magenta_lamp", Material.REDSTONE_LIGHT).setHardness(2f).setResistance(5f).setLightLevel(1f).setLightOpacity(1).setCreativeTab(VanillaEvolutionMod.buildingtab);
		red_lamp = new BlockLamp("red_lamp", Material.REDSTONE_LIGHT).setHardness(2f).setResistance(5f).setLightLevel(1f).setLightOpacity(1).setCreativeTab(VanillaEvolutionMod.buildingtab);
		blue_lamp = new BlockLamp("blue_lamp", Material.REDSTONE_LIGHT).setHardness(2f).setResistance(5f).setLightLevel(1f).setLightOpacity(1).setCreativeTab(VanillaEvolutionMod.buildingtab);
		green_lamp = new BlockLamp("green_lamp", Material.REDSTONE_LIGHT).setHardness(2f).setResistance(5f).setLightLevel(1f).setLightOpacity(1).setCreativeTab(VanillaEvolutionMod.buildingtab);
		yellow_lamp = new BlockLamp("yellow_lamp", Material.REDSTONE_LIGHT).setHardness(2f).setResistance(5f).setLightLevel(1f).setLightOpacity(1).setCreativeTab(VanillaEvolutionMod.buildingtab);
		white_lamp = new BlockLamp("white_lamp", Material.REDSTONE_LIGHT).setHardness(2f).setResistance(5f).setLightLevel(1f).setLightOpacity(1).setCreativeTab(VanillaEvolutionMod.buildingtab);
		scaffolding = new BlockScaffolding("scaffolding", Material.WOOD).setHardness(0f).setResistance(0f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		tomato_crop = new BlockTomatoCrop("tomato_crop");
		strawberry_crop = new BlockStrawberryCrop("strawberry_crop");
		cherry_crop = new BlockCherryCrop("cherry_crop");
		blueberry_crop = new BlockBlueberryCrop("blueberry_crop");
		cotton_crop = new BlockCottonCrop("cotton_crop");
		corn_crop = new BlockCornCrop("corn_crop");
		mint_crop = new BlockMintCrop("mint_crop");
		banana_crop = new BlockBananaCrop("banana_crop");
		vanilla_crop = new BlockVanillaCrop("vanilla_crop");
		maple_crop = new BlockMapleCrop("maple_crop");
		cinnamon_crop = new BlockCinnamonCrop("cinnamon_crop");
		barley_crop = new BlockBarleyCrop("barley_crop");
		oat_crop = new BlockOatCrop("oat_crop");
		rye_crop = new BlockRyeCrop("rye_crop");
		ginger_crop = new BlockGingerCrop("ginger_crop");
		peanut_crop = new BlockPeanutCrop("peanut_crop");
		pecan_crop = new BlockPecanCrop("pecan_crop");
		walnut_crop = new BlockWalnutCrop("walnut_crop");
		rhubarb_crop = new BlockRhubarbCrop("rhubarb_crop");
		eggplant_crop = new BlockEggplantCrop("eggplant_crop");
		peach_crop = new BlockPeachCrop("peach_crop");
		pineapple_crop = new BlockPineappleCrop("pineapple_crop");
		raspberry_crop = new BlockRaspberryCrop("raspberry_crop");
		garlic_crop = new BlockGarlicCrop("garlic_crop");
		green_bean_crop = new BlockGreenBeanCrop("green_bean_crop");
		onion_crop = new BlockOnionCrop("onion_crop");
}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(malachite_ore, bacon_ore, torch_ore, wood_ore, limestone, basalt, gneiss, shale, nickel_ore, bauxite_ore, aluminum_ore, silver_ore, lead_ore,
				zinc_ore, carbon_ore, tin_ore, copper_ore, cobalt_ore, meteorite_ore, enderite_ore, ultrafood_ore, superfood_ore, amber_ore, onyx_ore, seasonal_ore, ruby_ore,
				peridot_ore, amethyst_ore, adamantium_ore, vibranium_ore, dwarf_star_alloy_ore, slime_ore, energetic_ore, ancient_ore, elemental_ore, selenite_ore, marble,
				beryl_ore, magnetite_ore, refined_basalt, refined_gneiss, refined_marble, refined_shale, basalt_bricks, gneiss_bricks, marble_bricks, shale_bricks, adamantium_block,
				aluminum_block, amber_block, amethyst_block, beryl_block, bronze_block, carbon_block, cobalt_block, copper_block, dwarf_star_alloy_block, elemental_block,
				enderite_block, energetic_block, iridium_block, lead_block, magnetite_block, malachite_block, nickel_block, onyx_block, peridot_block, ruby_block, selenite_block, 
				silver_block, slimey_block, tin_block, vibranium_block, zinc_block, reinforced_sand, magenta_lamp, red_lamp, blue_lamp, green_lamp, yellow_lamp, white_lamp, scaffolding,
				tomato_crop, strawberry_crop, cherry_crop, blueberry_crop, cotton_crop, corn_crop, mint_crop, banana_crop, vanilla_crop, maple_crop, cinnamon_crop, barley_crop,
				oat_crop, rye_crop, ginger_crop, peanut_crop, pecan_crop, walnut_crop, rhubarb_crop, blue_moon_quartz_block, blue_moon_quartz_bricks, lead_bricks, eggplant_crop, peach_crop,
				pineapple_crop, raspberry_crop, ultrafood_block, superfood_block, seasonal_block, evolved_sand, evolved_sandstone, garlic_crop, green_bean_crop, onion_crop);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(malachite_ore).setRegistryName(malachite_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(bacon_ore).setRegistryName(bacon_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(torch_ore).setRegistryName(torch_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(wood_ore).setRegistryName(wood_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(limestone).setRegistryName(limestone.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(basalt).setRegistryName(basalt.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(gneiss).setRegistryName(gneiss.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(shale).setRegistryName(shale.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(nickel_ore).setRegistryName(nickel_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(bauxite_ore).setRegistryName(bauxite_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(aluminum_ore).setRegistryName(aluminum_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(silver_ore).setRegistryName(silver_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(lead_ore).setRegistryName(lead_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(zinc_ore).setRegistryName(zinc_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(carbon_ore).setRegistryName(carbon_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tin_ore).setRegistryName(tin_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(copper_ore).setRegistryName(copper_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(cobalt_ore).setRegistryName(cobalt_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(meteorite_ore).setRegistryName(meteorite_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(enderite_ore).setRegistryName(enderite_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(ultrafood_ore).setRegistryName(ultrafood_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(superfood_ore).setRegistryName(superfood_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(amber_ore).setRegistryName(amber_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(onyx_ore).setRegistryName(onyx_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(seasonal_ore).setRegistryName(seasonal_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(ruby_ore).setRegistryName(ruby_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(peridot_ore).setRegistryName(peridot_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(amethyst_ore).setRegistryName(amethyst_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(adamantium_ore).setRegistryName(adamantium_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(vibranium_ore).setRegistryName(vibranium_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(dwarf_star_alloy_ore).setRegistryName(dwarf_star_alloy_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(slime_ore).setRegistryName(slime_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(energetic_ore).setRegistryName(energetic_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(ancient_ore).setRegistryName(ancient_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(elemental_ore).setRegistryName(elemental_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(selenite_ore).setRegistryName(selenite_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(marble).setRegistryName(marble.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(beryl_ore).setRegistryName(beryl_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(magnetite_ore).setRegistryName(magnetite_ore.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(refined_basalt).setRegistryName(refined_basalt.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(refined_gneiss).setRegistryName(refined_gneiss.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(refined_marble).setRegistryName(refined_marble.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(refined_shale).setRegistryName(refined_shale.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(basalt_bricks).setRegistryName(basalt_bricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(gneiss_bricks).setRegistryName(gneiss_bricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(marble_bricks).setRegistryName(marble_bricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(shale_bricks).setRegistryName(shale_bricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(adamantium_block).setRegistryName(adamantium_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(aluminum_block).setRegistryName(aluminum_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(amber_block).setRegistryName(amber_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(amethyst_block).setRegistryName(amethyst_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(beryl_block).setRegistryName(beryl_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(bronze_block).setRegistryName(bronze_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(carbon_block).setRegistryName(carbon_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(cobalt_block).setRegistryName(cobalt_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(copper_block).setRegistryName(copper_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(dwarf_star_alloy_block).setRegistryName(dwarf_star_alloy_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(elemental_block).setRegistryName(elemental_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(enderite_block).setRegistryName(enderite_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(energetic_block).setRegistryName(energetic_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(iridium_block).setRegistryName(iridium_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(lead_block).setRegistryName(lead_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(magnetite_block).setRegistryName(magnetite_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(malachite_block).setRegistryName(malachite_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(nickel_block).setRegistryName(nickel_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(onyx_block).setRegistryName(onyx_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(peridot_block).setRegistryName(peridot_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(ruby_block).setRegistryName(ruby_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(selenite_block).setRegistryName(selenite_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(silver_block).setRegistryName(silver_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(slimey_block).setRegistryName(slimey_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tin_block).setRegistryName(tin_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(vibranium_block).setRegistryName(vibranium_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(zinc_block).setRegistryName(zinc_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(reinforced_sand).setRegistryName(reinforced_sand.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(magenta_lamp).setRegistryName(magenta_lamp.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(red_lamp).setRegistryName(red_lamp.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(blue_lamp).setRegistryName(blue_lamp.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(green_lamp).setRegistryName(green_lamp.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(yellow_lamp).setRegistryName(yellow_lamp.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(white_lamp).setRegistryName(white_lamp.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(scaffolding).setRegistryName(scaffolding.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(blue_moon_quartz_block).setRegistryName(blue_moon_quartz_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(blue_moon_quartz_bricks).setRegistryName(blue_moon_quartz_bricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(lead_bricks).setRegistryName(lead_bricks.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(ultrafood_block).setRegistryName(ultrafood_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(superfood_block).setRegistryName(superfood_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(seasonal_block).setRegistryName(seasonal_block.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(evolved_sand).setRegistryName(evolved_sand.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(evolved_sandstone).setRegistryName(evolved_sandstone.getRegistryName()));

		VanillaEvolutionItems.tomato_seed = new ItemSeeds(VanillaEvolutionBlocks.tomato_crop, Blocks.FARMLAND).setRegistryName("tomato_seed").setUnlocalizedName("tomato_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.tomato_seed);

		VanillaEvolutionItems.strawberry_seed = new ItemSeeds(VanillaEvolutionBlocks.strawberry_crop, Blocks.FARMLAND).setRegistryName("strawberry_seed").setUnlocalizedName("strawberry_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.strawberry_seed);
		
		VanillaEvolutionItems.cherry_seed = new ItemSeeds(VanillaEvolutionBlocks.cherry_crop, Blocks.FARMLAND).setRegistryName("cherry_seed").setUnlocalizedName("cherry_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.cherry_seed);
		
		VanillaEvolutionItems.blueberry_seed = new ItemSeeds(VanillaEvolutionBlocks.blueberry_crop, Blocks.FARMLAND).setRegistryName("blueberry_seed").setUnlocalizedName("blueberry_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.blueberry_seed);
		
		VanillaEvolutionItems.cotton = new ItemSeeds(VanillaEvolutionBlocks.cotton_crop, Blocks.FARMLAND).setRegistryName("cotton").setUnlocalizedName("cotton").setCreativeTab(CreativeTabs.MATERIALS);
		event.getRegistry().register(VanillaEvolutionItems.cotton);
		
		VanillaEvolutionItems.corn_seed = new ItemSeeds(VanillaEvolutionBlocks.corn_crop, Blocks.FARMLAND).setRegistryName("corn_seed").setUnlocalizedName("corn_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.corn_seed);
		
		VanillaEvolutionItems.mint_seed = new ItemSeeds(VanillaEvolutionBlocks.mint_crop, Blocks.FARMLAND).setRegistryName("mint_seed").setUnlocalizedName("mint_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.mint_seed);
		
		VanillaEvolutionItems.banana_seed = new ItemSeeds(VanillaEvolutionBlocks.banana_crop, Blocks.FARMLAND).setRegistryName("banana_seed").setUnlocalizedName("banana_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.banana_seed);
		
		VanillaEvolutionItems.vanilla_seed = new ItemSeeds(VanillaEvolutionBlocks.vanilla_crop, Blocks.FARMLAND).setRegistryName("vanilla_seed").setUnlocalizedName("vanilla_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.vanilla_seed);
		
		VanillaEvolutionItems.maple_seed = new ItemSeeds(VanillaEvolutionBlocks.maple_crop, Blocks.FARMLAND).setRegistryName("maple_seed").setUnlocalizedName("maple_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.maple_seed);
		
		VanillaEvolutionItems.cinnamon_seed = new ItemSeeds(VanillaEvolutionBlocks.cinnamon_crop, Blocks.FARMLAND).setRegistryName("cinnamon_seed").setUnlocalizedName("cinnamon_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.cinnamon_seed);
		
		VanillaEvolutionItems.barley_seed = new ItemSeeds(VanillaEvolutionBlocks.barley_crop, Blocks.FARMLAND).setRegistryName("barley_seed").setUnlocalizedName("barley_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.barley_seed);
		
		VanillaEvolutionItems.oat_seed = new ItemSeeds(VanillaEvolutionBlocks.oat_crop, Blocks.FARMLAND).setRegistryName("oat_seed").setUnlocalizedName("oat_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.oat_seed);
		
		VanillaEvolutionItems.rye_seed = new ItemSeeds(VanillaEvolutionBlocks.rye_crop, Blocks.FARMLAND).setRegistryName("rye_seed").setUnlocalizedName("rye_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.rye_seed);
		
		VanillaEvolutionItems.ginger = new ItemSeeds(VanillaEvolutionBlocks.ginger_crop, Blocks.FARMLAND).setRegistryName("ginger").setUnlocalizedName("ginger").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.ginger);
		
		VanillaEvolutionItems.peanut_seed = new ItemSeeds(VanillaEvolutionBlocks.peanut_crop, Blocks.FARMLAND).setRegistryName("peanut_seed").setUnlocalizedName("peanut_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.peanut_seed);
		
		VanillaEvolutionItems.pecan_seed = new ItemSeeds(VanillaEvolutionBlocks.pecan_crop, Blocks.FARMLAND).setRegistryName("pecan_seed").setUnlocalizedName("pecan_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.pecan_seed);
		
		VanillaEvolutionItems.walnut_seed = new ItemSeeds(VanillaEvolutionBlocks.walnut_crop, Blocks.FARMLAND).setRegistryName("walnut_seed").setUnlocalizedName("walnut_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.walnut_seed);
		
		VanillaEvolutionItems.rhubarb_seed = new ItemSeeds(VanillaEvolutionBlocks.rhubarb_crop, Blocks.FARMLAND).setRegistryName("rhubarb_seed").setUnlocalizedName("rhubarb_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.rhubarb_seed);
		
		VanillaEvolutionItems.eggplant_seed = new ItemSeeds(VanillaEvolutionBlocks.eggplant_crop, Blocks.FARMLAND).setRegistryName("eggplant_seed").setUnlocalizedName("eggplant_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.eggplant_seed);
		
		VanillaEvolutionItems.peach_seed = new ItemSeeds(VanillaEvolutionBlocks.peach_crop, Blocks.FARMLAND).setRegistryName("peach_seed").setUnlocalizedName("peach_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.peach_seed);
		
		VanillaEvolutionItems.pineapple_seed = new ItemSeeds(VanillaEvolutionBlocks.pineapple_crop, Blocks.FARMLAND).setRegistryName("pineapple_seed").setUnlocalizedName("pineapple_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.pineapple_seed);
		
		VanillaEvolutionItems.raspberry_seed = new ItemSeeds(VanillaEvolutionBlocks.raspberry_crop, Blocks.FARMLAND).setRegistryName("raspberry_seed").setUnlocalizedName("raspberry_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.raspberry_seed);
		
		VanillaEvolutionItems.garlic = new ItemSeeds(VanillaEvolutionBlocks.garlic_crop, Blocks.FARMLAND).setRegistryName("garlic").setUnlocalizedName("garlic").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.garlic);
		
		VanillaEvolutionItems.green_bean_seed = new ItemSeeds(VanillaEvolutionBlocks.green_bean_crop, Blocks.FARMLAND).setRegistryName("green_bean_seed").setUnlocalizedName("green_bean_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.green_bean_seed);
		
		VanillaEvolutionItems.onion_seed = new ItemSeeds(VanillaEvolutionBlocks.onion_crop, Blocks.FARMLAND).setRegistryName("onion_seed").setUnlocalizedName("onion_seed").setCreativeTab(VanillaEvolutionMod.seedtab);
		event.getRegistry().register(VanillaEvolutionItems.onion_seed);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(malachite_ore));
		registerRender(Item.getItemFromBlock(bacon_ore));
		registerRender(Item.getItemFromBlock(torch_ore));
		registerRender(Item.getItemFromBlock(wood_ore));
		registerRender(Item.getItemFromBlock(limestone));
		registerRender(Item.getItemFromBlock(basalt));
		registerRender(Item.getItemFromBlock(gneiss));
		registerRender(Item.getItemFromBlock(shale));
		registerRender(Item.getItemFromBlock(nickel_ore));
		registerRender(Item.getItemFromBlock(bauxite_ore));
		registerRender(Item.getItemFromBlock(aluminum_ore));
		registerRender(Item.getItemFromBlock(silver_ore));
		registerRender(Item.getItemFromBlock(lead_ore));
		registerRender(Item.getItemFromBlock(zinc_ore));
		registerRender(Item.getItemFromBlock(carbon_ore));
		registerRender(Item.getItemFromBlock(tin_ore));
		registerRender(Item.getItemFromBlock(copper_ore));
		registerRender(Item.getItemFromBlock(cobalt_ore));
		registerRender(Item.getItemFromBlock(meteorite_ore));
		registerRender(Item.getItemFromBlock(enderite_ore));
		registerRender(Item.getItemFromBlock(ultrafood_ore));
		registerRender(Item.getItemFromBlock(superfood_ore));
		registerRender(Item.getItemFromBlock(amber_ore));
		registerRender(Item.getItemFromBlock(onyx_ore));
		registerRender(Item.getItemFromBlock(seasonal_ore));
		registerRender(Item.getItemFromBlock(ruby_ore));
		registerRender(Item.getItemFromBlock(peridot_ore));
		registerRender(Item.getItemFromBlock(amethyst_ore));
		registerRender(Item.getItemFromBlock(adamantium_ore));
		registerRender(Item.getItemFromBlock(vibranium_ore));
		registerRender(Item.getItemFromBlock(dwarf_star_alloy_ore));
		registerRender(Item.getItemFromBlock(slime_ore));
		registerRender(Item.getItemFromBlock(energetic_ore));
		registerRender(Item.getItemFromBlock(ancient_ore));
		registerRender(Item.getItemFromBlock(elemental_ore));
		registerRender(Item.getItemFromBlock(selenite_ore));
		registerRender(Item.getItemFromBlock(marble));
		registerRender(Item.getItemFromBlock(beryl_ore));
		registerRender(Item.getItemFromBlock(magnetite_ore));
		registerRender(Item.getItemFromBlock(refined_basalt));
		registerRender(Item.getItemFromBlock(refined_gneiss));
		registerRender(Item.getItemFromBlock(refined_marble));
		registerRender(Item.getItemFromBlock(refined_shale));
		registerRender(Item.getItemFromBlock(basalt_bricks));
		registerRender(Item.getItemFromBlock(gneiss_bricks));
		registerRender(Item.getItemFromBlock(marble_bricks));
		registerRender(Item.getItemFromBlock(shale_bricks));
		registerRender(Item.getItemFromBlock(adamantium_block));
		registerRender(Item.getItemFromBlock(aluminum_block));
		registerRender(Item.getItemFromBlock(amber_block));
		registerRender(Item.getItemFromBlock(amethyst_block));
		registerRender(Item.getItemFromBlock(beryl_block));
		registerRender(Item.getItemFromBlock(bronze_block));
		registerRender(Item.getItemFromBlock(carbon_block));
		registerRender(Item.getItemFromBlock(cobalt_block));
		registerRender(Item.getItemFromBlock(copper_block));
		registerRender(Item.getItemFromBlock(dwarf_star_alloy_block));
		registerRender(Item.getItemFromBlock(elemental_block));
		registerRender(Item.getItemFromBlock(enderite_block));
		registerRender(Item.getItemFromBlock(energetic_block));
		registerRender(Item.getItemFromBlock(iridium_block));
		registerRender(Item.getItemFromBlock(lead_block));
		registerRender(Item.getItemFromBlock(magnetite_block));
		registerRender(Item.getItemFromBlock(malachite_block));
		registerRender(Item.getItemFromBlock(nickel_block));
		registerRender(Item.getItemFromBlock(onyx_block));
		registerRender(Item.getItemFromBlock(peridot_block));
		registerRender(Item.getItemFromBlock(ruby_block));
		registerRender(Item.getItemFromBlock(selenite_block));
		registerRender(Item.getItemFromBlock(silver_block));
		registerRender(Item.getItemFromBlock(slimey_block));
		registerRender(Item.getItemFromBlock(tin_block));
		registerRender(Item.getItemFromBlock(vibranium_block));
		registerRender(Item.getItemFromBlock(zinc_block));
		registerRender(Item.getItemFromBlock(reinforced_sand));
		registerRender(Item.getItemFromBlock(magenta_lamp));
		registerRender(Item.getItemFromBlock(red_lamp));
		registerRender(Item.getItemFromBlock(blue_lamp));
		registerRender(Item.getItemFromBlock(green_lamp));
		registerRender(Item.getItemFromBlock(yellow_lamp));
		registerRender(Item.getItemFromBlock(white_lamp));
		registerRender(Item.getItemFromBlock(scaffolding));
		registerRender(Item.getItemFromBlock(blue_moon_quartz_block));
		registerRender(Item.getItemFromBlock(blue_moon_quartz_bricks));
		registerRender(Item.getItemFromBlock(lead_bricks));
		registerRender(Item.getItemFromBlock(ultrafood_block));
		registerRender(Item.getItemFromBlock(superfood_block));
		registerRender(Item.getItemFromBlock(seasonal_block));
		registerRender(Item.getItemFromBlock(evolved_sand));
		registerRender(Item.getItemFromBlock(evolved_sandstone));

	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
}
