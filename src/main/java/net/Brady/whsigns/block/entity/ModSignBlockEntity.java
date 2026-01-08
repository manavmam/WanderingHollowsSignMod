package net.Brady.whsigns.block.entity;
import net.Brady.whsigns.block.custom.ModSignInterface;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.entity.SignText;
import net.minecraft.world.level.block.state.BlockState;
import java.util.function.UnaryOperator;

public class ModSignBlockEntity extends SignBlockEntity {
    private boolean hasBeenDyed = false;

    public ModSignBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOD_SIGN.get(), pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.MOD_SIGN.get();
    }

    @Override
    public boolean updateText(UnaryOperator<SignText> textUpdater, boolean filter) {
        if (hasBeenDyed) {
            return super.updateText(textUpdater, filter);
        }
        if (this.getBlockState().getBlock() instanceof ModSignInterface signInterface && signInterface.hasWhiteText()) {
            return super.updateText(current -> {
                SignText updated = textUpdater.apply(current);
                Component[] newFront = new Component[4];
                Component[] newBack = new Component[4];
                for (int i = 0; i < 4; i++) {
                    newFront[i] = updated.getMessage(i, false)
                            .copy()
                            .withStyle(s -> s.withColor(0xFFFFFF));
                    newBack[i] = updated.getMessage(i, true)
                            .copy()
                            .withStyle(s -> s.withColor(0xFFFFFF));
                }
                return new SignText(newFront, newBack, DyeColor.WHITE, updated.hasGlowingText());
            }, filter);
        }
        return super.updateText(textUpdater, filter);
    }

    // This method is called when a dye (or glow ink sac) is applied by the player.
    public void applyDye(DyeColor dyeColor) {
        hasBeenDyed = true;  // From now on, do not force white.
        boolean updated = super.updateText(text -> {
            // Rebuild text lines so the dye color fully overrides white.
            Component[] newFront = new Component[4];
            Component[] newBack = new Component[4];
            for (int i = 0; i < 4; i++) {
                newFront[i] = text.getMessage(i, false)
                        .copy()
                        .withStyle(s -> s.withColor(dyeColor.getTextColor()));
                newBack[i] = text.getMessage(i, true)
                        .copy()
                        .withStyle(s -> s.withColor(dyeColor.getTextColor()));
            }
            return new SignText(newFront, newBack, dyeColor, text.hasGlowingText());
        }, true);
        if (updated && level != null) {
            // Mark as changed and force a block update so other clients see the new color.
            setChanged();
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
    }
}
