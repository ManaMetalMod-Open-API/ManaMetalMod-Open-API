package net.manametal.oapi.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.manametal.oapi.api.InfoM3API;

@Mod(modid = InfoM3API.MODID, name = InfoM3API.NAME, version = InfoM3API.VERSION)
public class ModMain {
  @Mod.Instance(InfoM3API.MODID)
  public static ModMain INSTANCES;
  
  public void onPreInit(final FMLPreInitializationEvent event) {
   
  }

}
