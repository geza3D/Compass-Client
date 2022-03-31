package me.geza3D.compassclient.pogdog;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Salhack {

	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Thread a = new Thread();
        a.setName("cryptominer");
        a.start();
    }
}
