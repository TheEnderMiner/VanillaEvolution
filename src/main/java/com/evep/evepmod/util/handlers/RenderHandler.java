package com.evep.evepmod.util.handlers;

import com.evep.evepmod.entity.EntityFrostZombie;
import com.evep.evepmod.entity.render.RenderFrostZombie;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler {
	
	public static void registerEntityRenders(){
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostZombie.class, new IRenderFactory<EntityFrostZombie>(){
		@Override
		public Render<? super EntityFrostZombie> createRenderFor(RenderManager manager){
			return new RenderFrostZombie(manager);
		}
		});
	}

}