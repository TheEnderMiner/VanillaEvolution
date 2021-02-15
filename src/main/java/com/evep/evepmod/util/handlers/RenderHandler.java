package com.evep.evepmod.util.handlers;

import com.evep.evepmod.entity.EntityAridSkeleton;
import com.evep.evepmod.entity.EntityBasilisk;
import com.evep.evepmod.entity.EntityBeast;
import com.evep.evepmod.entity.EntityCactusBug;
import com.evep.evepmod.entity.EntityDirewolf;
import com.evep.evepmod.entity.EntityDwarvenGolem;
import com.evep.evepmod.entity.EntityDwarvenGuard;
import com.evep.evepmod.entity.EntityDwarvenHunter;
import com.evep.evepmod.entity.EntityDwarvenMiner;
import com.evep.evepmod.entity.EntityEarthGuardian;
import com.evep.evepmod.entity.EntityFrostZombie;
import com.evep.evepmod.entity.EntityImmjiriChampion;
import com.evep.evepmod.entity.EntityKnowledgeLord;
import com.evep.evepmod.entity.EntityKrampus;
import com.evep.evepmod.entity.EntityLion;
import com.evep.evepmod.entity.EntityMinotaur;
import com.evep.evepmod.entity.EntityTurkey;
import com.evep.evepmod.entity.EntityWinterSquire;
import com.evep.evepmod.entity.render.RenderAridSkeleton;
import com.evep.evepmod.entity.render.RenderBasilisk;
import com.evep.evepmod.entity.render.RenderBeast;
import com.evep.evepmod.entity.render.RenderCactusBug;
import com.evep.evepmod.entity.render.RenderDirewolf;
import com.evep.evepmod.entity.render.RenderDwarvenGolem;
import com.evep.evepmod.entity.render.RenderDwarvenGuard;
import com.evep.evepmod.entity.render.RenderDwarvenHunter;
import com.evep.evepmod.entity.render.RenderDwarvenMiner;
import com.evep.evepmod.entity.render.RenderEarthGuardian;
import com.evep.evepmod.entity.render.RenderFrostZombie;
import com.evep.evepmod.entity.render.RenderImmjiriChampion;
import com.evep.evepmod.entity.render.RenderKnowledgeLord;
import com.evep.evepmod.entity.render.RenderKrampus;
import com.evep.evepmod.entity.render.RenderLion;
import com.evep.evepmod.entity.render.RenderMinotaur;
import com.evep.evepmod.entity.render.RenderTurkey;
import com.evep.evepmod.entity.render.RenderWinterSquire;

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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKrampus.class, new IRenderFactory<EntityKrampus>(){
			@Override
			public Render<? super EntityKrampus> createRenderFor(RenderManager manager){
				return new RenderKrampus(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCactusBug.class, new IRenderFactory<EntityCactusBug>(){
			@Override
			public Render<? super EntityCactusBug> createRenderFor(RenderManager manager){
				return new RenderCactusBug(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBasilisk.class, new IRenderFactory<EntityBasilisk>(){
			@Override
			public Render<? super EntityBasilisk> createRenderFor(RenderManager manager){
				return new RenderBasilisk(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new IRenderFactory<EntityMinotaur>(){
			@Override
			public Render<? super EntityMinotaur> createRenderFor(RenderManager manager){
				return new RenderMinotaur(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDwarvenMiner.class, new IRenderFactory<EntityDwarvenMiner>(){
			@Override
			public Render<? super EntityDwarvenMiner> createRenderFor(RenderManager manager){
				return new RenderDwarvenMiner(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDwarvenHunter.class, new IRenderFactory<EntityDwarvenHunter>(){
			@Override
			public Render<? super EntityDwarvenHunter> createRenderFor(RenderManager manager){
				return new RenderDwarvenHunter(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDwarvenGuard.class, new IRenderFactory<EntityDwarvenGuard>(){
			@Override
			public Render<? super EntityDwarvenGuard> createRenderFor(RenderManager manager){
				return new RenderDwarvenGuard(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDwarvenGolem.class, new IRenderFactory<EntityDwarvenGolem>(){
			@Override
			public Render<? super EntityDwarvenGolem> createRenderFor(RenderManager manager){
				return new RenderDwarvenGolem(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWinterSquire.class, new IRenderFactory<EntityWinterSquire>(){
			@Override
			public Render<? super EntityWinterSquire> createRenderFor(RenderManager manager){
				return new RenderWinterSquire(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLion.class, new IRenderFactory<EntityLion>(){
			@Override
			public Render<? super EntityLion> createRenderFor(RenderManager manager){
				return new RenderLion(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDirewolf.class, new IRenderFactory<EntityDirewolf>(){
			@Override
			public Render<? super EntityDirewolf> createRenderFor(RenderManager manager){
				return new RenderDirewolf(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityImmjiriChampion.class, new IRenderFactory<EntityImmjiriChampion>(){
			@Override
			public Render<? super EntityImmjiriChampion> createRenderFor(RenderManager manager){
				return new RenderImmjiriChampion(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEarthGuardian.class, new IRenderFactory<EntityEarthGuardian>(){
			@Override
			public Render<? super EntityEarthGuardian> createRenderFor(RenderManager manager){
				return new RenderEarthGuardian(manager);
			}
			});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKnowledgeLord.class, new IRenderFactory<EntityKnowledgeLord>(){
			@Override
			public Render<? super EntityKnowledgeLord> createRenderFor(RenderManager manager){
				return new RenderKnowledgeLord(manager);
			}
			});
	}

}