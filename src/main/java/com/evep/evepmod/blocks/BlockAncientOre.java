package com.evep.evepmod.blocks;

import java.util.Random;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockAncientOre extends Block{
	
	public BlockAncientOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return VanillaEvolutionItems.ancient_locket;
	}
	 @Override
	    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
	        Item drop = this.getItemDropped(world.getBlockState(pos), RANDOM, fortune);
	        if (drop != Item.getItemFromBlock(this)) {
	            return 4 + RANDOM.nextInt(6);
	        }
	        return 0;
	    }
	 
}
