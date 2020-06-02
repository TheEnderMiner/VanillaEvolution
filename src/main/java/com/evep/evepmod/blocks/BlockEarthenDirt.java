package com.evep.evepmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEarthenDirt extends Block {

	public BlockEarthenDirt(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(blockSoundType.GROUND);
	}

}
