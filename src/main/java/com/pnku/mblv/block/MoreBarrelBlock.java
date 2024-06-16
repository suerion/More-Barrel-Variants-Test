package com.pnku.mblv.block;

import com.pnku.mblv.block.entity.MoreBarrelBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.*;

public class MoreBarrelBlock extends BarrelBlock {
    public DoubleBlockProperties.PropertyRetriever<ChestBlockEntity, Optional<NamedScreenHandlerFactory>> NAME_RETRIEVER;
    public final String barrelType;

    public MoreBarrelBlock(MapColor colour, String barrelType) {
        super(Settings.copy(Blocks.BARREL).mapColor(colour));
        this.barrelType = barrelType;
    }

    public MoreBarrelBlock(MapColor colour, BlockSoundGroup sound, String barrelType) {
        super(Settings.copy(Blocks.BARREL).mapColor(colour).sounds(sound));
        this.barrelType = barrelType;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new MoreBarrelBlockEntity(pos, state);
    }
}