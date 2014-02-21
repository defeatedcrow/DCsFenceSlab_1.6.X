package mods.DCfenceslab.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class CommonProxy {
	
	public int getRenderID()
	{
		return -1;
	}
	
	public void registerRenderers(){}

	public World getClientWorld() {
		
		return null;
	}

}
