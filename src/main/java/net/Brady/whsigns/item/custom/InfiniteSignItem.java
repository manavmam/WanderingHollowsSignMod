package net.Brady.whsigns.item.custom;

import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

public class InfiniteSignItem extends SignItem {
    public InfiniteSignItem(Properties properties, Block sign, Block wallSign) {
        super(properties, sign, wallSign);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        if (player != null && !player.getAbilities().instabuild) {
            ItemStack stack = context.getItemInHand();
            int count = stack.getCount();
            InteractionResult result = super.useOn(context);
            if (result.consumesAction()) {
                stack.setCount(count);
            }
            return result;
        }
        return super.useOn(context);
    }
}
