package com.evep.evepmod.blocks.tileentity;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.blocks.container.ContainerTitaniumVault;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;

public class TileEntityTitaniumVault extends TileEntityLockableLoot implements ITickable{
	
	private NonNullList<ItemStack> chestContents = NonNullList.<ItemStack>withSize(72, ItemStack.EMPTY);
	public int numPlayersUsing, ticksSinceSync;
	
	@Override
	public int getSizeInventory() {
		return 72;
	}
	
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	@Override
	public boolean isEmpty() {
		for(ItemStack stack : this.chestContents){
			if(stack.isEmpty()) return false;
		}
		return true;
	}
	
	@Override
	public String getName() {
		return this.hasCustomName() ? this.customName : "container.titanium_vault";
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		this.chestContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		
		if(!this.checkLootAndRead(compound)) ItemStackHelper.loadAllItems(compound, chestContents);
		if(compound.hasKey("CustomName", 8)) this.customName = compound.getString("CustomName");
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		if(!this.checkLootAndWrite(compound)) ItemStackHelper.saveAllItems(compound, chestContents);
		if(compound.hasKey("CustomName", 8)) compound.setString("CustomeName", this.customName);
		
		return compound;
	}
	
	@Override
	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
		return new ContainerTitaniumVault(playerInventory, this, playerIn);
	}
	
	@Override
	public String getGuiID() {
		return VanillaEvolutionMod.MODID + ":titanium_vault";
	}
	
	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.chestContents;
	}
	
	@Override
	public void openInventory(EntityPlayer player) {
		++this.numPlayersUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayersUsing);
		this.world.notifyNeighborsOfStateChange(pos, this.getBlockType(), false);
	}
	
	@Override
	public void closeInventory(EntityPlayer player) {
		--this.numPlayersUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayersUsing);
		this.world.notifyNeighborsOfStateChange(pos, this.getBlockType(), false);
	}

	@Override
	public void update() {
	}
}
