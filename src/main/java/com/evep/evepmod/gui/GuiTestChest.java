//package com.evep.evepmod.gui;
//
//import com.evep.evepmod.VanillaEvolutionMod;
//import com.evep.evepmod.containers.ContainerTestChest;
//import com.evep.evepmod.tileentities.TileEntityTestChest;
//
//import net.minecraft.client.gui.inventory.GuiContainer;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.entity.player.InventoryPlayer;
//import net.minecraft.util.ResourceLocation;
//
//public class GuiTestChest extends GuiContainer{
//	
//	private static final ResourceLocation GUI_CHEST = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/gui/test_chest.png");
//	private final InventoryPlayer playerInventory;
//	private final TileEntityTestChest te;
//	
//	public GuiTestChest(InventoryPlayer playerInventory, TileEntityTestChest chestInventory, EntityPlayer player) {
//		super(new ContainerTestChest(playerInventory, chestInventory, player));
//		this.playerInventory = playerInventory;
//		this.te = chestInventory;
//		
//		this.xSize = 175;
//		this.ySize = 256;
//	}
//	
//	@Override
//	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
//		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 4210752);
//		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize -91, 4210752);
//	}
//	
//	@Override
//	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
//		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//		this.mc.getTextureManager().bindTexture(GUI_CHEST);
//		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
//	}
//
//}
