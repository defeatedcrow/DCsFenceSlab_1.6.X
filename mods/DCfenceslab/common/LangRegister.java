package mods.DCfenceslab.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LangRegister {

	public void registerLang() {
		
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabW, 1, 0), "Oak Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabW, 1, 0), "ja_JP", "樫の柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabW, 1, 1), "Spruce Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabW, 1, 1), "ja_JP", "松の柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabW, 1, 2), "Birch Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabW, 1, 2), "ja_JP", "白樺の柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabW, 1, 3), "Jangle Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabW, 1, 3), "ja_JP", "ジャングルの柵半ブロック");
		
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 0), "Cobblestone Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 0), "ja_JP", "丸石の柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 1), "Stone Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 1), "ja_JP", "石の柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 2), "Stonebrick Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 2), "ja_JP", "石レンガの柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 3), "Sandstone Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 3), "ja_JP", "砂岩の柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 4), "Brick Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 4), "ja_JP", "レンガの柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 5), "Netherbrick Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 5), "ja_JP", "ネザーレンガの柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 6), "Quatz Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 6), "ja_JP", "クオーツの柵半ブロック");
		LanguageRegistry.addName(new ItemStack(DCsFenceSlab.fenceslabS, 1, 7), "IronBlock Fence Slab");
		LanguageRegistry.instance().addNameForObject(new ItemStack(DCsFenceSlab.fenceslabS, 1, 7), "ja_JP", "鉄の柵半ブロック");
		
	}

}
