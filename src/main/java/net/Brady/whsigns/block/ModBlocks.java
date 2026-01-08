package net.Brady.whsigns.block;

import net.Brady.whsigns.whsigns;
import net.Brady.whsigns.block.custom.*;
import net.Brady.whsigns.item.ModItems;
import net.Brady.whsigns.util.ModWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, whsigns.MOD_ID);

    public static final RegistryObject<Block> DICE_BLOCK = BLOCKS.register("dice_block",
            () -> new DiceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noLootTable()));

    public static final RegistryObject<Block> ERICA_SIGN = BLOCKS.register("erica_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.ERICA));

    public static final RegistryObject<Block> ERICA_WALL_SIGN = BLOCKS.register("erica_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.ERICA));

    public static final RegistryObject<Block> DAPLIN_SIGN = BLOCKS.register("daplin_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.DAPLIN));

    public static final RegistryObject<Block> DAPLIN_WALL_SIGN = BLOCKS.register("daplin_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.DAPLIN));

    public static final RegistryObject<Block> CELESTE_SIGN = BLOCKS.register("celeste_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.CELESTE));

    public static final RegistryObject<Block> CELESTE_WALL_SIGN = BLOCKS.register("celeste_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.CELESTE));

    public static final RegistryObject<Block> BLOSSOM_SIGN = BLOCKS.register("blossom_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BLOSSOM));

    public static final RegistryObject<Block> BLOSSOM_WALL_SIGN = BLOCKS.register("blossom_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BLOSSOM));

    public static final RegistryObject<Block> CLOVER_SIGN = BLOCKS.register("clover_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.CLOVER));

    public static final RegistryObject<Block> CLOVER_WALL_SIGN = BLOCKS.register("clover_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.CLOVER));

    public static final RegistryObject<Block> BEE_SIGN = BLOCKS.register("bee_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BEE));

    public static final RegistryObject<Block> BEE_WALL_SIGN = BLOCKS.register("bee_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BEE));

    
    
    

    public static final RegistryObject<Block> AURORA_SIGN = BLOCKS.register("aurora_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.AURORA));

    public static final RegistryObject<Block> AURORA_WALL_SIGN = BLOCKS.register("aurora_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.AURORA));

    public static final RegistryObject<Block> BEACH_SIGN = BLOCKS.register("beach_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BEACH));

    public static final RegistryObject<Block> BEACH_WALL_SIGN = BLOCKS.register("beach_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BEACH));

    public static final RegistryObject<Block> BLACK_SIGN = BLOCKS.register("black_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BLACK));

    public static final RegistryObject<Block> BLACK_WALL_SIGN = BLOCKS.register("black_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BLACK));

    public static final RegistryObject<Block> BLUE_SIGN = BLOCKS.register("blue_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BLUE));

    public static final RegistryObject<Block> BLUE_WALL_SIGN = BLOCKS.register("blue_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BLUE));

    public static final RegistryObject<Block> BROWN_SIGN = BLOCKS.register("brown_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BROWN));

    public static final RegistryObject<Block> BROWN_WALL_SIGN = BLOCKS.register("brown_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BROWN));

    public static final RegistryObject<Block> BUBBLEGUM_SIGN = BLOCKS.register("bubblegum_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.BUBBLEGUM));

    public static final RegistryObject<Block> BUBBLEGUM_WALL_SIGN = BLOCKS.register("bubblegum_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.BUBBLEGUM));

    public static final RegistryObject<Block> CHOCOLATE_SIGN = BLOCKS.register("chocolate_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.CHOCOLATE));

    public static final RegistryObject<Block> CHOCOLATE_WALL_SIGN = BLOCKS.register("chocolate_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.CHOCOLATE));

    public static final RegistryObject<Block> CYAN_SIGN = BLOCKS.register("cyan_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.CYAN));

    public static final RegistryObject<Block> CYAN_WALL_SIGN = BLOCKS.register("cyan_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.CYAN));

    public static final RegistryObject<Block> DARKCHOCOLATE_SIGN = BLOCKS.register("darkchocolate_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.DARKCHOCOLATE));

    public static final RegistryObject<Block> DARKCHOCOLATE_WALL_SIGN = BLOCKS.register("darkchocolate_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.DARKCHOCOLATE));

    public static final RegistryObject<Block> DARKGREY_SIGN = BLOCKS.register("darkgrey_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.DARKGREY));

    public static final RegistryObject<Block> DARKGREY_WALL_SIGN = BLOCKS.register("darkgrey_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.DARKGREY));

    public static final RegistryObject<Block> DEEPSEA_SIGN = BLOCKS.register("deepsea_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.DEEPSEA));

    public static final RegistryObject<Block> DEEPSEA_WALL_SIGN = BLOCKS.register("deepsea_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.DEEPSEA));

    public static final RegistryObject<Block> GREEN_SIGN = BLOCKS.register("green_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.GREEN));

    public static final RegistryObject<Block> GREEN_WALL_SIGN = BLOCKS.register("green_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.GREEN));

    public static final RegistryObject<Block> GREY_SIGN = BLOCKS.register("grey_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.GREY));

    public static final RegistryObject<Block> GREY_WALL_SIGN = BLOCKS.register("grey_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.GREY));

    public static final RegistryObject<Block> ICE_SIGN = BLOCKS.register("ice_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.ICE));

    public static final RegistryObject<Block> ICE_WALL_SIGN = BLOCKS.register("ice_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.ICE));

    public static final RegistryObject<Block> INDIGO_SIGN = BLOCKS.register("indigo_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.INDIGO));

    public static final RegistryObject<Block> INDIGO_WALL_SIGN = BLOCKS.register("indigo_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.INDIGO));

    public static final RegistryObject<Block> LIGHTBLUE_SIGN = BLOCKS.register("lightblue_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.LIGHTBLUE));

    public static final RegistryObject<Block> LIGHTBLUE_WALL_SIGN = BLOCKS.register("lightblue_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.LIGHTBLUE));

    public static final RegistryObject<Block> LIME_SIGN = BLOCKS.register("lime_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.LIME));

    public static final RegistryObject<Block> LIME_WALL_SIGN = BLOCKS.register("lime_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.LIME));

    public static final RegistryObject<Block> MAGENTA_SIGN = BLOCKS.register("magenta_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.MAGENTA));

    public static final RegistryObject<Block> MAGENTA_WALL_SIGN = BLOCKS.register("magenta_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.MAGENTA));

    public static final RegistryObject<Block> MAROON_SIGN = BLOCKS.register("maroon_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.MAROON));

    public static final RegistryObject<Block> MAROON_WALL_SIGN = BLOCKS.register("maroon_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.MAROON));

    public static final RegistryObject<Block> MIDNIGHT_SIGN = BLOCKS.register("midnight_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.MIDNIGHT));

    public static final RegistryObject<Block> MIDNIGHT_WALL_SIGN = BLOCKS.register("midnight_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.MIDNIGHT));

    public static final RegistryObject<Block> MYSTIC_SIGN = BLOCKS.register("mystic_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.MYSTIC));

    public static final RegistryObject<Block> MYSTIC_WALL_SIGN = BLOCKS.register("mystic_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.MYSTIC));

    public static final RegistryObject<Block> ORANGE_SIGN = BLOCKS.register("orange_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.ORANGE));

    public static final RegistryObject<Block> ORANGE_WALL_SIGN = BLOCKS.register("orange_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.ORANGE));

    public static final RegistryObject<Block> PASTELGREEN_SIGN = BLOCKS.register("pastelgreen_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PASTELGREEN));

    public static final RegistryObject<Block> PASTELGREEN_WALL_SIGN = BLOCKS.register("pastelgreen_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PASTELGREEN));

    public static final RegistryObject<Block> PASTELORANGE_SIGN = BLOCKS.register("pastelorange_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PASTELORANGE));

    public static final RegistryObject<Block> PASTELORANGE_WALL_SIGN = BLOCKS.register("pastelorange_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PASTELORANGE));

    public static final RegistryObject<Block> PASTELPINK_SIGN = BLOCKS.register("pastelpink_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PASTELPINK));

    public static final RegistryObject<Block> PASTELPINK_WALL_SIGN = BLOCKS.register("pastelpink_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PASTELPINK));

    public static final RegistryObject<Block> PASTELPURPLE_SIGN = BLOCKS.register("pastelpurple_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PASTELPURPLE));

    public static final RegistryObject<Block> PASTELPURPLE_WALL_SIGN = BLOCKS.register("pastelpurple_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PASTELPURPLE));

    public static final RegistryObject<Block> PASTELYELLOW_SIGN = BLOCKS.register("pastelyellow_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PASTELYELLOW));

    public static final RegistryObject<Block> PASTELYELLOW_WALL_SIGN = BLOCKS.register("pastelyellow_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PASTELYELLOW));

    public static final RegistryObject<Block> PINK_SIGN = BLOCKS.register("pink_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PINK));

    public static final RegistryObject<Block> PINK_WALL_SIGN = BLOCKS.register("pink_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PINK));

    public static final RegistryObject<Block> PURPLE_SIGN = BLOCKS.register("purple_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.PURPLE));

    public static final RegistryObject<Block> PURPLE_WALL_SIGN = BLOCKS.register("purple_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.PURPLE));

    public static final RegistryObject<Block> RED_SIGN = BLOCKS.register("red_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.RED));

    public static final RegistryObject<Block> RED_WALL_SIGN = BLOCKS.register("red_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.RED));

    public static final RegistryObject<Block> RUBYCHOCOLATE_SIGN = BLOCKS.register("rubychocolate_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.RUBYCHOCOLATE));

    public static final RegistryObject<Block> RUBYCHOCOLATE_WALL_SIGN = BLOCKS.register("rubychocolate_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.RUBYCHOCOLATE));

    public static final RegistryObject<Block> SEASHELL_SIGN = BLOCKS.register("seashell_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.SEASHELL));

    public static final RegistryObject<Block> SEASHELL_WALL_SIGN = BLOCKS.register("seashell_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.SEASHELL));

    public static final RegistryObject<Block> SUNRISE_SIGN = BLOCKS.register("sunrise_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.SUNRISE));
    
    public static final RegistryObject<Block> SUNRISE_WALL_SIGN = BLOCKS.register("sunrise_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.SUNRISE));

    public static final RegistryObject<Block> SUNSET_SIGN = BLOCKS.register("sunset_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.SUNSET));

    public static final RegistryObject<Block> SUNSET_WALL_SIGN = BLOCKS.register("sunset_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.SUNSET));

    public static final RegistryObject<Block> SWAMP_SIGN = BLOCKS.register("swamp_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.SWAMP));

    public static final RegistryObject<Block> SWAMP_WALL_SIGN = BLOCKS.register("swamp_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.SWAMP));

    public static final RegistryObject<Block> TWILIGHT_SIGN = BLOCKS.register("twilight_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.TWILIGHT));

    public static final RegistryObject<Block> TWILIGHT_WALL_SIGN = BLOCKS.register("twilight_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.TWILIGHT));

    public static final RegistryObject<Block> WHITE_SIGN = BLOCKS.register("white_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.WHITE));

    public static final RegistryObject<Block> WHITE_WALL_SIGN = BLOCKS.register("white_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.WHITE));

    public static final RegistryObject<Block> WHITECHOCOLATE_SIGN = BLOCKS.register("whitechocolate_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.WHITECHOCOLATE));

    public static final RegistryObject<Block> WHITECHOCOLATE_WALL_SIGN = BLOCKS.register("whitechocolate_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.WHITECHOCOLATE));

    public static final RegistryObject<Block> YELLOW_SIGN = BLOCKS.register("yellow_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable(), ModWoodTypes.YELLOW));

    public static final RegistryObject<Block> YELLOW_WALL_SIGN = BLOCKS.register("yellow_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.YELLOW));




    // public static final RegistryObject<Block> OSIAN_SIGN = BLOCKS.register("osian_sign",
    //        () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.OSIAN));

    public static final RegistryObject<Block> OSIAN_SIGN = BLOCKS.register("osian_sign",
            () -> new ModStandingSignBlock(
                BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noLootTable()
                    .strength(1.0f) // Same as vanilla signs
                    .sound(SoundType.WOOD)
                    .requiresCorrectToolForDrops(), // Ensures tools are considered
                ModWoodTypes.OSIAN));


    public static final RegistryObject<Block> OSIAN_WALL_SIGN = BLOCKS.register("osian_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noLootTable(), ModWoodTypes.OSIAN));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        // Only register BlockItem if it's not a sign
        if (!(block.get() instanceof SignBlock)) {
            registerBlockItem(name, toReturn);
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
