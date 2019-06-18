//package com.evep.evepmod.init;
//
//import com.evep.evepmod.items.armor.ItemEnderiteArmor;
//import com.evep.evepmod.util.Lang;
//import com.evep.evepmod.VanillaEvolutionMod;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.init.SoundEvents;
//import net.minecraft.inventory.EntityEquipmentSlot;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemArmor;
//import net.minecraft.item.ItemArmor.ArmorMaterial;
//import net.minecraftforge.client.event.ModelRegistryEvent;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.common.util.EnumHelper;
//import net.minecraftforge.event.RegistryEvent;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
//
//
//@EventBusSubscriber
//
//public class VanillaEvolutionArmor {
//
//	public static ArmorMaterial MATERIALNAME = EnumHelper.addArmorMaterial("hazmatsuit", VanillaEvolutionMod.MODID+":hazmatsuit", 50, new int[] {0,1,2,0}, 14, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f);
//
//	public static ItemArmor HELMET_HAZMAT;
//	public static ItemArmor CHESTPLATE_HAZMAT;
//	public static ItemArmor LEGGINGS_HAZMAT;
//	public static ItemArmor BOOTS_HAZMAT;
//
//	public static void init(){
//		HELMET_HAZMAT = new ItemEnderiteArmor(MATERIALNAME,Lang.localise("info.helmet_hazmat"), 1, EntityEquipmentSlot.HEAD, "helmet_hazmat");
//		CHESTPLATE_HAZMAT = new ItemEnderiteArmor(MATERIALNAME,Lang.localise("info.chest_hazmat") , 1, EntityEquipmentSlot.CHEST, "chest_hazmat");
//		LEGGINGS_HAZMAT = new ItemEnderiteArmor(MATERIALNAME,Lang.localise("info.leggings_hazmat") , 2, EntityEquipmentSlot.LEGS, "leggings_hazmat");
//		BOOTS_HAZMAT = new ItemEnderiteArmor(MATERIALNAME,Lang.localise("info.boots_hazmat") ,1, EntityEquipmentSlot.FEET, "boots_hazmat");
//
//		
//		HELMET_HAZMAT.setCreativeTab(CreativeTabs.COMBAT);
//		CHESTPLATE_HAZMAT.setCreativeTab(CreativeTabs.COMBAT);
//		LEGGINGS_HAZMAT.setCreativeTab(CreativeTabs.COMBAT);
//		BOOTS_HAZMAT.setCreativeTab(CreativeTabs.COMBAT);
//	}
//
//	@SubscribeEvent
//	public static void registerItems(RegistryEvent.Register<Item> event){
//		event.getRegistry().registerAll(HELMET_HAZMAT, CHESTPLATE_HAZMAT, LEGGINGS_HAZMAT, BOOTS_HAZMAT);
//	}
//
//	@SubscribeEvent
//	public static void registerRenders(ModelRegistryEvent event){
//		registerRender(HELMET_HAZMAT);
//		registerRender(CHESTPLATE_HAZMAT);
//		registerRender(LEGGINGS_HAZMAT);
//		registerRender(BOOTS_HAZMAT);
//	}
//
//	public static void registerRender(Item item){
//		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//	}
//
//}
