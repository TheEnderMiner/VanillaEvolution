package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityCactusBug;
import com.evep.evepmod.entity.model.ModelCactusBug;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCactusBug extends RenderLiving<EntityCactusBug>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/cactus_bug.png");
	
	public RenderCactusBug(RenderManager manager) 
	{
		super(manager, new ModelCactusBug(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCactusBug entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityCactusBug entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
