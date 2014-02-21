package mods.DCfenceslab.common;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFenceSlabW extends ItemBlock{
	
	private static final String[] SlabType = new String[] {"_oak", "_spruse", "_birch", "_jangle"};
	
	public ItemFenceSlabW(int itemId)
	{
		super(itemId);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return super.getUnlocalizedName() + SlabType[(par1ItemStack.getItemDamage() & 3)];
		
	}
	
	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}

}
