package com.evep.evepmod.items;

import java.util.List;

import com.evep.evepmod.entity.EntityKnowledgeLord;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemAncientBook extends Item{

	public ItemAncientBook(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setMaxDamage(1);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);

	     tooltip.add("A magical tome that summons the Lord of Knowledge");
	}
	
	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return stack.getMetadata() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;
	    }
	 
	 @Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			ItemStack item = playerIn.getHeldItem(handIn);
			Vec3d aim = playerIn.getLookVec();
			EntityKnowledgeLord lord = new EntityKnowledgeLord(worldIn);
			
			lord.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY, playerIn.posZ + aim.z * 1.5D);
			lord.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 3.5D, playerIn.posZ + aim.z * 1.5D);
			if(!worldIn.isRemote) {
				  worldIn.spawnEntity(lord);
				}
			item.damageItem(2, playerIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
		}

}
