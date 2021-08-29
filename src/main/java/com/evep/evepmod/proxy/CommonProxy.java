
package com.evep.evepmod.proxy;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.init.VanillaEvolutionEntities;
import com.evep.evepmod.util.handlers.GuiHandler;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy 
{
	public void registerModel(Item item, int metadata) {}
	
	public void preInit(){
		VanillaEvolutionEntities.registerEntities();
	}
	
	public void registerItemRenderer(Item item, int meta, String id){}
	
//	public void init(FMLInitializationEvent e){
//		NetworkRegistry.INSTANCE.registerGuiHandler(VanillaEvolutionMod.instance, new GuiHandler());
//	}
	
//	void openMyGui()
//	{
//	}

}