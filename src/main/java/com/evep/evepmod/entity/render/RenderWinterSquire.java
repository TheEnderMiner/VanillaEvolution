package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityWinterSquire;
import com.evep.evepmod.entity.model.ModelWinterSquire;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWinterSquire extends RenderLiving<EntityWinterSquire>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/winter_squire.png");
	
	public RenderWinterSquire(RenderManager manager) 
	{
		super(manager, new ModelWinterSquire(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityWinterSquire entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityWinterSquire entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
