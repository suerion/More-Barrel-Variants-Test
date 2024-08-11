package de.pnku.mblv.block;

import de.pnku.mblv.block.entity.MoreBarrelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class MoreBarrelBlock extends BarrelBlock {
    public final String barrelWoodType;

    public MoreBarrelBlock(MapColor colour, String barrelWoodType) {
        super(Properties.copy(Blocks.BARREL).mapColor(colour));
        this.barrelWoodType = barrelWoodType;
    }

    public MoreBarrelBlock(MapColor colour, SoundType soundType, String barrelWoodType) {
        super(Properties.copy(Blocks.BARREL).mapColor(colour).sound(soundType));
        this.barrelWoodType = barrelWoodType;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MoreBarrelBlockEntity(pos, state);
    }
}