package com.evep.evepmod.blocks;

import java.util.Random;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockSaltBlock extends Block {

	public BlockSaltBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(blockSoundType.SAND);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return VanillaEvolutionItems.salt;
	}
	
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(3);
		
	}

}
