package com.evep.evepmod.init;

import java.util.ArrayList;
import java.util.List;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.items.*;
import com.evep.evepmod.items.armor.ItemBeastArmor;
import com.evep.evepmod.items.armor.ItemCAArmor;
import com.evep.evepmod.items.armor.ItemCobaltArmor;
import com.evep.evepmod.items.armor.ItemElementArmor;
import com.evep.evepmod.items.armor.ItemElementArmor2;
import com.evep.evepmod.items.armor.ItemEnderiteArmor;
import com.evep.evepmod.items.armor.ItemExosuitArmor;
import com.evep.evepmod.items.armor.ItemFlashArmor;
import com.evep.evepmod.items.armor.ItemNightsWatchArmor;
import com.evep.evepmod.items.armor.ItemPajamaArmor;
import com.evep.evepmod.items.armor.ItemPantherArmor;
import com.evep.evepmod.items.armor.ItemProminentArmor;
import com.evep.evepmod.items.armor.ItemPurgeMask;
import com.evep.evepmod.items.armor.ItemRubyArmor;
import com.evep.evepmod.items.armor.ItemSeleniteArmor;
import com.evep.evepmod.items.armor.ItemSlimeArmor;
import com.evep.evepmod.items.armor.ItemTechArmor;
import com.evep.evepmod.items.armor.ItemWarBonnet;
import com.evep.evepmod.items.armor.ItemWolverineArmor;
import com.evep.evepmod.items.tools.ItemAirAxe;
import com.evep.evepmod.items.tools.ItemAmethystAxe;
import com.evep.evepmod.items.tools.ItemAmethystHoe;
import com.evep.evepmod.items.tools.ItemAmethystPickaxe;
import com.evep.evepmod.items.tools.ItemAmethystPickhoxel;
import com.evep.evepmod.items.tools.ItemAmethystShovel;
import com.evep.evepmod.items.tools.ItemAmethystSword;
import com.evep.evepmod.items.tools.ItemAssassin;
import com.evep.evepmod.items.tools.ItemBronzeAxe;
import com.evep.evepmod.items.tools.ItemBronzeHoe;
import com.evep.evepmod.items.tools.ItemBronzePickaxe;
import com.evep.evepmod.items.tools.ItemBronzePickhoxel;
import com.evep.evepmod.items.tools.ItemBronzeShovel;
import com.evep.evepmod.items.tools.ItemBronzeSword;
import com.evep.evepmod.items.tools.ItemCAShield;
import com.evep.evepmod.items.tools.ItemCapitalismAxe;
import com.evep.evepmod.items.tools.ItemCuriosity;
import com.evep.evepmod.items.tools.ItemDragonglassArakh;
import com.evep.evepmod.items.tools.ItemDragonglassAxe;
import com.evep.evepmod.items.tools.ItemDragonglassSpear;
import com.evep.evepmod.items.tools.ItemEarthPickaxe;
import com.evep.evepmod.items.tools.ItemEnderSword;
import com.evep.evepmod.items.tools.ItemEndericPickhoxel;
import com.evep.evepmod.items.tools.ItemEnderitePickaxe;
import com.evep.evepmod.items.tools.ItemEnderiteSword;
import com.evep.evepmod.items.tools.ItemFireSword;
import com.evep.evepmod.items.tools.ItemHeartSword;
import com.evep.evepmod.items.tools.ItemIce;
import com.evep.evepmod.items.tools.ItemLightsaber;
import com.evep.evepmod.items.tools.ItemMalachiteAxe;
import com.evep.evepmod.items.tools.ItemMalachiteHoe;
import com.evep.evepmod.items.tools.ItemMalachitePickaxe;
import com.evep.evepmod.items.tools.ItemMalachiteShovel;
import com.evep.evepmod.items.tools.ItemMalachiteSword;
import com.evep.evepmod.items.tools.ItemOathkeeper;
import com.evep.evepmod.items.tools.ItemOculus;
import com.evep.evepmod.items.tools.ItemOnyxPickaxe;
import com.evep.evepmod.items.tools.ItemPantherClaws;
import com.evep.evepmod.items.tools.ItemPeridotAxe;
import com.evep.evepmod.items.tools.ItemPeridotHoe;
import com.evep.evepmod.items.tools.ItemPeridotPickaxe;
import com.evep.evepmod.items.tools.ItemPeridotShovel;
import com.evep.evepmod.items.tools.ItemPeridotSword;
import com.evep.evepmod.items.tools.ItemPulverizer;
import com.evep.evepmod.items.tools.ItemRubyAxe;
import com.evep.evepmod.items.tools.ItemRubyHoe;
import com.evep.evepmod.items.tools.ItemRubyPickaxe;
import com.evep.evepmod.items.tools.ItemRubyShovel;
import com.evep.evepmod.items.tools.ItemRubySword;
import com.evep.evepmod.items.tools.ItemSelenitePickaxe;
import com.evep.evepmod.items.tools.ItemSeleniteSword;
import com.evep.evepmod.items.tools.ItemSlimeSword;
import com.evep.evepmod.items.tools.ItemTechArm;
import com.evep.evepmod.items.tools.ItemTerrorizer;
import com.evep.evepmod.items.tools.ItemWaterShovel;
import com.evep.evepmod.items.tools.ItemWidowWail;
import com.evep.evepmod.items.tools.ItemWolverineClaws;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=VanillaEvolutionMod.MODID)

public class VanillaEvolutionItems {
	
	public static ItemMalachiteIngot malachite_ingot;
	public static ItemMalachiteSword malachite_sword;
	public static ItemMalachitePickaxe malachite_pickaxe;
	public static ItemMalachiteAxe malachite_axe;
	public static ItemMalachiteShovel malachite_shovel;
	public static ItemMalachiteHoe malachite_hoe;
	public static ItemMeteoriteShard meteorite_shard;
	public static ItemNickelIngot nickel_ingot;
	public static ItemAluminumIngot aluminum_ingot;
	public static ItemSilverIngot silver_ingot;
	public static ItemLeadIngot lead_ingot;
	public static ItemZincIngot zinc_ingot;
	public static ItemCarbonIngot carbon_ingot;
	public static ItemTinIngot tin_ingot;
	public static ItemCopperIngot copper_ingot;
	public static ItemCobaltIngot cobalt_ingot;
	public static ItemEnderite enderite;
	public static ItemUltrafoodGem ultrafood_gem;
	public static ItemSuperfoodGem superfood_gem;
	public static ItemAmber amber;
	public static ItemOnyx onyx;
	public static ItemSeasonalGem seasonal_gem;
	public static ItemRuby ruby;
	public static ItemPeridot peridot;
	public static ItemAmethyst amethyst;
	public static ItemAdamantiumIngot adamantium_ingot;
	public static ItemVibranium vibranium;
	public static ItemDwarfStarAlloy dwarf_star_alloy;
	public static ItemSlimeGem slime_gem;
	public static ItemEnergeticOrb energetic_orb;
	public static ItemAncientLocket ancient_locket;
	public static ItemElementalIngot elemental_ingot;
	public static ItemSelenite selenite;
	public static ItemEnderiteSword enderite_sword;
	public static ItemEnderitePickaxe enderite_pickaxe;
	public static ItemPeridotSword peridot_sword;
	public static ItemPeridotPickaxe peridot_pickaxe;
	public static ItemPeridotAxe peridot_axe;
	public static ItemPeridotShovel peridot_shovel;
	public static ItemPeridotHoe peridot_hoe;
	public static ItemAmethystSword amethyst_sword;
	public static ItemAmethystPickaxe amethyst_pickaxe;
	public static ItemAmethystAxe amethyst_axe;
	public static ItemAmethystShovel amethyst_shovel;
	public static ItemAmethystHoe amethyst_hoe;
	public static ItemAmethystPickhoxel amethyst_pickhoxel;
	public static ItemBeryl beryl;
	public static ItemMagnetiteIngot magnetite_ingot;
	public static ItemBronzeIngot bronze_ingot;
	public static ItemIridiumIngot iridium_ingot;
	public static ItemSlimeyStuffs enchanted_slime_gem;
	public static ItemSlimeyStuffs infused_slime_gem;
	public static ItemSlimeyStuffs magical_slime_gem;
	public static ItemSlimeyStuffs evolved_slime_gem;
	public static ItemImbuedRod imbued_rod;
	public static ItemSlimeSword slime_sword;
	public static ItemBronzeSword bronze_sword;
	public static ItemBronzePickaxe bronze_pickaxe;
	public static ItemBronzeAxe bronze_axe;
	public static ItemBronzeShovel bronze_shovel;
	public static ItemBronzeHoe bronze_hoe;
	public static ItemBronzePickhoxel bronze_pickhoxel;
	public static ItemSeleniteSword selenite_sword;
	public static ItemSelenitePickaxe selenite_pickaxe;
	public static ItemOnyxPickaxe onyx_pickaxe;
	public static ItemSlimeyStuffs remarkable_slimeball;
	public static ItemSlimeyStuffs mythical_slimeball;
	public static ItemRubySword ruby_sword;
	public static ItemRubyPickaxe ruby_pickaxe;
	public static ItemRubyAxe ruby_axe;
	public static ItemRubyShovel ruby_shovel;
	public static ItemRubyHoe ruby_hoe;
	public static ItemAncientLocket amber_locket;
	public static ItemBronzeIngot steel_ingot;
	public static ItemGraphite graphite;
	public static ItemTechnology silicon_chunk;
	public static ItemTechnology silicon;
	public static ItemTechnology concrete_dust;
	public static ItemTechnology aluminum_sheet;
	public static ItemTechnology nickel_sheet;
	public static ItemTechnology polymer;
	public static ItemTechnology electronic;
	public static ItemTechnology computer_chip;
	public static ItemTechnology control_panel;
	public static ItemTechnology visor;
	public static ItemTechnology aluminum_wire;
	public static ItemTechnology copper_wire;
	public static ItemTechnology basic_wire;
	public static ItemTechnology advanced_wire;
	public static ItemTechnology prominent_wire;
	public static ItemTechnology basic_battery;
	public static ItemTechnology advanced_battery;
	public static ItemTechnology prominent_battery;
	public static ItemTechArm tech_arm;
	public static ItemKnife knife;
	public static ItemAnimalFat animal_fat;
	public static ItemGrease grease;
	public static ItemBacon bacon;
	public static Item tomato_seed;
	public static ItemTomato tomato;
	public static ItemStrawberry strawberry;
	public static ItemBlueberry blueberry;
	public static ItemCherry cherry;
	public static Item strawberry_seed;
	public static Item cherry_seed;
	public static Item blueberry_seed;
	public static Item cotton;
	public static ItemCorn corn;
	public static ItemMint mint;
	public static ItemBanana banana;
	public static ItemVanilla vanilla;
	public static ItemMaple maple;
	public static ItemCinnamon cinnamon;
	public static ItemGrain barley;
	public static ItemGrain oat;
	public static ItemGrain rye;
	public static Item corn_seed;
	public static Item mint_seed;
	public static Item banana_seed;
	public static Item vanilla_seed;
	public static Item maple_seed;
	public static Item cinnamon_seed;
	public static Item barley_seed;
	public static Item oat_seed;
	public static Item rye_seed;
	public static Item ginger;
	public static ItemPeanut peanut;
	public static ItemPeanut pecan;
	public static ItemPeanut walnut;
	public static ItemRhubarb rhubarb;
	public static Item peanut_seed;
	public static Item pecan_seed;
	public static Item walnut_seed;
	public static Item rhubarb_seed;
	public static ItemWhisk whisk;
	public static ItemCream cream;
	public static ItemCream whipped_cream;
	public static ItemCream butter;
	public static ItemCream cream_cheese;
	public static ItemCream cheese;
	public static ItemBaking crust;
	public static ItemChocolate chocolate;
	public static ItemBaking flour;
	public static ItemBaking salt;
	public static ItemBaking cornstarch;
	public static ItemBaking baking_soda;
	public static ItemBaking baking_powder;
	public static ItemBaking vegetable_oil;
	public static ItemBaking funnel_cake_mixture;
	public static ItemBaking brown_sugar;
	public static ItemCracker graham_cracker;
	public static ItemMarshmallow marshmallow;
	public static ItemBaking ice_cream_cone;
	public static ItemSyrup molasses;
	public static ItemSyrup syrup;
	public static ItemSyrup corn_syrup;
	public static ItemSyrup dark_corn_syrup;
	public static ItemFudge fudge;
	public static ItemBrownie brownie;
	public static ItemMintBrownie mint_brownie;
	public static ItemBlondie blondie;
	public static ItemSmore smore;
	public static ItemCupcake cupcake;
	public static ItemBananaBread banana_bread;
	public static ItemVanillaIceCream vanilla_ice_cream;
	public static ItemChocolateIceCream chocolate_ice_cream;
	public static ItemMintIceCream mint_ice_cream;
	public static ItemStrawberryIceCream strawberry_ice_cream;
	public static ItemCookieCreamIceCream cookies_and_cream_ice_cream;
	public static ItemFunnelCake funnel_cake;
	public static ItemCheeseake cheesecake;
	public static ItemChocolateCake chocolate_cake;
	public static ItemAngelFoodCake angel_food_cake;
	public static ItemIceCreamCake ice_cream_cake;
	public static ItemApplePie apple_pie;
	public static ItemPecanPie pecan_pie;
	public static ItemBlueberryPie blueberry_pie;
	public static ItemCherryPie cherry_pie;
	public static ItemStrawberryPie strawberry_pie;
	public static ItemFrenchSilkPie french_silk_pie;
	public static ItemRhubarbPie rhubarb_pie;
	public static ItemDoubleChocolateCookie double_chocolate_cookie;
	public static ItemSmoreCookie smore_cookie;
	public static ItemElements earth_shard;
	public static ItemElements earth_ingot;
	public static ItemEarthPickaxe earth_pickaxe;
	public static ItemElements water_shard;
	public static ItemElements water_ingot;
	public static ItemWaterShovel water_shovel;
	public static ItemElements air_shard;
	public static ItemElements air_ingot;
	public static ItemAirAxe air_axe;
	public static ItemElements fire_shard;
	public static ItemElements fire_ingot;
	public static ItemFireSword fire_sword;
	public static ItemSoul shattered_soul;
	public static ItemSoul soul;
	public static ItemPowerStone power_stone;
	public static ItemSpaceStone space_stone;
	public static ItemRealityStone reality_stone;
	public static ItemSoulStone soul_stone;
	public static ItemTimeStone time_stone;
	public static ItemMindStone mind_stone;
	public static ItemInfinityGauntlet infinity_gauntlet;
	public static ItemWolverineClaws wolverine_claws;
	public static ItemPantherClaws panther_claws;
	public static ItemBallisticNylon ballistic_nylon;
	public static ItemCAShield captain_shield;
	public static ItemEnderResource portal_stone;
	public static ItemEnderResource ender_stone;
	public static ItemEnderSword ender_sword;
	public static ItemCurious curious_powder;
	public static ItemCuriosity curiosity;
	public static ItemTerrorizer terrorizer;
	public static ItemBlueMoon blue_moon_quartz;
	public static ItemAssassin assassin;
	public static ItemPulverizer pulverizer;
	public static ItemAtomicSplicer atomic_splicer;
	public static ItemChargedAtomicSplicer charged_atomic_splicer;
	public static ItemAtom atom;
	public static ItemSeasonalGem winter_gem;
	public static ItemSeasonalGem spring_gem;
	public static ItemSeasonalGem summer_gem;
	public static ItemSeasonalGem autumn_gem;
	public static ItemHeartGem heart_gem;
	public static ItemHeartCandy heart_candy;
	public static ItemHeartSword heart_sword;
	public static ItemEggplant eggplant;
	public static ItemPeach peach;
	public static ItemPineapple pineapple;
	public static ItemRaspberry raspberry;
	public static Item eggplant_seed;
	public static Item peach_seed;
	public static Item pineapple_seed;
	public static Item raspberry_seed;
	public static ItemGoldenPotato golden_potato;
	public static ItemGoldenBeetroot golden_beetroot;
	public static ItemGoldenEggplant golden_eggplant;
	public static ItemGoldenPeach golden_peach;
	public static ItemGoldenPineapple golden_pineapple;
	public static ItemPeachCobbler peach_cobbler;
	public static ItemUltrafood ultra_potato;
	public static ItemUltrafood ultra_berry;
	public static ItemSugaredFlesh sugared_flesh;
	public static ItemASSJW night_steel;
	public static ItemASSJW enderic_alloy;
	public static ItemASSJW charged_beryl;
	public static ItemASSJW mysterious_moss_ball;
	public static ItemCapitalismAxe axe_of_capitalism;
	public static ItemOculus oculus;
	public static ItemGOT dragonglass;
	public static ItemGOT valyrian_steel;
	public static ItemLongclaw longclaw;
	public static ItemIce ice;
	public static ItemOathkeeper oathkeeper;
	public static ItemWidowWail widow_wail;
	public static ItemDragonglassArakh dragonglass_arakh;
	public static ItemDragonglassSpear dragonglass_spear;
	public static ItemDragonglassAxe dragonglass_axe;
	public static ItemNeedle needle;
	public static ItemCatspaw catspaw_dagger;
	public static ItemLightning mjolnir;
	public static ItemLightning stormbreaker;
	public static ItemKyber kyber_crystal;
	public static ItemLightsaber saber_blue;
	public static ItemLightsaber saber_green;
	public static ItemLightsaber saber_purple;
	public static ItemLightsaber saber_red;
	public static ItemEndericPickhoxel enderic_pickhoxel;
	public static ItemFrozenFlesh frozen_flesh;
	public static ItemPulsatingShard pulsating_shard;
	public static ItemDustBone dust_bone;
	public static ItemPeanutButter peanut_butter;
	public static ItemBaking uncooked_caramel;
	public static ItemBaking caramel;
	public static ItemBaking fondant;
	public static ItemBaking jelly_bean_mold;
	public static ItemPeanutButterCup peanut_butter_cup;
	public static ItemCaramelChocolateBar caramel_chocolate_bar;
	public static ItemPeanutChocolateBar peanut_chocolate_bar;
	public static ItemCandyCorn candy_corn;
	public static ItemJellyBeans jelly_beans;
	public static ItemCaramelApple caramel_apple;
	public static ItemWishbone wishbone;
	public static ItemTurkeyFeather turkey_feather;
	public static ItemRawTurkey raw_turkey;
	public static ItemCookedTurkey cooked_turkey;
	public static Item garlic;
	public static Item green_bean_seed;
	public static ItemGreenBeans green_beans;
	public static Item onion_seed;
	public static ItemOnion onion;
	public static ItemMasher masher;
	public static ItemGravy gravy;
	public static ItemMPotatoes mashed_potatoes;
	public static ItemMPotatoesG mashed_potatoes_gravy;
	public static ItemStuffing stuffing;
	public static ItemGBC green_bean_casserole;
	public static ItemHungerPill hunger_pill;
//	public static ItemTimeClock time_master_clock;
	
	public static ItemEnderiteArmor enderite_helmet;
	public static ItemEnderiteArmor enderite_chestplate;
	public static ItemEnderiteArmor enderite_leggings;
	public static ItemEnderiteArmor enderite_boots;
	
	public static ItemSlimeArmor slime_helmet;
	public static ItemSlimeArmor slime_chestplate;
	public static ItemSlimeArmor slime_leggings;
	public static ItemSlimeArmor slime_boots;
	
	public static ItemSeleniteArmor selenite_helmet;
	public static ItemSeleniteArmor selenite_chestplate;
	public static ItemSeleniteArmor selenite_leggings;
	public static ItemSeleniteArmor selenite_boots;

	public static ItemRubyArmor ruby_helmet;
	public static ItemRubyArmor ruby_chestplate;
	public static ItemRubyArmor ruby_leggings;
	public static ItemRubyArmor ruby_boots;

	public static ItemCobaltArmor cobalt_helmet;
	public static ItemCobaltArmor cobalt_chestplate;
	public static ItemCobaltArmor cobalt_leggings;
	public static ItemCobaltArmor cobalt_boots;

	public static ItemExosuitArmor tech_helmet;
	public static ItemExosuitArmor tech_chestplate;
	public static ItemExosuitArmor tech_leggings;
	public static ItemExosuitArmor tech_boots;

	public static ItemElementArmor element_helmet;
	public static ItemElementArmor element_chestplate;
	public static ItemElementArmor2 element_leggings;
	public static ItemElementArmor element_boots;

	public static ItemPajamaArmor ppajama_helmet;
	public static ItemPajamaArmor ppajama_chestplate;
	public static ItemPajamaArmor ppajama_leggings;
	public static ItemPajamaArmor ppajama_boots;

	public static ItemPajamaArmor bpajama_helmet;
	public static ItemPajamaArmor bpajama_chestplate;
	public static ItemPajamaArmor bpajama_leggings;
	public static ItemPajamaArmor bpajama_boots;

	public static ItemFlashArmor flash_helmet;
	public static ItemFlashArmor flash_chestplate;
	public static ItemFlashArmor flash_leggings;
	public static ItemFlashArmor flash_boots;

	public static ItemWolverineArmor wolverine_helmet;
	public static ItemWolverineArmor wolverine_chestplate;
	public static ItemWolverineArmor wolverine_leggings;
	public static ItemWolverineArmor wolverine_boots;

	public static ItemPantherArmor panther_helmet;
	public static ItemPantherArmor panther_chestplate;
	public static ItemPantherArmor panther_leggings;
	public static ItemPantherArmor panther_boots;

	public static ItemCAArmor captain_helmet;
	public static ItemCAArmor captain_chestplate;
	public static ItemCAArmor captain_leggings;
	public static ItemCAArmor captain_boots;

	public static ItemPurgeMask purge_mask;

	public static ItemTechArmor aexosuit_helmet;
	public static ItemTechArmor aexosuit_chestplate;
	public static ItemTechArmor aexosuit_leggings;
	public static ItemTechArmor aexosuit_boots;

	public static ItemNightsWatchArmor nights_watch_chestplate;
	public static ItemNightsWatchArmor nights_watch_leggings;
	public static ItemNightsWatchArmor nights_watch_boots;

	public static ItemProminentArmor pexosuit_helmet;
	public static ItemProminentArmor pexosuit_chestplate;
	public static ItemProminentArmor pexosuit_leggings;
	public static ItemProminentArmor pexosuit_boots;

	public static ItemBeastArmor beast_gemstone;

	public static ItemWarBonnet war_bonnet;
	
	public static void init(){
		malachite_ingot = (ItemMalachiteIngot) new ItemMalachiteIngot("malachite_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		malachite_sword = (ItemMalachiteSword) new ItemMalachiteSword("malachite_sword", MalachiteTools, 2.5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		malachite_pickaxe = (ItemMalachitePickaxe) new ItemMalachitePickaxe("malachite_pickaxe", MalachiteTools, 2.5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		malachite_axe = (ItemMalachiteAxe) new ItemMalachiteAxe("malachite_axe", MalachiteTools, 4.5f, 1).setCreativeTab(VanillaEvolutionMod.toolstab);
		malachite_shovel = (ItemMalachiteShovel) new ItemMalachiteShovel("malachite_shovel", MalachiteTools, 2.5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		malachite_hoe = (ItemMalachiteHoe) new ItemMalachiteHoe("malachite_hoe", MalachiteTools, 2.5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		meteorite_shard = (ItemMeteoriteShard) new ItemMeteoriteShard("meteorite_shard").setCreativeTab(VanillaEvolutionMod.resourcetab);
		nickel_ingot = (ItemNickelIngot) new ItemNickelIngot("nickel_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		aluminum_ingot = (ItemAluminumIngot) new ItemAluminumIngot("aluminum_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		silver_ingot = (ItemSilverIngot) new ItemSilverIngot("silver_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		lead_ingot = (ItemLeadIngot) new ItemLeadIngot("lead_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		zinc_ingot = (ItemZincIngot) new ItemZincIngot("zinc_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		carbon_ingot = (ItemCarbonIngot) new ItemCarbonIngot("carbon_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		tin_ingot = (ItemTinIngot) new ItemTinIngot("tin_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		copper_ingot = (ItemCopperIngot) new ItemCopperIngot("copper_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		cobalt_ingot = (ItemCobaltIngot) new ItemCobaltIngot("cobalt_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		enderite = (ItemEnderite) new ItemEnderite("enderite").setCreativeTab(VanillaEvolutionMod.resourcetab);
		ultrafood_gem = (ItemUltrafoodGem) new ItemUltrafoodGem("ultrafood_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		superfood_gem = (ItemSuperfoodGem) new ItemSuperfoodGem("superfood_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		amber = (ItemAmber) new ItemAmber("amber").setCreativeTab(VanillaEvolutionMod.resourcetab);
		onyx = (ItemOnyx) new ItemOnyx("onyx").setCreativeTab(VanillaEvolutionMod.resourcetab);
		seasonal_gem = (ItemSeasonalGem) new ItemSeasonalGem("seasonal_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		ruby = (ItemRuby) new ItemRuby("ruby").setCreativeTab(VanillaEvolutionMod.resourcetab);
		peridot = (ItemPeridot) new ItemPeridot("peridot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		amethyst = (ItemAmethyst) new ItemAmethyst("amethyst").setCreativeTab(VanillaEvolutionMod.resourcetab);
		adamantium_ingot = (ItemAdamantiumIngot) new ItemAdamantiumIngot("adamantium_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		vibranium = (ItemVibranium) new ItemVibranium("vibranium").setCreativeTab(VanillaEvolutionMod.resourcetab);
		dwarf_star_alloy = (ItemDwarfStarAlloy) new ItemDwarfStarAlloy("dwarf_star_alloy").setCreativeTab(VanillaEvolutionMod.resourcetab);
		slime_gem = (ItemSlimeGem) new ItemSlimeGem("slime_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		energetic_orb = (ItemEnergeticOrb) new ItemEnergeticOrb("energetic_orb").setCreativeTab(VanillaEvolutionMod.resourcetab);
		ancient_locket = (ItemAncientLocket) new ItemAncientLocket("ancient_locket").setCreativeTab(VanillaEvolutionMod.resourcetab);
		elemental_ingot = (ItemElementalIngot) new ItemElementalIngot("elemental_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		selenite = (ItemSelenite) new ItemSelenite("selenite").setCreativeTab(VanillaEvolutionMod.resourcetab);
		enderite_sword = (ItemEnderiteSword) new ItemEnderiteSword("enderite_sword", EnderiteTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		enderite_pickaxe = (ItemEnderitePickaxe) new ItemEnderitePickaxe("enderite_pickaxe", EnderiteTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		peridot_sword = (ItemPeridotSword) new ItemPeridotSword("peridot_sword", PeridotTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		peridot_pickaxe = (ItemPeridotPickaxe) new ItemPeridotPickaxe("peridot_pickaxe", PeridotTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		peridot_axe = (ItemPeridotAxe) new ItemPeridotAxe("peridot_axe", PeridotTools, 7f, 1).setCreativeTab(VanillaEvolutionMod.toolstab);
		peridot_shovel = (ItemPeridotShovel) new ItemPeridotShovel("peridot_shovel", PeridotTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		peridot_hoe = (ItemPeridotHoe) new ItemPeridotHoe("peridot_hoe", PeridotTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		amethyst_sword = (ItemAmethystSword) new ItemAmethystSword("amethyst_sword", AmethystTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		amethyst_pickaxe = (ItemAmethystPickaxe) new ItemAmethystPickaxe("amethyst_pickaxe", AmethystTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		amethyst_axe = (ItemAmethystAxe) new ItemAmethystAxe("amethyst_axe", AmethystTools, 6f, 1).setCreativeTab(VanillaEvolutionMod.toolstab);
		amethyst_shovel = (ItemAmethystShovel) new ItemAmethystShovel("amethyst_shovel", AmethystTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		amethyst_hoe = (ItemAmethystHoe) new ItemAmethystHoe("amethyst_hoe", AmethystTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		amethyst_pickhoxel = (ItemAmethystPickhoxel) new ItemAmethystPickhoxel("amethyst_pickhoxel", AmethystTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		beryl = (ItemBeryl) new ItemBeryl("beryl").setCreativeTab(VanillaEvolutionMod.resourcetab);
		magnetite_ingot = (ItemMagnetiteIngot) new ItemMagnetiteIngot("magnetite_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		bronze_ingot = (ItemBronzeIngot) new ItemBronzeIngot("bronze_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		iridium_ingot = (ItemIridiumIngot) new ItemIridiumIngot("iridium_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		enchanted_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("enchanted_slime_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		infused_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("infused_slime_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		magical_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("magical_slime_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		evolved_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("evolved_slime_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		imbued_rod = (ItemImbuedRod) new ItemImbuedRod("imbued_rod").setCreativeTab(VanillaEvolutionMod.resourcetab);
		slime_sword = (ItemSlimeSword) new ItemSlimeSword("slime_sword", SlimeTools, 8f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		bronze_sword = (ItemBronzeSword) new ItemBronzeSword("bronze_sword", BronzeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		bronze_pickaxe = (ItemBronzePickaxe) new ItemBronzePickaxe("bronze_pickaxe", BronzeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		bronze_axe = (ItemBronzeAxe) new ItemBronzeAxe("bronze_axe", BronzeTools, 4f, 1f).setCreativeTab(VanillaEvolutionMod.toolstab);
		bronze_shovel = (ItemBronzeShovel) new ItemBronzeShovel("bronze_shovel", BronzeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		bronze_hoe = (ItemBronzeHoe) new ItemBronzeHoe("bronze_hoe", BronzeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		bronze_pickhoxel = (ItemBronzePickhoxel) new ItemBronzePickhoxel("bronze_pickhoxel", BronzeTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		selenite_sword = (ItemSeleniteSword) new ItemSeleniteSword("selenite_sword", SeleniteTools, 12f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		selenite_pickaxe = (ItemSelenitePickaxe) new ItemSelenitePickaxe("selenite_pickaxe", SelenitePTools, 12f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		onyx_pickaxe = (ItemOnyxPickaxe) new ItemOnyxPickaxe("onyx_pickaxe", OnyxTools, 7f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		remarkable_slimeball = (ItemSlimeyStuffs) new ItemSlimeyStuffs("remarkable_slimeball").setCreativeTab(VanillaEvolutionMod.resourcetab);
		mythical_slimeball = (ItemSlimeyStuffs) new ItemSlimeyStuffs("mythical_slimeball").setCreativeTab(VanillaEvolutionMod.resourcetab);
		ruby_sword = (ItemRubySword) new ItemRubySword("ruby_sword", RubyTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_pickaxe = (ItemRubyPickaxe) new ItemRubyPickaxe("ruby_pickaxe", RubyTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_axe = (ItemRubyAxe) new ItemRubyAxe("ruby_axe", RubyTools, 6f, 1f).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_shovel = (ItemRubyShovel) new ItemRubyShovel("ruby_shovel", RubyTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_hoe = (ItemRubyHoe) new ItemRubyHoe("ruby_hoe", RubyTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		amber_locket = (ItemAncientLocket) new ItemAncientLocket("amber_locket").setCreativeTab(VanillaEvolutionMod.resourcetab);
		steel_ingot = (ItemBronzeIngot) new ItemBronzeIngot("steel_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		graphite = (ItemGraphite) new ItemGraphite("graphite").setCreativeTab(VanillaEvolutionMod.resourcetab);
		silicon_chunk = (ItemTechnology) new ItemTechnology("silicon_chunk").setCreativeTab(VanillaEvolutionMod.resourcetab);
		silicon = (ItemTechnology) new ItemTechnology("silicon").setCreativeTab(VanillaEvolutionMod.resourcetab);
		concrete_dust = (ItemTechnology) new ItemTechnology("concrete_dust").setCreativeTab(VanillaEvolutionMod.resourcetab);
		aluminum_sheet = (ItemTechnology) new ItemTechnology("aluminum_sheet").setCreativeTab(VanillaEvolutionMod.resourcetab);
		nickel_sheet = (ItemTechnology) new ItemTechnology("nickel_sheet").setCreativeTab(VanillaEvolutionMod.resourcetab);
		polymer = (ItemTechnology) new ItemTechnology("polymer").setCreativeTab(VanillaEvolutionMod.resourcetab);
		electronic = (ItemTechnology) new ItemTechnology("electronic").setCreativeTab(VanillaEvolutionMod.resourcetab);
		computer_chip = (ItemTechnology) new ItemTechnology("computer_chip").setCreativeTab(VanillaEvolutionMod.resourcetab);
		control_panel = (ItemTechnology) new ItemTechnology("control_panel").setCreativeTab(VanillaEvolutionMod.resourcetab);
		visor = (ItemTechnology) new ItemTechnology("visor").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.resourcetab);
		aluminum_wire = (ItemTechnology) new ItemTechnology("aluminum_wire").setCreativeTab(VanillaEvolutionMod.resourcetab);
		copper_wire = (ItemTechnology) new ItemTechnology("copper_wire").setCreativeTab(VanillaEvolutionMod.resourcetab);
		basic_wire = (ItemTechnology) new ItemTechnology("basic_wire").setCreativeTab(VanillaEvolutionMod.resourcetab);
		advanced_wire = (ItemTechnology) new ItemTechnology("advanced_wire").setCreativeTab(VanillaEvolutionMod.resourcetab);
		prominent_wire = (ItemTechnology) new ItemTechnology("prominent_wire").setCreativeTab(VanillaEvolutionMod.resourcetab);
		basic_battery = (ItemTechnology) new ItemTechnology("basic_battery").setMaxStackSize(8).setCreativeTab(VanillaEvolutionMod.resourcetab);
		advanced_battery = (ItemTechnology) new ItemTechnology("advanced_battery").setMaxStackSize(8).setCreativeTab(VanillaEvolutionMod.resourcetab);
		prominent_battery = (ItemTechnology) new ItemTechnology("prominent_battery").setMaxStackSize(8).setCreativeTab(VanillaEvolutionMod.resourcetab);
		tech_arm = (ItemTechArm) new ItemTechArm("tech_arm", TechTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		knife = (ItemKnife) new ItemKnife("knife").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.foodtab);
		animal_fat = (ItemAnimalFat) new ItemAnimalFat("animal_fat", 1, 0.1f, true).setCreativeTab(VanillaEvolutionMod.foodtab);
		grease = (ItemGrease) new ItemGrease("grease", 1, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		bacon = (ItemBacon) new ItemBacon("bacon", 12, 0.8f, true).setCreativeTab(VanillaEvolutionMod.foodtab);
		tomato = (ItemTomato) new ItemTomato("tomato", 6, 1.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		strawberry = (ItemStrawberry) new ItemStrawberry("strawberry", 8, 1.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		blueberry = (ItemBlueberry) new ItemBlueberry("blueberry", 5, 1.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		cherry = (ItemCherry) new ItemCherry("cherry", 7, 1.0f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		corn = (ItemCorn) new ItemCorn("corn", 5, 1.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		mint = (ItemMint) new ItemMint("mint", 1, 0.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		banana = (ItemBanana) new ItemBanana("banana", 8, 1.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		vanilla = (ItemVanilla) new ItemVanilla("vanilla", 2, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		maple = (ItemMaple) new ItemMaple("maple", 2, 0.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		cinnamon = (ItemCinnamon) new ItemCinnamon("cinnamon", 1, 0.0f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		barley = (ItemGrain) new ItemGrain("barley").setCreativeTab(VanillaEvolutionMod.foodtab);
		oat = (ItemGrain) new ItemGrain("oat").setCreativeTab(VanillaEvolutionMod.foodtab);
		rye = (ItemGrain) new ItemGrain("rye").setCreativeTab(VanillaEvolutionMod.foodtab);
		peanut = (ItemPeanut) new ItemPeanut("peanut", 4, 1.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		pecan = (ItemPeanut) new ItemPeanut("pecan", 3, 0.8f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		walnut = (ItemPeanut) new ItemPeanut("walnut", 5, 1.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		rhubarb = (ItemRhubarb) new ItemRhubarb("rhubarb", 3, 0.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		whisk = (ItemWhisk) new ItemWhisk("whisk").setMaxStackSize(1).setContainerItem(VanillaEvolutionItems.steel_ingot).setCreativeTab(VanillaEvolutionMod.foodtab);
		cream = (ItemCream) new ItemCream("cream", 1, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		whipped_cream = (ItemCream) new ItemCream("whipped_cream", 1, 0.2f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		butter = (ItemCream) new ItemCream("butter", 2, 0.2f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		cream_cheese = (ItemCream) new ItemCream("cream_cheese", 2, 0.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		cheese = (ItemCream) new ItemCream("cheese", 5, 0.2f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		crust = (ItemBaking) new ItemBaking("crust").setMaxStackSize(16).setCreativeTab(VanillaEvolutionMod.foodtab);
		chocolate = (ItemChocolate) new ItemChocolate("chocolate", 2, 0.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		flour = (ItemBaking) new ItemBaking("flour").setCreativeTab(VanillaEvolutionMod.foodtab);
		salt = (ItemBaking) new ItemBaking("salt").setCreativeTab(VanillaEvolutionMod.foodtab);
		cornstarch = (ItemBaking) new ItemBaking("cornstarch").setCreativeTab(VanillaEvolutionMod.foodtab);
		baking_soda = (ItemBaking) new ItemBaking("baking_soda").setMaxStackSize(8).setCreativeTab(VanillaEvolutionMod.foodtab);
		baking_powder = (ItemBaking) new ItemBaking("baking_powder").setMaxStackSize(8).setCreativeTab(VanillaEvolutionMod.foodtab);
		vegetable_oil = (ItemBaking) new ItemBaking("vegetable_oil").setMaxStackSize(8).setCreativeTab(VanillaEvolutionMod.foodtab);
		funnel_cake_mixture = (ItemBaking) new ItemBaking("funnel_cake_mixture").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.foodtab);
		brown_sugar = (ItemBaking) new ItemBaking("brown_sugar").setCreativeTab(VanillaEvolutionMod.foodtab);
		graham_cracker = (ItemCracker) new ItemCracker("graham_cracker", 4, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		marshmallow = (ItemMarshmallow) new ItemMarshmallow("marshmallow", 1, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		ice_cream_cone = (ItemBaking) new ItemBaking("ice_cream_cone").setCreativeTab(VanillaEvolutionMod.foodtab);
		molasses = (ItemSyrup) new ItemSyrup("molasses", 0, 0.1f, false).setMaxStackSize(16).setCreativeTab(VanillaEvolutionMod.foodtab);
		syrup = (ItemSyrup) new ItemSyrup("syrup", 0, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		corn_syrup = (ItemSyrup) new ItemSyrup("corn_syrup", 0, 0.2f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		dark_corn_syrup = (ItemSyrup) new ItemSyrup("dark_corn_syrup", 0, 0.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		fudge = (ItemFudge) new ItemFudge("fudge", 10, 0.7f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		brownie = (ItemBrownie) new ItemBrownie("brownie", 11, 1.0f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		mint_brownie = (ItemMintBrownie) new ItemMintBrownie("mint_brownie", 15, 1.6f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		blondie = (ItemBlondie) new ItemBlondie("blondie", 8, 0.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		smore = (ItemSmore) new ItemSmore("smore", 6, 0.4f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		cupcake = (ItemCupcake) new ItemCupcake("cupcake", 5, 0.9f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		banana_bread = (ItemBananaBread) new ItemBananaBread("banana_bread", 4, 1.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		vanilla_ice_cream = (ItemVanillaIceCream) new ItemVanillaIceCream("vanilla_ice_cream", 7, 1.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		chocolate_ice_cream = (ItemChocolateIceCream) new ItemChocolateIceCream("chocolate_ice_cream", 8, 0.9f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		mint_ice_cream = (ItemMintIceCream) new ItemMintIceCream("mint_ice_cream", 9, 1.2f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		strawberry_ice_cream = (ItemStrawberryIceCream) new ItemStrawberryIceCream("strawberry_ice_cream", 10, 1.6f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		cookies_and_cream_ice_cream = (ItemCookieCreamIceCream) new ItemCookieCreamIceCream("cookies_and_cream_ice_cream", 7, 0.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		funnel_cake = (ItemFunnelCake) new ItemFunnelCake("funnel_cake", 9, 1.7f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		cheesecake = (ItemCheeseake) new ItemCheeseake("cheesecake", 10, 1.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		chocolate_cake = (ItemChocolateCake) new ItemChocolateCake("chocolate_cake", 8, 1.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		angel_food_cake = (ItemAngelFoodCake) new ItemAngelFoodCake("angel_food_cake", 6, 1.6f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		ice_cream_cake = (ItemIceCreamCake) new ItemIceCreamCake("ice_cream_cake", 9, 0.9f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		apple_pie = (ItemApplePie) new ItemApplePie("apple_pie", 12, 1.2f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		pecan_pie = (ItemPecanPie) new ItemPecanPie("pecan_pie", 10, 1.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		blueberry_pie = (ItemBlueberryPie) new ItemBlueberryPie("blueberry_pie", 9, 1.7f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		cherry_pie = (ItemCherryPie) new ItemCherryPie("cherry_pie", 11, 0.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		strawberry_pie = (ItemStrawberryPie) new ItemStrawberryPie("strawberry_pie", 13, 1.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		french_silk_pie = (ItemFrenchSilkPie) new ItemFrenchSilkPie("french_silk_pie", 15, 1.4f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		rhubarb_pie = (ItemRhubarbPie) new ItemRhubarbPie("rhubarb_pie", 9, 1.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		double_chocolate_cookie = (ItemDoubleChocolateCookie) new ItemDoubleChocolateCookie("double_chocolate_cookie", 6, 1.2f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		smore_cookie = (ItemSmoreCookie) new ItemSmoreCookie("smore_cookie", 8, 2.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		earth_shard = (ItemElements) new ItemElements("earth_shard").setCreativeTab(VanillaEvolutionMod.elementtab);
		earth_ingot = (ItemElements) new ItemElements("earth_ingot").setCreativeTab(VanillaEvolutionMod.elementtab);
		earth_pickaxe = (ItemEarthPickaxe) new ItemEarthPickaxe("earth_pickaxe", ElementTools, 13f, 996f).setCreativeTab(VanillaEvolutionMod.elementtab);
		water_shard = (ItemElements) new ItemElements("water_shard").setCreativeTab(VanillaEvolutionMod.elementtab);
		water_ingot = (ItemElements) new ItemElements("water_ingot").setCreativeTab(VanillaEvolutionMod.elementtab);
		water_shovel = (ItemWaterShovel) new ItemWaterShovel("water_shovel", ElementTools, 10f, 996f).setCreativeTab(VanillaEvolutionMod.elementtab);
		air_shard = (ItemElements) new ItemElements("air_shard").setCreativeTab(VanillaEvolutionMod.elementtab);
		air_ingot = (ItemElements) new ItemElements("air_ingot").setCreativeTab(VanillaEvolutionMod.elementtab);
		air_axe = (ItemAirAxe) new ItemAirAxe("air_axe", ElementTools, 15f, 1f).setCreativeTab(VanillaEvolutionMod.elementtab);
		fire_shard = (ItemElements) new ItemElements("fire_shard").setCreativeTab(VanillaEvolutionMod.elementtab);
		fire_ingot = (ItemElements) new ItemElements("fire_ingot").setCreativeTab(VanillaEvolutionMod.elementtab);
		fire_sword = (ItemFireSword) new ItemFireSword("fire_sword", ElementTools, 15f, 996f).setCreativeTab(VanillaEvolutionMod.elementtab);
		shattered_soul = (ItemSoul) new ItemSoul("shattered_soul").setCreativeTab(VanillaEvolutionMod.resourcetab);
		soul = (ItemSoul) new ItemSoul("soul").setCreativeTab(VanillaEvolutionMod.resourcetab);
		power_stone = (ItemPowerStone) new ItemPowerStone("power_stone").setCreativeTab(VanillaEvolutionMod.toolstab);
		space_stone = (ItemSpaceStone) new ItemSpaceStone("space_stone").setCreativeTab(VanillaEvolutionMod.toolstab);
		reality_stone = (ItemRealityStone) new ItemRealityStone("reality_stone").setCreativeTab(VanillaEvolutionMod.toolstab);
		soul_stone = (ItemSoulStone) new ItemSoulStone("soul_stone").setCreativeTab(VanillaEvolutionMod.toolstab);
		time_stone = (ItemTimeStone) new ItemTimeStone("time_stone").setCreativeTab(VanillaEvolutionMod.toolstab);
		mind_stone = (ItemMindStone) new ItemMindStone("mind_stone").setCreativeTab(VanillaEvolutionMod.toolstab);
		infinity_gauntlet = (ItemInfinityGauntlet) new ItemInfinityGauntlet("infinity_gauntlet", InfinityTools, 15f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		wolverine_claws = (ItemWolverineClaws) new ItemWolverineClaws("wolverine_claws", WClawTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		panther_claws = (ItemPantherClaws) new ItemPantherClaws("panther_claws", PClawTools, 6.5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		ballistic_nylon = (ItemBallisticNylon) new ItemBallisticNylon("ballistic_nylon").setCreativeTab(VanillaEvolutionMod.resourcetab);
		captain_shield = (ItemCAShield) new ItemCAShield("captain_shield", ShieldTools, 7f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		portal_stone = (ItemEnderResource) new ItemEnderResource("portal_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		ender_stone = (ItemEnderResource) new ItemEnderResource("ender_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		ender_sword = (ItemEnderSword) new ItemEnderSword("ender_sword", EnderTools, 11f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		curious_powder = (ItemCurious) new ItemCurious("curious_powder").setCreativeTab(VanillaEvolutionMod.resourcetab);
		curiosity = (ItemCuriosity) new ItemCuriosity("curiosity", CuriousTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		terrorizer = (ItemTerrorizer) new ItemTerrorizer("terrorizer", TerrorizerTools, 6.5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		blue_moon_quartz = (ItemBlueMoon) new ItemBlueMoon("blue_moon_quartz").setCreativeTab(VanillaEvolutionMod.resourcetab);
		assassin = (ItemAssassin) new ItemAssassin("assassin", AssassinTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		pulverizer = (ItemPulverizer) new ItemPulverizer("pulverizer", PulverizerTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		atomic_splicer = (ItemAtomicSplicer) new ItemAtomicSplicer("atomic_splicer").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.toolstab);
		charged_atomic_splicer = (ItemChargedAtomicSplicer) new ItemChargedAtomicSplicer("charged_atomic_splicer").setMaxStackSize(1).setContainerItem(VanillaEvolutionItems.charged_atomic_splicer).setCreativeTab(VanillaEvolutionMod.toolstab);
		atom = (ItemAtom) new ItemAtom("atom").setMaxStackSize(128).setCreativeTab(VanillaEvolutionMod.resourcetab);
		winter_gem = (ItemSeasonalGem) new ItemSeasonalGem("winter_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		spring_gem = (ItemSeasonalGem) new ItemSeasonalGem("spring_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		summer_gem = (ItemSeasonalGem) new ItemSeasonalGem("summer_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		autumn_gem = (ItemSeasonalGem) new ItemSeasonalGem("autumn_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		heart_gem = (ItemHeartGem) new ItemHeartGem("heart_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		heart_candy = (ItemHeartCandy) new ItemHeartCandy("heart_candy", 5, 0.6f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		heart_sword = (ItemHeartSword) new ItemHeartSword("heart_sword", HeartTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.seasontab);
		eggplant = (ItemEggplant) new ItemEggplant("eggplant", 7, 1.2f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		peach = (ItemPeach) new ItemPeach("peach", 5, 1.6f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		pineapple = (ItemPineapple) new ItemPineapple("pineapple", 7, 1.3f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		raspberry = (ItemRaspberry) new ItemRaspberry("raspberry", 4, 1.7f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		golden_potato = (ItemGoldenPotato) new ItemGoldenPotato("golden_potato", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		golden_beetroot = (ItemGoldenBeetroot) new ItemGoldenBeetroot("golden_beetroot", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		golden_eggplant = (ItemGoldenEggplant) new ItemGoldenEggplant("golden_eggplant", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		golden_peach = (ItemGoldenPeach) new ItemGoldenPeach("golden_peach", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		golden_pineapple = (ItemGoldenPineapple) new ItemGoldenPineapple("golden_pineapple", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		peach_cobbler = (ItemPeachCobbler) new ItemPeachCobbler("peach_cobbler", 16, 2.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		ultra_potato = (ItemUltrafood) new ItemUltrafood("ultra_potato", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.supertab);
		ultra_berry = (ItemUltrafood) new ItemUltrafood("ultra_berry", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.supertab);
		sugared_flesh = (ItemSugaredFlesh) new ItemSugaredFlesh("sugared_flesh", 20, 3.2f, true).setCreativeTab(VanillaEvolutionMod.supertab);
		night_steel = (ItemASSJW) new ItemASSJW("night_steel").setCreativeTab(VanillaEvolutionMod.resourcetab);
		enderic_alloy = (ItemASSJW) new ItemASSJW("enderic_alloy").setCreativeTab(VanillaEvolutionMod.resourcetab);
		charged_beryl = (ItemASSJW) new ItemASSJW("charged_beryl").setCreativeTab(VanillaEvolutionMod.resourcetab);
		mysterious_moss_ball = (ItemASSJW) new ItemASSJW("mysterious_moss_ball").setCreativeTab(VanillaEvolutionMod.resourcetab);
		axe_of_capitalism = (ItemCapitalismAxe) new ItemCapitalismAxe("axe_of_capitalism", CapitalismTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		oculus = (ItemOculus) new ItemOculus("oculus", OculusTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		dragonglass = (ItemGOT) new ItemGOT("dragonglass").setCreativeTab(VanillaEvolutionMod.resourcetab);
		valyrian_steel = (ItemGOT) new ItemGOT("valyrian_steel").setCreativeTab(VanillaEvolutionMod.resourcetab);
		longclaw = (ItemLongclaw) new ItemLongclaw("longclaw", LongclawTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		ice = (ItemIce) new ItemIce("ice", IceTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		oathkeeper = (ItemOathkeeper) new ItemOathkeeper("oathkeeper", OathkeeperTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		widow_wail = (ItemWidowWail) new ItemWidowWail("widow_wail", WidowWailTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		dragonglass_arakh = (ItemDragonglassArakh) new ItemDragonglassArakh("dragonglass_arakh", DArakhTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		dragonglass_spear = (ItemDragonglassSpear) new ItemDragonglassSpear("dragonglass_spear", DSpearTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		dragonglass_axe = (ItemDragonglassAxe) new ItemDragonglassAxe("dragonglass_axe", DAxeTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		needle = (ItemNeedle) new ItemNeedle("needle", NeedleTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		catspaw_dagger = (ItemCatspaw) new ItemCatspaw("catspaw_dagger", CatspawTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		mjolnir = (ItemLightning) new ItemLightning("mjolnir", MjolnirTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		stormbreaker = (ItemLightning) new ItemLightning("stormbreaker", StormbreakerTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		kyber_crystal = (ItemKyber) new ItemKyber("kyber_crystal").setCreativeTab(VanillaEvolutionMod.resourcetab);
		saber_blue = (ItemLightsaber) new ItemLightsaber("saber_blue", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_green = (ItemLightsaber) new ItemLightsaber("saber_green", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_purple = (ItemLightsaber) new ItemLightsaber("saber_purple", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_red = (ItemLightsaber) new ItemLightsaber("saber_red", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		enderic_pickhoxel = (ItemEndericPickhoxel) new ItemEndericPickhoxel("enderic_pickhoxel", EndericPhTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		frozen_flesh = (ItemFrozenFlesh) new ItemFrozenFlesh("frozen_flesh", 4, 1.1f, true).setCreativeTab(VanillaEvolutionMod.mobtab);
		pulsating_shard = (ItemPulsatingShard) new ItemPulsatingShard("pulsating_shard").setCreativeTab(VanillaEvolutionMod.mobtab);
		dust_bone = (ItemDustBone) new ItemDustBone("dust_bone").setCreativeTab(VanillaEvolutionMod.mobtab);
		peanut_butter = (ItemPeanutButter) new ItemPeanutButter("peanut_butter", 2, 0.5f, true).setCreativeTab(VanillaEvolutionMod.foodtab);
		uncooked_caramel = (ItemBaking) new ItemBaking("uncooked_caramel").setCreativeTab(VanillaEvolutionMod.foodtab);
		caramel = (ItemBaking) new ItemBaking("caramel").setCreativeTab(VanillaEvolutionMod.foodtab);
		fondant = (ItemBaking) new ItemBaking("fondant").setCreativeTab(VanillaEvolutionMod.foodtab);
		jelly_bean_mold = (ItemBaking) new ItemBaking("jelly_bean_mold").setCreativeTab(VanillaEvolutionMod.foodtab);
		peanut_butter_cup = (ItemPeanutButterCup) new ItemPeanutButterCup("peanut_butter_cup", 8, 0.4f, true).setCreativeTab(VanillaEvolutionMod.seasontab);
		caramel_chocolate_bar = (ItemCaramelChocolateBar) new ItemCaramelChocolateBar("caramel_chocolate_bar", 10, 0.5f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		peanut_chocolate_bar = (ItemPeanutChocolateBar) new ItemPeanutChocolateBar("peanut_chocolate_bar", 8, 1.1f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		candy_corn = (ItemCandyCorn) new ItemCandyCorn("candy_corn", 4, 0.2f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		jelly_beans = (ItemJellyBeans) new ItemJellyBeans("jelly_beans", 8, 0.6f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		caramel_apple = (ItemCaramelApple) new ItemCaramelApple("caramel_apple", 10, 0.8f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		wishbone = (ItemWishbone) new ItemWishbone("wishbone").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.mobtab);
		turkey_feather = (ItemTurkeyFeather) new ItemTurkeyFeather("turkey_feather").setCreativeTab(VanillaEvolutionMod.mobtab);
		raw_turkey = (ItemRawTurkey) new ItemRawTurkey("raw_turkey", 2, 0.3f, true).setCreativeTab(VanillaEvolutionMod.mobtab);
		cooked_turkey = (ItemCookedTurkey) new ItemCookedTurkey("cooked_turkey", 7, 0.8f, true).setCreativeTab(CreativeTabs.FOOD);
		green_beans = (ItemGreenBeans) new ItemGreenBeans("green_beans", 3, 0.8f, true).setCreativeTab(VanillaEvolutionMod.foodtab);
		onion = (ItemOnion) new ItemOnion("onion", 4, 0.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		masher = (ItemMasher) new ItemMasher("masher").setMaxStackSize(1).setContainerItem(VanillaEvolutionItems.steel_ingot).setCreativeTab(VanillaEvolutionMod.foodtab);
		gravy = (ItemGravy) new ItemGravy("gravy", 0, 0.0f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		mashed_potatoes = (ItemMPotatoes) new ItemMPotatoes("mashed_potatoes", 6, 0.8f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		mashed_potatoes_gravy = (ItemMPotatoesG) new ItemMPotatoesG("mashed_potatoes_gravy", 9, 1.2f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		stuffing = (ItemStuffing) new ItemStuffing("stuffing", 12, 1.6f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		green_bean_casserole = (ItemGBC) new ItemGBC("green_bean_casserole", 10, 1.5f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		hunger_pill = (ItemHungerPill) new ItemHungerPill("hunger_pill", 0, 0f, false).setCreativeTab(CreativeTabs.MISC);
//		time_master_clock = (ItemTimeClock) new ItemTimeClock("time_master_clock").setCreativeTab(VanillaEvolutionMod.resourcetab);
	
		enderite_helmet = (ItemEnderiteArmor) new ItemEnderiteArmor("enderite_helmet", EnderiteArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		enderite_chestplate = (ItemEnderiteArmor) new ItemEnderiteArmor("enderite_chestplate", EnderiteArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		enderite_leggings = (ItemEnderiteArmor) new ItemEnderiteArmor("enderite_leggings", EnderiteArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		enderite_boots =  (ItemEnderiteArmor)new ItemEnderiteArmor("enderite_boots", EnderiteArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		slime_helmet = (ItemSlimeArmor) new ItemSlimeArmor("slime_helmet", SlimeArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		slime_chestplate = (ItemSlimeArmor) new ItemSlimeArmor("slime_chestplate", SlimeArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		slime_leggings = (ItemSlimeArmor) new ItemSlimeArmor("slime_leggings", SlimeArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		slime_boots =  (ItemSlimeArmor)new ItemSlimeArmor("slime_boots", SlimeArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		selenite_helmet = (ItemSeleniteArmor) new ItemSeleniteArmor("selenite_helmet", SeleniteArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		selenite_chestplate = (ItemSeleniteArmor) new ItemSeleniteArmor("selenite_chestplate", SeleniteArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		selenite_leggings = (ItemSeleniteArmor) new ItemSeleniteArmor("selenite_leggings", SeleniteArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		selenite_boots =  (ItemSeleniteArmor)new ItemSeleniteArmor("selenite_boots", SeleniteArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		ruby_helmet = (ItemRubyArmor) new ItemRubyArmor("ruby_helmet", RubyArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_chestplate = (ItemRubyArmor) new ItemRubyArmor("ruby_chestplate", RubyArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_leggings = (ItemRubyArmor) new ItemRubyArmor("ruby_leggings", RubyArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		ruby_boots =  (ItemRubyArmor)new ItemRubyArmor("ruby_boots", RubyArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		cobalt_helmet = (ItemCobaltArmor) new ItemCobaltArmor("cobalt_helmet", CobaltArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		cobalt_chestplate = (ItemCobaltArmor) new ItemCobaltArmor("cobalt_chestplate", CobaltArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		cobalt_leggings = (ItemCobaltArmor) new ItemCobaltArmor("cobalt_leggings", CobaltArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		cobalt_boots =  (ItemCobaltArmor)new ItemCobaltArmor("cobalt_boots", CobaltArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		tech_helmet = (ItemExosuitArmor) new ItemExosuitArmor("tech_helmet", TechArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		tech_chestplate = (ItemExosuitArmor) new ItemExosuitArmor("tech_chestplate", TechArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		tech_leggings = (ItemExosuitArmor) new ItemExosuitArmor("tech_leggings", TechArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		tech_boots =  (ItemExosuitArmor)new ItemExosuitArmor("tech_boots", TechArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		element_helmet = (ItemElementArmor) new ItemElementArmor("element_helmet", ElementArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.elementtab);
		element_chestplate = (ItemElementArmor) new ItemElementArmor("element_chestplate", ElementArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.elementtab);
		element_leggings = (ItemElementArmor2) new ItemElementArmor2("element_leggings", ElementArmor2, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.elementtab);
		element_boots =  (ItemElementArmor)new ItemElementArmor("element_boots", ElementArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.elementtab);
		
		ppajama_helmet = (ItemPajamaArmor) new ItemPajamaArmor("ppajama_helmet", PPajamaArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		ppajama_chestplate = (ItemPajamaArmor) new ItemPajamaArmor("ppajama_chestplate", PPajamaArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		ppajama_leggings = (ItemPajamaArmor) new ItemPajamaArmor("ppajama_leggings", PPajamaArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		ppajama_boots =  (ItemPajamaArmor)new ItemPajamaArmor("ppajama_boots", PPajamaArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		bpajama_helmet = (ItemPajamaArmor) new ItemPajamaArmor("bpajama_helmet", BPajamaArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		bpajama_chestplate = (ItemPajamaArmor) new ItemPajamaArmor("bpajama_chestplate", BPajamaArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		bpajama_leggings = (ItemPajamaArmor) new ItemPajamaArmor("bpajama_leggings", BPajamaArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		bpajama_boots =  (ItemPajamaArmor)new ItemPajamaArmor("bpajama_boots", BPajamaArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		flash_helmet = (ItemFlashArmor) new ItemFlashArmor("flash_helmet", FlashArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		flash_chestplate = (ItemFlashArmor) new ItemFlashArmor("flash_chestplate", FlashArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		flash_leggings = (ItemFlashArmor) new ItemFlashArmor("flash_leggings", FlashArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		flash_boots =  (ItemFlashArmor)new ItemFlashArmor("flash_boots", FlashArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		wolverine_helmet = (ItemWolverineArmor) new ItemWolverineArmor("wolverine_helmet", WolverineArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		wolverine_chestplate = (ItemWolverineArmor) new ItemWolverineArmor("wolverine_chestplate", WolverineArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		wolverine_leggings = (ItemWolverineArmor) new ItemWolverineArmor("wolverine_leggings", WolverineArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		wolverine_boots =  (ItemWolverineArmor)new ItemWolverineArmor("wolverine_boots", WolverineArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		panther_helmet = (ItemPantherArmor) new ItemPantherArmor("panther_helmet", PantherArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		panther_chestplate = (ItemPantherArmor) new ItemPantherArmor("panther_chestplate", PantherArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		panther_leggings = (ItemPantherArmor) new ItemPantherArmor("panther_leggings", PantherArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		panther_boots =  (ItemPantherArmor)new ItemPantherArmor("panther_boots", PantherArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		captain_helmet = (ItemCAArmor) new ItemCAArmor("captain_helmet", CaptainArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		captain_chestplate = (ItemCAArmor) new ItemCAArmor("captain_chestplate", CaptainArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		captain_leggings = (ItemCAArmor) new ItemCAArmor("captain_leggings", CaptainArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		captain_boots =  (ItemCAArmor)new ItemCAArmor("captain_boots", CaptainArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);

		purge_mask =  (ItemPurgeMask)new ItemPurgeMask("purge_mask", PurgeArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		aexosuit_helmet = (ItemTechArmor) new ItemTechArmor("aexosuit_helmet", AExosuitArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		aexosuit_chestplate = (ItemTechArmor) new ItemTechArmor("aexosuit_chestplate", AExosuitArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		aexosuit_leggings = (ItemTechArmor) new ItemTechArmor("aexosuit_leggings", AExosuitArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		aexosuit_boots =  (ItemTechArmor)new ItemTechArmor("aexosuit_boots", AExosuitArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		nights_watch_chestplate = (ItemNightsWatchArmor) new ItemNightsWatchArmor("nights_watch_chestplate", NightArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		nights_watch_leggings = (ItemNightsWatchArmor) new ItemNightsWatchArmor("nights_watch_leggings", NightArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		nights_watch_boots =  (ItemNightsWatchArmor)new ItemNightsWatchArmor("nights_watch_boots", NightArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		pexosuit_helmet = (ItemProminentArmor) new ItemProminentArmor("pexosuit_helmet", PExosuitArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		pexosuit_chestplate = (ItemProminentArmor) new ItemProminentArmor("pexosuit_chestplate", PExosuitArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		pexosuit_leggings = (ItemProminentArmor) new ItemProminentArmor("pexosuit_leggings", PExosuitArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		pexosuit_boots =  (ItemProminentArmor)new ItemProminentArmor("pexosuit_boots", PExosuitArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);

		beast_gemstone = (ItemBeastArmor) new ItemBeastArmor("beast_gemstone", BeastArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);

		war_bonnet = (ItemWarBonnet) new ItemWarBonnet("war_bonnet", BonnetArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.seasontab);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(malachite_ingot, malachite_sword, malachite_pickaxe, malachite_axe, malachite_shovel, malachite_hoe, meteorite_shard, nickel_ingot, 
				aluminum_ingot, silver_ingot, lead_ingot, zinc_ingot, carbon_ingot, tin_ingot, copper_ingot, cobalt_ingot, enderite, ultrafood_gem, superfood_gem, amber,
				onyx, seasonal_gem, ruby, peridot, amethyst, adamantium_ingot, vibranium, dwarf_star_alloy, slime_gem, energetic_orb, ancient_locket, elemental_ingot, selenite,
				enderite_sword, enderite_pickaxe, peridot_sword, peridot_pickaxe, peridot_axe, peridot_shovel, peridot_hoe, amethyst_sword, amethyst_pickaxe, amethyst_axe, 
				amethyst_shovel, amethyst_hoe, amethyst_pickhoxel, beryl, magnetite_ingot, bronze_ingot, iridium_ingot, enchanted_slime_gem, infused_slime_gem, magical_slime_gem,
				evolved_slime_gem, imbued_rod, slime_sword, bronze_sword, bronze_pickaxe, bronze_axe, bronze_shovel, bronze_hoe, bronze_pickhoxel, selenite_sword, selenite_pickaxe,
				onyx_pickaxe, enderite_helmet, enderite_chestplate, enderite_leggings, enderite_boots, remarkable_slimeball, mythical_slimeball, slime_helmet, slime_chestplate,
				slime_leggings, slime_boots, selenite_helmet, selenite_chestplate, selenite_leggings, selenite_boots, ruby_sword, ruby_pickaxe, ruby_axe, ruby_shovel,ruby_hoe,
				ruby_helmet, ruby_chestplate, ruby_leggings, ruby_boots, cobalt_helmet, cobalt_chestplate, cobalt_leggings, cobalt_boots, amber_locket, steel_ingot, graphite,
				silicon_chunk, silicon, concrete_dust, aluminum_sheet, nickel_sheet, polymer, electronic, computer_chip, control_panel, visor, aluminum_wire, copper_wire,
				basic_wire, advanced_wire, prominent_wire, basic_battery, advanced_battery, prominent_battery, tech_arm, tech_helmet, tech_chestplate, tech_leggings, tech_boots,
				knife, animal_fat, grease, bacon, tomato, strawberry, blueberry, cherry, corn, mint, banana, vanilla, maple, cinnamon, barley, oat, rye, peanut, pecan, walnut, rhubarb,
				whisk, cream, whipped_cream, butter, cream_cheese, cheese, crust, chocolate, flour, salt, cornstarch, baking_soda, baking_powder, vegetable_oil, funnel_cake_mixture,
				brown_sugar, graham_cracker, marshmallow, ice_cream_cone, molasses, syrup, corn_syrup, dark_corn_syrup, fudge, brownie, mint_brownie, blondie, smore, cupcake, banana_bread,
				vanilla_ice_cream, chocolate_ice_cream, mint_ice_cream, strawberry_ice_cream, cookies_and_cream_ice_cream, funnel_cake, cheesecake, chocolate_cake, angel_food_cake, ice_cream_cake,
				apple_pie, pecan_pie, blueberry_pie, cherry_pie, strawberry_pie, french_silk_pie, rhubarb_pie, double_chocolate_cookie, smore_cookie, earth_shard, earth_ingot, earth_pickaxe,
				water_shard, water_ingot, water_shovel, air_shard, air_ingot, air_axe, fire_shard, fire_ingot, fire_sword, element_helmet, element_chestplate, element_leggings, element_boots,
				ppajama_helmet, ppajama_chestplate, ppajama_leggings, ppajama_boots, bpajama_helmet, bpajama_chestplate, bpajama_leggings, bpajama_boots, shattered_soul, soul, power_stone,
				space_stone, reality_stone, soul_stone, time_stone, mind_stone, infinity_gauntlet, flash_helmet, flash_chestplate, flash_leggings, flash_boots, wolverine_claws, wolverine_helmet,
				wolverine_chestplate, wolverine_leggings, wolverine_boots, panther_claws, panther_helmet, panther_chestplate, panther_leggings, panther_boots, ballistic_nylon, captain_shield,
				captain_helmet, captain_chestplate, captain_leggings, captain_boots, purge_mask, aexosuit_helmet, aexosuit_chestplate, aexosuit_leggings, aexosuit_boots, portal_stone, ender_stone,
				ender_sword, curious_powder, curiosity, terrorizer, blue_moon_quartz, assassin, pulverizer, atomic_splicer, charged_atomic_splicer, atom, winter_gem, spring_gem, summer_gem,
				autumn_gem, heart_gem, heart_candy, heart_sword, eggplant, peach, pineapple, raspberry, golden_potato, golden_beetroot, golden_eggplant, golden_peach, golden_pineapple,
				peach_cobbler, ultra_potato, ultra_berry, sugared_flesh, night_steel, enderic_alloy, charged_beryl, mysterious_moss_ball, axe_of_capitalism, oculus, dragonglass, valyrian_steel, 
				nights_watch_chestplate, nights_watch_leggings, nights_watch_boots, longclaw, ice, oathkeeper, widow_wail, dragonglass_arakh, dragonglass_spear, dragonglass_axe, needle, 
				catspaw_dagger, mjolnir, stormbreaker, kyber_crystal, saber_blue, saber_green, saber_purple, saber_red, pexosuit_helmet, pexosuit_chestplate, pexosuit_leggings, pexosuit_boots, 
				enderic_pickhoxel, frozen_flesh, pulsating_shard, beast_gemstone, dust_bone, peanut_butter, uncooked_caramel, caramel, fondant, jelly_bean_mold, peanut_butter_cup, 
				caramel_chocolate_bar, peanut_chocolate_bar, candy_corn, jelly_beans, caramel_apple, raw_turkey, cooked_turkey, turkey_feather, wishbone, war_bonnet, green_beans, onion, masher, 
				gravy, mashed_potatoes, mashed_potatoes_gravy, stuffing, green_bean_casserole, hunger_pill);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(malachite_ingot);
		registerRender(malachite_sword);
		registerRender(malachite_pickaxe);
		registerRender(malachite_axe);
		registerRender(malachite_shovel);
		registerRender(malachite_hoe);
		registerRender(meteorite_shard);
		registerRender(nickel_ingot);
		registerRender(aluminum_ingot);
		registerRender(silver_ingot);
		registerRender(lead_ingot);
		registerRender(zinc_ingot);
		registerRender(carbon_ingot);
		registerRender(tin_ingot);
		registerRender(copper_ingot);
		registerRender(cobalt_ingot);
		registerRender(enderite);
		registerRender(ultrafood_gem);
		registerRender(superfood_gem);
		registerRender(amber);
		registerRender(onyx);
		registerRender(seasonal_gem);
		registerRender(ruby);
		registerRender(peridot);
		registerRender(amethyst);
		registerRender(adamantium_ingot);
		registerRender(vibranium);
		registerRender(dwarf_star_alloy);
		registerRender(slime_gem);
		registerRender(energetic_orb);
		registerRender(ancient_locket);
		registerRender(elemental_ingot);
		registerRender(selenite);
		registerRender(enderite_sword);
		registerRender(enderite_pickaxe);
		registerRender(peridot_sword);
		registerRender(peridot_pickaxe);
		registerRender(peridot_axe);
		registerRender(peridot_shovel);
		registerRender(peridot_hoe);
		registerRender(amethyst_sword);
		registerRender(amethyst_pickaxe);
		registerRender(amethyst_axe);
		registerRender(amethyst_shovel);
		registerRender(amethyst_hoe);
		registerRender(amethyst_pickhoxel);
		registerRender(beryl);
		registerRender(magnetite_ingot);
		registerRender(bronze_ingot);
		registerRender(iridium_ingot);
		registerRender(enchanted_slime_gem);
		registerRender(infused_slime_gem);
		registerRender(magical_slime_gem); 
		registerRender(evolved_slime_gem);
		registerRender(imbued_rod);
		registerRender(slime_sword);
		registerRender(bronze_sword);
		registerRender(bronze_pickaxe);
		registerRender(bronze_axe);
		registerRender(bronze_shovel);
		registerRender(bronze_hoe);
		registerRender(bronze_pickhoxel);
		registerRender(selenite_sword);
		registerRender(selenite_pickaxe);
		registerRender(onyx_pickaxe);
		registerRender(remarkable_slimeball);
		registerRender(mythical_slimeball);
		registerRender(ruby_sword);
		registerRender(ruby_pickaxe);
		registerRender(ruby_axe);
		registerRender(ruby_shovel);
		registerRender(ruby_hoe);
		registerRender(amber_locket);
		registerRender(steel_ingot);
		registerRender(graphite);
		registerRender(silicon_chunk);
		registerRender(silicon);
		registerRender(concrete_dust);
		registerRender(aluminum_sheet);
		registerRender(nickel_sheet);
		registerRender(polymer);
		registerRender(electronic);
		registerRender(computer_chip);
		registerRender(control_panel);
		registerRender(visor);
		registerRender(aluminum_wire);
		registerRender(copper_wire);
		registerRender(basic_wire);
		registerRender(advanced_wire);
		registerRender(prominent_wire);
		registerRender(basic_battery);
		registerRender(advanced_battery);
		registerRender(prominent_battery);
		registerRender(tech_arm);
		registerRender(knife);
		registerRender(animal_fat);
		registerRender(grease);
		registerRender(bacon);
		registerRender(tomato);
		registerRender(strawberry);
		registerRender(blueberry);
		registerRender(cherry);
		registerRender(corn);
		registerRender(mint);
		registerRender(banana);
		registerRender(vanilla);
		registerRender(maple);
		registerRender(cinnamon);
		registerRender(barley);
		registerRender(oat);
		registerRender(rye);
		registerRender(peanut);
		registerRender(pecan);
		registerRender(walnut); 
		registerRender(rhubarb);
		registerRender(whisk);
		registerRender(cream);
		registerRender(whipped_cream);
		registerRender(butter);
		registerRender(cream_cheese);
		registerRender(cheese);
		registerRender(crust);
		registerRender(chocolate);
		registerRender(flour);
		registerRender(salt);
		registerRender(cornstarch);
		registerRender(baking_soda);
		registerRender(baking_powder);
		registerRender(vegetable_oil);
		registerRender(funnel_cake_mixture);
		registerRender(brown_sugar);
		registerRender(graham_cracker);
		registerRender(marshmallow);
		registerRender(ice_cream_cone);
		registerRender(molasses);
		registerRender(syrup);
		registerRender(corn_syrup);
		registerRender(dark_corn_syrup);
		registerRender(fudge);
		registerRender(brownie);
		registerRender(mint_brownie);
		registerRender(blondie);
		registerRender(smore);
		registerRender(cupcake);
		registerRender(banana_bread);
		registerRender(vanilla_ice_cream);
		registerRender(chocolate_ice_cream);
		registerRender(mint_ice_cream);
		registerRender(strawberry_ice_cream);
		registerRender(cookies_and_cream_ice_cream);
		registerRender(funnel_cake);
		registerRender(cheesecake);
		registerRender(chocolate_cake);
		registerRender(angel_food_cake);
		registerRender(ice_cream_cake);
		registerRender(apple_pie);
		registerRender(pecan_pie);
		registerRender(blueberry_pie);
		registerRender(cherry_pie);
		registerRender(strawberry_pie);
		registerRender(french_silk_pie);
		registerRender(rhubarb_pie);
		registerRender(double_chocolate_cookie);
		registerRender(smore_cookie);
		registerRender(earth_shard);
		registerRender(earth_ingot);
		registerRender(earth_pickaxe);
		registerRender(water_shard);
		registerRender(water_ingot);
		registerRender(water_shovel);
		registerRender(air_shard);
		registerRender(air_ingot);
		registerRender(air_axe);
		registerRender(fire_shard);
		registerRender(fire_ingot);
		registerRender(fire_sword);
		registerRender(shattered_soul);
		registerRender(soul);
		registerRender(power_stone);
		registerRender(space_stone);
		registerRender(reality_stone);
		registerRender(soul_stone);
		registerRender(time_stone);
		registerRender(mind_stone);
		registerRender(infinity_gauntlet);
		registerRender(wolverine_claws);
		registerRender(panther_claws);
		registerRender(ballistic_nylon);
		registerRender(captain_shield);
		registerRender(portal_stone);
		registerRender(ender_stone);
		registerRender(ender_sword);
		registerRender(curious_powder);
		registerRender(curiosity);
		registerRender(terrorizer);
		registerRender(blue_moon_quartz);
		registerRender(assassin);
		registerRender(pulverizer);
		registerRender(atomic_splicer);
		registerRender(charged_atomic_splicer);
		registerRender(atom);
		registerRender(winter_gem);
		registerRender(spring_gem);
		registerRender(summer_gem);
		registerRender(autumn_gem);
		registerRender(heart_gem);
		registerRender(heart_candy);
		registerRender(heart_sword);
		registerRender(eggplant);
		registerRender(peach);
		registerRender(pineapple);
		registerRender(raspberry);
		registerRender(golden_potato);
		registerRender(golden_beetroot);
		registerRender(golden_eggplant);
		registerRender(golden_peach);
		registerRender(golden_pineapple);
		registerRender(peach_cobbler);
		registerRender(ultra_potato);
		registerRender(ultra_berry);
		registerRender(sugared_flesh);
		registerRender(night_steel);
		registerRender(enderic_alloy);
		registerRender(charged_beryl);
		registerRender(mysterious_moss_ball);
		registerRender(axe_of_capitalism);
		registerRender(oculus);
		registerRender(dragonglass);
		registerRender(valyrian_steel);
		registerRender(longclaw);
		registerRender(ice);
		registerRender(oathkeeper);
		registerRender(widow_wail);
		registerRender(dragonglass_arakh);
		registerRender(dragonglass_spear);
		registerRender(dragonglass_axe);
		registerRender(needle);
		registerRender(catspaw_dagger);
		registerRender(mjolnir);
		registerRender(stormbreaker);
		registerRender(kyber_crystal);
		registerRender(saber_blue);
		registerRender(saber_green);
		registerRender(saber_purple);
		registerRender(saber_red);
		registerRender(enderic_pickhoxel);
		registerRender(frozen_flesh);
		registerRender(pulsating_shard);
		registerRender(dust_bone);	
		registerRender(peanut_butter);	
		registerRender(uncooked_caramel);	
		registerRender(caramel);	
		registerRender(fondant);	
		registerRender(jelly_bean_mold);	
		registerRender(peanut_butter_cup);	
		registerRender(caramel_chocolate_bar);	
		registerRender(peanut_chocolate_bar);	
		registerRender(candy_corn);	
		registerRender(jelly_beans);	
		registerRender(caramel_apple);
		registerRender(wishbone);
		registerRender(turkey_feather);
		registerRender(raw_turkey);
		registerRender(cooked_turkey);
		registerRender(war_bonnet);
		registerRender(green_beans);
		registerRender(onion);
		registerRender(masher);
		registerRender(gravy);
		registerRender(mashed_potatoes);
		registerRender(mashed_potatoes_gravy);
		registerRender(stuffing);
		registerRender(green_bean_casserole);
		registerRender(hunger_pill);
	//	registerRender(time_master_clock);
		
		registerRender(tomato_seed);
		registerRender(strawberry_seed);
		registerRender(cherry_seed);
		registerRender(blueberry_seed);
		registerRender(cotton);
		registerRender(corn_seed);
		registerRender(mint_seed);
		registerRender(banana_seed);
		registerRender(vanilla_seed);
		registerRender(maple_seed);
		registerRender(cinnamon_seed);
		registerRender(barley_seed);
		registerRender(oat_seed);
		registerRender(rye_seed);
		registerRender(ginger);
		registerRender(peanut_seed);
		registerRender(pecan_seed);
		registerRender(walnut_seed);
		registerRender(rhubarb_seed);
		registerRender(eggplant_seed);
		registerRender(peach_seed);
		registerRender(pineapple_seed);
		registerRender(raspberry_seed);
		registerRender(garlic);
		registerRender(green_bean_seed);
		registerRender(onion_seed);
		
		registerRender(enderite_helmet);
		registerRender(enderite_chestplate);
		registerRender(enderite_leggings);
		registerRender(enderite_boots);
		
		registerRender(slime_helmet);
		registerRender(slime_chestplate);
		registerRender(slime_leggings);
		registerRender(slime_boots);
		
		registerRender(selenite_helmet);
		registerRender(selenite_chestplate);
		registerRender(selenite_leggings);
		registerRender(selenite_boots);
		
		registerRender(ruby_helmet);
		registerRender(ruby_chestplate);
		registerRender(ruby_leggings);
		registerRender(ruby_boots);
		
		registerRender(cobalt_helmet);
		registerRender(cobalt_chestplate);
		registerRender(cobalt_leggings);
		registerRender(cobalt_boots);
		
		registerRender(tech_helmet);
		registerRender(tech_chestplate);
		registerRender(tech_leggings);
		registerRender(tech_boots);
		
		registerRender(element_helmet);
		registerRender(element_chestplate);
		registerRender(element_leggings);
		registerRender(element_boots);
		
		registerRender(ppajama_helmet);
		registerRender(ppajama_chestplate);
		registerRender(ppajama_leggings);
		registerRender(ppajama_boots);
		
		registerRender(bpajama_helmet);
		registerRender(bpajama_chestplate);
		registerRender(bpajama_leggings);
		registerRender(bpajama_boots);
		
		registerRender(flash_helmet);
		registerRender(flash_chestplate);
		registerRender(flash_leggings);
		registerRender(flash_boots);
		
		registerRender(wolverine_helmet);
		registerRender(wolverine_chestplate);
		registerRender(wolverine_leggings);
		registerRender(wolverine_boots);
		
		registerRender(panther_helmet);
		registerRender(panther_chestplate);
		registerRender(panther_leggings);
		registerRender(panther_boots);
		
		registerRender(captain_helmet);
		registerRender(captain_chestplate);
		registerRender(captain_leggings);
		registerRender(captain_boots);

		registerRender(purge_mask);
		
		registerRender(aexosuit_helmet);
		registerRender(aexosuit_chestplate);
		registerRender(aexosuit_leggings);
		registerRender(aexosuit_boots);
		
		registerRender(nights_watch_chestplate);
		registerRender(nights_watch_leggings);
		registerRender(nights_watch_boots);
		
		registerRender(pexosuit_helmet);
		registerRender(pexosuit_chestplate);
		registerRender(pexosuit_leggings);
		registerRender(pexosuit_boots);

		registerRender(beast_gemstone);
	}
	
													//Name, Harvest Level, Durability, Efficiency, Damage, Enchantibility
	public static final ToolMaterial MalachiteTools = EnumHelper.addToolMaterial("MalachiteTools", 2, 905, 7f, 2.5f, 12);
	public static final ToolMaterial BronzeTools = EnumHelper.addToolMaterial("BronzeTools", 2, 4000, 9f, 2.5f, 20);
	public static final ToolMaterial AmethystTools = EnumHelper.addToolMaterial("AmethystTools", 3, 1350, 9f, 4f, 18);
	public static final ToolMaterial RubyTools = EnumHelper.addToolMaterial("RubyTools", 3, 2000, 12f, 4f, 20);
	public static final ToolMaterial PeridotTools = EnumHelper.addToolMaterial("PeridotTools", 3, 1750, 10f, 5f, 15);
	public static final ToolMaterial OnyxTools = EnumHelper.addToolMaterial("OnyxTools", 3, -1, 5f, 4f, 25);
	public static final ToolMaterial SlimeTools = EnumHelper.addToolMaterial("SlimeTools", 3, 2050, 11f, 7f, 20);
	public static final ToolMaterial EnderiteTools = EnumHelper.addToolMaterial("EnderiteTools", 4, 5000, 15f, 6f, 25);
	public static final ToolMaterial SeleniteTools = EnumHelper.addToolMaterial("SeleniteTools", 5, 8000, 20f, 8f, 30);
	public static final ToolMaterial SelenitePTools = EnumHelper.addToolMaterial("SeleniteTools", 5, 8000, 20f, 6f, 30);
	public static final ToolMaterial TechTools = EnumHelper.addToolMaterial("TechTools", 5, 10000, 22f, 11f, 0);
	public static final ToolMaterial ElementTools = EnumHelper.addToolMaterial("ElementTools", 5, 12000, 25f, 9f, 30);
	public static final ToolMaterial InfinityTools = EnumHelper.addToolMaterial("InfinityTools", 3, -1, 20f, 11f, 0);
	public static final ToolMaterial WClawTools = EnumHelper.addToolMaterial("WClawTools", 3, 4000, 10f, 5f, 0);
	public static final ToolMaterial PClawTools = EnumHelper.addToolMaterial("PClawTools", 3, 4000, 10f, 5.5f, 0);
	public static final ToolMaterial ShieldTools = EnumHelper.addToolMaterial("ShieldTools", 3, 5000, 10f, 6f, 0);
	public static final ToolMaterial EnderTools = EnumHelper.addToolMaterial("EnderTools", 4, 6500, 10f, 9f, 15);
	public static final ToolMaterial CuriousTools = EnumHelper.addToolMaterial("CuriousTools", 3, 3250, 6f, 5f, 0);
	public static final ToolMaterial TerrorizerTools = EnumHelper.addToolMaterial("TerrorizerTools", 3, 3000, 7f, 6.5f, 0);
	public static final ToolMaterial AssassinTools = EnumHelper.addToolMaterial("AssassinTools", 3, 6000, 8f, 6f, 0);
	public static final ToolMaterial PulverizerTools = EnumHelper.addToolMaterial("PulverizerTools", 3, 8000, 9f, 6f, 0);
	public static final ToolMaterial HeartTools = EnumHelper.addToolMaterial("HeartTools", 3, -1, 9f, 6f, 20);
	public static final ToolMaterial CapitalismTools = EnumHelper.addToolMaterial("CapitalismTools", 3, 15000, 9f, 13f, 0);
	public static final ToolMaterial OculusTools = EnumHelper.addToolMaterial("OculusTools", 3, 17500, 9f, 11f, 0);
	public static final ToolMaterial LongclawTools = EnumHelper.addToolMaterial("LongclawTools", 3, 6000, 10f, 11f, 30);
	public static final ToolMaterial IceTools = EnumHelper.addToolMaterial("IceTools", 3, 10000, 8f, 12f, 25);
	public static final ToolMaterial OathkeeperTools = EnumHelper.addToolMaterial("OathkeeperTools", 3, 5000, 9f, 11f, 20);
	public static final ToolMaterial WidowWailTools = EnumHelper.addToolMaterial("WidowWailTools", 3, 4000, 9f, 10f, 10);
	public static final ToolMaterial DArakhTools = EnumHelper.addToolMaterial("DArakhTools", 3, -1, 9f, 10f, 10);
	public static final ToolMaterial DSpearTools = EnumHelper.addToolMaterial("DSpearTools", 3, -1, 9f, 11f, 10);
	public static final ToolMaterial DAxeTools = EnumHelper.addToolMaterial("DAxeTools", 3, -1, 9f, 12f, 10);
	public static final ToolMaterial NeedleTools = EnumHelper.addToolMaterial("NeedleTools", 3, 9000, 9f, 4f, 30);
	public static final ToolMaterial CatspawTools = EnumHelper.addToolMaterial("CatspawTools", 3, -1, 9f, 11f, 30);
	public static final ToolMaterial MjolnirTools = EnumHelper.addToolMaterial("MjolnirTools", 3, -1, 9f, 4f, 0);
	public static final ToolMaterial StormbreakerTools = EnumHelper.addToolMaterial("StormbreakerTools", 3, -1, 9f, 5f, 0);
	public static final ToolMaterial LightsaberTools = EnumHelper.addToolMaterial("LightsaberTools", 3, -1, 9f, 9f, 0);
	public static final ToolMaterial EndericPhTools = EnumHelper.addToolMaterial("EndericPhTools", 5, 10000, 25f, 5f, 0);
	
					//Name, Texture Name, Durability, Protection: (Boots, Leggings, Chestplate, Helmet), Enchantibility, Sound, Resistance
	public static final ArmorMaterial EnderiteArmor = EnumHelper.addArmorMaterial("enderitearmor", VanillaEvolutionMod.MODID + ":enderite_armor", 40, 
			new int[] {4, 8, 11, 5}, 15, SoundEvents.ENTITY_ENDERMEN_TELEPORT, 3f);

	public static final ArmorMaterial SlimeArmor = EnumHelper.addArmorMaterial("slimearmor", VanillaEvolutionMod.MODID + ":slime_armor", 35, 
			new int[] {5, 9, 13, 6}, 20, SoundEvents.ENTITY_SLIME_SQUISH, 2f);
	
	public static final ArmorMaterial SeleniteArmor = EnumHelper.addArmorMaterial("selenitearmor", VanillaEvolutionMod.MODID + ":selenite_armor", 60, 
			new int[] {7, 12, 14, 8}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5f);
	
	public static final ArmorMaterial RubyArmor = EnumHelper.addArmorMaterial("rubyarmor", VanillaEvolutionMod.MODID + ":ruby_armor", 36, 
			new int[] {3, 7, 9, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f);
	
	public static final ArmorMaterial CobaltArmor = EnumHelper.addArmorMaterial("cobaltarmor", VanillaEvolutionMod.MODID + ":cobalt_armor", 22, 
			new int[] {2, 5, 7, 3}, 16, SoundEvents.ENTITY_GENERIC_SPLASH, 0f);
	
	public static final ArmorMaterial TechArmor = EnumHelper.addArmorMaterial("techarmor", VanillaEvolutionMod.MODID + ":tech_armor", 40, 
			new int[] {6, 10, 12, 6}, 0, SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT, 4f);
	
	public static final ArmorMaterial ElementArmor = EnumHelper.addArmorMaterial("elementarmor", VanillaEvolutionMod.MODID + ":element_armor", 75, 
			new int[] {8, 13, 15, 8}, 16, SoundEvents.ENTITY_ELDER_GUARDIAN_CURSE, 5f);
	
	public static final ArmorMaterial ElementArmor2 = EnumHelper.addArmorMaterial("elementarmor2", VanillaEvolutionMod.MODID + ":testelement_armor", 75, 
			new int[] {8, 13, 15, 8}, 16, SoundEvents.ENTITY_PLAYER_HURT_ON_FIRE, 5f);
	
	public static final ArmorMaterial PPajamaArmor = EnumHelper.addArmorMaterial("ppjamaarmor", VanillaEvolutionMod.MODID + ":ppajama_armor", 25, 
			new int[] {1, 2, 2, 1}, 20, SoundEvents.ENTITY_SHEEP_SHEAR, 0f);
	
	public static final ArmorMaterial BPajamaArmor = EnumHelper.addArmorMaterial("bpajamaarmor", VanillaEvolutionMod.MODID + ":bpajama_armor", 25, 
			new int[] {1, 2, 2, 1}, 20, SoundEvents.ENTITY_SHEEP_SHEAR, 0f);
	
	public static final ArmorMaterial FlashArmor = EnumHelper.addArmorMaterial("flasharmor", VanillaEvolutionMod.MODID + ":flash_armor", 30, 
			new int[] {1, 3, 4, 2}, 30, SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT, 0f);
	
	public static final ArmorMaterial WolverineArmor = EnumHelper.addArmorMaterial("wolverinearmor", VanillaEvolutionMod.MODID + ":wolverine_armor", 50, 
			new int[] {4, 8, 9, 4}, 20, SoundEvents.BLOCK_IRON_DOOR_CLOSE, 2f);
	
	public static final ArmorMaterial PantherArmor = EnumHelper.addArmorMaterial("pantherarmor", VanillaEvolutionMod.MODID + ":panther_armor", 54, 
			new int[] {4, 8, 10, 6}, 30, SoundEvents.ENTITY_CAT_HISS, 3f);
	
	public static final ArmorMaterial CaptainArmor = EnumHelper.addArmorMaterial("captainarmor", VanillaEvolutionMod.MODID + ":captain_armor", 45, 
			new int[] {4, 8, 9, 5}, 30, SoundEvents.ITEM_SHIELD_BLOCK, 3f);
	
	public static final ArmorMaterial PurgeArmor = EnumHelper.addArmorMaterial("purgearmor", VanillaEvolutionMod.MODID + ":purge_armor", -1, 
			new int[] {2, 2, 2, 2}, 20, SoundEvents.ENTITY_GHAST_SCREAM, 1f);
	
	public static final ArmorMaterial AExosuitArmor = EnumHelper.addArmorMaterial("aexosuitarmor", VanillaEvolutionMod.MODID + ":aexosuit_armor", 60, 
			new int[] {6, 10, 13, 7}, 0, SoundEvents.BLOCK_PISTON_CONTRACT, 5f);
	
	public static final ArmorMaterial CloakArmor = EnumHelper.addArmorMaterial("cloakarmor", VanillaEvolutionMod.MODID + ":moonlightcloak_armor", 75, 
			new int[] {9, 14, 16, 10}, 20, SoundEvents.AMBIENT_CAVE, 6f);
	
	public static final ArmorMaterial EnderArmor = EnumHelper.addArmorMaterial("enderarmor", VanillaEvolutionMod.MODID + ":ender_armor", 75, 
			new int[] {10, 15, 16, 11}, 20, SoundEvents.ENTITY_ENDERMEN_AMBIENT, 5f);
	
	public static final ArmorMaterial NightArmor = EnumHelper.addArmorMaterial("nightarmor", VanillaEvolutionMod.MODID + ":nights_watch_armor", 100, 
			new int[] {8, 14, 15, 9}, 16, SoundEvents.AMBIENT_CAVE, 4f);
	
	public static final ArmorMaterial PExosuitArmor = EnumHelper.addArmorMaterial("pexosuitarmor", VanillaEvolutionMod.MODID + ":pexosuit_armor", 80, 
			new int[] {8, 12, 14, 9}, 0, SoundEvents.BLOCK_NOTE_BASS, 5f);
	
	public static final ArmorMaterial BeastArmor = EnumHelper.addArmorMaterial("beastarmor", VanillaEvolutionMod.MODID + ":beast_armor", 60, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.AMBIENT_CAVE, 0f);
	
	public static final ArmorMaterial BonnetArmor = EnumHelper.addArmorMaterial("bonnetarmor", VanillaEvolutionMod.MODID + ":war_bonnet_armor", 30, 
			new int[] {2, 0, 0, 0}, 0, SoundEvents.BLOCK_CLOTH_BREAK, 0f);
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
}
