package net.Brady.whsigns.block.custom;
import net.Brady.whsigns.block.entity.ModSignBlockEntity;
import net.Brady.whsigns.util.ModWoodTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class ModStandingSignBlock extends StandingSignBlock implements ModSignInterface {
    private final net.minecraft.world.level.block.state.properties.WoodType type;

    public ModStandingSignBlock(Properties properties, net.minecraft.world.level.block.state.properties.WoodType type) {
        super(properties, type);
        this.type = type;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ModSignBlockEntity(pos, state);
    }

    public net.minecraft.world.level.block.state.properties.WoodType type() {
        return this.type;
    }

    // Indicates that our special signs should force white by default.
    @Override
    public boolean hasWhiteText() {
        return type == ModWoodTypes.OSIAN || type == ModWoodTypes.CLOVER || type == ModWoodTypes.DAPLIN || type == ModWoodTypes.DARKCHOCOLATE || type == ModWoodTypes.INDIGO || type == ModWoodTypes.MAROON || type == ModWoodTypes.MIDNIGHT || type == ModWoodTypes.SUNSET || type == ModWoodTypes.SWAMP || type == ModWoodTypes.TWILIGHT || type == ModWoodTypes.BLACK || type == ModWoodTypes.BLUE || type == ModWoodTypes.PURPLE || type == ModWoodTypes.GREEN;
    }

    // Detect right-click with a DyeItem (or glow ink sac, which is treated as a dye)
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack held = player.getItemInHand(hand);
        if (held.getItem() instanceof DyeItem) {
            if (!level.isClientSide()) {
                BlockEntity be = level.getBlockEntity(pos);
                if (be instanceof ModSignBlockEntity signEntity) {
                    DyeColor dye = ((DyeItem) held.getItem()).getDyeColor();
                    // Apply the dye color to the sign – this should fully override white.
                    signEntity.applyDye(dye);
                    if (!player.getAbilities().instabuild) {
                        held.shrink(1);
                    }
                }
            }
            return InteractionResult.SUCCESS;
        }
        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof SignBlockEntity signEntity && this.hasWhiteText()) {
            signEntity.updateText((signText) -> signText.setColor(DyeColor.WHITE), true);
        }
    }
}