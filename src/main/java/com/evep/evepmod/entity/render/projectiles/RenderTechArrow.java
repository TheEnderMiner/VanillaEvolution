package com.evep.evepmod.entity.render.projectiles;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.projectiles.EntityTechArrow;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTechArrow extends RenderArrow<EntityTechArrow>{

	public RenderTechArrow(RenderManager manager) {
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTechArrow entity) {
		return new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/projectiles/tech_arrow.png");
	}
	
}
