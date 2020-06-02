package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityLion;
import com.evep.evepmod.entity.model.ModelLion;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLion extends RenderLiving<EntityLion>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/lion.png");
	
	public RenderLion(RenderManager manager) 
	{
		super(manager, new ModelLion(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityLion entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityLion entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
