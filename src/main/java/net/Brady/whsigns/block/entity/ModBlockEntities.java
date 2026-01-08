package net.Brady.whsigns.block.entity;

import net.Brady.whsigns.whsigns;
import net.Brady.whsigns.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, whsigns.MOD_ID);



    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.ERICA_SIGN.get(), ModBlocks.BLOSSOM_SIGN.get(), ModBlocks.DAPLIN_SIGN.get(), ModBlocks.CELESTE_SIGN.get(), ModBlocks.CLOVER_SIGN.get(), ModBlocks.BEE_SIGN.get(),ModBlocks.OSIAN_SIGN.get(),ModBlocks.ERICA_WALL_SIGN.get(), ModBlocks.BLOSSOM_WALL_SIGN.get(), ModBlocks.DAPLIN_WALL_SIGN.get(), ModBlocks.CELESTE_WALL_SIGN.get(), ModBlocks.CLOVER_WALL_SIGN.get(), ModBlocks.BEE_WALL_SIGN.get(),ModBlocks.OSIAN_WALL_SIGN.get(), ModBlocks.AURORA_SIGN.get(), ModBlocks.AURORA_WALL_SIGN.get(), ModBlocks.BEACH_SIGN.get(), ModBlocks.BEACH_WALL_SIGN.get(), ModBlocks.BLACK_SIGN.get(), ModBlocks.BLACK_WALL_SIGN.get(), ModBlocks.BLUE_SIGN.get(), ModBlocks.BLUE_WALL_SIGN.get(), ModBlocks.BROWN_SIGN.get(), ModBlocks.BROWN_WALL_SIGN.get(), ModBlocks.BUBBLEGUM_SIGN.get(), ModBlocks.BUBBLEGUM_WALL_SIGN.get(), ModBlocks.CHOCOLATE_SIGN.get(), ModBlocks.CHOCOLATE_WALL_SIGN.get(), ModBlocks.CYAN_SIGN.get(), ModBlocks.CYAN_WALL_SIGN.get(), ModBlocks.DARKCHOCOLATE_SIGN.get(), ModBlocks.DARKCHOCOLATE_WALL_SIGN.get(), ModBlocks.DARKGREY_SIGN.get(), ModBlocks.DARKGREY_WALL_SIGN.get(), ModBlocks.DEEPSEA_SIGN.get(), ModBlocks.DEEPSEA_WALL_SIGN.get(), ModBlocks.GREEN_SIGN.get(), ModBlocks.GREEN_WALL_SIGN.get(), ModBlocks.GREY_SIGN.get(), ModBlocks.GREY_WALL_SIGN.get(), ModBlocks.ICE_SIGN.get(), ModBlocks.ICE_WALL_SIGN.get(), ModBlocks.INDIGO_SIGN.get(), ModBlocks.INDIGO_WALL_SIGN.get(), ModBlocks.LIGHTBLUE_SIGN.get(), ModBlocks.LIGHTBLUE_WALL_SIGN.get(), ModBlocks.LIME_SIGN.get(), ModBlocks.LIME_WALL_SIGN.get(), ModBlocks.MAGENTA_SIGN.get(), ModBlocks.MAGENTA_WALL_SIGN.get(), ModBlocks.MAROON_SIGN.get(), ModBlocks.MAROON_WALL_SIGN.get(), ModBlocks.MIDNIGHT_SIGN.get(), ModBlocks.MIDNIGHT_WALL_SIGN.get(), ModBlocks.MYSTIC_SIGN.get(), ModBlocks.MYSTIC_WALL_SIGN.get(), ModBlocks.ORANGE_SIGN.get(), ModBlocks.ORANGE_WALL_SIGN.get(), ModBlocks.PASTELGREEN_SIGN.get(), ModBlocks.PASTELGREEN_WALL_SIGN.get(), ModBlocks.PASTELORANGE_SIGN.get(), ModBlocks.PASTELORANGE_WALL_SIGN.get(), ModBlocks.PASTELPINK_SIGN.get(), ModBlocks.PASTELPINK_WALL_SIGN.get(), ModBlocks.PASTELPURPLE_SIGN.get(), ModBlocks.PASTELPURPLE_WALL_SIGN.get(), ModBlocks.PASTELYELLOW_SIGN.get(), ModBlocks.PASTELYELLOW_WALL_SIGN.get(), ModBlocks.PINK_SIGN.get(), ModBlocks.PINK_WALL_SIGN.get(), ModBlocks.PURPLE_SIGN.get(), ModBlocks.PURPLE_WALL_SIGN.get(), ModBlocks.RED_SIGN.get(), ModBlocks.RED_WALL_SIGN.get(), ModBlocks.RUBYCHOCOLATE_SIGN.get(), ModBlocks.RUBYCHOCOLATE_WALL_SIGN.get(), ModBlocks.SEASHELL_SIGN.get(), ModBlocks.SEASHELL_WALL_SIGN.get(), ModBlocks.SUNRISE_SIGN.get(), ModBlocks.SUNRISE_WALL_SIGN.get(), ModBlocks.SUNSET_SIGN.get(), ModBlocks.SUNSET_WALL_SIGN.get(), ModBlocks.SWAMP_SIGN.get(), ModBlocks.SWAMP_WALL_SIGN.get(), ModBlocks.TWILIGHT_SIGN.get(), ModBlocks.TWILIGHT_WALL_SIGN.get(), ModBlocks.WHITE_SIGN.get(), ModBlocks.WHITE_WALL_SIGN.get(), ModBlocks.WHITECHOCOLATE_SIGN.get(), ModBlocks.WHITECHOCOLATE_WALL_SIGN.get(), ModBlocks.YELLOW_SIGN.get(), ModBlocks.YELLOW_WALL_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
    

}
