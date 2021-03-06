package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityKnowledgeLord;
import com.evep.evepmod.entity.model.ModelKnowledgeLord;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKnowledgeLord extends RenderLiving<EntityKnowledgeLord>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/knowledge_lord.png");
	
	public RenderKnowledgeLord(RenderManager manager) 
	{
		super(manager, new ModelKnowledgeLord(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityKnowledgeLord entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityKnowledgeLord entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
