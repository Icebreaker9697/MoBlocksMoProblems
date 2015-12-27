package com.mo.moblocks;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public static mysteryBox mysteryBox;
	
	@Instance(value ="moblocks")
	public static MoBlocksMoProblems instance;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
		CustomBlocks.createBlock();
		CustomItem.createItems();
		CustomBlockRenderer.renderThis();
		CustomItemRenderer.renderThis();
		MoRecipes.addRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
