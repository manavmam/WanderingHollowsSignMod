package net.Brady.whsigns.datagen;

import net.Brady.whsigns.whsigns;
import net.Brady.whsigns.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, whsigns.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.BAR_BRAWL_MUSIC_DISC);

        simpleItem(ModItems.ERICA_SIGN);
        simpleItem(ModItems.BLOSSOM_SIGN);

        simpleItem(ModItems.CELESTE_SIGN);
        simpleItem(ModItems.DAPLIN_SIGN);
        simpleItem(ModItems.CLOVER_SIGN);
        simpleItem(ModItems.BEE_SIGN);
        simpleItem(ModItems.OSIAN_SIGN);

        simpleItem(ModItems.AURORA_SIGN);
        simpleItem(ModItems.BEACH_SIGN);
        simpleItem(ModItems.BLACK_SIGN);
        simpleItem(ModItems.BLUE_SIGN);
        simpleItem(ModItems.BROWN_SIGN);
        simpleItem(ModItems.BUBBLEGUM_SIGN);
        simpleItem(ModItems.CHOCOLATE_SIGN);
        simpleItem(ModItems.CYAN_SIGN);
        simpleItem(ModItems.DARKCHOCOLATE_SIGN);
        simpleItem(ModItems.DARKGREY_SIGN);
        simpleItem(ModItems.DEEPSEA_SIGN);
        simpleItem(ModItems.GREEN_SIGN);
        simpleItem(ModItems.GREY_SIGN);
        simpleItem(ModItems.ICE_SIGN);
        simpleItem(ModItems.INDIGO_SIGN);
        simpleItem(ModItems.LIGHTBLUE_SIGN);
        simpleItem(ModItems.LIME_SIGN);
        simpleItem(ModItems.MAGENTA_SIGN);
        simpleItem(ModItems.MAROON_SIGN);
        simpleItem(ModItems.MIDNIGHT_SIGN);
        simpleItem(ModItems.MYSTIC_SIGN);
        simpleItem(ModItems.PASTELGREEN_SIGN);
        simpleItem(ModItems.PASTELORANGE_SIGN);
        simpleItem(ModItems.PASTELPINK_SIGN);
        simpleItem(ModItems.PASTELPURPLE_SIGN);
        simpleItem(ModItems.PASTELYELLOW_SIGN);
        simpleItem(ModItems.PINK_SIGN);
        simpleItem(ModItems.PURPLE_SIGN);
        simpleItem(ModItems.RED_SIGN);
        simpleItem(ModItems.RUBYCHOCOLATE_SIGN);
        simpleItem(ModItems.SEASHELL_SIGN);
        simpleItem(ModItems.SUNRISE_SIGN);
        simpleItem(ModItems.SUNSET_SIGN);
        simpleItem(ModItems.SWAMP_SIGN);
        simpleItem(ModItems.TWILIGHT_SIGN);
        simpleItem(ModItems.WHITE_SIGN);
        simpleItem(ModItems.WHITECHOCOLATE_SIGN);
        simpleItem(ModItems.YELLOW_SIGN);
        
        simpleItem(ModItems.DICE);
    }

   



    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(whsigns.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(whsigns.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }


    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(whsigns.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(whsigns.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(whsigns.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(whsigns.MOD_ID,"block/" + item.getId().getPath()));
    }
}
