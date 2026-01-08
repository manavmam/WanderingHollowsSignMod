package net.Brady.whsigns.block.custom;

import net.minecraft.world.item.DyeColor;

public interface ModSignInterface {
    boolean hasWhiteText();
    default boolean shouldForceWhiteText(DyeColor currentColor) {
        return hasWhiteText() && currentColor == DyeColor.BLACK; // BLACK is the default color
    }
}

