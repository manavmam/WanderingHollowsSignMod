package net.Brady.whsigns;

import com.mojang.logging.LogUtils;
import net.Brady.whsigns.block.ModBlocks;
import net.Brady.whsigns.block.entity.ModBlockEntities;
import net.Brady.whsigns.entity.ModEntities;
import net.Brady.whsigns.item.ModCreativeModTabs;
import net.Brady.whsigns.item.ModItems;
import net.Brady.whsigns.loot.ModLootModifiers;
import net.Brady.whsigns.screen.ModMenuTypes;
import net.Brady.whsigns.sound.ModSounds;
import net.Brady.whsigns.util.ModWoodTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(whsigns.MOD_ID)
public class whsigns {
    public static final String MOD_ID = "whsigns";
    public static final Logger LOGGER = LogUtils.getLogger();

    public whsigns() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);



        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {;
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.ERICA);
            Sheets.addWoodType(ModWoodTypes.BLOSSOM);
            Sheets.addWoodType(ModWoodTypes.CELESTE);
            Sheets.addWoodType(ModWoodTypes.DAPLIN);
            Sheets.addWoodType(ModWoodTypes.CLOVER);
            Sheets.addWoodType(ModWoodTypes.BEE);
            Sheets.addWoodType(ModWoodTypes.AURORA);
            Sheets.addWoodType(ModWoodTypes.BEACH);
            Sheets.addWoodType(ModWoodTypes.BLACK);
            Sheets.addWoodType(ModWoodTypes.BROWN);
            Sheets.addWoodType(ModWoodTypes.BUBBLEGUM);
            Sheets.addWoodType(ModWoodTypes.CHOCOLATE);
            Sheets.addWoodType(ModWoodTypes.CYAN);
            Sheets.addWoodType(ModWoodTypes.DARKCHOCOLATE);
            Sheets.addWoodType(ModWoodTypes.DARKGREY);
            Sheets.addWoodType(ModWoodTypes.DEEPSEA);
            Sheets.addWoodType(ModWoodTypes.GREEN);
            Sheets.addWoodType(ModWoodTypes.GREY);
            Sheets.addWoodType(ModWoodTypes.ICE);
            Sheets.addWoodType(ModWoodTypes.INDIGO);
            Sheets.addWoodType(ModWoodTypes.LIGHTBLUE);
            Sheets.addWoodType(ModWoodTypes.LIME);
            Sheets.addWoodType(ModWoodTypes.MAGENTA);
            Sheets.addWoodType(ModWoodTypes.MAROON);
            Sheets.addWoodType(ModWoodTypes.MIDNIGHT);
            Sheets.addWoodType(ModWoodTypes.MYSTIC);
            Sheets.addWoodType(ModWoodTypes.ORANGE);
            Sheets.addWoodType(ModWoodTypes.PASTELGREEN);
            Sheets.addWoodType(ModWoodTypes.PASTELORANGE);
            Sheets.addWoodType(ModWoodTypes.PASTELPINK);
            Sheets.addWoodType(ModWoodTypes.PASTELPURPLE);
            Sheets.addWoodType(ModWoodTypes.PASTELYELLOW);
            Sheets.addWoodType(ModWoodTypes.PINK);
            Sheets.addWoodType(ModWoodTypes.PURPLE);
            Sheets.addWoodType(ModWoodTypes.RED);
            Sheets.addWoodType(ModWoodTypes.RUBYCHOCOLATE);
            Sheets.addWoodType(ModWoodTypes.SEASHELL);
            Sheets.addWoodType(ModWoodTypes.SUNRISE);
            Sheets.addWoodType(ModWoodTypes.SUNSET);
            Sheets.addWoodType(ModWoodTypes.SWAMP);
            Sheets.addWoodType(ModWoodTypes.TWILIGHT);
            Sheets.addWoodType(ModWoodTypes.WHITE);
            Sheets.addWoodType(ModWoodTypes.WHITECHOCOLATE);
            Sheets.addWoodType(ModWoodTypes.YELLOW);
            
            EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);

        }
    }
}
