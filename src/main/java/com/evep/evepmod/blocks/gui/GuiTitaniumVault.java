package com.evep.evepmod.blocks.gui;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.blocks.container.ContainerTitaniumVault;
import com.evep.evepmod.blocks.tileentity.TileEntityTitaniumVault;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiTitaniumVault extends GuiContainer{

	private static final ResourceLocation GUI_CHEST = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/gui/titanium_vault.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityTitaniumVault te;
	
	public GuiTitaniumVault(InventoryPlayer playerInventory, TileEntityTitaniumVault chestInventory, EntityPlayer player) {
		super(new ContainerTitaniumVault(playerInventory, chestInventory, player));
		this.playerInventory = playerInventory;
		this.te = chestInventory;
		
		this.xSize = 175;
		this.ySize = 256;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedComponentText(), 8, 6, 4210752);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

}
