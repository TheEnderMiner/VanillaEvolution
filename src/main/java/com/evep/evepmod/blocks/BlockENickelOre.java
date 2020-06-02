package com.evep.evepmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockENickelOre extends Block {

	public BlockENickelOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
