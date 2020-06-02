package com.evep.evepmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockECarbonOre extends Block {

	public BlockECarbonOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
