package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityDirewolf;
import com.evep.evepmod.entity.model.ModelDirewolf;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDirewolf extends RenderLiving<EntityDirewolf>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/direwolf.png");
	
	public RenderDirewolf(RenderManager manager) 
	{
		super(manager, new ModelDirewolf(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDirewolf entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityDirewolf entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
