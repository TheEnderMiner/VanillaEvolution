package com.evep.evepmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEIronOre extends Block {

	public BlockEIronOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
