package com.pnku.mblv.block.entity;

import com.pnku.mblv.block.MoreBarrelBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class MoreBarrelBlockEntity extends BarrelBlockEntity {
    public MoreBarrelBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.lolmblv." + getBlock().barrelType + "_barrel");
    }

    public MoreBarrelBlock getBlock() {
        return (MoreBarrelBlock) getCachedState().getBlock();
    }
}