package mods.DCfenceslab.common;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import mods.DCfenceslab.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.src.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
		modid = "DCsFenceSlab",
		name = "FenceSlabMod",
		version = "1.6.2_1.0c",
		dependencies = "required-after:Forge@[9.10,);required-after:FML@[6.2.0,)"
		)
@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = false
		)

public class DCsFenceSlab{
	
	@SidedProxy(clientSide = "mods.DCfenceslab.client.ClientProxy", serverSide = "mods.DCfenceslab.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("DCsFenceSlab")
    public static DCsFenceSlab instance;
	
	public static Block  fenceslabW;
	public static Block  fenceslabS;
	
	public int blockIdFenceSlabW = 625;
	public int blockIdFenceSlabS = 626;
	
	public static int modelFSW;
	public static int modelFSS;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			cfg.load();
			Property blockFenceW = cfg.getBlock("FenceSlab_wood", blockIdFenceSlabW);
			Property blockFenceS = cfg.getBlock("FenceSlab_stone", blockIdFenceSlabS);
			
			blockIdFenceSlabW = blockFenceW.getInt();
			blockIdFenceSlabS = blockFenceS.getInt();

		}
		catch (Exception e)
		{
			FMLLog.log(Level.SEVERE, e, "Error Message");

		}
		finally
		{
			cfg.save();
		}
		
		fenceslabW = (new BlockFenceSlabW(blockIdFenceSlabW)).
				setUnlocalizedName("defeatedcrow.fenceSlabW").
				setCreativeTab(CreativeTabs.tabDecorations);
		
		fenceslabS = (new BlockFenceSlabS(blockIdFenceSlabS)).
				setUnlocalizedName("defeatedcrow.fenceSlabS").
				setCreativeTab(CreativeTabs.tabDecorations);
		
		GameRegistry.registerBlock(fenceslabW, ItemFenceSlabW.class, "fenceSlabW");
		GameRegistry.registerBlock(fenceslabS, ItemFenceSlabS.class, "fenceSlabS");
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Registering new render
		this.modelFSS = proxy.getRenderID();
		this.modelFSW = proxy.getRenderID();
		proxy.registerRenderers();
		
		//Registering new recipe
	      (new RecipeRegister()).addRecipe();
	      
	    //Registering language
	      (new LangRegister()).registerLang();
	}
	
}
