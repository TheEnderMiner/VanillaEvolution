package com.evep.evepmod.init;

import java.util.ArrayList;
import java.util.List;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.items.*;
import com.evep.evepmod.items.armor.ItemAsteroidArmor;
import com.evep.evepmod.items.armor.ItemBLocketArmor;
import com.evep.evepmod.items.armor.ItemBeastArmor;
import com.evep.evepmod.items.armor.ItemCAArmor;
import com.evep.evepmod.items.armor.ItemCloakBoots;
import com.evep.evepmod.items.armor.ItemCloakChestplate;
import com.evep.evepmod.items.armor.ItemCloakHelmet;
import com.evep.evepmod.items.armor.ItemCloakLeggings;
import com.evep.evepmod.items.armor.ItemCobaltArmor;
import com.evep.evepmod.items.armor.ItemCyborgArmor;
import com.evep.evepmod.items.armor.ItemDwarvenArmor;
import com.evep.evepmod.items.armor.ItemEarthArmor;
import com.evep.evepmod.items.armor.ItemEarthChestplate;
import com.evep.evepmod.items.armor.ItemElementArmor;
import com.evep.evepmod.items.armor.ItemElementArmor2;
import com.evep.evepmod.items.armor.ItemEnderiteArmor;
import com.evep.evepmod.items.armor.ItemEnergeticArmor;
import com.evep.evepmod.items.armor.ItemExosuitArmor;
import com.evep.evepmod.items.armor.ItemFELocketArmor;
import com.evep.evepmod.items.armor.ItemFFLocketArmor;
import com.evep.evepmod.items.armor.ItemFLocketArmor;
import com.evep.evepmod.items.armor.ItemFlashArmor;
import com.evep.evepmod.items.armor.ItemHLocketArmor;
import com.evep.evepmod.items.armor.ItemJediArmor;
import com.evep.evepmod.items.armor.ItemKrampusArmor;
import com.evep.evepmod.items.armor.ItemKyloArmor;
import com.evep.evepmod.items.armor.ItemLLocketArmor;
import com.evep.evepmod.items.armor.ItemLionArmor;
import com.evep.evepmod.items.armor.ItemLunarArmor;
import com.evep.evepmod.items.armor.ItemMLocketArmor;
import com.evep.evepmod.items.armor.ItemNightsWatchArmor;
import com.evep.evepmod.items.armor.ItemNuclearIArmor;
import com.evep.evepmod.items.armor.ItemPajamaArmor;
import com.evep.evepmod.items.armor.ItemPantherArmor;
import com.evep.evepmod.items.armor.ItemProminentArmor;
import com.evep.evepmod.items.armor.ItemPurgeMask;
import com.evep.evepmod.items.armor.ItemRubyArmor;
import com.evep.evepmod.items.armor.ItemScaleArmor;
import com.evep.evepmod.items.armor.ItemSeleniteArmor;
import com.evep.evepmod.items.armor.ItemShadowArmor;
import com.evep.evepmod.items.armor.ItemSlimeArmor;
import com.evep.evepmod.items.armor.ItemSolarArmor;
import com.evep.evepmod.items.armor.ItemSweaterArmor;
import com.evep.evepmod.items.armor.ItemTechArmor;
import com.evep.evepmod.items.armor.ItemThanosArmor;
import com.evep.evepmod.items.armor.ItemThorArmor;
import com.evep.evepmod.items.armor.ItemTitaniumArmor;
import com.evep.evepmod.items.armor.ItemVLocketArmor;
import com.evep.evepmod.items.armor.ItemVaderArmor;
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
import com.evep.evepmod.items.tools.ItemAsteroidPickaxe;
import com.evep.evepmod.items.tools.ItemAsteroidSword;
import com.evep.evepmod.items.tools.ItemBronzeAxe;
import com.evep.evepmod.items.tools.ItemBronzeHoe;
import com.evep.evepmod.items.tools.ItemBronzePickaxe;
import com.evep.evepmod.items.tools.ItemBronzePickhoxel;
import com.evep.evepmod.items.tools.ItemBronzeShovel;
import com.evep.evepmod.items.tools.ItemBronzeSword;
import com.evep.evepmod.items.tools.ItemCAShield;
import com.evep.evepmod.items.tools.ItemCapitalismAxe;
import com.evep.evepmod.items.tools.ItemCatspaw;
import com.evep.evepmod.items.tools.ItemCuriosity;
import com.evep.evepmod.items.tools.ItemDarknessBlade;
import com.evep.evepmod.items.tools.ItemDragonglassArakh;
import com.evep.evepmod.items.tools.ItemDragonglassAxe;
import com.evep.evepmod.items.tools.ItemDragonglassSpear;
import com.evep.evepmod.items.tools.ItemDwarvenDagger;
import com.evep.evepmod.items.tools.ItemDwarvenMace;
import com.evep.evepmod.items.tools.ItemDwarvenPickhoxel;
import com.evep.evepmod.items.tools.ItemDwarvenSword;
import com.evep.evepmod.items.tools.ItemEarthPickaxe;
import com.evep.evepmod.items.tools.ItemEarthenPickhoxel;
import com.evep.evepmod.items.tools.ItemEnderSword;
import com.evep.evepmod.items.tools.ItemEndericPickhoxel;
import com.evep.evepmod.items.tools.ItemEnderitePickaxe;
import com.evep.evepmod.items.tools.ItemEnderiteSword;
import com.evep.evepmod.items.tools.ItemFireSword;
import com.evep.evepmod.items.tools.ItemFrostSword;
import com.evep.evepmod.items.tools.ItemHeartSword;
import com.evep.evepmod.items.tools.ItemHeartsbane;
import com.evep.evepmod.items.tools.ItemIce;
import com.evep.evepmod.items.tools.ItemInfinityGauntlet;
import com.evep.evepmod.items.tools.ItemKFSword;
import com.evep.evepmod.items.tools.ItemKKSword;
import com.evep.evepmod.items.tools.ItemKLSword;
import com.evep.evepmod.items.tools.ItemKSSword;
import com.evep.evepmod.items.tools.ItemLightning;
import com.evep.evepmod.items.tools.ItemLightsaber;
import com.evep.evepmod.items.tools.ItemLightsaberFast;
import com.evep.evepmod.items.tools.ItemLunarAxe;
import com.evep.evepmod.items.tools.ItemLunarHoe;
import com.evep.evepmod.items.tools.ItemLunarPickaxe;
import com.evep.evepmod.items.tools.ItemLunarPickhoxel;
import com.evep.evepmod.items.tools.ItemLunarShovel;
import com.evep.evepmod.items.tools.ItemLunarSword;
import com.evep.evepmod.items.tools.ItemMagmaSword;
import com.evep.evepmod.items.tools.ItemMalachiteAxe;
import com.evep.evepmod.items.tools.ItemMalachiteHoe;
import com.evep.evepmod.items.tools.ItemMalachitePickaxe;
import com.evep.evepmod.items.tools.ItemMalachiteShovel;
import com.evep.evepmod.items.tools.ItemMalachiteSword;
import com.evep.evepmod.items.tools.ItemNeedle;
import com.evep.evepmod.items.tools.ItemNightKingSpear;
import com.evep.evepmod.items.tools.ItemNightKingSword;
import com.evep.evepmod.items.tools.ItemOathkeeper;
import com.evep.evepmod.items.tools.ItemOculus;
import com.evep.evepmod.items.tools.ItemOnyxPickaxe;
import com.evep.evepmod.items.tools.ItemPantherClaws;
import com.evep.evepmod.items.tools.ItemPeridotAxe;
import com.evep.evepmod.items.tools.ItemPeridotHoe;
import com.evep.evepmod.items.tools.ItemPeridotPickaxe;
import com.evep.evepmod.items.tools.ItemPeridotShovel;
import com.evep.evepmod.items.tools.ItemPeridotSword;
import com.evep.evepmod.items.tools.ItemPlatinumPickaxe;
import com.evep.evepmod.items.tools.ItemPlatinumSword;
import com.evep.evepmod.items.tools.ItemPulverizer;
import com.evep.evepmod.items.tools.ItemRubyAxe;
import com.evep.evepmod.items.tools.ItemRubyHoe;
import com.evep.evepmod.items.tools.ItemRubyPickaxe;
import com.evep.evepmod.items.tools.ItemRubyShovel;
import com.evep.evepmod.items.tools.ItemRubySword;
import com.evep.evepmod.items.tools.ItemSelenitePickaxe;
import com.evep.evepmod.items.tools.ItemSeleniteSword;
import com.evep.evepmod.items.tools.ItemSlimeSword;
import com.evep.evepmod.items.tools.ItemSolarAxe;
import com.evep.evepmod.items.tools.ItemSolarHoe;
import com.evep.evepmod.items.tools.ItemSolarPickaxe;
import com.evep.evepmod.items.tools.ItemSolarPickhoxel;
import com.evep.evepmod.items.tools.ItemSolarShovel;
import com.evep.evepmod.items.tools.ItemSolarSword;
import com.evep.evepmod.items.tools.ItemTechArm;
import com.evep.evepmod.items.tools.ItemTerra;
import com.evep.evepmod.items.tools.ItemTerrorizer;
import com.evep.evepmod.items.tools.ItemThanosGlaive;
import com.evep.evepmod.items.tools.ItemVacuousSword;
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
	public static ItemLightsaber saber_duo;
	public static ItemLightsaberFast saber_kylo;
	public static ItemLightsaber saber_yellow;
	public static ItemLightsaberFast saber_shoto_yellow;
	public static ItemLightsaberFast saber_shoto_green;
	public static ItemIceShard ice_shard;
	public static ItemKrampusCloth krampus_cloth;
	public static ItemSeasonalGem christmas_gem;
	public static ItemMug mug;
	public static ItemBaking christmas_cookie_dough;
	public static ItemEggnog eggnog;
	public static ItemHardenedScales hardened_scales;
	public static ItemBasiliskEye basilisk_eye;
	public static ItemImbuedRod godly_rod;
	public static ItemInfusedIceShard infused_ice_shard;
	public static ItemNightKingSword night_king_sword;
	public static ItemNightKingSpear night_king_spear;
	public static ItemMagmaSword magma_sword;
	public static ItemElectronSplicer electron_splicer;
	public static ItemElectron electron;
	public static ItemBGravitationalCompressor basic_gravitional_compressor;
	public static ItemMinorWormhole minor_wormhole;
	public static ItemDarkMatter dark_matter;
	public static ItemMoonGem moon_gem;
	public static ItemLunarSword lunar_sword;
	public static ItemLunarPickaxe lunar_pickaxe;
	public static ItemLunarAxe lunar_axe;
	public static ItemLunarShovel lunar_shovel;
	public static ItemLunarHoe lunar_hoe;
	public static ItemLunarPickhoxel lunar_pickhoxel;
	public static ItemSpaceMetal extraterrestrial_metal;
	public static ItemSpaceMetal asgardian_steel;
	public static ItemThanosGlaive thanos_glaive;
	public static ItemBreadSlice bread_slice;
	public static ItemBaking shortening;
	public static ItemBatter waffle_batter;
	public static ItemBatter pancake_batter;
	public static ItemCooking tortilla;
	public static ItemBaking sweet_dough;
	public static ItemCooking sliced_potatoes;
	public static ItemToast toast;
	public static ItemFrenchToast french_toast;
	public static ItemScrambledEggs scrambled_eggs;
	public static ItemOmelette omelette;
	public static ItemWaffle waffle;
	public static ItemPancake pancake;
	public static ItemBreakfastBurrito breakfast_burrito;
	public static ItemDonut donut;
	public static ItemHashbrowns hashbrowns;
	public static ItemMuffin poppy_seed_muffin;
	public static ItemUltrafood ultra_bread;
	public static ItemGlowingTomato glowing_tomato;
	public static ItemCarbonIngot carbon_nugget;
	public static ItemStarWars durasteel;
	public static ItemStarWars jedi_cloth;
	public static ItemStarWars sith_cloth;
	public static ItemDwarven dwarven_ingot;
	public static ItemDwarven dwarven_nugget;
	public static ItemDwarvenDagger dwarven_dagger;
	public static ItemDwarvenSword dwarven_sword;
	public static ItemDwarvenMace dwarven_mace;
	public static ItemDwarvenPickhoxel dwarven_pickhoxel;
	public static ItemMeteoriteShard iron_chunk;
	public static ItemMeteoriteShard gold_chunk;
	public static ItemMeteoriteShard silver_chunk;
	public static ItemMeteoriteShard platinum_chunk;
	public static ItemPlatinumIngot platinum_ingot;
	public static ItemUraniumIngot uranium_ingot;
	public static ItemTitaniumIngot titanium_ingot;
	public static ItemEarthGem earth_gem;
	public static ItemNeutronSplicer neutron_splicer;
	public static ItemElectron neutron;
	public static ItemPlutoniumIngot plutonium_ingot;
	public static ItemFrostSword frost_sword;
	public static ItemMinotaur minotaur_hide;
	public static ItemMinotaur minotaur_horn;
	public static ItemMinotaurHeart minotaur_heart;
	public static ItemAncientLocket overworld_locket;
	public static ItemAncientLocket earth_locket;
	public static ItemBasiliskEye immjiri_eye;
	public static ItemTechnology dwarven_mechanism;
	public static ItemNote note;
	public static ItemRawLion raw_lion;
	public static ItemLionHide lion_hide;
	public static ItemLionTooth lion_tooth;
	public static ItemCookedLion cooked_lion;
	public static ItemLionTooth lion_tooth_dust;
	public static ItemManeHair mane_hair;
	public static ItemDwarvenGem dwarven_gem;
	public static ItemSnowLeopard snow_leopard_hide;
	public static ItemPeltPile pelt_pile;
	public static ItemPeltPile hide_bundle;
	public static ItemImbuedRod dwarven_rod;
	public static ItemStrengthCrystal1 strength_crystal_1;
	public static ItemSolar solar_gas;
	public static ItemSolar solar_gem;
	public static ItemSolarSword solar_sword;
	public static ItemSolarPickaxe solar_pickaxe;
	public static ItemSolarAxe solar_axe;
	public static ItemSolarShovel solar_shovel;
	public static ItemSolarHoe solar_hoe;
	public static ItemSolarPickhoxel solar_pickhoxel;
	public static ItemPlatinumSword platinum_sword;
	public static ItemPlatinumPickaxe platinum_pickaxe;
	public static ItemDuskCloth dusk_cloth;
	public static ItemEarthenPickhoxel earthen_pickhoxel;
	public static ItemPopcorn popcorn;
	public static ItemUltrafood ultra_turkey;
	public static ItemCelestialCookie celestial_cookie;
	public static ItemBreathtakingMint breathtaking_mint;
	public static ItemImmjiriOffering immjiri_offering;
	public static ItemImmjiriTear immjiri_tear;
	public static ItemDarknessBlade darkness_blade;
	public static ItemEarthHorn earth_horn;
	public static ItemEarthTablet earth_tablet;
	public static ItemTerra terra;
	public static ItemTechnology lead_lining;
	public static ItemTechnology platinum_wire;
	public static ItemTechnology nuclear_battery;
	public static ItemAsteroidIngot asteroid_ingot;
	public static ItemAsteroidSword asteroid_sword;
	public static ItemAsteroidPickaxe asteroid_pickaxe;
	public static ItemHeartsbane heartsbane;
	public static ItemCheeseCracker cheese_cracker;
	public static ItemUltrafood ultra_cheese;
	public static ItemCuredSpiderEye cured_spider_eye;
	public static ItemAncientBook ancient_book;
	public static ItemVacuousSword vacuous_sword;
	public static ItemKKSword kk_sword;
	public static ItemKLSword kl_sword;
	public static ItemKSSword ks_sword;
	public static ItemKFSword kf_sword;
	public static ItemRoastCarrot roast_carrot;
	
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

	public static ItemKrampusArmor krampus_helmet;
	public static ItemKrampusArmor krampus_chestplate;
	public static ItemKrampusArmor krampus_leggings;
	public static ItemKrampusArmor krampus_boots;

	public static ItemSweaterArmor christmas_sweater_tree;
	public static ItemSweaterArmor christmas_sweater_snowman;
	public static ItemSweaterArmor christmas_sweater_candycane;

	public static ItemScaleArmor scale_helmet;
	public static ItemScaleArmor scale_chestplate;
	public static ItemScaleArmor scale_leggings;
	public static ItemScaleArmor scale_boots;

	public static ItemLunarArmor lunar_helmet;
	public static ItemLunarArmor lunar_chestplate;
	public static ItemLunarArmor lunar_leggings;
	public static ItemLunarArmor lunar_boots;

	public static ItemEnergeticArmor energetic_helmet;
	public static ItemEnergeticArmor energetic_chestplate;
	public static ItemEnergeticArmor energetic_leggings;
	public static ItemEnergeticArmor energetic_boots;

	public static ItemThanosArmor thanos_helmet;
	public static ItemThanosArmor thanos_chestplate;
	public static ItemThanosArmor thanos_leggings;
	public static ItemThanosArmor thanos_boots;

	public static ItemThorArmor thor_chestplate;
	public static ItemThorArmor thor_leggings;
	public static ItemThorArmor thor_boots;

	public static ItemJediArmor jedi_helmet;
	public static ItemJediArmor jedi_chestplate;
	public static ItemJediArmor jedi_leggings;
	public static ItemJediArmor jedi_boots;

	public static ItemJediArmor sith_helmet;
	public static ItemJediArmor sith_chestplate;
	public static ItemJediArmor sith_leggings;
	public static ItemJediArmor sith_boots;

	public static ItemKyloArmor kylo_helmet;
	public static ItemKyloArmor kylo_chestplate;
	public static ItemKyloArmor kylo_leggings;
	public static ItemKyloArmor kylo_boots;

	public static ItemVaderArmor vader_helmet;
	public static ItemVaderArmor vader_chestplate;
	public static ItemVaderArmor vader_leggings;
	public static ItemVaderArmor vader_boots;

	public static ItemDwarvenArmor dwarven_helmet;
	public static ItemDwarvenArmor dwarven_chestplate;
	public static ItemDwarvenArmor dwarven_leggings;
	public static ItemDwarvenArmor dwarven_boots;

	public static ItemVLocketArmor vanishing_locket;
	public static ItemBLocketArmor brawns_locket;
	public static ItemHLocketArmor healing_locket;
	public static ItemFLocketArmor fire_warding_locket;

	public static ItemLionArmor lion_helmet;
	public static ItemLionArmor lion_chestplate;
	public static ItemLionArmor lion_leggings;
	public static ItemLionArmor lion_boots;

	public static ItemTitaniumArmor titanium_helmet;
	public static ItemTitaniumArmor titanium_chestplate;
	public static ItemTitaniumArmor titanium_leggings;
	public static ItemTitaniumArmor titanium_boots;

	public static ItemSolarArmor solar_helmet;
	public static ItemSolarArmor solar_chestplate;
	public static ItemSolarArmor solar_leggings;
	public static ItemSolarArmor solar_boots;

	public static ItemCloakHelmet cloak_helmet;
	public static ItemCloakChestplate cloak_chestplate;
	public static ItemCloakLeggings cloak_leggings;
	public static ItemCloakBoots cloak_boots;

	public static ItemEarthArmor earthen_helmet;
	public static ItemEarthChestplate earthen_chestplate;
	public static ItemEarthArmor earthen_leggings;
	public static ItemEarthArmor earthen_boots;

	public static ItemShadowArmor shadow_helmet;
	public static ItemShadowArmor shadow_chestplate;
	public static ItemShadowArmor shadow_leggings;
	public static ItemShadowArmor shadow_boots;

	public static ItemFFLocketArmor fast_fighting_locket;
	public static ItemMLocketArmor mining_locket;
	public static ItemLLocketArmor leaping_locket;
	public static ItemFELocketArmor feeding_locket;

	public static ItemNuclearIArmor nucleari_helmet;
	public static ItemNuclearIArmor nucleari_chestplate;
	public static ItemNuclearIArmor nucleari_leggings;
	public static ItemNuclearIArmor nucleari_boots;

	public static ItemAsteroidArmor asteroid_helmet;
	public static ItemAsteroidArmor asteroid_chestplate;
	public static ItemAsteroidArmor asteroid_leggings;
	public static ItemAsteroidArmor asteroid_boots;

	public static ItemCyborgArmor cyborg_helmet;
	public static ItemCyborgArmor cyborg_chestplate;
	public static ItemCyborgArmor cyborg_leggings;
	public static ItemCyborgArmor cyborg_boots;
	
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
		knife = (ItemKnife) new ItemKnife("knife").setMaxStackSize(8).setContainerItem(VanillaEvolutionItems.copper_ingot).setCreativeTab(VanillaEvolutionMod.foodtab);
		animal_fat = (ItemAnimalFat) new ItemAnimalFat("animal_fat", 1, 0.1f, true).setCreativeTab(VanillaEvolutionMod.foodtab);
		grease = (ItemGrease) new ItemGrease("grease", 1, 0.1f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		bacon = (ItemBacon) new ItemBacon("bacon", 12, 0.8f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		tomato = (ItemTomato) new ItemTomato("tomato", 6, 1.3f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		strawberry = (ItemStrawberry) new ItemStrawberry("strawberry", 8, 1.1f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		blueberry = (ItemBlueberry) new ItemBlueberry("blueberry", 5, 1.5f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		cherry = (ItemCherry) new ItemCherry("cherry", 7, 1.0f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		corn = (ItemCorn) new ItemCorn("corn", 5, 1.5f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		mint = (ItemMint) new ItemMint("mint", 1, 0.3f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		banana = (ItemBanana) new ItemBanana("banana", 8, 1.1f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		vanilla = (ItemVanilla) new ItemVanilla("vanilla", 2, 0.1f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		maple = (ItemMaple) new ItemMaple("maple", 2, 0.3f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		cinnamon = (ItemCinnamon) new ItemCinnamon("cinnamon", 1, 0.0f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		barley = (ItemGrain) new ItemGrain("barley").setCreativeTab(VanillaEvolutionMod.seedtab);
		oat = (ItemGrain) new ItemGrain("oat").setCreativeTab(VanillaEvolutionMod.seedtab);
		rye = (ItemGrain) new ItemGrain("rye").setCreativeTab(VanillaEvolutionMod.seedtab);
		peanut = (ItemPeanut) new ItemPeanut("peanut", 4, 1.3f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		pecan = (ItemPeanut) new ItemPeanut("pecan", 3, 0.8f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		walnut = (ItemPeanut) new ItemPeanut("walnut", 5, 1.1f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		rhubarb = (ItemRhubarb) new ItemRhubarb("rhubarb", 3, 0.3f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		whisk = (ItemWhisk) new ItemWhisk("whisk").setMaxStackSize(8).setContainerItem(VanillaEvolutionItems.steel_ingot).setCreativeTab(VanillaEvolutionMod.foodtab);
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
		earth_shard = (ItemElements) new ItemElements("earth_shard").setCreativeTab(VanillaEvolutionMod.resourcetab);
		earth_ingot = (ItemElements) new ItemElements("earth_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		earth_pickaxe = (ItemEarthPickaxe) new ItemEarthPickaxe("earth_pickaxe", ElementTools, 13f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		water_shard = (ItemElements) new ItemElements("water_shard").setCreativeTab(VanillaEvolutionMod.resourcetab);
		water_ingot = (ItemElements) new ItemElements("water_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		water_shovel = (ItemWaterShovel) new ItemWaterShovel("water_shovel", ElementTools, 10f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		air_shard = (ItemElements) new ItemElements("air_shard").setCreativeTab(VanillaEvolutionMod.resourcetab);
		air_ingot = (ItemElements) new ItemElements("air_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		air_axe = (ItemAirAxe) new ItemAirAxe("air_axe", ElementTools, 15f, 1f).setCreativeTab(VanillaEvolutionMod.toolstab);
		fire_shard = (ItemElements) new ItemElements("fire_shard").setCreativeTab(VanillaEvolutionMod.resourcetab);
		fire_ingot = (ItemElements) new ItemElements("fire_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		fire_sword = (ItemFireSword) new ItemFireSword("fire_sword", ElementTools, 15f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		shattered_soul = (ItemSoul) new ItemSoul("shattered_soul").setCreativeTab(VanillaEvolutionMod.resourcetab);
		soul = (ItemSoul) new ItemSoul("soul").setCreativeTab(VanillaEvolutionMod.resourcetab);
		power_stone = (ItemPowerStone) new ItemPowerStone("power_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		space_stone = (ItemSpaceStone) new ItemSpaceStone("space_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		reality_stone = (ItemRealityStone) new ItemRealityStone("reality_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		soul_stone = (ItemSoulStone) new ItemSoulStone("soul_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		time_stone = (ItemTimeStone) new ItemTimeStone("time_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
		mind_stone = (ItemMindStone) new ItemMindStone("mind_stone").setCreativeTab(VanillaEvolutionMod.resourcetab);
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
		charged_atomic_splicer = (ItemChargedAtomicSplicer) new ItemChargedAtomicSplicer("charged_atomic_splicer").setContainerItem(VanillaEvolutionItems.atomic_splicer).setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.toolstab);
		atom = (ItemAtom) new ItemAtom("atom").setMaxStackSize(128).setCreativeTab(VanillaEvolutionMod.resourcetab);
		winter_gem = (ItemSeasonalGem) new ItemSeasonalGem("winter_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		spring_gem = (ItemSeasonalGem) new ItemSeasonalGem("spring_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		summer_gem = (ItemSeasonalGem) new ItemSeasonalGem("summer_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		autumn_gem = (ItemSeasonalGem) new ItemSeasonalGem("autumn_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		heart_gem = (ItemHeartGem) new ItemHeartGem("heart_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		heart_candy = (ItemHeartCandy) new ItemHeartCandy("heart_candy", 5, 0.6f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		heart_sword = (ItemHeartSword) new ItemHeartSword("heart_sword", HeartTools, 6f, 996f).setCreativeTab(VanillaEvolutionMod.seasontab);
		eggplant = (ItemEggplant) new ItemEggplant("eggplant", 7, 1.2f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		peach = (ItemPeach) new ItemPeach("peach", 5, 1.6f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		pineapple = (ItemPineapple) new ItemPineapple("pineapple", 7, 1.3f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		raspberry = (ItemRaspberry) new ItemRaspberry("raspberry", 4, 1.7f, false).setCreativeTab(VanillaEvolutionMod.seedtab);
		golden_potato = (ItemGoldenPotato) new ItemGoldenPotato("golden_potato", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		golden_beetroot = (ItemGoldenBeetroot) new ItemGoldenBeetroot("golden_beetroot", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		golden_eggplant = (ItemGoldenEggplant) new ItemGoldenEggplant("golden_eggplant", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		golden_peach = (ItemGoldenPeach) new ItemGoldenPeach("golden_peach", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		golden_pineapple = (ItemGoldenPineapple) new ItemGoldenPineapple("golden_pineapple", 10, 2.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		peach_cobbler = (ItemPeachCobbler) new ItemPeachCobbler("peach_cobbler", 16, 2.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		ultra_potato = (ItemUltrafood) new ItemUltrafood("ultra_potato", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		ultra_berry = (ItemUltrafood) new ItemUltrafood("ultra_berry", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		sugared_flesh = (ItemSugaredFlesh) new ItemSugaredFlesh("sugared_flesh", 20, 3.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
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
		cooked_turkey = (ItemCookedTurkey) new ItemCookedTurkey("cooked_turkey", 7, 0.8f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		green_beans = (ItemGreenBeans) new ItemGreenBeans("green_beans", 3, 0.8f, true).setCreativeTab(VanillaEvolutionMod.foodtab);
		onion = (ItemOnion) new ItemOnion("onion", 4, 0.5f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		masher = (ItemMasher) new ItemMasher("masher").setMaxStackSize(1).setContainerItem(VanillaEvolutionItems.steel_ingot).setCreativeTab(VanillaEvolutionMod.foodtab);
		gravy = (ItemGravy) new ItemGravy("gravy", 0, 0.0f, false).setCreativeTab(VanillaEvolutionMod.foodtab);
		mashed_potatoes = (ItemMPotatoes) new ItemMPotatoes("mashed_potatoes", 6, 0.8f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		mashed_potatoes_gravy = (ItemMPotatoesG) new ItemMPotatoesG("mashed_potatoes_gravy", 9, 1.2f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		stuffing = (ItemStuffing) new ItemStuffing("stuffing", 12, 1.6f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		green_bean_casserole = (ItemGBC) new ItemGBC("green_bean_casserole", 10, 1.5f, false).setCreativeTab(VanillaEvolutionMod.seasontab);
		hunger_pill = (ItemHungerPill) new ItemHungerPill("hunger_pill", 0, 0f, false).setCreativeTab(CreativeTabs.MISC);
		saber_duo = (ItemLightsaber) new ItemLightsaber("saber_duo", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_kylo = (ItemLightsaberFast) new ItemLightsaberFast("saber_kylo", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_yellow = (ItemLightsaber) new ItemLightsaber("saber_yellow", LightsaberTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_shoto_yellow = (ItemLightsaberFast) new ItemLightsaberFast("saber_shoto_yellow", LightsaberShotoTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		saber_shoto_green = (ItemLightsaberFast) new ItemLightsaberFast("saber_shoto_green", LightsaberShotoTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		ice_shard = (ItemIceShard) new ItemIceShard("ice_shard").setCreativeTab(VanillaEvolutionMod.mobtab);
		krampus_cloth = (ItemKrampusCloth) new ItemKrampusCloth("krampus_cloth").setCreativeTab(VanillaEvolutionMod.mobtab);
		christmas_gem = (ItemSeasonalGem) new ItemSeasonalGem("christmas_gem").setCreativeTab(VanillaEvolutionMod.seasontab);
		mug = (ItemMug) new ItemMug("mug").setCreativeTab(VanillaEvolutionMod.foodtab);
//		christmas_cookie_dough = (ItemBaking) new ItemBaking("christmas_cookie_dough").setCreativeTab(VanillaEvolutionMod.foodtab);
		eggnog = (ItemEggnog) new ItemEggnog("eggnog").setCreativeTab(VanillaEvolutionMod.seasontab);
		hardened_scales = (ItemHardenedScales) new ItemHardenedScales("hardened_scales").setCreativeTab(VanillaEvolutionMod.mobtab);
		basilisk_eye = (ItemBasiliskEye) new ItemBasiliskEye("basilisk_eye").setCreativeTab(VanillaEvolutionMod.mobtab);
		godly_rod = (ItemImbuedRod) new ItemImbuedRod("godly_rod").setCreativeTab(VanillaEvolutionMod.resourcetab);
		infused_ice_shard = (ItemInfusedIceShard) new ItemInfusedIceShard("infused_ice_shard").setCreativeTab(VanillaEvolutionMod.resourcetab);
		night_king_sword = (ItemNightKingSword) new ItemNightKingSword("night_king_sword", NKSwordTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		night_king_spear = (ItemNightKingSpear) new ItemNightKingSpear("night_king_spear", NKSpearTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		magma_sword = (ItemMagmaSword) new ItemMagmaSword("magma_sword", MagmaTools, 10f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		electron_splicer = (ItemElectronSplicer) new ItemElectronSplicer("electron_splicer").setMaxStackSize(1).setContainerItem(VanillaEvolutionItems.atomic_splicer).setCreativeTab(VanillaEvolutionMod.resourcetab);
		electron = (ItemElectron) new ItemElectron("electron").setCreativeTab(VanillaEvolutionMod.resourcetab);
		basic_gravitional_compressor = (ItemBGravitationalCompressor) new ItemBGravitationalCompressor("basic_gravitional_compressor").setContainerItem(VanillaEvolutionItems.prominent_battery).setMaxStackSize(4).setCreativeTab(VanillaEvolutionMod.resourcetab);
		minor_wormhole = (ItemMinorWormhole) new ItemMinorWormhole("minor_wormhole").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.resourcetab);
		dark_matter = (ItemDarkMatter) new ItemDarkMatter("dark_matter").setCreativeTab(VanillaEvolutionMod.resourcetab);
		moon_gem = (ItemMoonGem) new ItemMoonGem("moon_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		lunar_sword = (ItemLunarSword) new ItemLunarSword("lunar_sword", LunarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_pickaxe = (ItemLunarPickaxe) new ItemLunarPickaxe("lunar_pickaxe", LunarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_axe = (ItemLunarAxe) new ItemLunarAxe("lunar_axe", LunarTools, 10f, 1f).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_shovel = (ItemLunarShovel) new ItemLunarShovel("lunar_shovel", LunarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_hoe = (ItemLunarHoe) new ItemLunarHoe("lunar_hoe", LunarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_pickhoxel = (ItemLunarPickhoxel) new ItemLunarPickhoxel("lunar_pickhoxel", LunarTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		extraterrestrial_metal = (ItemSpaceMetal) new ItemSpaceMetal("extraterrestrial_metal").setCreativeTab(VanillaEvolutionMod.resourcetab);
		asgardian_steel = (ItemSpaceMetal) new ItemSpaceMetal("asgardian_steel").setCreativeTab(VanillaEvolutionMod.resourcetab);
		thanos_glaive = (ItemThanosGlaive) new ItemThanosGlaive("thanos_glaive", ThanosTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		bread_slice = (ItemBreadSlice) new ItemBreadSlice("bread_slice", 1, 0.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		shortening = (ItemBaking) new ItemBaking("shortening").setCreativeTab(VanillaEvolutionMod.foodtab);
		waffle_batter = (ItemBatter) new ItemBatter("waffle_batter").setCreativeTab(VanillaEvolutionMod.foodtab);
		pancake_batter = (ItemBatter) new ItemBatter("pancake_batter").setCreativeTab(VanillaEvolutionMod.foodtab);
		tortilla = (ItemCooking) new ItemCooking("tortilla").setCreativeTab(VanillaEvolutionMod.foodtab);
		sweet_dough = (ItemBaking) new ItemBaking("sweet_dough").setCreativeTab(VanillaEvolutionMod.foodtab);
		sliced_potatoes = (ItemCooking) new ItemCooking("sliced_potatoes").setCreativeTab(VanillaEvolutionMod.foodtab);
		toast = (ItemToast) new ItemToast("toast", 3, 0.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		french_toast = (ItemFrenchToast) new ItemFrenchToast("french_toast", 7, 1.2f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		scrambled_eggs = (ItemScrambledEggs) new ItemScrambledEggs("scrambled_eggs", 4, 0.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		omelette = (ItemOmelette) new ItemOmelette("omelette", 12, 1.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		waffle = (ItemWaffle) new ItemWaffle("waffle", 10, 1.6f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		pancake = (ItemPancake) new ItemPancake("pancake", 11, 1.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		breakfast_burrito = (ItemBreakfastBurrito) new ItemBreakfastBurrito("breakfast_burrito", 12, 1.6f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		donut = (ItemDonut) new ItemDonut("donut", 9, 1.2f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		hashbrowns = (ItemHashbrowns) new ItemHashbrowns("hashbrowns", 7, 0.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		poppy_seed_muffin = (ItemMuffin) new ItemMuffin("poppy_seed_muffin", 10, 1.5f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		ultra_bread = (ItemUltrafood) new ItemUltrafood("ultra_bread", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		glowing_tomato = (ItemGlowingTomato) new ItemGlowingTomato("glowing_tomato", 20, 3.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		carbon_nugget = (ItemCarbonIngot) new ItemCarbonIngot("carbon_nugget").setCreativeTab(VanillaEvolutionMod.resourcetab);
		durasteel = (ItemStarWars) new ItemStarWars("durasteel").setCreativeTab(VanillaEvolutionMod.resourcetab);
		jedi_cloth = (ItemStarWars) new ItemStarWars("jedi_cloth").setCreativeTab(VanillaEvolutionMod.resourcetab);
		sith_cloth = (ItemStarWars) new ItemStarWars("sith_cloth").setCreativeTab(VanillaEvolutionMod.resourcetab);
		dwarven_ingot = (ItemDwarven) new ItemDwarven("dwarven_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		dwarven_nugget = (ItemDwarven) new ItemDwarven("dwarven_nugget").setCreativeTab(VanillaEvolutionMod.resourcetab);
		dwarven_dagger = (ItemDwarvenDagger) new ItemDwarvenDagger("dwarven_dagger", DwarvenDaggerTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		dwarven_sword = (ItemDwarvenSword) new ItemDwarvenSword("dwarven_sword", DwarvenSwordTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		dwarven_mace = (ItemDwarvenMace) new ItemDwarvenMace("dwarven_mace", DwarvenMaceTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		dwarven_pickhoxel = (ItemDwarvenPickhoxel) new ItemDwarvenPickhoxel("dwarven_pickhoxel", DwarvenPickhoxelTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		iron_chunk = (ItemMeteoriteShard) new ItemMeteoriteShard("iron_chunk").setCreativeTab(VanillaEvolutionMod.resourcetab);
		gold_chunk = (ItemMeteoriteShard) new ItemMeteoriteShard("gold_chunk").setCreativeTab(VanillaEvolutionMod.resourcetab);
		silver_chunk = (ItemMeteoriteShard) new ItemMeteoriteShard("silver_chunk").setCreativeTab(VanillaEvolutionMod.resourcetab);
		platinum_chunk = (ItemMeteoriteShard) new ItemMeteoriteShard("platinum_chunk").setCreativeTab(VanillaEvolutionMod.resourcetab);
		platinum_ingot = (ItemPlatinumIngot) new ItemPlatinumIngot("platinum_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		uranium_ingot = (ItemUraniumIngot) new ItemUraniumIngot("uranium_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		titanium_ingot = (ItemTitaniumIngot) new ItemTitaniumIngot("titanium_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		earth_gem = (ItemEarthGem) new ItemEarthGem("earth_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		neutron_splicer = (ItemNeutronSplicer) new ItemNeutronSplicer("neutron_splicer").setMaxStackSize(1).setContainerItem(VanillaEvolutionItems.atomic_splicer).setCreativeTab(VanillaEvolutionMod.resourcetab);
		neutron = (ItemElectron) new ItemElectron("neutron").setCreativeTab(VanillaEvolutionMod.resourcetab);
		plutonium_ingot = (ItemPlutoniumIngot) new ItemPlutoniumIngot("plutonium_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		frost_sword = (ItemFrostSword) new ItemFrostSword("frost_sword", FrostTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		minotaur_hide = (ItemMinotaur) new ItemMinotaur("minotaur_hide").setCreativeTab(VanillaEvolutionMod.mobtab);
		minotaur_horn = (ItemMinotaur) new ItemMinotaur("minotaur_horn").setCreativeTab(VanillaEvolutionMod.mobtab);
		minotaur_heart = (ItemMinotaurHeart) new ItemMinotaurHeart("minotaur_heart", 0, 0f, false).setCreativeTab(VanillaEvolutionMod.mobtab);
		overworld_locket = (ItemAncientLocket) new ItemAncientLocket("overworld_locket").setCreativeTab(VanillaEvolutionMod.resourcetab);
		earth_locket = (ItemAncientLocket) new ItemAncientLocket("earth_locket").setCreativeTab(VanillaEvolutionMod.resourcetab);
		immjiri_eye = (ItemBasiliskEye) new ItemBasiliskEye("immjiri_eye").setCreativeTab(VanillaEvolutionMod.mobtab);
		dwarven_mechanism = (ItemTechnology) new ItemTechnology("dwarven_mechanism").setCreativeTab(VanillaEvolutionMod.resourcetab);
		note = (ItemNote) new ItemNote("note").setMaxStackSize(1);
		raw_lion = (ItemRawLion) new ItemRawLion("raw_lion", 3, 0.2f, true).setCreativeTab(VanillaEvolutionMod.mobtab);
		lion_hide = (ItemLionHide) new ItemLionHide("lion_hide").setCreativeTab(VanillaEvolutionMod.mobtab);
		lion_tooth = (ItemLionTooth) new ItemLionTooth("lion_tooth").setCreativeTab(VanillaEvolutionMod.mobtab);
		cooked_lion = (ItemCookedLion) new ItemCookedLion("cooked_lion", 6, 1.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		lion_tooth_dust = (ItemLionTooth) new ItemLionTooth("lion_tooth_dust").setCreativeTab(VanillaEvolutionMod.resourcetab);
		mane_hair = (ItemManeHair) new ItemManeHair("mane_hair").setCreativeTab(VanillaEvolutionMod.mobtab);
		dwarven_gem = (ItemDwarvenGem) new ItemDwarvenGem("dwarven_gem").setCreativeTab(VanillaEvolutionMod.mobtab);
		snow_leopard_hide = (ItemSnowLeopard) new ItemSnowLeopard("snow_leopard_hide").setCreativeTab(VanillaEvolutionMod.mobtab);
		pelt_pile = (ItemPeltPile) new ItemPeltPile("pelt_pile").setCreativeTab(VanillaEvolutionMod.resourcetab);
		hide_bundle = (ItemPeltPile) new ItemPeltPile("hide_bundle").setCreativeTab(VanillaEvolutionMod.resourcetab);
		dwarven_rod = (ItemImbuedRod) new ItemImbuedRod("dwarven_rod").setCreativeTab(VanillaEvolutionMod.resourcetab);
		strength_crystal_1 = (ItemStrengthCrystal1) new ItemStrengthCrystal1("strength_crystal_1", 0, 0f, false).setCreativeTab(VanillaEvolutionMod.resourcetab);
		solar_gas = (ItemSolar) new ItemSolar("solar_gas").setCreativeTab(VanillaEvolutionMod.resourcetab);
		solar_gem = (ItemSolar) new ItemSolar("solar_gem").setCreativeTab(VanillaEvolutionMod.resourcetab);
		solar_sword = (ItemSolarSword) new ItemSolarSword("solar_sword", SolarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_pickaxe = (ItemSolarPickaxe) new ItemSolarPickaxe("solar_pickaxe", SolarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_axe = (ItemSolarAxe) new ItemSolarAxe("solar_axe", SolarTools, 10f, 1f).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_shovel = (ItemSolarShovel) new ItemSolarShovel("solar_shovel", SolarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_hoe = (ItemSolarHoe) new ItemSolarHoe("solar_hoe", SolarTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_pickhoxel = (ItemSolarPickhoxel) new ItemSolarPickhoxel("solar_pickhoxel", SolarTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		platinum_sword = (ItemPlatinumSword) new ItemPlatinumSword("platinum_sword", PlatinumTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		platinum_pickaxe = (ItemPlatinumPickaxe) new ItemPlatinumPickaxe("platinum_pickaxe", PlatinumTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		dusk_cloth = (ItemDuskCloth) new ItemDuskCloth("dusk_cloth").setCreativeTab(VanillaEvolutionMod.resourcetab);
		earthen_pickhoxel = (ItemEarthenPickhoxel) new ItemEarthenPickhoxel("earthen_pickhoxel", EarthenPickhoxelTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		popcorn = (ItemPopcorn) new ItemPopcorn("popcorn", 7, 1.3f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		ultra_turkey = (ItemUltrafood) new ItemUltrafood("ultra_turkey", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		celestial_cookie = (ItemCelestialCookie) new ItemCelestialCookie("celestial_cookie", 20, 3.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		breathtaking_mint = (ItemBreathtakingMint) new ItemBreathtakingMint("breathtaking_mint", 20, 3.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		immjiri_offering = (ItemImmjiriOffering) new ItemImmjiriOffering("immjiri_offering").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.resourcetab);
		immjiri_tear = (ItemImmjiriTear) new ItemImmjiriTear("immjiri_tear").setCreativeTab(VanillaEvolutionMod.resourcetab);
		darkness_blade = (ItemDarknessBlade) new ItemDarknessBlade("darkness_blade", DarknessTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		earth_horn = (ItemEarthHorn) new ItemEarthHorn("earth_horn").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.resourcetab);
		earth_tablet = (ItemEarthTablet) new ItemEarthTablet("earth_tablet").setCreativeTab(VanillaEvolutionMod.resourcetab);
		terra = (ItemTerra) new ItemTerra("terra", TerraTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		lead_lining = (ItemTechnology) new ItemTechnology("lead_lining").setCreativeTab(VanillaEvolutionMod.resourcetab);
		platinum_wire = (ItemTechnology) new ItemTechnology("platinum_wire").setCreativeTab(VanillaEvolutionMod.resourcetab);
		nuclear_battery = (ItemTechnology) new ItemTechnology("nuclear_battery").setCreativeTab(VanillaEvolutionMod.resourcetab);
		asteroid_ingot = (ItemAsteroidIngot) new ItemAsteroidIngot("asteroid_ingot").setCreativeTab(VanillaEvolutionMod.resourcetab);
		asteroid_sword = (ItemAsteroidSword) new ItemAsteroidSword("asteroid_sword", AsteroidTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		asteroid_pickaxe = (ItemAsteroidPickaxe) new ItemAsteroidPickaxe("asteroid_pickaxe", AsteroidTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		heartsbane = (ItemHeartsbane) new ItemHeartsbane("heartsbane", HeartsbaneTools).setCreativeTab(VanillaEvolutionMod.toolstab);
		cheese_cracker = (ItemCheeseCracker) new ItemCheeseCracker("cheese_cracker", 5, 1.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		ultra_cheese = (ItemUltrafood) new ItemUltrafood("ultra_cheese", 20, 2.8f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
		cured_spider_eye = (ItemCuredSpiderEye) new ItemCuredSpiderEye("cured_spider_eye", 20, 3.2f, true).setCreativeTab(VanillaEvolutionMod.dessertab);
		ancient_book = (ItemAncientBook) new ItemAncientBook("ancient_book").setMaxStackSize(1).setCreativeTab(VanillaEvolutionMod.resourcetab);
		vacuous_sword = (ItemVacuousSword) new ItemVacuousSword("vacuous_sword", VacuousTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		kk_sword = (ItemKKSword) new ItemKKSword("kk_sword", KnowledgeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		kl_sword = (ItemKLSword) new ItemKLSword("kl_sword", KnowledgeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		ks_sword = (ItemKSSword) new ItemKSSword("ks_sword", KnowledgeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		kf_sword = (ItemKFSword) new ItemKFSword("kf_sword", KnowledgeTools, 5f, 996f).setCreativeTab(VanillaEvolutionMod.toolstab);
		roast_carrot = (ItemRoastCarrot) new ItemRoastCarrot("roast_carrot", 8, 4.0f, false).setCreativeTab(VanillaEvolutionMod.dessertab);
	
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
		
		element_helmet = (ItemElementArmor) new ItemElementArmor("element_helmet", ElementArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		element_chestplate = (ItemElementArmor) new ItemElementArmor("element_chestplate", ElementArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		element_leggings = (ItemElementArmor2) new ItemElementArmor2("element_leggings", ElementArmor2, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		element_boots =  (ItemElementArmor)new ItemElementArmor("element_boots", ElementArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
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
	
		krampus_helmet = (ItemKrampusArmor) new ItemKrampusArmor("krampus_helmet", KrampusArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.seasontab);
		krampus_chestplate = (ItemKrampusArmor) new ItemKrampusArmor("krampus_chestplate", KrampusArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.seasontab);
		krampus_leggings = (ItemKrampusArmor) new ItemKrampusArmor("krampus_leggings", KrampusArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.seasontab);
		krampus_boots =  (ItemKrampusArmor)new ItemKrampusArmor("krampus_boots", KrampusArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.seasontab);

		christmas_sweater_tree = (ItemSweaterArmor) new ItemSweaterArmor("christmas_sweater_tree", SweaterTArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.seasontab);
		christmas_sweater_snowman = (ItemSweaterArmor) new ItemSweaterArmor("christmas_sweater_snowman", SweaterSArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.seasontab);
		christmas_sweater_candycane = (ItemSweaterArmor) new ItemSweaterArmor("christmas_sweater_candycane", SweaterCArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.seasontab);
	
		scale_helmet = (ItemScaleArmor) new ItemScaleArmor("scale_helmet", ScaleArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		scale_chestplate = (ItemScaleArmor) new ItemScaleArmor("scale_chestplate", ScaleArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		scale_leggings = (ItemScaleArmor) new ItemScaleArmor("scale_leggings", ScaleArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		scale_boots =  (ItemScaleArmor)new ItemScaleArmor("scale_boots", ScaleArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		lunar_helmet = (ItemLunarArmor) new ItemLunarArmor("lunar_helmet", LunarArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_chestplate = (ItemLunarArmor) new ItemLunarArmor("lunar_chestplate", LunarArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_leggings = (ItemLunarArmor) new ItemLunarArmor("lunar_leggings", LunarArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		lunar_boots =  (ItemLunarArmor)new ItemLunarArmor("lunar_boots", LunarArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		energetic_helmet = (ItemEnergeticArmor) new ItemEnergeticArmor("energetic_helmet", EnergeticArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		energetic_chestplate = (ItemEnergeticArmor) new ItemEnergeticArmor("energetic_chestplate", EnergeticArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		energetic_leggings = (ItemEnergeticArmor) new ItemEnergeticArmor("energetic_leggings", EnergeticArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		energetic_boots =  (ItemEnergeticArmor)new ItemEnergeticArmor("energetic_boots", EnergeticArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		thanos_helmet = (ItemThanosArmor) new ItemThanosArmor("thanos_helmet", ThanosArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		thanos_chestplate = (ItemThanosArmor) new ItemThanosArmor("thanos_chestplate", ThanosArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		thanos_leggings = (ItemThanosArmor) new ItemThanosArmor("thanos_leggings", ThanosArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		thanos_boots =  (ItemThanosArmor)new ItemThanosArmor("thanos_boots", ThanosArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);

		thor_chestplate = (ItemThorArmor) new ItemThorArmor("thor_chestplate", ThorArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		thor_leggings = (ItemThorArmor) new ItemThorArmor("thor_leggings", ThorArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		thor_boots =  (ItemThorArmor)new ItemThorArmor("thor_boots", ThorArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		jedi_helmet = (ItemJediArmor) new ItemJediArmor("jedi_helmet", JediArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		jedi_chestplate = (ItemJediArmor) new ItemJediArmor("jedi_chestplate", JediArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		jedi_leggings = (ItemJediArmor) new ItemJediArmor("jedi_leggings", JediArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		jedi_boots =  (ItemJediArmor)new ItemJediArmor("jedi_boots", JediArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		sith_helmet = (ItemJediArmor) new ItemJediArmor("sith_helmet", SithArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		sith_chestplate = (ItemJediArmor) new ItemJediArmor("sith_chestplate", SithArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		sith_leggings = (ItemJediArmor) new ItemJediArmor("sith_leggings", SithArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		sith_boots =  (ItemJediArmor)new ItemJediArmor("sith_boots", SithArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		kylo_helmet = (ItemKyloArmor) new ItemKyloArmor("kylo_helmet", KyloArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		kylo_chestplate = (ItemKyloArmor) new ItemKyloArmor("kylo_chestplate", KyloArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		kylo_leggings = (ItemKyloArmor) new ItemKyloArmor("kylo_leggings", KyloArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		kylo_boots =  (ItemKyloArmor)new ItemKyloArmor("kylo_boots", KyloArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		vader_helmet = (ItemVaderArmor) new ItemVaderArmor("vader_helmet", VaderArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		vader_chestplate = (ItemVaderArmor) new ItemVaderArmor("vader_chestplate", VaderArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		vader_leggings = (ItemVaderArmor) new ItemVaderArmor("vader_leggings", VaderArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		vader_boots =  (ItemVaderArmor)new ItemVaderArmor("vader_boots", VaderArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		dwarven_helmet = (ItemDwarvenArmor) new ItemDwarvenArmor("dwarven_helmet", DwarvenArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		dwarven_chestplate = (ItemDwarvenArmor) new ItemDwarvenArmor("dwarven_chestplate", DwarvenArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		dwarven_leggings = (ItemDwarvenArmor) new ItemDwarvenArmor("dwarven_leggings", DwarvenArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		dwarven_boots =  (ItemDwarvenArmor)new ItemDwarvenArmor("dwarven_boots", DwarvenArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);

		vanishing_locket = (ItemVLocketArmor) new ItemVLocketArmor("vanishing_locket", VLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		brawns_locket = (ItemBLocketArmor) new ItemBLocketArmor("brawns_locket", BLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		healing_locket = (ItemHLocketArmor) new ItemHLocketArmor("healing_locket", HLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		fire_warding_locket = (ItemFLocketArmor) new ItemFLocketArmor("fire_warding_locket", FLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		lion_helmet = (ItemLionArmor) new ItemLionArmor("lion_helmet", LionArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		lion_chestplate = (ItemLionArmor) new ItemLionArmor("lion_chestplate", LionArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		lion_leggings = (ItemLionArmor) new ItemLionArmor("lion_leggings", LionArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		lion_boots =  (ItemLionArmor)new ItemLionArmor("lion_boots", LionArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		titanium_helmet = (ItemTitaniumArmor) new ItemTitaniumArmor("titanium_helmet", TitaniumArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		titanium_chestplate = (ItemTitaniumArmor) new ItemTitaniumArmor("titanium_chestplate", TitaniumArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		titanium_leggings = (ItemTitaniumArmor) new ItemTitaniumArmor("titanium_leggings", TitaniumArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		titanium_boots =  (ItemTitaniumArmor)new ItemTitaniumArmor("titanium_boots", TitaniumArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		solar_helmet = (ItemSolarArmor) new ItemSolarArmor("solar_helmet", SolarArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_chestplate = (ItemSolarArmor) new ItemSolarArmor("solar_chestplate", SolarArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_leggings = (ItemSolarArmor) new ItemSolarArmor("solar_leggings", SolarArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		solar_boots =  (ItemSolarArmor)new ItemSolarArmor("solar_boots", SolarArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		cloak_helmet = (ItemCloakHelmet) new ItemCloakHelmet("cloak_helmet", CloakArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		cloak_chestplate = (ItemCloakChestplate) new ItemCloakChestplate("cloak_chestplate", CloakArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		cloak_leggings = (ItemCloakLeggings) new ItemCloakLeggings("cloak_leggings", CloakArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		cloak_boots =  (ItemCloakBoots)new ItemCloakBoots("cloak_boots", CloakArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		earthen_helmet = (ItemEarthArmor) new ItemEarthArmor("earthen_helmet", EarthArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		earthen_chestplate = (ItemEarthChestplate) new ItemEarthChestplate("earthen_chestplate", EarthenArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		earthen_leggings = (ItemEarthArmor) new ItemEarthArmor("earthen_leggings", EarthArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		earthen_boots =  (ItemEarthArmor)new ItemEarthArmor("earthen_boots", EarthArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
		
		shadow_helmet = (ItemShadowArmor) new ItemShadowArmor("shadow_helmet", ShadowArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		shadow_chestplate = (ItemShadowArmor) new ItemShadowArmor("shadow_chestplate", ShadowArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		shadow_leggings = (ItemShadowArmor) new ItemShadowArmor("shadow_leggings", ShadowArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		shadow_boots =  (ItemShadowArmor)new ItemShadowArmor("shadow_boots", ShadowArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);

		fast_fighting_locket = (ItemFFLocketArmor) new ItemFFLocketArmor("fast_fighting_locket", FFLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		mining_locket = (ItemMLocketArmor) new ItemMLocketArmor("mining_locket", MLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		leaping_locket = (ItemLLocketArmor) new ItemLLocketArmor("leaping_locket", LLocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		feeding_locket = (ItemFELocketArmor) new ItemFELocketArmor("feeding_locket", FELocketArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		nucleari_helmet = (ItemNuclearIArmor) new ItemNuclearIArmor("nucleari_helmet", NuclearIArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		nucleari_chestplate = (ItemNuclearIArmor) new ItemNuclearIArmor("nucleari_chestplate", NuclearIArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		nucleari_leggings = (ItemNuclearIArmor) new ItemNuclearIArmor("nucleari_leggings", NuclearIArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		nucleari_boots =  (ItemNuclearIArmor)new ItemNuclearIArmor("nucleari_boots", NuclearIArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		asteroid_helmet = (ItemAsteroidArmor) new ItemAsteroidArmor("asteroid_helmet", AsteroidArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		asteroid_chestplate = (ItemAsteroidArmor) new ItemAsteroidArmor("asteroid_chestplate", AsteroidArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		asteroid_leggings = (ItemAsteroidArmor) new ItemAsteroidArmor("asteroid_leggings", AsteroidArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		asteroid_boots =  (ItemAsteroidArmor)new ItemAsteroidArmor("asteroid_boots", AsteroidArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
	
		cyborg_helmet = (ItemCyborgArmor) new ItemCyborgArmor("cyborg_helmet", CyborgArmor, 1, EntityEquipmentSlot.HEAD).setCreativeTab(VanillaEvolutionMod.toolstab);
		cyborg_chestplate = (ItemCyborgArmor) new ItemCyborgArmor("cyborg_chestplate", CyborgArmor, 1, EntityEquipmentSlot.CHEST).setCreativeTab(VanillaEvolutionMod.toolstab);
		cyborg_leggings = (ItemCyborgArmor) new ItemCyborgArmor("cyborg_leggings", CyborgArmor, 2, EntityEquipmentSlot.LEGS).setCreativeTab(VanillaEvolutionMod.toolstab);
		cyborg_boots =  (ItemCyborgArmor)new ItemCyborgArmor("cyborg_boots", CyborgArmor, 1, EntityEquipmentSlot.FEET).setCreativeTab(VanillaEvolutionMod.toolstab);
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
				gravy, mashed_potatoes, mashed_potatoes_gravy, stuffing, green_bean_casserole, hunger_pill, saber_duo, saber_kylo, saber_yellow, saber_shoto_yellow, saber_shoto_green, ice_shard,
				krampus_cloth, christmas_gem, krampus_helmet, krampus_chestplate, krampus_leggings, krampus_boots, christmas_sweater_tree, christmas_sweater_snowman, christmas_sweater_candycane,
				mug, eggnog, hardened_scales, basilisk_eye, scale_helmet, scale_chestplate, scale_leggings, scale_boots, godly_rod, infused_ice_shard, night_king_sword, night_king_spear, 
				magma_sword, electron_splicer, electron, basic_gravitional_compressor, minor_wormhole, dark_matter, moon_gem, lunar_sword, lunar_pickaxe, lunar_axe, lunar_shovel, lunar_hoe,
				lunar_pickhoxel, lunar_helmet, lunar_chestplate, lunar_leggings, lunar_boots, energetic_helmet, energetic_chestplate, energetic_leggings, energetic_boots, extraterrestrial_metal, 
				asgardian_steel, thanos_helmet, thanos_chestplate, thanos_leggings, thanos_boots, thanos_glaive, thor_chestplate, thor_leggings, thor_boots, bread_slice, shortening, waffle_batter,
				pancake_batter, tortilla, sweet_dough, sliced_potatoes, toast, french_toast, scrambled_eggs, omelette, waffle, pancake, breakfast_burrito, donut, hashbrowns, poppy_seed_muffin,
				ultra_bread, glowing_tomato, carbon_nugget, durasteel, jedi_cloth, jedi_helmet, jedi_chestplate, jedi_leggings, jedi_boots, sith_helmet, sith_chestplate, sith_leggings,
				sith_boots, kylo_helmet, kylo_chestplate, kylo_leggings, kylo_boots, vader_helmet, vader_chestplate, vader_leggings, vader_boots, sith_cloth, dwarven_ingot, dwarven_nugget, 
				dwarven_dagger, dwarven_sword, dwarven_mace, dwarven_pickhoxel, dwarven_helmet, dwarven_chestplate, dwarven_leggings, dwarven_boots, iron_chunk, gold_chunk, silver_chunk, platinum_chunk,
				platinum_ingot, uranium_ingot, titanium_ingot, earth_gem, neutron_splicer, neutron, plutonium_ingot, frost_sword, minotaur_hide, minotaur_horn, minotaur_heart, overworld_locket, 
				earth_locket, vanishing_locket, brawns_locket, healing_locket, fire_warding_locket, immjiri_eye, dwarven_mechanism, note, raw_lion, lion_hide, lion_tooth, cooked_lion, lion_tooth_dust,
				mane_hair, dwarven_gem, snow_leopard_hide, pelt_pile, hide_bundle, dwarven_rod, strength_crystal_1, lion_helmet, lion_chestplate, lion_leggings, lion_boots, titanium_helmet, 
				titanium_chestplate, titanium_leggings, titanium_boots, solar_gas, solar_gem, solar_sword, solar_pickaxe, solar_axe, solar_shovel, solar_hoe, solar_pickhoxel, solar_helmet,
				solar_chestplate, solar_leggings, solar_boots, platinum_sword, platinum_pickaxe, cloak_helmet, cloak_chestplate, cloak_leggings, cloak_boots, dusk_cloth, earthen_helmet, 
				earthen_chestplate, earthen_leggings, earthen_boots, earthen_pickhoxel, popcorn, ultra_turkey, celestial_cookie, breathtaking_mint, immjiri_offering, immjiri_tear, darkness_blade,
				shadow_helmet, shadow_chestplate, shadow_leggings, shadow_boots, earth_horn, earth_tablet, terra, fast_fighting_locket, mining_locket, leaping_locket, feeding_locket,
				lead_lining, platinum_wire, nuclear_battery, nucleari_helmet, nucleari_chestplate, nucleari_leggings, nucleari_boots, asteroid_ingot, asteroid_sword, asteroid_pickaxe,
				asteroid_helmet, asteroid_chestplate, asteroid_leggings, asteroid_boots, cyborg_helmet, cyborg_chestplate, cyborg_leggings, cyborg_boots, heartsbane, cheese_cracker,
				ultra_cheese, cured_spider_eye, ancient_book, vacuous_sword, kk_sword, kl_sword, ks_sword, kf_sword, roast_carrot);
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
		registerRender(saber_duo);
		registerRender(saber_kylo);
		registerRender(saber_yellow);
		registerRender(saber_shoto_yellow);
		registerRender(saber_shoto_green);
		registerRender(ice_shard);
		registerRender(krampus_cloth);
		registerRender(christmas_gem);
		registerRender(mug);
	//	registerRender(christmas_cookie_dough);
		registerRender(eggnog);
		registerRender(hardened_scales);
		registerRender(basilisk_eye);
		registerRender(godly_rod);
		registerRender(infused_ice_shard);
		registerRender(night_king_sword);
		registerRender(night_king_spear);
		registerRender(magma_sword);
		registerRender(electron_splicer);
		registerRender(electron);
		registerRender(basic_gravitional_compressor);
		registerRender(minor_wormhole);
		registerRender(dark_matter);
		registerRender(moon_gem);
		registerRender(lunar_sword);
		registerRender(lunar_pickaxe);
		registerRender(lunar_axe);
		registerRender(lunar_shovel);
		registerRender(lunar_hoe);
		registerRender(lunar_pickhoxel);
		registerRender(extraterrestrial_metal);
		registerRender(asgardian_steel);
		registerRender(thanos_glaive);
		registerRender(bread_slice);
		registerRender(shortening);
		registerRender(waffle_batter);
		registerRender(pancake_batter);
		registerRender(tortilla);
		registerRender(sweet_dough);
		registerRender(sliced_potatoes);
		registerRender(toast);
		registerRender(french_toast);
		registerRender(scrambled_eggs);
		registerRender(omelette);
		registerRender(waffle);
		registerRender(pancake);
		registerRender(breakfast_burrito);
		registerRender(donut);
		registerRender(hashbrowns);
		registerRender(poppy_seed_muffin);
		registerRender(ultra_bread);
		registerRender(glowing_tomato);
		registerRender(carbon_nugget);
		registerRender(durasteel);
		registerRender(jedi_cloth);
		registerRender(sith_cloth);
		registerRender(dwarven_ingot);
		registerRender(dwarven_nugget);
		registerRender(dwarven_dagger);
		registerRender(dwarven_sword);
		registerRender(dwarven_mace);
		registerRender(dwarven_pickhoxel);
		registerRender(iron_chunk);
		registerRender(gold_chunk);
		registerRender(silver_chunk);
		registerRender(platinum_chunk);
		registerRender(platinum_ingot);
		registerRender(uranium_ingot);
		registerRender(titanium_ingot);
		registerRender(earth_gem);
		registerRender(neutron_splicer);
		registerRender(neutron);
		registerRender(plutonium_ingot);
		registerRender(frost_sword);
		registerRender(minotaur_hide);
		registerRender(minotaur_horn);
		registerRender(minotaur_heart);
		registerRender(overworld_locket);
		registerRender(earth_locket);
		registerRender(immjiri_eye);
		registerRender(dwarven_mechanism);
		registerRender(note);
		registerRender(raw_lion);
		registerRender(lion_hide);
		registerRender(lion_tooth);
		registerRender(cooked_lion);
		registerRender(lion_tooth_dust);
		registerRender(mane_hair);
		registerRender(dwarven_gem);
		registerRender(snow_leopard_hide);
		registerRender(pelt_pile);
		registerRender(hide_bundle);
		registerRender(dwarven_rod);
		registerRender(strength_crystal_1);
		registerRender(solar_gas);
		registerRender(solar_gem);
		registerRender(solar_sword);
		registerRender(solar_pickaxe);
		registerRender(solar_axe);
		registerRender(solar_shovel);
		registerRender(solar_hoe);
		registerRender(solar_pickhoxel);
		registerRender(platinum_sword);
		registerRender(platinum_pickaxe);
		registerRender(dusk_cloth);
		registerRender(earthen_pickhoxel);
		registerRender(popcorn);
		registerRender(ultra_turkey);
		registerRender(celestial_cookie);
		registerRender(breathtaking_mint);
		registerRender(immjiri_offering);
		registerRender(immjiri_tear);
		registerRender(darkness_blade);
		registerRender(earth_horn);
		registerRender(earth_tablet);
		registerRender(terra);
		registerRender(lead_lining);
		registerRender(platinum_wire);
		registerRender(nuclear_battery);
		registerRender(asteroid_ingot);
		registerRender(asteroid_sword);
		registerRender(asteroid_pickaxe);
		registerRender(heartsbane);
		registerRender(cheese_cracker);
		registerRender(ultra_cheese);
		registerRender(cured_spider_eye);
		registerRender(ancient_book);
		registerRender(vacuous_sword);
		registerRender(kk_sword);
		registerRender(kl_sword);
		registerRender(ks_sword);
		registerRender(kf_sword);
		registerRender(roast_carrot);
		
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
		
		registerRender(krampus_helmet);
		registerRender(krampus_chestplate);
		registerRender(krampus_leggings);
		registerRender(krampus_boots);

		registerRender(christmas_sweater_tree);
		registerRender(christmas_sweater_snowman);
		registerRender(christmas_sweater_candycane);
		
		registerRender(scale_helmet);
		registerRender(scale_chestplate);
		registerRender(scale_leggings);
		registerRender(scale_boots);
		
		registerRender(lunar_helmet);
		registerRender(lunar_chestplate);
		registerRender(lunar_leggings);
		registerRender(lunar_boots);
		
		registerRender(energetic_helmet);
		registerRender(energetic_chestplate);
		registerRender(energetic_leggings);
		registerRender(energetic_boots);
		
		registerRender(thanos_helmet);
		registerRender(thanos_chestplate);
		registerRender(thanos_leggings);
		registerRender(thanos_boots);

		registerRender(thor_chestplate);
		registerRender(thor_leggings);
		registerRender(thor_boots);
		
		registerRender(jedi_helmet);
		registerRender(jedi_chestplate);
		registerRender(jedi_leggings);
		registerRender(jedi_boots);
		
		registerRender(sith_helmet);
		registerRender(sith_chestplate);
		registerRender(sith_leggings);
		registerRender(sith_boots);
		
		registerRender(kylo_helmet);
		registerRender(kylo_chestplate);
		registerRender(kylo_leggings);
		registerRender(kylo_boots);
		
		registerRender(vader_helmet);
		registerRender(vader_chestplate);
		registerRender(vader_leggings);
		registerRender(vader_boots);
		
		registerRender(dwarven_helmet);
		registerRender(dwarven_chestplate);
		registerRender(dwarven_leggings);
		registerRender(dwarven_boots);
		
		registerRender(vanishing_locket);
		registerRender(brawns_locket);
		registerRender(healing_locket);
		registerRender(fire_warding_locket);
		
		registerRender(lion_helmet);
		registerRender(lion_chestplate);
		registerRender(lion_leggings);
		registerRender(lion_boots);
		
		registerRender(titanium_helmet);
		registerRender(titanium_chestplate);
		registerRender(titanium_leggings);
		registerRender(titanium_boots);
		
		registerRender(solar_helmet);
		registerRender(solar_chestplate);
		registerRender(solar_leggings);
		registerRender(solar_boots);
		
		registerRender(cloak_helmet);
		registerRender(cloak_chestplate);
		registerRender(cloak_leggings);
		registerRender(cloak_boots);
		
		registerRender(earthen_helmet);
		registerRender(earthen_chestplate);
		registerRender(earthen_leggings);
		registerRender(earthen_boots);
		
		registerRender(shadow_helmet);
		registerRender(shadow_chestplate);
		registerRender(shadow_leggings);
		registerRender(shadow_boots);
		
		registerRender(fast_fighting_locket);
		registerRender(mining_locket);
		registerRender(leaping_locket);
		registerRender(feeding_locket);
		
		registerRender(nucleari_helmet);
		registerRender(nucleari_chestplate);
		registerRender(nucleari_leggings);
		registerRender(nucleari_boots);
		
		registerRender(asteroid_helmet);
		registerRender(asteroid_chestplate);
		registerRender(asteroid_leggings);
		registerRender(asteroid_boots);
		
		registerRender(cyborg_helmet);
		registerRender(cyborg_chestplate);
		registerRender(cyborg_leggings);
		registerRender(cyborg_boots);
	}
	
										//Name, Harvest Level, Durability, Efficiency, Damage (-4f), Enchantibility
	public static final ToolMaterial MalachiteTools = EnumHelper.addToolMaterial("MalachiteTools", 2, 905, 7f, 2.5f, 12);
	public static final ToolMaterial BronzeTools = EnumHelper.addToolMaterial("BronzeTools", 2, 4000, 9f, 2.5f, 20);
	public static final ToolMaterial AmethystTools = EnumHelper.addToolMaterial("AmethystTools", 3, 1350, 9f, 4f, 18);
	public static final ToolMaterial RubyTools = EnumHelper.addToolMaterial("RubyTools", 3, 2000, 12f, 4f, 20);
	public static final ToolMaterial PeridotTools = EnumHelper.addToolMaterial("PeridotTools", 3, 1750, 10f, 5f, 15);
	public static final ToolMaterial OnyxTools = EnumHelper.addToolMaterial("OnyxTools", 3, -1, 5f, 4f, 25);
	public static final ToolMaterial SlimeTools = EnumHelper.addToolMaterial("SlimeTools", 3, 2050, 11f, 7f, 20);
	public static final ToolMaterial EnderiteTools = EnumHelper.addToolMaterial("EnderiteTools", 4, 5000, 15f, 6f, 25);
	public static final ToolMaterial SeleniteTools = EnumHelper.addToolMaterial("SeleniteTools", 5, 8000, 18f, 7f, 30);
	public static final ToolMaterial SelenitePTools = EnumHelper.addToolMaterial("SeleniteTools", 5, 8000, 18f, 6f, 30);
	public static final ToolMaterial TechTools = EnumHelper.addToolMaterial("TechTools", 5, 10000, 22f, 11f, 0);
	public static final ToolMaterial ElementTools = EnumHelper.addToolMaterial("ElementTools", 5, 12000, 22f, 8f, 30);
	public static final ToolMaterial InfinityTools = EnumHelper.addToolMaterial("InfinityTools", 3, -1, 20f, 12f, 5);
	public static final ToolMaterial WClawTools = EnumHelper.addToolMaterial("WClawTools", 3, 4000, 10f, 5f, 10);
	public static final ToolMaterial PClawTools = EnumHelper.addToolMaterial("PClawTools", 3, 4000, 10f, 6f, 10);
	public static final ToolMaterial ShieldTools = EnumHelper.addToolMaterial("ShieldTools", 3, 5000, 10f, 6f, 10);
	public static final ToolMaterial EnderTools = EnumHelper.addToolMaterial("EnderTools", 4, 6500, 10f, 9f, 15);
	public static final ToolMaterial CuriousTools = EnumHelper.addToolMaterial("CuriousTools", 3, 3250, 6f, 5f, 0);
	public static final ToolMaterial TerrorizerTools = EnumHelper.addToolMaterial("TerrorizerTools", 3, 3000, 7f, 6.5f, 0);
	public static final ToolMaterial AssassinTools = EnumHelper.addToolMaterial("AssassinTools", 3, 6000, 8f, 6f, 0);
	public static final ToolMaterial PulverizerTools = EnumHelper.addToolMaterial("PulverizerTools", 3, 8000, 9f, 6f, 0);
	public static final ToolMaterial HeartTools = EnumHelper.addToolMaterial("HeartTools", 3, -1, 9f, 5f, 20);
	public static final ToolMaterial CapitalismTools = EnumHelper.addToolMaterial("CapitalismTools", 3, 15000, 9f, 11f, 10);
	public static final ToolMaterial OculusTools = EnumHelper.addToolMaterial("OculusTools", 3, 17500, 9f, 9f, 10);
	public static final ToolMaterial LongclawTools = EnumHelper.addToolMaterial("LongclawTools", 3, 6000, 10f, 11f, 30);
	public static final ToolMaterial IceTools = EnumHelper.addToolMaterial("IceTools", 3, 10000, 8f, 12f, 25);
	public static final ToolMaterial OathkeeperTools = EnumHelper.addToolMaterial("OathkeeperTools", 3, 5000, 9f, 11f, 20);
	public static final ToolMaterial WidowWailTools = EnumHelper.addToolMaterial("WidowWailTools", 3, 4000, 9f, 10f, 10);
	public static final ToolMaterial DArakhTools = EnumHelper.addToolMaterial("DArakhTools", 3, -1, 9f, 9f, 10);
	public static final ToolMaterial DSpearTools = EnumHelper.addToolMaterial("DSpearTools", 3, -1, 9f, 10f, 10);
	public static final ToolMaterial DAxeTools = EnumHelper.addToolMaterial("DAxeTools", 3, -1, 9f, 11f, 10);
	public static final ToolMaterial NeedleTools = EnumHelper.addToolMaterial("NeedleTools", 3, 9000, 9f, 4f, 30);
	public static final ToolMaterial CatspawTools = EnumHelper.addToolMaterial("CatspawTools", 3, -1, 9f, 11f, 30);
	public static final ToolMaterial MjolnirTools = EnumHelper.addToolMaterial("MjolnirTools", 3, -1, 9f, 4f, 5);
	public static final ToolMaterial StormbreakerTools = EnumHelper.addToolMaterial("StormbreakerTools", 3, -1, 9f, 5f, 5);
	public static final ToolMaterial LightsaberTools = EnumHelper.addToolMaterial("LightsaberTools", 3, -1, 9f, 9f, 0);
	public static final ToolMaterial EndericPhTools = EnumHelper.addToolMaterial("EndericPhTools", 5, 10000, 23f, 5f, 15);
	public static final ToolMaterial LightsaberShotoTools = EnumHelper.addToolMaterial("LightsaberShotoTools", 3, -1, 9f, 8f, 0);
	public static final ToolMaterial NKSwordTools = EnumHelper.addToolMaterial("NKSwordTools", 3, -1, 9f, 12f, 20);
	public static final ToolMaterial NKSpearTools = EnumHelper.addToolMaterial("NKSpearTools", 3, -1, 9f, 13f, 20);
	public static final ToolMaterial MagmaTools = EnumHelper.addToolMaterial("MagmaTools", 3, 3000, 9f, 10f, 0);
	public static final ToolMaterial LunarTools = EnumHelper.addToolMaterial("LunarTools", 5, 12500, 25f, 12f, 20);
	public static final ToolMaterial ThanosTools = EnumHelper.addToolMaterial("ThanosTools", 5, 13000, 10f, 10f, 20);
	public static final ToolMaterial DwarvenDaggerTools = EnumHelper.addToolMaterial("DwarvenDaggerTools", 6, 15000, 10f, 12f, 10);
	public static final ToolMaterial DwarvenSwordTools = EnumHelper.addToolMaterial("DwarvenSwordTools", 6, 15000, 10f, 13f, 10);
	public static final ToolMaterial DwarvenMaceTools = EnumHelper.addToolMaterial("DwarvenMaceTools", 6, 15000, 10f, 14f, 10);
	public static final ToolMaterial DwarvenPickhoxelTools = EnumHelper.addToolMaterial("DwarvenPickhoxelTools", 6, 15000, 24f, 6f, 10);
	public static final ToolMaterial FrostTools = EnumHelper.addToolMaterial("FrostTools", 6, 9000, 10f, 15f, 5);
	public static final ToolMaterial SolarTools = EnumHelper.addToolMaterial("SolarTools", 6, 15000, 27f, 14f, 25);
	public static final ToolMaterial PlatinumTools = EnumHelper.addToolMaterial("PlatinumTools", 6, -1, 25f, 14f, 30);
	public static final ToolMaterial StaffTools = EnumHelper.addToolMaterial("StaffTools", 1, 32, 1f, -3f, 0);
	public static final ToolMaterial EarthenPickhoxelTools = EnumHelper.addToolMaterial("EarthenPickhoxelTools", 6, 17500, 28f, 5f, 35);
	public static final ToolMaterial DarknessTools = EnumHelper.addToolMaterial("DarknessTools", 6, 20000, 20f, 16f, 50);
	public static final ToolMaterial TerraTools = EnumHelper.addToolMaterial("TerraTools", 6, -1, 10f, 16f, 0);
	public static final ToolMaterial AsteroidTools = EnumHelper.addToolMaterial("AsteroidTools", 6, 18000, 10f, 17f, 30);
	public static final ToolMaterial HeartsbaneTools = EnumHelper.addToolMaterial("HeartsbaneTools", 6, 8000, 10f, 13f, -1);
	public static final ToolMaterial VacuousTools = EnumHelper.addToolMaterial("VacuousTools", 5, 500, 5f, 4f, 0);
	public static final ToolMaterial KnowledgeTools = EnumHelper.addToolMaterial("KnowledgeTools", 5, 10000, 20f, 12f, 0);
	
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
	
	public static final ArmorMaterial EnderArmor = EnumHelper.addArmorMaterial("enderarmor", VanillaEvolutionMod.MODID + ":ender_armor", 75, 
			new int[] {10, 15, 16, 11}, 20, SoundEvents.ENTITY_ENDERMEN_AMBIENT, 5f);
	
	public static final ArmorMaterial NightArmor = EnumHelper.addArmorMaterial("nightarmor", VanillaEvolutionMod.MODID + ":nights_watch_armor", 100, 
			new int[] {8, 13, 15, 9}, 16, SoundEvents.AMBIENT_CAVE, 4f);
	
	public static final ArmorMaterial PExosuitArmor = EnumHelper.addArmorMaterial("pexosuitarmor", VanillaEvolutionMod.MODID + ":pexosuit_armor", 80, 
			new int[] {8, 12, 14, 9}, 0, SoundEvents.BLOCK_NOTE_BASS, 5f);
	
	public static final ArmorMaterial BeastArmor = EnumHelper.addArmorMaterial("beastarmor", VanillaEvolutionMod.MODID + ":beast_armor", 60, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.AMBIENT_CAVE, 0f);
	
	public static final ArmorMaterial BonnetArmor = EnumHelper.addArmorMaterial("bonnetarmor", VanillaEvolutionMod.MODID + ":war_bonnet_armor", 30, 
			new int[] {0, 0, 0, 2}, 0, SoundEvents.BLOCK_CLOTH_BREAK, 0f);
	
	public static final ArmorMaterial KrampusArmor = EnumHelper.addArmorMaterial("krampusarmor", VanillaEvolutionMod.MODID + ":krampus_armor", 80, 
			new int[] {5, 6, 8, 5}, 30, SoundEvents.ENTITY_GHAST_AMBIENT, 0f);
	
	public static final ArmorMaterial SweaterTArmor = EnumHelper.addArmorMaterial("sweatertarmor", VanillaEvolutionMod.MODID + ":sweater_tree_armor", 40, 
			new int[] {0, 0, 1, 0}, 30, SoundEvents.BLOCK_CLOTH_PLACE, 0f);
	
	public static final ArmorMaterial SweaterSArmor = EnumHelper.addArmorMaterial("sweaterSarmor", VanillaEvolutionMod.MODID + ":sweater_snowman_armor", 40, 
			new int[] {0, 0, 1, 0}, 30, SoundEvents.BLOCK_CLOTH_PLACE, 0f);
	
	public static final ArmorMaterial SweaterCArmor = EnumHelper.addArmorMaterial("sweaterCarmor", VanillaEvolutionMod.MODID + ":sweater_candycane_armor", 40, 
			new int[] {0, 0, 1, 0}, 30, SoundEvents.BLOCK_CLOTH_PLACE, 0f);
	
	public static final ArmorMaterial ScaleArmor = EnumHelper.addArmorMaterial("scaleArmor", VanillaEvolutionMod.MODID + ":scale_armor", -1, 
			new int[] {3, 6, 7, 3}, 30, SoundEvents.ENTITY_SILVERFISH_AMBIENT, 3f);
	
	public static final ArmorMaterial LunarArmor = EnumHelper.addArmorMaterial("lunarArmor", VanillaEvolutionMod.MODID + ":lunar_armor", 75, 
			new int[] {8, 14, 15, 9}, 25, SoundEvents.AMBIENT_CAVE, 5f);
	
	public static final ArmorMaterial EnergeticArmor = EnumHelper.addArmorMaterial("energeticarmor", VanillaEvolutionMod.MODID + ":energetic_armor", 90, 
			new int[] {9, 13, 14, 10}, 0, SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, 6f);
	
	public static final ArmorMaterial ThanosArmor = EnumHelper.addArmorMaterial("thanosarmor", VanillaEvolutionMod.MODID + ":thanos_armor", 60, 
			new int[] {7, 11, 12, 8}, 15, SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 5f);
	
	public static final ArmorMaterial ThorArmor = EnumHelper.addArmorMaterial("thorarmor", VanillaEvolutionMod.MODID + ":thor_armor", 50, 
			new int[] {8, 13, 14, 0}, 10, SoundEvents.ENTITY_LIGHTNING_THUNDER, 5f);
	
	public static final ArmorMaterial JediArmor = EnumHelper.addArmorMaterial("jediarmor", VanillaEvolutionMod.MODID + ":jedi_armor", -1, 
			new int[] {2, 5, 7, 3}, 0, SoundEvents.BLOCK_CLOTH_PLACE, 0f);
	
	public static final ArmorMaterial KyloArmor = EnumHelper.addArmorMaterial("kyloarmor", VanillaEvolutionMod.MODID + ":kylo_armor", 65, 
			new int[] {4, 8, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f);
	
	public static final ArmorMaterial VaderArmor = EnumHelper.addArmorMaterial("vaderarmor", VanillaEvolutionMod.MODID + ":vader_armor", 75, 
			new int[] {5, 8, 10, 5}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f);
	
	public static final ArmorMaterial SithArmor = EnumHelper.addArmorMaterial("sitharmor", VanillaEvolutionMod.MODID + ":sith_armor", -1, 
			new int[] {2, 5, 7, 3}, 0, SoundEvents.BLOCK_CLOTH_PLACE, 0f);
	
	public static final ArmorMaterial DwarvenArmor = EnumHelper.addArmorMaterial("dwarvenarmor", VanillaEvolutionMod.MODID + ":dwarven_armor", 100, 
			new int[] {9, 13, 14, 10}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 5f);
	
	public static final ArmorMaterial VLocketArmor = EnumHelper.addArmorMaterial("vlocketarmor", VanillaEvolutionMod.MODID + ":vanishing_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial BLocketArmor = EnumHelper.addArmorMaterial("blocketarmor", VanillaEvolutionMod.MODID + ":brawns_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial HLocketArmor = EnumHelper.addArmorMaterial("hlocketarmor", VanillaEvolutionMod.MODID + ":healing_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial FLocketArmor = EnumHelper.addArmorMaterial("flocketarmor", VanillaEvolutionMod.MODID + ":fire_warding_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial LionArmor = EnumHelper.addArmorMaterial("lionarmor", VanillaEvolutionMod.MODID + ":lion_armor", 65, 
			new int[] {3, 7, 8, 4}, 40, SoundEvents.ENTITY_WOLF_GROWL, 3f);
	
	public static final ArmorMaterial TitaniumArmor = EnumHelper.addArmorMaterial("titaniumarmor", VanillaEvolutionMod.MODID + ":titanium_armor", 100, 
			new int[] {10, 13, 15, 12}, 0, SoundEvents.ENTITY_IRONGOLEM_STEP, 7f);
	
	public static final ArmorMaterial SolarArmor = EnumHelper.addArmorMaterial("solarArmor", VanillaEvolutionMod.MODID + ":solar_armor", 95, 
			new int[] {10, 14, 15, 11}, 25, SoundEvents.ENTITY_BLAZE_AMBIENT, 6f);
	
	public static final ArmorMaterial CloakArmor = EnumHelper.addArmorMaterial("cloakArmor", VanillaEvolutionMod.MODID + ":cloak_armor", 100, 
			new int[] {9, 12, 13, 10}, 30, SoundEvents.ENTITY_WITHER_AMBIENT, 5f);
	
	public static final ArmorMaterial EarthArmor = EnumHelper.addArmorMaterial("earthArmor", VanillaEvolutionMod.MODID + ":earth_armor", 120, 
			new int[] {10, 13, 14, 10}, 30, SoundEvents.BLOCK_STONE_BREAK, 6f);
	
	public static final ArmorMaterial EarthenArmor = EnumHelper.addArmorMaterial("earthenArmor", VanillaEvolutionMod.MODID + ":earthen_armor", 120, 
			new int[] {10, 13, 14, 10}, 30, SoundEvents.BLOCK_STONE_BREAK, 6f);
	
	public static final ArmorMaterial ShadowArmor = EnumHelper.addArmorMaterial("shadowArmor", VanillaEvolutionMod.MODID + ":shadow_armor", 130, 
			new int[] {12, 14, 14, 12}, 50, SoundEvents.ENTITY_WITHER_SPAWN, 7f);
	
	public static final ArmorMaterial FFLocketArmor = EnumHelper.addArmorMaterial("felocketarmor", VanillaEvolutionMod.MODID + ":fast_fighting_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial MLocketArmor = EnumHelper.addArmorMaterial("mlocketarmor", VanillaEvolutionMod.MODID + ":mining_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial LLocketArmor = EnumHelper.addArmorMaterial("llocketarmor", VanillaEvolutionMod.MODID + ":leaping_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial FELocketArmor = EnumHelper.addArmorMaterial("felocketarmor", VanillaEvolutionMod.MODID + ":feeding_armor", -1, 
			new int[] {0, 0, 0, 0}, 0, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 0f);
	
	public static final ArmorMaterial NuclearIArmor = EnumHelper.addArmorMaterial("nucleariarmor", VanillaEvolutionMod.MODID + ":nucleari_armor", 120, 
			new int[] {11, 14, 15, 12}, 0, SoundEvents.BLOCK_REDSTONE_TORCH_BURNOUT, 7f);
	
	public static final ArmorMaterial AsteroidArmor = EnumHelper.addArmorMaterial("asteroidArmor", VanillaEvolutionMod.MODID + ":asteroid_armor", 130, 
			new int[] {11, 14, 16, 11}, 30, SoundEvents.ENTITY_BLAZE_SHOOT, 7f);
	
	public static final ArmorMaterial CyborgArmor = EnumHelper.addArmorMaterial("cyborgArmor", VanillaEvolutionMod.MODID + ":cyborg_armor", 120, 
			new int[] {10, 13, 14, 11}, 0, SoundEvents.BLOCK_PISTON_CONTRACT, 7f);
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
}
