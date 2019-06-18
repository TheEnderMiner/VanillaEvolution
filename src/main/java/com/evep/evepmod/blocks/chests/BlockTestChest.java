//package com.evep.evepmod.blocks.chests;
//
//import java.util.Random;
//
//import com.evep.evepmod.VanillaEvolutionMod;
//import com.evep.evepmod.init.VanillaEvolutionBlocks;
//import com.evep.evepmod.init.VanillaEvolutionItems;
//import com.evep.evepmod.tileentities.TileEntityTestChest;
//
//import net.minecraft.block.BlockContainer;
//import net.minecraft.block.BlockHorizontal;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.properties.IProperty;
//import net.minecraft.block.properties.PropertyDirection;
//import net.minecraft.block.state.BlockStateContainer;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.inventory.InventoryHelper;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemBlock;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.tileentity.TileEntityChest;
//import net.minecraft.util.EnumBlockRenderType;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.EnumHand;
//import net.minecraft.util.Mirror;
//import net.minecraft.util.Rotation;
//import net.minecraft.util.math.AxisAlignedBB;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.world.World;
//
//public class BlockTestChest extends BlockContainer{
//	
//	 public static final PropertyDirection FACING = BlockHorizontal.FACING;
//	
//	public BlockTestChest(String name) 
//	{
//		
//		super(Material.IRON);
//		setUnlocalizedName(name);
//		setRegistryName(name);
//		
//		VanillaEvolutionBlocks.BLOCKS.add(this);
//		VanillaEvolutionItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
//	}
//	
//	@Override
//	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
//	{
//		return Item.getItemFromBlock(VanillaEvolutionBlocks.test_chest);
//	}
//	
//	@Override
//	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
//	{
//		if(!worldIn.isRemote)
//		{
//			playerIn.openGui(VanillaEvolutionMod.instance, VanillaEvolutionMod.gui_test_chest, worldIn, pos.getX(), pos.getY(), pos.getZ());
//		}
//		
//		return true;
//	}
//	
//	
//	@Override
//	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
//	{
//		if (!worldIn.isRemote) 
//        {
//            IBlockState north = worldIn.getBlockState(pos.north());
//            IBlockState south = worldIn.getBlockState(pos.south());
//            IBlockState west = worldIn.getBlockState(pos.west());
//            IBlockState east = worldIn.getBlockState(pos.east());
//            EnumFacing face = (EnumFacing)state.getValue(FACING);
//
//            if (face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.SOUTH;
//            else if (face == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()) face = EnumFacing.NORTH;
//            else if (face == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()) face = EnumFacing.EAST;
//            else if (face == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()) face = EnumFacing.WEST;
//            worldIn.setBlockState(pos, state.withProperty(FACING, face), 2);
//        }
//	}
//	
//	@Override
//	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) 
//	{
//		TileEntityTestChest tileentity = (TileEntityTestChest)worldIn.getTileEntity(pos);
//		InventoryHelper.dropInventoryItems(worldIn, pos, tileentity);
//		super.breakBlock(worldIn, pos, state);
//	}
//	
//	@Override
//	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
//	{
//		if(stack.hasDisplayName())
//		{
//			TileEntity tileentity = worldIn.getTileEntity(pos);
//			
//			if(tileentity instanceof TileEntityTestChest)
//			{
//				((TileEntityTestChest)tileentity).setCustomName(stack.getDisplayName());
//			}	
//		}
//	}
//	
//	
//	@Override
//	protected BlockStateContainer createBlockState() 
//	{
//		return new BlockStateContainer(this, new IProperty[] {FACING});
//	}
//
//	@Override
//	public IBlockState withRotation(IBlockState state, Rotation rot)
//	{
//		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
//	}
//	
//	 public IBlockState getStateFromMeta(int meta)
//	    {
//	        EnumFacing enumfacing = EnumFacing.getFront(meta);
//
//	        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
//	        {
//	            enumfacing = EnumFacing.NORTH;
//	        }
//
//	        return this.getDefaultState().withProperty(FACING, enumfacing);
//	    }
//	 
//	 public int getMetaFromState(IBlockState state)
//	    {
//	        return ((EnumFacing)state.getValue(FACING)).getIndex();
//	    }
//	
//	@Override
//	public TileEntity createNewTileEntity(World worldIn, int meta)
//	{
//		return new TileEntityTestChest();
//	}
//	
//	@Override
//	public EnumBlockRenderType getRenderType(IBlockState state) 
//	{
//		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
//	}
//	
//	@Override
//	public boolean isFullBlock(IBlockState state) 
//	{
//		return false;
//	}
//	
//	@Override
//	public boolean isFullCube(IBlockState state)
//	{
//		return false;
//	}
//	
//	@Override
//	public boolean isOpaqueCube(IBlockState state)
//	{
//		return false;
//	}
//	
//	@Override
//	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) 
//	{
//		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
//	}
//	
//	
//	@Override
//	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) 
//	{
//		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
//	}
//
//}
