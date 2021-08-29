package com.evep.evepmod.items.tools.ranged;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.entity.projectiles.EntityTechArrow;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTechArrow extends ItemArrow implements IHasModel{
	
	 public ItemTechArrow(String name)
	    {
	    	setUnlocalizedName(name);
			setRegistryName(name);
	        
	        VanillaEvolutionItems.ITEMS.add(this);
	    }  
	 
	 @Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		EntityTechArrow entityTechArrow = new EntityTechArrow(worldIn, shooter);
		return entityTechArrow;
	}
	 
	 @Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
