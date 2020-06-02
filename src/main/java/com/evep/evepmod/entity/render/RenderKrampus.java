package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityKrampus;
import com.evep.evepmod.entity.model.ModelKrampus;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKrampus extends RenderLiving<EntityKrampus>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/krampus.png");
	
	public RenderKrampus(RenderManager manager) 
	{
		super(manager, new ModelKrampus(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityKrampus entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityKrampus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
