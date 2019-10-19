package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityBeast;
import com.evep.evepmod.entity.model.ModelBeast;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBeast extends RenderLiving<EntityBeast>{
	
public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/beast.png");
	
	public RenderBeast(RenderManager manager) 
	{
		super(manager, new ModelBeast(), 0.6F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBeast entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityBeast entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
