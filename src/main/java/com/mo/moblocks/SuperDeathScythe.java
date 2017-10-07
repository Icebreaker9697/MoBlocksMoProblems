package com.mo.moblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SuperDeathScythe extends ItemSword{

	public SuperDeathScythe(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}

}
