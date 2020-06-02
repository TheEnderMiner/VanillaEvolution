package com.evep.evepmod.potions;

import com.evep.evepmod.VanillaEvolutionMod;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionMinotaur extends Potion{

	public PotionMinotaur(String name, boolean isBadPotion, int color, int iconIndexX, int iconIndexY) {
		super(isBadPotion, color);
		setPotionName("effect." + name);
		setIconIndex(iconIndexX, iconIndexY);
		this.setRegistryName(new ResourceLocation(VanillaEvolutionMod.MODID + ":" + name));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/gui/potion_effects.png"));
		return true;
	}

}
