package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityBasilisk;
import com.evep.evepmod.entity.model.ModelBasilisk;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBasilisk extends RenderLiving<EntityBasilisk>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/basilisk.png");
	
	public RenderBasilisk(RenderManager manager) 
	{
		super(manager, new ModelBasilisk(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBasilisk entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityBasilisk entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
