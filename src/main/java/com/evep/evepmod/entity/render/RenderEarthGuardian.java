package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityEarthGuardian;
import com.evep.evepmod.entity.model.ModelEarthGuardian;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEarthGuardian extends RenderLiving<EntityEarthGuardian>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/earth_guardian.png");
	
	public RenderEarthGuardian(RenderManager manager) 
	{
		super(manager, new ModelEarthGuardian(), 1.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityEarthGuardian entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityEarthGuardian entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}


}
