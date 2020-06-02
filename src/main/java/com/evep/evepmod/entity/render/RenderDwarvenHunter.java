package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityDwarvenHunter;
import com.evep.evepmod.entity.model.ModelDwarvenHunter;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDwarvenHunter extends RenderLiving<EntityDwarvenHunter>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/dwarven_hunter.png");
	
	public RenderDwarvenHunter(RenderManager manager) 
	{
		super(manager, new ModelDwarvenHunter(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDwarvenHunter entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityDwarvenHunter entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
