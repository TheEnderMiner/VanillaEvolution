package com.evep.evepmod.util.handlers;

import com.evep.evepmod.entity.EntityAridSkeleton;
import com.evep.evepmod.entity.EntityBeast;
import com.evep.evepmod.entity.EntityFrostZombie;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.entity.render.RenderAridSkeleton;
import com.evep.evepmod.entity.render.RenderBeast;
import com.evep.evepmod.entity.render.RenderFrostZombie;
import com.evep.evepmod.entity.render.RenderTurkey;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostZombie.class, new IRenderFactory<EntityFrostZombie>(){
		@Override
		public Render<? super EntityFrostZombie> createRenderFor(RenderManager manager){
			return new RenderFrostZombie(manager);
		}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBeast.class, new IRenderFactory<EntityBeast>(){
			@Override
			public Render<? super EntityBeast> createRenderFor(RenderManager manager){
				return new RenderBeast(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAridSkeleton.class, new IRenderFactory<EntityAridSkeleton>(){
			@Override
			public Render<? super EntityAridSkeleton> createRenderFor(RenderManager manager){
				return new RenderAridSkeleton(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTurkey.class, new IRenderFactory<EntityTurkey>(){
			@Override
			public Render<? super EntityTurkey> createRenderFor(RenderManager manager){
				return new RenderTurkey(manager);
			}
			});
	}

}