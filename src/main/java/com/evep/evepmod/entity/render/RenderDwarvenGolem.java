package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityDwarvenGolem;
import com.evep.evepmod.entity.model.ModelDwarvenGolem;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDwarvenGolem extends RenderLiving<EntityDwarvenGolem>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/dwarven_golem.png");
	
	public RenderDwarvenGolem(RenderManager manager) 
	{
		super(manager, new ModelDwarvenGolem(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDwarvenGolem entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityDwarvenGolem entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
