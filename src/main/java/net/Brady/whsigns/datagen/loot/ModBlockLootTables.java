package net.Brady.whsigns.datagen.loot;

import net.Brady.whsigns.block.ModBlocks;
import net.Brady.whsigns.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.ERICA_SIGN.get(), block -> createSingleItemTable(ModItems.ERICA_SIGN.get()));
        this.add(ModBlocks.ERICA_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.ERICA_SIGN.get()));

        this.add(ModBlocks.DAPLIN_SIGN.get(), block -> createSingleItemTable(ModItems.DAPLIN_SIGN.get()));
        this.add(ModBlocks.DAPLIN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.DAPLIN_SIGN.get()));

        this.add(ModBlocks.BLOSSOM_SIGN.get(), block -> createSingleItemTable(ModItems.BLOSSOM_SIGN.get()));
        this.add(ModBlocks.BLOSSOM_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BLOSSOM_SIGN.get()));

        this.add(ModBlocks.CELESTE_SIGN.get(), block -> createSingleItemTable(ModItems.CELESTE_SIGN.get()));
        this.add(ModBlocks.CELESTE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.CELESTE_SIGN.get()));

        this.add(ModBlocks.CLOVER_SIGN.get(), block -> createSingleItemTable(ModItems.CLOVER_SIGN.get()));
        this.add(ModBlocks.CLOVER_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.CLOVER_SIGN.get()));

        this.add(ModBlocks.BEE_SIGN.get(), block -> createSingleItemTable(ModItems.BEE_SIGN.get()));
        this.add(ModBlocks.BEE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BEE_SIGN.get()));

        this.add(ModBlocks.OSIAN_SIGN.get(), block -> createSingleItemTable(ModItems.OSIAN_SIGN.get()));
        this.add(ModBlocks.OSIAN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.OSIAN_SIGN.get()));

        this.add(ModBlocks.AURORA_SIGN.get(), block -> createSingleItemTable(ModItems.AURORA_SIGN.get()));
        this.add(ModBlocks.AURORA_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.AURORA_SIGN.get()));
        
        this.add(ModBlocks.BEACH_SIGN.get(), block -> createSingleItemTable(ModItems.BEACH_SIGN.get()));
        this.add(ModBlocks.BEACH_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BEACH_SIGN.get()));
        
        this.add(ModBlocks.BLACK_SIGN.get(), block -> createSingleItemTable(ModItems.BLACK_SIGN.get()));
        this.add(ModBlocks.BLACK_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BLACK_SIGN.get()));
        
        this.add(ModBlocks.BLUE_SIGN.get(), block -> createSingleItemTable(ModItems.BLUE_SIGN.get()));
        this.add(ModBlocks.BLUE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BLUE_SIGN.get()));
        
        this.add(ModBlocks.BROWN_SIGN.get(), block -> createSingleItemTable(ModItems.BROWN_SIGN.get()));
        this.add(ModBlocks.BROWN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BROWN_SIGN.get()));
        
        this.add(ModBlocks.BUBBLEGUM_SIGN.get(), block -> createSingleItemTable(ModItems.BUBBLEGUM_SIGN.get()));
        this.add(ModBlocks.BUBBLEGUM_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BUBBLEGUM_SIGN.get()));
        
        this.add(ModBlocks.CHOCOLATE_SIGN.get(), block -> createSingleItemTable(ModItems.CHOCOLATE_SIGN.get()));
        this.add(ModBlocks.CHOCOLATE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.CHOCOLATE_SIGN.get()));
        
        this.add(ModBlocks.CYAN_SIGN.get(), block -> createSingleItemTable(ModItems.CYAN_SIGN.get()));
        this.add(ModBlocks.CYAN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.CYAN_SIGN.get()));
        
        this.add(ModBlocks.DARKCHOCOLATE_SIGN.get(), block -> createSingleItemTable(ModItems.DARKCHOCOLATE_SIGN.get()));
        this.add(ModBlocks.DARKCHOCOLATE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.DARKCHOCOLATE_SIGN.get()));
        
        this.add(ModBlocks.DARKGREY_SIGN.get(), block -> createSingleItemTable(ModItems.DARKGREY_SIGN.get()));
        this.add(ModBlocks.DARKGREY_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.DARKGREY_SIGN.get()));
        
        this.add(ModBlocks.DEEPSEA_SIGN.get(), block -> createSingleItemTable(ModItems.DEEPSEA_SIGN.get()));
        this.add(ModBlocks.DEEPSEA_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.DEEPSEA_SIGN.get()));
        
        this.add(ModBlocks.GREEN_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_SIGN.get()));
        this.add(ModBlocks.GREEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_SIGN.get()));
        
        this.add(ModBlocks.GREY_SIGN.get(), block -> createSingleItemTable(ModItems.GREY_SIGN.get()));
        this.add(ModBlocks.GREY_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.GREY_SIGN.get()));
        
        this.add(ModBlocks.ICE_SIGN.get(), block -> createSingleItemTable(ModItems.ICE_SIGN.get()));
        this.add(ModBlocks.ICE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.ICE_SIGN.get()));
        
        this.add(ModBlocks.INDIGO_SIGN.get(), block -> createSingleItemTable(ModItems.INDIGO_SIGN.get()));
        this.add(ModBlocks.INDIGO_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.INDIGO_SIGN.get()));
        
        this.add(ModBlocks.LIGHTBLUE_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHTBLUE_SIGN.get()));
        this.add(ModBlocks.LIGHTBLUE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.LIGHTBLUE_SIGN.get()));
        
        this.add(ModBlocks.LIME_SIGN.get(), block -> createSingleItemTable(ModItems.LIME_SIGN.get()));
        this.add(ModBlocks.LIME_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.LIME_SIGN.get()));
        
        this.add(ModBlocks.MAGENTA_SIGN.get(), block -> createSingleItemTable(ModItems.MAGENTA_SIGN.get()));
        this.add(ModBlocks.MAGENTA_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.MAGENTA_SIGN.get()));
        
        this.add(ModBlocks.MAROON_SIGN.get(), block -> createSingleItemTable(ModItems.MAROON_SIGN.get()));
        this.add(ModBlocks.MAROON_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.MAROON_SIGN.get()));
        
        this.add(ModBlocks.MIDNIGHT_SIGN.get(), block -> createSingleItemTable(ModItems.MIDNIGHT_SIGN.get()));
        this.add(ModBlocks.MIDNIGHT_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.MIDNIGHT_SIGN.get()));
        
        this.add(ModBlocks.MYSTIC_SIGN.get(), block -> createSingleItemTable(ModItems.MYSTIC_SIGN.get()));
        this.add(ModBlocks.MYSTIC_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.MYSTIC_SIGN.get()));
        
        this.add(ModBlocks.ORANGE_SIGN.get(), block -> createSingleItemTable(ModItems.ORANGE_SIGN.get()));
        this.add(ModBlocks.ORANGE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.ORANGE_SIGN.get()));
        
        this.add(ModBlocks.PASTELGREEN_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELGREEN_SIGN.get()));
        this.add(ModBlocks.PASTELGREEN_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELGREEN_SIGN.get()));
        
        this.add(ModBlocks.PASTELORANGE_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELORANGE_SIGN.get()));
        this.add(ModBlocks.PASTELORANGE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELORANGE_SIGN.get()));
        
        this.add(ModBlocks.PASTELPINK_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELPINK_SIGN.get()));
        this.add(ModBlocks.PASTELPINK_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELPINK_SIGN.get()));
        
        this.add(ModBlocks.PASTELPURPLE_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELPURPLE_SIGN.get()));
        this.add(ModBlocks.PASTELPURPLE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELPURPLE_SIGN.get()));
        
        this.add(ModBlocks.PASTELYELLOW_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELYELLOW_SIGN.get()));
        this.add(ModBlocks.PASTELYELLOW_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PASTELYELLOW_SIGN.get()));
        
        this.add(ModBlocks.PINK_SIGN.get(), block -> createSingleItemTable(ModItems.PINK_SIGN.get()));
        this.add(ModBlocks.PINK_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PINK_SIGN.get()));
        
        this.add(ModBlocks.PURPLE_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_SIGN.get()));
        this.add(ModBlocks.PURPLE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_SIGN.get()));
        
        this.add(ModBlocks.RED_SIGN.get(), block -> createSingleItemTable(ModItems.RED_SIGN.get()));
        this.add(ModBlocks.RED_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.RED_SIGN.get()));
        
        this.add(ModBlocks.RUBYCHOCOLATE_SIGN.get(), block -> createSingleItemTable(ModItems.RUBYCHOCOLATE_SIGN.get()));
        this.add(ModBlocks.RUBYCHOCOLATE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.RUBYCHOCOLATE_SIGN.get()));
        
        this.add(ModBlocks.SEASHELL_SIGN.get(), block -> createSingleItemTable(ModItems.SEASHELL_SIGN.get()));
        this.add(ModBlocks.SEASHELL_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.SEASHELL_SIGN.get()));
        
        this.add(ModBlocks.SUNRISE_SIGN.get(), block -> createSingleItemTable(ModItems.SUNRISE_SIGN.get()));
        this.add(ModBlocks.SUNRISE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.SUNRISE_SIGN.get()));
        
        this.add(ModBlocks.SUNSET_SIGN.get(), block -> createSingleItemTable(ModItems.SUNSET_SIGN.get()));
        this.add(ModBlocks.SUNSET_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.SUNSET_SIGN.get()));
        
        this.add(ModBlocks.SWAMP_SIGN.get(), block -> createSingleItemTable(ModItems.SWAMP_SIGN.get()));
        this.add(ModBlocks.SWAMP_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.SWAMP_SIGN.get()));
        
        this.add(ModBlocks.TWILIGHT_SIGN.get(), block -> createSingleItemTable(ModItems.TWILIGHT_SIGN.get()));
        this.add(ModBlocks.TWILIGHT_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.TWILIGHT_SIGN.get()));
        
        this.add(ModBlocks.WHITE_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_SIGN.get()));
        this.add(ModBlocks.WHITE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_SIGN.get()));
        
        this.add(ModBlocks.WHITECHOCOLATE_SIGN.get(), block -> createSingleItemTable(ModItems.WHITECHOCOLATE_SIGN.get()));
        this.add(ModBlocks.WHITECHOCOLATE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.WHITECHOCOLATE_SIGN.get()));
        
        this.add(ModBlocks.YELLOW_SIGN.get(), block -> createSingleItemTable(ModItems.YELLOW_SIGN.get()));
        this.add(ModBlocks.YELLOW_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.YELLOW_SIGN.get()));
        
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
