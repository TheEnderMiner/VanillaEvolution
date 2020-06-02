package com.evep.evepmod.blocks;

import java.util.ArrayList;

import com.evep.evepmod.init.VanillaEvolutionItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockEMeteoriteOre extends Block {

	public BlockEMeteoriteOre(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override 
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		
//		drops.add(new ItemStack(Items.IRON_INGOT, RANDOM.nextInt(3)+1));
		if(RANDOM.nextFloat()>0.3f) {
			drops.add(new ItemStack(VanillaEvolutionItems.iron_chunk, RANDOM.nextInt(3)+1));
		}
		if(RANDOM.nextFloat()>0.6f) {
			drops.add(new ItemStack(VanillaEvolutionItems.gold_chunk, RANDOM.nextInt(2)+1));
		}
		if(RANDOM.nextFloat()>0.4f) {
			drops.add(new ItemStack(VanillaEvolutionItems.silver_chunk, RANDOM.nextInt(3)+1));
		}
		if(RANDOM.nextFloat()>0.7f) {
			drops.add(new ItemStack(VanillaEvolutionItems.platinum_chunk, RANDOM.nextInt(2)+1)); //Platinum
		}
		
		return drops;
	}
	
}
