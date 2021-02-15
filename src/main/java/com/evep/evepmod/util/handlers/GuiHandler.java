package com.evep.evepmod.util.handlers;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.blocks.container.ContainerTitaniumVault;
import com.evep.evepmod.blocks.gui.GuiTitaniumVault;
import com.evep.evepmod.blocks.tileentity.TileEntityTitaniumVault;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	//	if(ID == VanillaEvolutionMod.GUI_TITANIUM_VAULT) return new ContainerTitaniumVault(player.inventory, (TileEntityTitaniumVault)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	//	if(ID == VanillaEvolutionMod.GUI_TITANIUM_VAULT) return new GuiTitaniumVault(player.inventory, (TileEntityTitaniumVault)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
	
	public static void registerGUIs(){
		
	}

}
