package com.evep.evepmod.blocks;

import java.util.Random;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSlimeOre extends Block{
	
	public BlockSlimeOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return VanillaEvolutionItems.slime_gem;
	}
	 @Override
	    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
	        Item drop = this.getItemDropped(world.getBlockState(pos), RANDOM, fortune);
	        if (drop != Item.getItemFromBlock(this)) {
	            return 2 + RANDOM.nextInt(3);
	        }
	        return 0;
	    }
	 
	 @Override
	 public int quantityDroppedWithBonus(int fortune, Random random)
	 {
	     if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune))
	     {
	         int i = random.nextInt(fortune + 2) - 1;
	         if (i < 0)
	         {
	             i = 0;
	         }
	         return this.quantityDropped(random) * (i + 1);
	     }
	     else
	     {
	        return this.quantityDropped(random);
	     }
	 }

}
