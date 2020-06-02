package com.evep.evepmod.util.handlers;

import com.evep.evepmod.items.ItemNote;
import com.evep.evepmod.items.gui.GuiNote;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static final int NOTE_GUI = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == NOTE_GUI)
			return new GuiNote();
		return null;
	}

}
