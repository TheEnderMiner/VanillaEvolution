package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.entity.model.ModelTurkey;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTurkey extends RenderLiving<EntityTurkey>{
	
public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/turkey.png");
	
	public RenderTurkey(RenderManager manager) 
	{
		super(manager, new ModelTurkey(), 0.3F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTurkey entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityTurkey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
