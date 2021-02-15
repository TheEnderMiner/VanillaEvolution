package com.evep.evepmod.blocks;

import java.util.Random;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.blocks.item.ItemBlockDoor;
import com.evep.evepmod.init.VanillaEvolutionBlocks;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.IHasModel;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockDoorBase extends BlockDoor implements IHasModel{

	public BlockDoorBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		VanillaEvolutionBlocks.BLOCKS.add(this);
		VanillaEvolutionItems.ITEMS.add(new ItemBlockDoor(this.setRegistryName(name)));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(this);
	}
	
	@Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}

}
