package com.evep.evepmod;

import org.apache.logging.log4j.Logger;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionCrafting;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.proxy.CommonProxy;
import com.evep.evepmod.tabs.BlocksTab;
import com.evep.evepmod.tabs.BuildingTab;
import com.evep.evepmod.tabs.DessertTab;
import com.evep.evepmod.tabs.ElementTab;
import com.evep.evepmod.tabs.FoodTab;
import com.evep.evepmod.tabs.HeroTab;
import com.evep.evepmod.tabs.OresTab;
import com.evep.evepmod.tabs.ResourceTab;
import com.evep.evepmod.tabs.SeasonTab;
import com.evep.evepmod.tabs.SeedTab;
import com.evep.evepmod.tabs.SuperTab;
import com.evep.evepmod.tabs.ToolsTab;
import com.evep.evepmod.util.handlers.FuelHandler;
import com.evep.evepmod.util.handlers.RegistryHandler;
import com.evep.evepmod.world.gen.OreGen;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = VanillaEvolutionMod.MODID, name = VanillaEvolutionMod.NAME, version = VanillaEvolutionMod.VERSION, acceptedMinecraftVersions = VanillaEvolutionMod.ACCEPTED_MINECRAFT_VERSIONS)
public class VanillaEvolutionMod{
	
//	@SidedProxy(modId=VanillaEvolutionMod.MODID,clientSide=VanillaEvolutionMod.CLIENT_PROXY_CLASS, serverSide=VanillaEvolutionMod.SERVER_PROXY_CLASS)
//	public static IProxy proxy;
	
	@SidedProxy(clientSide = VanillaEvolutionMod.CLIENT_PROXY_CLASS, serverSide = VanillaEvolutionMod.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs resourcetab = new ResourceTab("resourcetab");
	public static final CreativeTabs toolstab = new ToolsTab("toolstab");
	public static final CreativeTabs elementtab = new ElementTab("elementtab");
	public static final CreativeTabs herotab = new HeroTab("herotab");
	public static final CreativeTabs seasontab = new SeasonTab("seasontab");
	public static final CreativeTabs foodtab = new FoodTab("foodtab");
	public static final CreativeTabs seedtab = new SeedTab("seedtab");
	public static final CreativeTabs dessertab = new DessertTab("dessertab");
	public static final CreativeTabs supertab = new SuperTab("supertab");
	public static final CreativeTabs orestab = new OresTab("orestab");
	public static final CreativeTabs buildingtab = new BuildingTab("buildingtab");
	public static final CreativeTabs blockstab = new BlocksTab("blockstab");
	
	public static final int gui_nickel_furnace = 0;
//	public static final int gui_test_chest = 1;
	
    public static final String MODID = "evep";
    public static final String NAME = "Vanilla Evolution";
    public static final String VERSION = "1.0.2";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12.2]";
   
	public static final String CLIENT_PROXY_CLASS = "com.evep.evepmod.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.evep.evepmod.proxy.CommonProxy";
	
	public static final int ENTITY_FROST_ZOMBIE = 1;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println(VanillaEvolutionMod.MODID + ":preInit");
        VanillaEvolutionItems.init();
        VanillaEvolutionBlocks.init();
        RegistryHandler.preInitRegistries();
        proxy.preInit();
    }

    @EventHandler
	public static void init(FMLInitializationEvent event) 
    {
		System.out.println(VanillaEvolutionMod.MODID + ":init");
		VanillaEvolutionCrafting.init();
		GameRegistry.registerFuelHandler(new FuelHandler());
		RegistryHandler.initRegistries(event);
		
																	//In Vein, Lowest, Highest, Chance - When it loads
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.malachite_ore, 10, 1, 48, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.bacon_ore, 6, 8, 64, 8), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.torch_ore, 6, 8, 64, 6), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.wood_ore, 6, 8, 64, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.limestone, 12, 50, 70, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.basalt, 12, 1, 15, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.gneiss, 12, 16, 35, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.shale, 12, 36, 49, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.nickel_ore, 8, 1, 32, 3), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.bauxite_ore, 4, 1, 28, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.silver_ore, 6, 1, 56, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.lead_ore, 6, 1, 60, 8), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.zinc_ore, 8, 1, 36, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.carbon_ore, 5, 1, 20, 2), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.tin_ore, 8, 1, 40, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.copper_ore, 12, 4, 52, 6), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.cobalt_ore, 8, 1, 48, 6), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.meteorite_ore, 4, 1, 100, 8), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.ultrafood_ore, 8, 1, 20, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.superfood_ore, 3, 1, 12, 3), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.amber_ore, 7, 1, 24, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.onyx_ore, 4, 1, 16, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.seasonal_ore, 8, 1, 32, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.ruby_ore, 8, 1, 28, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.peridot_ore, 6, 1, 12, 3), 1);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.amethyst_ore, 8, 1, 20, 5), 1);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.adamantium_ore, 4, 1, 24, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.vibranium_ore, 3, 1, 15, 3), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.dwarf_star_alloy_ore, 4, 1, 18, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.slime_ore, 9, 1, 28, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.energetic_ore, 4, 1, 20, 1), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.ancient_ore, 2, 1, 12, 2), 1);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.elemental_ore, 6, 1, 20, 1), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.selenite_ore, 8, 1, 24, 1), 0);
		

		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.beryl_ore, 6, 0, 255, 8, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.magnetite_ore, 8, 0, 255, 6, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.enderite_ore, 5, 0, 255, 10, 1, BlockMatcher.forBlock(Blocks.END_STONE)), 0);
	}
    
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) 
    {
		System.out.println(VanillaEvolutionMod.MODID + ":postInit");
		RegistryHandler.postInitRegistries();
	}
    
   @Instance
   public static VanillaEvolutionMod instance;
}
