package net.Brady.whsigns.item;

import net.Brady.whsigns.whsigns;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, whsigns.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OSIAN_SIGN.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());

                        pOutput.accept(ModItems.ERICA_SIGN.get());
                        pOutput.accept(ModItems.BLOSSOM_SIGN.get());
                        pOutput.accept(ModItems.CLOVER_SIGN.get());
                        pOutput.accept(ModItems.DAPLIN_SIGN.get());
                        pOutput.accept(ModItems.CELESTE_SIGN.get());
                        pOutput.accept(ModItems.BEE_SIGN.get());
                        pOutput.accept(ModItems.OSIAN_SIGN.get());

                        pOutput.accept(ModItems.AURORA_SIGN.get());
                        pOutput.accept(ModItems.BEACH_SIGN.get());
                        pOutput.accept(ModItems.BLACK_SIGN.get());
                        pOutput.accept(ModItems.BLUE_SIGN.get());
                        pOutput.accept(ModItems.BROWN_SIGN.get());
                        pOutput.accept(ModItems.BUBBLEGUM_SIGN.get());
                        pOutput.accept(ModItems.CHOCOLATE_SIGN.get());
                        pOutput.accept(ModItems.CYAN_SIGN.get());
                        pOutput.accept(ModItems.DARKCHOCOLATE_SIGN.get());
                        pOutput.accept(ModItems.DARKGREY_SIGN.get());
                        pOutput.accept(ModItems.DEEPSEA_SIGN.get());
                        pOutput.accept(ModItems.GREEN_SIGN.get());
                        pOutput.accept(ModItems.GREY_SIGN.get());
                        pOutput.accept(ModItems.ICE_SIGN.get());
                        pOutput.accept(ModItems.INDIGO_SIGN.get());
                        pOutput.accept(ModItems.LIGHTBLUE_SIGN.get());
                        pOutput.accept(ModItems.LIME_SIGN.get());
                        pOutput.accept(ModItems.MAGENTA_SIGN.get());
                        pOutput.accept(ModItems.MAROON_SIGN.get());
                        pOutput.accept(ModItems.MIDNIGHT_SIGN.get());
                        pOutput.accept(ModItems.MYSTIC_SIGN.get());
                        pOutput.accept(ModItems.ORANGE_SIGN.get());
                        pOutput.accept(ModItems.PASTELGREEN_SIGN.get());
                        pOutput.accept(ModItems.PASTELORANGE_SIGN.get());
                        pOutput.accept(ModItems.PASTELPINK_SIGN.get());
                        pOutput.accept(ModItems.PASTELPURPLE_SIGN.get());
                        pOutput.accept(ModItems.PASTELYELLOW_SIGN.get());
                        pOutput.accept(ModItems.PINK_SIGN.get());
                        pOutput.accept(ModItems.PURPLE_SIGN.get());
                        pOutput.accept(ModItems.RED_SIGN.get());
                        pOutput.accept(ModItems.RUBYCHOCOLATE_SIGN.get());
                        pOutput.accept(ModItems.SEASHELL_SIGN.get());
                        pOutput.accept(ModItems.SUNRISE_SIGN.get());
                        pOutput.accept(ModItems.SUNSET_SIGN.get());
                        pOutput.accept(ModItems.SWAMP_SIGN.get());
                        pOutput.accept(ModItems.TWILIGHT_SIGN.get());
                        pOutput.accept(ModItems.WHITE_SIGN.get());
                        pOutput.accept(ModItems.WHITECHOCOLATE_SIGN.get());
                        pOutput.accept(ModItems.YELLOW_SIGN.get());
                        
                        pOutput.accept(ModItems.DICE.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
