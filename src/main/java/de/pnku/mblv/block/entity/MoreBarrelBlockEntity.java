package de.pnku.mblv.block.entity;

import de.pnku.mblv.block.MoreBarrelBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class MoreBarrelBlockEntity extends BarrelBlockEntity {
    public MoreBarrelBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("container.lolmblv." + getBlock().barrelWoodType + "_barrel");
    }

    public MoreBarrelBlock getBlock() {
        return (MoreBarrelBlock) getBlockState().getBlock();
    }
}