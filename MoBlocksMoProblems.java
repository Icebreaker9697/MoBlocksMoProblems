package com.mo.moblocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MoBlocksMoProblems.MODID, name=MoBlocksMoProblems.MODNAME, version = MoBlocksMoProblems.MODVER)

public class MoBlocksMoProblems {

	public static final String MODID = "moblocks";
	public static final String MODNAME = "MoBlocksMoProblems";
	public static final String MODVER = "0.0.0";
	
	@Instance(value ="moblocks")
	public static MoBlocksMoProblems instance;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		CommonProxy.preinit(event);	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT){
			CommonProxy.init(event);
		}
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
