package mods.DCfenceslab.common;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFenceSlabS extends ItemBlock{
	
	private static final String[] SlabType = new String[] {"_cobblestone", "_stone", "stonebrick", "_sandstone", "_brick", "_netherbrick", "_quartz", "_iron"};
	
	public ItemFenceSlabS(int itemId)
	{
		super(itemId);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return super.getUnlocalizedName() + SlabType[(par1ItemStack.getItemDamage() & 7)];
		
	}
	
	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}

}
