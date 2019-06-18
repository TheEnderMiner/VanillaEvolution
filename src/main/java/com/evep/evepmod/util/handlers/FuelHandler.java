package com.evep.evepmod.util.handlers;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == VanillaEvolutionItems.carbon_ingot)
			return 3200;
//		if(fuel.getItem() == VanillaEvolutionItems.amber)
//			return 28800;
		return 0;
	}

}
