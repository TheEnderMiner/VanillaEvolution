package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.containers.ContainerNickelFurnace;
import com.evep.evepmod.gui.GuiNickelFurnace;
import com.evep.evepmod.tileentities.TileEntityNickelFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
	//	if(ID == VanillaEvolutionMod.gui_test_chest) return new ContainerTestChest(player.inventory, (TileEntityTestChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		
		if(ID == VanillaEvolutionMod.gui_nickel_furnace) return new ContainerNickelFurnace(player.inventory, (TileEntityNickelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
	//	if(ID == VanillaEvolutionMod.gui_test_chest) return new GuiTestChest(player.inventory, (TileEntityTestChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		
		if(ID == VanillaEvolutionMod.gui_nickel_furnace) return new GuiNickelFurnace(player.inventory, (TileEntityNickelFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		
		return null;
	}
	
	public static void registerGUIs(){
		
	}

}
