
package com.evep.evepmod.proxy;

import com.evep.evepmod.util.handlers.RenderHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy{

	@Override
		public void preInit(FMLPreInitializationEvent event) {
		RenderHandler.registerEntityRenders();
}

	@Override
		public void init(FMLInitializationEvent event) {
}

	@Override
		public void postInit(FMLPostInitializationEvent event) {
}
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}