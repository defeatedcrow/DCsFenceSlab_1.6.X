package mods.DCfenceslab.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegister {

	public void addRecipe() {
		
		for (int i = 0; i < 4; i++)
	      {
	    	  GameRegistry.addRecipe(
		    		  new ItemStack(DCsFenceSlab.fenceslabW, 6, i),
		    		  new Object[]{" X ","XXX",
		    			  Character.valueOf('X'), new ItemStack(Block.planks,1,i)});
	      }
		
		for (int i = 0; i < 8; i++)
	      {
	    	ItemStack itemstack = new ItemStack(Block.cobblestone,1,0);
	    	if (i == 1) itemstack = new ItemStack(Block.stone,1,0);
	    	else if (i == 2) itemstack = new ItemStack(Block.stoneBrick,1,0);
	    	else if (i == 3) itemstack = new ItemStack(Block.sandStone,1,0);
	    	else if (i == 4) itemstack = new ItemStack(Block.brick,1,0);
	    	else if (i == 5) itemstack = new ItemStack(Block.netherBrick,1,0);
	    	else if (i == 6) itemstack = new ItemStack(Block.blockNetherQuartz,1,0);
	    	else if (i == 7) itemstack = new ItemStack(Block.blockIron,1,0);
	    	else itemstack = new ItemStack(Block.cobblestone,1,0);
			
			GameRegistry.addRecipe(
		    		  new ItemStack(DCsFenceSlab.fenceslabS, 6, i),
		    		  new Object[]{" X ","XXX",
		    			  Character.valueOf('X'), itemstack});
	      }
		
	}

}
