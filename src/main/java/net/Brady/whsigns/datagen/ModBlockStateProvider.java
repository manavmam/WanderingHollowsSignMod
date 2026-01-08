package net.Brady.whsigns.datagen;

import net.Brady.whsigns.whsigns;
import net.Brady.whsigns.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, whsigns.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        signBlock(ModBlocks.BEE_SIGN.get(), ModBlocks.BEE_WALL_SIGN.get(),
        blockTexture(ModBlocks.BEE_SIGN.get()));
        signBlock(ModBlocks.BLOSSOM_SIGN.get(), ModBlocks.BLOSSOM_WALL_SIGN.get(),
        blockTexture(ModBlocks.BLOSSOM_SIGN.get()));
        signBlock(ModBlocks.CELESTE_SIGN.get(), ModBlocks.CELESTE_WALL_SIGN.get(),
        blockTexture(ModBlocks.CELESTE_SIGN.get()));
        signBlock(ModBlocks.CLOVER_SIGN.get(), ModBlocks.CLOVER_WALL_SIGN.get(),
        blockTexture(ModBlocks.CLOVER_SIGN.get()));
        signBlock(ModBlocks.DAPLIN_SIGN.get(), ModBlocks.DAPLIN_WALL_SIGN.get(),
        blockTexture(ModBlocks.DAPLIN_SIGN.get()));
        signBlock(ModBlocks.ERICA_SIGN.get(), ModBlocks.ERICA_WALL_SIGN.get(),
        blockTexture(ModBlocks.ERICA_SIGN.get()));
        signBlock(ModBlocks.OSIAN_SIGN.get(), ModBlocks.OSIAN_WALL_SIGN.get(),
        blockTexture(ModBlocks.OSIAN_SIGN.get()));
        signBlock(ModBlocks.AURORA_SIGN.get(), ModBlocks.AURORA_WALL_SIGN.get(),
        blockTexture(ModBlocks.AURORA_SIGN.get()));
        signBlock(ModBlocks.BEACH_SIGN.get(), ModBlocks.BEACH_WALL_SIGN.get(),
        blockTexture(ModBlocks.AURORA_SIGN.get()));
        signBlock(ModBlocks.BLACK_SIGN.get(), ModBlocks.BLACK_WALL_SIGN.get(),
        blockTexture(ModBlocks.BLACK_SIGN.get()));
        signBlock(ModBlocks.BLUE_SIGN.get(), ModBlocks.BLUE_WALL_SIGN.get(),
        blockTexture(ModBlocks.BLUE_SIGN.get()));
        signBlock(ModBlocks.BROWN_SIGN.get(), ModBlocks.BROWN_WALL_SIGN.get(),
        blockTexture(ModBlocks.BROWN_SIGN.get()));
        signBlock(ModBlocks.BUBBLEGUM_SIGN.get(), ModBlocks.BUBBLEGUM_WALL_SIGN.get(),
        blockTexture(ModBlocks.BUBBLEGUM_SIGN.get()));
        signBlock(ModBlocks.CHOCOLATE_SIGN.get(), ModBlocks.CHOCOLATE_WALL_SIGN.get(),
        blockTexture(ModBlocks.CHOCOLATE_SIGN.get()));
        signBlock(ModBlocks.CYAN_SIGN.get(), ModBlocks.CYAN_WALL_SIGN.get(),
        blockTexture(ModBlocks.CYAN_SIGN.get()));
        signBlock(ModBlocks.DARKCHOCOLATE_SIGN.get(), ModBlocks.DARKCHOCOLATE_WALL_SIGN.get(),
        blockTexture(ModBlocks.DARKCHOCOLATE_SIGN.get()));
        signBlock(ModBlocks.DARKGREY_SIGN.get(), ModBlocks.DARKGREY_WALL_SIGN.get(),
        blockTexture(ModBlocks.DARKGREY_SIGN.get()));
        signBlock(ModBlocks.DEEPSEA_SIGN.get(), ModBlocks.DEEPSEA_WALL_SIGN.get(),
        blockTexture(ModBlocks.DEEPSEA_SIGN.get()));
        signBlock(ModBlocks.GREEN_SIGN.get(), ModBlocks.GREEN_WALL_SIGN.get(),
        blockTexture(ModBlocks.GREEN_SIGN.get()));
        signBlock(ModBlocks.GREY_SIGN.get(), ModBlocks.GREY_WALL_SIGN.get(),
        blockTexture(ModBlocks.GREY_SIGN.get()));
        signBlock(ModBlocks.ICE_SIGN.get(), ModBlocks.ICE_WALL_SIGN.get(),
        blockTexture(ModBlocks.ICE_SIGN.get()));
        signBlock(ModBlocks.INDIGO_SIGN.get(), ModBlocks.INDIGO_WALL_SIGN.get(),
        blockTexture(ModBlocks.INDIGO_SIGN.get()));
        signBlock(ModBlocks.LIGHTBLUE_SIGN.get(), ModBlocks.LIGHTBLUE_WALL_SIGN.get(),
        blockTexture(ModBlocks.LIGHTBLUE_SIGN.get()));
        signBlock(ModBlocks.LIME_SIGN.get(), ModBlocks.LIME_WALL_SIGN.get(),
        blockTexture(ModBlocks.LIME_SIGN.get()));
        signBlock(ModBlocks.MAGENTA_SIGN.get(), ModBlocks.MAGENTA_WALL_SIGN.get(),
        blockTexture(ModBlocks.MAGENTA_SIGN.get()));
        signBlock(ModBlocks.MAROON_SIGN.get(), ModBlocks.MAROON_WALL_SIGN.get(),
        blockTexture(ModBlocks.MAROON_SIGN.get()));
        signBlock(ModBlocks.MIDNIGHT_SIGN.get(), ModBlocks.MIDNIGHT_WALL_SIGN.get(),
        blockTexture(ModBlocks.MIDNIGHT_SIGN.get()));
        signBlock(ModBlocks.MYSTIC_SIGN.get(), ModBlocks.MYSTIC_WALL_SIGN.get(),
        blockTexture(ModBlocks.MYSTIC_SIGN.get()));
        signBlock(ModBlocks.ORANGE_SIGN.get(), ModBlocks.ORANGE_WALL_SIGN.get(),
        blockTexture(ModBlocks.ORANGE_SIGN.get()));
        signBlock(ModBlocks.PASTELGREEN_SIGN.get(), ModBlocks.PASTELGREEN_WALL_SIGN.get(),
        blockTexture(ModBlocks.PASTELGREEN_SIGN.get()));
        signBlock(ModBlocks.PASTELPINK_SIGN.get(), ModBlocks.PASTELPINK_WALL_SIGN.get(),
        blockTexture(ModBlocks.PASTELPINK_SIGN.get()));
        signBlock(ModBlocks.PASTELPURPLE_SIGN.get(), ModBlocks.PASTELPURPLE_WALL_SIGN.get(),
        blockTexture(ModBlocks.PASTELPURPLE_SIGN.get()));
        signBlock(ModBlocks.PASTELYELLOW_SIGN.get(), ModBlocks.PASTELYELLOW_WALL_SIGN.get(),
        blockTexture(ModBlocks.PASTELYELLOW_SIGN.get()));
        signBlock(ModBlocks.PINK_SIGN.get(), ModBlocks.PINK_WALL_SIGN.get(),
        blockTexture(ModBlocks.PINK_SIGN.get()));
        signBlock(ModBlocks.PURPLE_SIGN.get(), ModBlocks.PURPLE_WALL_SIGN.get(),
        blockTexture(ModBlocks.PURPLE_SIGN.get()));
        signBlock(ModBlocks.RED_SIGN.get(), ModBlocks.RED_WALL_SIGN.get(),
        blockTexture(ModBlocks.RED_SIGN.get()));
        signBlock(ModBlocks.RUBYCHOCOLATE_SIGN.get(), ModBlocks.RUBYCHOCOLATE_WALL_SIGN.get(),
        blockTexture(ModBlocks.RUBYCHOCOLATE_SIGN.get()));
        signBlock(ModBlocks.SEASHELL_SIGN.get(), ModBlocks.SEASHELL_WALL_SIGN.get(),
        blockTexture(ModBlocks.SEASHELL_SIGN.get()));
        signBlock(ModBlocks.SUNRISE_SIGN.get(), ModBlocks.SUNRISE_WALL_SIGN.get(),
        blockTexture(ModBlocks.SUNRISE_SIGN.get()));
        signBlock(ModBlocks.SUNSET_SIGN.get(), ModBlocks.SUNSET_WALL_SIGN.get(),
        blockTexture(ModBlocks.SUNSET_SIGN.get()));
        signBlock(ModBlocks.SWAMP_SIGN.get(), ModBlocks.SWAMP_WALL_SIGN.get(),
        blockTexture(ModBlocks.SWAMP_SIGN.get()));
        signBlock(ModBlocks.TWILIGHT_SIGN.get(), ModBlocks.TWILIGHT_WALL_SIGN.get(),
        blockTexture(ModBlocks.TWILIGHT_SIGN.get()));
        signBlock(ModBlocks.WHITE_SIGN.get(), ModBlocks.WHITE_WALL_SIGN.get(),
        blockTexture(ModBlocks.WHITE_SIGN.get()));
        signBlock(ModBlocks.WHITECHOCOLATE_SIGN.get(), ModBlocks.WHITECHOCOLATE_WALL_SIGN.get(),
        blockTexture(ModBlocks.WHITECHOCOLATE_SIGN.get()));
        signBlock(ModBlocks.YELLOW_SIGN.get(), ModBlocks.YELLOW_WALL_SIGN.get(),
        blockTexture(ModBlocks.YELLOW_SIGN.get()));        
        
        


    }
    public void signBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        
        simpleBlock(signBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }


    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(whsigns.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
