
package com.evep.evepmod.proxy;

import com.evep.evepmod.init.VanillaEvolutionEntities;

import net.minecraft.item.Item;

public class CommonProxy 
{
	public void registerModel(Item item, int metadata) {}
	
	public void preInit(){
		VanillaEvolutionEntities.registerEntities();
	}
}