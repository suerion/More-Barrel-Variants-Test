package com.pnku.mblv.init;

import com.pnku.mblv.MoreBarrelVariants;
import com.pnku.mblv.block.MoreBarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;
import java.util.List;

public class MblvBlockInit {
    public static final MoreBarrelBlock OAK_BARREL = new MoreBarrelBlock(MapColor.OAK_TAN, "oak");
    public static final MoreBarrelBlock SPRUCE_BARREL = new MoreBarrelBlock(MapColor.SPRUCE_BROWN, "spruce");
    public static final MoreBarrelBlock BIRCH_BARREL = new MoreBarrelBlock(MapColor.PALE_YELLOW, "birch");
    public static final MoreBarrelBlock JUNGLE_BARREL = new MoreBarrelBlock(MapColor.DIRT_BROWN, "jungle");
    public static final MoreBarrelBlock ACACIA_BARREL = new MoreBarrelBlock(MapColor.ORANGE, "acacia");
    public static final MoreBarrelBlock DARK_OAK_BARREL = new MoreBarrelBlock(MapColor.BROWN, "dark_oak");
    public static final MoreBarrelBlock MANGROVE_BARREL = new MoreBarrelBlock(MapColor.RED, "mangrove");
    public static final MoreBarrelBlock CHERRY_BARREL = new MoreBarrelBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.CHERRY_WOOD, "cherry");
    public static final MoreBarrelBlock BAMBOO_BARREL = new MoreBarrelBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD, "bamboo");
    public static final MoreBarrelBlock CRIMSON_BARREL = new MoreBarrelBlock(MapColor.DULL_PINK, BlockSoundGroup.NETHER_WOOD, "crimson");
    public static final MoreBarrelBlock WARPED_BARREL = new MoreBarrelBlock(MapColor.DARK_AQUA, BlockSoundGroup.NETHER_WOOD, "warped");

    public static final List<Block> more_barrel = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_BARREL);
        registerBlock(SPRUCE_BARREL);
        registerBlock(BIRCH_BARREL);
        registerBlock(JUNGLE_BARREL);
        registerBlock(ACACIA_BARREL);
        registerBlock(DARK_OAK_BARREL);
        registerBlock(MANGROVE_BARREL);
        registerBlock(CHERRY_BARREL);
        registerBlock(BAMBOO_BARREL);
        registerBlock(CRIMSON_BARREL);
        registerBlock(WARPED_BARREL);

    }

    private static void registerBlock(MoreBarrelBlock barrel) {
        Registry.register(Registries.BLOCK, MoreBarrelVariants.asId(barrel.barrelType + "_barrel"), barrel);
        more_barrel.add(barrel);
    }
}