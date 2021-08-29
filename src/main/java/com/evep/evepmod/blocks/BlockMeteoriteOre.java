package com.evep.evepmod.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockMeteoriteOre extends Block{
	
	public BlockMeteoriteOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override 
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		
//		drops.add(new ItemStack(Items.IRON_INGOT, RANDOM.nextInt(3)+1));
		//					 Lower #, higher chance									Second # is lowest amount, first # + second is highest amount
		if(RANDOM.nextFloat()>0.5f) {
			drops.add(new ItemStack(VanillaEvolutionItems.meteorite_shard, RANDOM.nextInt(3)+3));
		}
		if(RANDOM.nextFloat()>0.5f) {
			drops.add(new ItemStack(VanillaEvolutionItems.nickel_chunk, RANDOM.nextInt(1)+2));
		}
		if(RANDOM.nextFloat()>0.4f) {
			drops.add(new ItemStack(VanillaEvolutionItems.cobalt_chunk, RANDOM.nextInt(2)+1));
		}
		if(RANDOM.nextFloat()>0.7f) {
			drops.add(new ItemStack(VanillaEvolutionItems.carbon_chunk, RANDOM.nextInt(1)+1));
		}
		if(RANDOM.nextFloat()>0.3f) {
			drops.add(new ItemStack(VanillaEvolutionItems.silicon_chunk, RANDOM.nextInt(1)+2));
		}
		
		return drops;
	}
}
