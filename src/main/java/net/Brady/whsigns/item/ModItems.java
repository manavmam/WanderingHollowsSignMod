package net.Brady.whsigns.item;

import net.Brady.whsigns.whsigns;
import net.Brady.whsigns.block.ModBlocks;
import net.Brady.whsigns.item.custom.*;
import net.Brady.whsigns.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, whsigns.MOD_ID);

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> ERICA_SIGN = ITEMS.register("erica_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.ERICA_SIGN.get(), ModBlocks.ERICA_WALL_SIGN.get()));

    public static final RegistryObject<Item> DAPLIN_SIGN = ITEMS.register("daplin_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.DAPLIN_SIGN.get(), ModBlocks.DAPLIN_WALL_SIGN.get()));

    public static final RegistryObject<Item> BLOSSOM_SIGN = ITEMS.register("blossom_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BLOSSOM_SIGN.get(), ModBlocks.BLOSSOM_WALL_SIGN.get()));

    public static final RegistryObject<Item> CELESTE_SIGN=ITEMS.register("celeste_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.CELESTE_SIGN.get(), ModBlocks.CELESTE_WALL_SIGN.get()));

    public static final RegistryObject<Item> CLOVER_SIGN = ITEMS.register("clover_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.CLOVER_SIGN.get(), ModBlocks.CLOVER_WALL_SIGN.get()));

    public static final RegistryObject<Item> BEE_SIGN = ITEMS.register("bee_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BEE_SIGN.get(), ModBlocks.BEE_WALL_SIGN.get()));


    public static final RegistryObject<Item> OSIAN_SIGN = ITEMS.register("osian_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.OSIAN_SIGN.get(), ModBlocks.OSIAN_WALL_SIGN.get()));
    

    public static final RegistryObject<Item> AURORA_SIGN = ITEMS.register("aurora_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.AURORA_SIGN.get(), ModBlocks.AURORA_WALL_SIGN.get()));

    public static final RegistryObject<Item> BEACH_SIGN = ITEMS.register("beach_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BEACH_SIGN.get(), ModBlocks.BEACH_WALL_SIGN.get()));

    public static final RegistryObject<Item> BLACK_SIGN = ITEMS.register("black_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BLACK_SIGN.get(), ModBlocks.BLACK_WALL_SIGN.get()));

    public static final RegistryObject<Item> BLUE_SIGN = ITEMS.register("blue_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BLUE_SIGN.get(), ModBlocks.BLUE_WALL_SIGN.get()));

    public static final RegistryObject<Item> BROWN_SIGN = ITEMS.register("brown_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BROWN_SIGN.get(), ModBlocks.BROWN_WALL_SIGN.get()));

    public static final RegistryObject<Item> BUBBLEGUM_SIGN = ITEMS.register("bubblegum_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.BUBBLEGUM_SIGN.get(), ModBlocks.BUBBLEGUM_WALL_SIGN.get()));

    public static final RegistryObject<Item> CHOCOLATE_SIGN = ITEMS.register("chocolate_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.CHOCOLATE_SIGN.get(), ModBlocks.CHOCOLATE_WALL_SIGN.get()));

    public static final RegistryObject<Item> CYAN_SIGN = ITEMS.register("cyan_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.CYAN_SIGN.get(), ModBlocks.CYAN_WALL_SIGN.get()));

    public static final RegistryObject<Item> DARKCHOCOLATE_SIGN = ITEMS.register("darkchocolate_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.DARKCHOCOLATE_SIGN.get(), ModBlocks.DARKCHOCOLATE_WALL_SIGN.get()));

    public static final RegistryObject<Item> DARKGREY_SIGN = ITEMS.register("darkgrey_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.DARKGREY_SIGN.get(), ModBlocks.DARKGREY_WALL_SIGN.get()));

    public static final RegistryObject<Item> DEEPSEA_SIGN = ITEMS.register("deepsea_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.DEEPSEA_SIGN.get(), ModBlocks.DEEPSEA_WALL_SIGN.get()));

    public static final RegistryObject<Item> GREEN_SIGN = ITEMS.register("green_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.GREEN_SIGN.get(), ModBlocks.GREEN_WALL_SIGN.get()));

    public static final RegistryObject<Item> GREY_SIGN = ITEMS.register("grey_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.GREY_SIGN.get(), ModBlocks.GREY_WALL_SIGN.get()));

    public static final RegistryObject<Item> ICE_SIGN = ITEMS.register("ice_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.ICE_SIGN.get(), ModBlocks.ICE_WALL_SIGN.get()));

    public static final RegistryObject<Item> INDIGO_SIGN = ITEMS.register("indigo_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.INDIGO_SIGN.get(), ModBlocks.INDIGO_WALL_SIGN.get()));

    public static final RegistryObject<Item> LIGHTBLUE_SIGN = ITEMS.register("lightblue_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.LIGHTBLUE_SIGN.get(), ModBlocks.LIGHTBLUE_WALL_SIGN.get()));

    public static final RegistryObject<Item> LIME_SIGN = ITEMS.register("lime_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.LIME_SIGN.get(), ModBlocks.LIME_WALL_SIGN.get()));

    public static final RegistryObject<Item> MAGENTA_SIGN = ITEMS.register("magenta_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.MAGENTA_SIGN.get(), ModBlocks.MAGENTA_WALL_SIGN.get()));

    public static final RegistryObject<Item> MAROON_SIGN = ITEMS.register("maroon_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.MAROON_SIGN.get(), ModBlocks.MAROON_WALL_SIGN.get()));

    public static final RegistryObject<Item> MIDNIGHT_SIGN = ITEMS.register("midnight_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.MIDNIGHT_SIGN.get(), ModBlocks.MIDNIGHT_WALL_SIGN.get()));

    public static final RegistryObject<Item> MYSTIC_SIGN = ITEMS.register("mystic_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.MYSTIC_SIGN.get(), ModBlocks.MYSTIC_WALL_SIGN.get()));

    public static final RegistryObject<Item> ORANGE_SIGN = ITEMS.register("orange_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.ORANGE_SIGN.get(), ModBlocks.ORANGE_WALL_SIGN.get()));

    public static final RegistryObject<Item> PASTELGREEN_SIGN = ITEMS.register("pastelgreen_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PASTELGREEN_SIGN.get(), ModBlocks.PASTELGREEN_WALL_SIGN.get()));

    public static final RegistryObject<Item> PASTELORANGE_SIGN = ITEMS.register("pastelorange_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PASTELORANGE_SIGN.get(), ModBlocks.PASTELORANGE_WALL_SIGN.get()));

    public static final RegistryObject<Item> PASTELPINK_SIGN = ITEMS.register("pastelpink_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PASTELPINK_SIGN.get(), ModBlocks.PASTELPINK_WALL_SIGN.get()));

    public static final RegistryObject<Item> PASTELPURPLE_SIGN = ITEMS.register("pastelpurple_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PASTELPURPLE_SIGN.get(), ModBlocks.PASTELPURPLE_WALL_SIGN.get()));

    public static final RegistryObject<Item> PASTELYELLOW_SIGN = ITEMS.register("pastelyellow_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PASTELYELLOW_SIGN.get(), ModBlocks.PASTELYELLOW_WALL_SIGN.get()));

    public static final RegistryObject<Item> PINK_SIGN = ITEMS.register("pink_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PINK_SIGN.get(), ModBlocks.PINK_WALL_SIGN.get()));

    public static final RegistryObject<Item> PURPLE_SIGN = ITEMS.register("purple_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.PURPLE_SIGN.get(), ModBlocks.PURPLE_WALL_SIGN.get()));

    public static final RegistryObject<Item> RED_SIGN = ITEMS.register("red_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.RED_SIGN.get(), ModBlocks.RED_WALL_SIGN.get()));

    public static final RegistryObject<Item> RUBYCHOCOLATE_SIGN = ITEMS.register("rubychocolate_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.RUBYCHOCOLATE_SIGN.get(), ModBlocks.RUBYCHOCOLATE_WALL_SIGN.get()));

    public static final RegistryObject<Item> SEASHELL_SIGN = ITEMS.register("seashell_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.SEASHELL_SIGN.get(), ModBlocks.SEASHELL_WALL_SIGN.get()));

    public static final RegistryObject<Item> SUNRISE_SIGN = ITEMS.register("sunrise_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.SUNRISE_SIGN.get(), ModBlocks.SUNRISE_WALL_SIGN.get()));

    public static final RegistryObject<Item> SUNSET_SIGN = ITEMS.register("sunset_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.SUNSET_SIGN.get(), ModBlocks.SUNSET_WALL_SIGN.get()));

    public static final RegistryObject<Item> SWAMP_SIGN = ITEMS.register("swamp_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.SWAMP_SIGN.get(), ModBlocks.SWAMP_WALL_SIGN.get()));

    public static final RegistryObject<Item> TWILIGHT_SIGN = ITEMS.register("twilight_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.TWILIGHT_SIGN.get(), ModBlocks.TWILIGHT_WALL_SIGN.get()));

    public static final RegistryObject<Item> WHITE_SIGN = ITEMS.register("white_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.WHITE_SIGN.get(), ModBlocks.WHITE_WALL_SIGN.get()));

    public static final RegistryObject<Item> WHITECHOCOLATE_SIGN = ITEMS.register("whitechocolate_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.WHITECHOCOLATE_SIGN.get(), ModBlocks.WHITECHOCOLATE_WALL_SIGN.get()));

    public static final RegistryObject<Item> YELLOW_SIGN = ITEMS.register("yellow_sign",
            () -> new InfiniteSignItem(new Item.Properties().stacksTo(64), ModBlocks.YELLOW_SIGN.get(), ModBlocks.YELLOW_WALL_SIGN.get()));



    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
