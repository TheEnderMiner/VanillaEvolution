package com.evep.evepmod.items.gui;

import com.evep.evepmod.VanillaEvolutionMod;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiNote extends GuiScreen{
	
	private static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/gui/note.png");
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
//		this.mc.getTextureManager().bindTexture(ResourceLocation location);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

}
