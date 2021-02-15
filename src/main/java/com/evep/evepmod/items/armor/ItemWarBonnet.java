package com.evep.evepmod.items.armor;

import java.util.List;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.init.VanillaEvolutionItems;
import com.evep.evepmod.items.models.ModelWarBonnet;
import com.evep.evepmod.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWarBonnet extends ItemArmor implements IHasModel{

	public ItemWarBonnet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		
		VanillaEvolutionItems.ITEMS.add(this);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("The hat of a Native American tribe"));

	}

	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack){
		return stack.getItem() == VanillaEvolutionItems.turkey_feather;
	}
	

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
	{
		{
			if(player.inventory.armorInventory.get(3) != null)
			{
				{
					if(player.inventory.armorInventory.get(3).getItem() == VanillaEvolutionItems.war_bonnet)
					{
						player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 12*20, 0));
						player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 12*20, 0));
					}
				}
			  }
			}
		}
	
	@Override
	public void registerModels() {
		VanillaEvolutionMod.proxy.registerModel(this, 0);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		if(itemStack != ItemStack.EMPTY){
			if(itemStack.getItem() instanceof ItemArmor){
				ModelWarBonnet model = new ModelWarBonnet();
				
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				return model;
			}
		}
		
		return null;
	}

}
