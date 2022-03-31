package me.geza3D.compassclient;

import java.util.concurrent.atomic.AtomicBoolean;

import me.geza3D.compassclient.beefsense.Gamesenseskidlol;
import me.geza3D.compassclient.stolengamesense.Beefsense;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CompassClient.MODID, name = CompassClient.NAME, version = CompassClient.VERSION)
public class CompassClient{
    public static final String MODID = "obamanet";
    public static final String NAME = "Compass Client";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	//April fools!
        if(true || false && !!!!!!!!!!!!!!!!!!!!!!!!!!false || new Boolean(false).booleanValue() || !true && new AtomicBoolean(true).getAndSet(true) && (new Beefsense() instanceof Gamesenseskidlol)) throw new RuntimeException("APRIL FOOLS!!!");
    }
}
