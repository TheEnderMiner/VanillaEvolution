package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityDwarvenGuard;
import com.evep.evepmod.entity.model.ModelDwarvenGuard;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDwarvenGuard extends RenderLiving<EntityDwarvenGuard>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/dwarven_guard.png");
	
	public RenderDwarvenGuard(RenderManager manager) 
	{
		super(manager, new ModelDwarvenGuard(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDwarvenGuard entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityDwarvenGuard entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
