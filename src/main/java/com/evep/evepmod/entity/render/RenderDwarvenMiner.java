package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityDwarvenMiner;
import com.evep.evepmod.entity.model.ModelDwarvenMiner;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDwarvenMiner extends RenderLiving<EntityDwarvenMiner>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/dwarven_miner.png");
	
	public RenderDwarvenMiner(RenderManager manager) 
	{
		super(manager, new ModelDwarvenMiner(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDwarvenMiner entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityDwarvenMiner entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
