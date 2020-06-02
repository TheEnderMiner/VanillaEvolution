package com.evep.evepmod.entity;

import java.util.Set;

import javax.annotation.Nullable;

import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.handlers.LootTableHandler;
import com.evep.evepmod.util.handlers.SoundsHandler;
import com.google.common.collect.Sets;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDirewolf extends EntityMob{
	
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(VanillaEvolutionItems.raw_lion);
    public int timeUntilNextDrop;

	public EntityDirewolf(World worldIn) {
		super(worldIn);
		 this.setSize(0.9F, 0.9F);
	     this.experienceValue = 15;
	}
	
	@Override
	protected void initEntityAI() {
	      this.tasks.addTask(1, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, true));
	        this.tasks.addTask(3, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(5, new EntityAITempt(this, 1.2D, false, TEMPTATION_ITEMS));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityDirewolf.class}));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLion.class, true));
	}
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.383D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	@Override
	public float getEyeHeight(){
		return  0.9F;
	}
	
	@Nullable
    protected ResourceLocation getLootTable()
    {
		return LootTableHandler.DIREWOLF;
    }
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_DIREWOLF_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_DIREWOLF_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_DIREWOLF_DEATH;
	}
	

}
