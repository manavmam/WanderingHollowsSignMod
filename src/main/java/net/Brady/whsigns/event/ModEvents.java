package net.Brady.whsigns.event;

import net.Brady.whsigns.whsigns;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = whsigns.MOD_ID)
public class ModEvents {


    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
    
    }
}
