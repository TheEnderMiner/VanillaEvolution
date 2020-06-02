package com.evep.evepmod.blocks;

import java.util.Random;

import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockEarthenStone extends Block{
	
	public BlockEarthenStone(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
