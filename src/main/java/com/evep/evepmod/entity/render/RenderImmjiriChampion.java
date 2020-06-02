package com.evep.evepmod.entity.render;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.EntityImmjiriChampion;
import com.evep.evepmod.entity.EntityLion;
import com.evep.evepmod.entity.model.ModelImmjiriChampion;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderImmjiriChampion extends RenderLiving<EntityImmjiriChampion>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(VanillaEvolutionMod.MODID + ":textures/entity/immjiri_champion.png");
	
	public RenderImmjiriChampion(RenderManager manager) 
	{
		super(manager, new ModelImmjiriChampion(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityImmjiriChampion entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityImmjiriChampion entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
