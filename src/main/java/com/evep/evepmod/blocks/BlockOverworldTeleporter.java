package com.evep.evepmod.blocks;

import com.evep.evepmod.commands.util.Teleport;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOverworldTeleporter extends Block {

	public BlockOverworldTeleporter(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote){
			Teleport.teleportToDimension(playerIn, 0, playerIn.getPosition().getX(), playerIn.getPosition().getY() + 5, playerIn.getPosition().getZ());
			return true;
		}
		
		return false;
	}

}
