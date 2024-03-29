package com.evep.evepmod;

import org.apache.logging.log4j.Logger;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionCrafting;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.items.armor.ItemCloakBoots;
import com.evep.evepmod.proxy.CommonProxy;
import com.evep.evepmod.tabs.BlocksTab;
import com.evep.evepmod.tabs.BuildingTab;
import com.evep.evepmod.tabs.DessertTab;
import com.evep.evepmod.tabs.FoodTab;
import com.evep.evepmod.tabs.MobTab;
import com.evep.evepmod.tabs.OresTab;
import com.evep.evepmod.tabs.ResourceTab;
import com.evep.evepmod.tabs.SeasonTab;
import com.evep.evepmod.tabs.SeedTab;
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
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = VanillaEvolutionMod.MODID, name = VanillaEvolutionMod.NAME, version = VanillaEvolutionMod.VERSION, acceptedMinecraftVersions = VanillaEvolutionMod.ACCEPTED_MINECRAFT_VERSIONS)
public class VanillaEvolutionMod{
	
//	@SidedProxy(modId=VanillaEvolutionMod.MODID,clientSide=VanillaEvolutionMod.CLIENT_PROXY_CLASS, serverSide=VanillaEvolutionMod.SERVER_PROXY_CLASS)
//	public static IProxy proxy;
	
	@SidedProxy(clientSide = VanillaEvolutionMod.CLIENT_PROXY_CLASS, serverSide = VanillaEvolutionMod.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs resourcetab = new ResourceTab("resourcetab");
	public static final CreativeTabs toolstab = new ToolsTab("toolstab");
	public static final CreativeTabs seasontab = new SeasonTab("seasontab");
	public static final CreativeTabs mobtab = new MobTab("mobtab");
	public static final CreativeTabs foodtab = new FoodTab("foodtab");
	public static final CreativeTabs seedtab = new SeedTab("seedtab");
	public static final CreativeTabs dessertab = new DessertTab("dessertab");
	public static final CreativeTabs orestab = new OresTab("orestab");
	public static final CreativeTabs buildingtab = new BuildingTab("buildingtab");
	public static final CreativeTabs blockstab = new BlocksTab("blockstab");
	
//	public static final int gui_nickel_furnace = 0;
//	public static final int gui_test_chest = 1;
	
    public static final String MODID = "evep";
    public static final String NAME = "Vanilla Evolution";
    public static final String VERSION = "1.6.3";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12.2]";
   
	public static final String CLIENT_PROXY_CLASS = "com.evep.evepmod.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.evep.evepmod.proxy.CommonProxy";
	
	//Mob Id
	public static final int ENTITY_FROST_ZOMBIE = 1;
	public static final int ENTITY_BEAST = 2;
	public static final int ENTITY_ARID_SKELETON = 3;
	public static final int ENTITY_TURKEY = 4;
	public static final int ENTITY_KRAMPUS = 5;
	public static final int ENTITY_CACTUS_BUG = 6;
	public static final int ENTITY_BASILISK = 7;
	public static final int ENTITY_MINOTAUR = 8;
	public static final int ENTITY_DWARVEN_MINER = 9;
	public static final int ENTITY_DWARVEN_HUNTER = 10;
	public static final int ENTITY_DWARVEN_GUARD = 11;
	public static final int ENTITY_DWARVEN_GOLEM = 12;
	public static final int ENTITY_WINTER_SQUIRE = 13;
	public static final int ENTITY_LION = 14;
	public static final int ENTITY_DIREWOLF = 15;
	public static final int ENTITY_IMMJIRI_CHAMPION = 16;
	public static final int ENTITY_EARTH_GUARDIAN = 17;
	public static final int ENTITY_KNOWLEDGE_LORD = 18;
	
	//Projectile ID
	public static final int ENTITY_TECH_ARROW = 100;
	
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println(VanillaEvolutionMod.MODID + ":preInit");
        VanillaEvolutionItems.init();
        VanillaEvolutionBlocks.init();
        RegistryHandler.preInitRegistries(event);
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
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.bauxite_ore, 4, 1, 28, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.tin_ore, 8, 1, 40, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.copper_ore, 12, 4, 52, 6), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.meteorite_ore, 6, 1, 100, 9), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.ultrafood_ore, 8, 1, 20, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.superfood_ore, 3, 1, 12, 3), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.seasonal_ore, 8, 1, 32, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.ruby_ore, 8, 1, 28, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.peridot_ore, 6, 1, 12, 3), 1);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.amethyst_ore, 8, 1, 20, 5), 1);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.adamantium_ore, 4, 1, 24, 4), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.vibranium_ore, 3, 1, 15, 3), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.slime_ore, 9, 1, 28, 5), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.energetic_ore, 4, 1, 20, 1), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.elemental_ore, 6, 1, 20, 1), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.selenite_ore, 8, 1, 24, 1), 0);
		
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.beryl_ore, 6, 0, 255, 8, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.magnetite_ore, 8, 0, 255, 6, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.silver_ore, 6, 0, 255, 12, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.lead_ore, 6, 0, 255, 11, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.onyx_ore, 4, 0, 255, 7, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.amber_ore, 7, 0, 255, 8, -1, BlockMatcher.forBlock(Blocks.NETHERRACK)), 0);
	
		
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.enderite_ore, 5, 0, 255, 10, 1, BlockMatcher.forBlock(Blocks.END_STONE)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.zinc_ore, 8, 0, 255, 12, 1, BlockMatcher.forBlock(Blocks.END_STONE)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.dwarf_star_alloy_ore, 4, 0, 255, 11, 1, BlockMatcher.forBlock(Blocks.END_STONE)), 0);

		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_ore, 8, 0, 255, 8, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_uranium_ore, 5, 0, 255, 8, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_titanium_ore, 5, 0, 255, 7, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_iron_ore, 10, 0, 255, 13, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_diamond_ore, 8, 0, 255, 7, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_emerald_ore, 3, 0, 255, 6, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_nickel_ore, 10, 0, 255, 14, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_carbon_ore, 6, 0, 255, 9, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_meteorite_ore, 5, 0, 255, 11, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_elemental_ore, 4, 0, 255, 7, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_ancient_ore, 3, 0, 255, 7, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_magnetite_ore, 6, 0, 255, 8, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_energetic_ore, 5, 0, 255, 7, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);
		GameRegistry.registerWorldGenerator(new OreGen(VanillaEvolutionBlocks.earth_superfood_ore, 3, 0, 255, 8, 2, BlockMatcher.forBlock(VanillaEvolutionBlocks.earthen_stone)), 0);

	}
    
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) 
    {
		System.out.println(VanillaEvolutionMod.MODID + ":postInit");
		RegistryHandler.postInitRegistries();
	}
    
    @EventHandler
    public static void serverInt(FMLServerStartingEvent event) {RegistryHandler.serverRegistries(event);}
    
   @Instance
   public static VanillaEvolutionMod instance;
}
