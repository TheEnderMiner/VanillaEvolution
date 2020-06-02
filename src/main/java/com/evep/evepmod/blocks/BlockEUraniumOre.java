package com.evep.evepmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEUraniumOre extends Block {

	public BlockEUraniumOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
