package com.pnku.mbv.init;

import com.pnku.mbv.MoreBarrelVariants;
import com.pnku.mbv.block.MoreBarrelBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class MbvItemInit {
    public static final BlockItem OAK_BARREL_I = new BlockItem(MbvBlockInit.OAK_BARREL, new Item.Settings());
    public static final BlockItem SPRUCE_BARREL_I = new BlockItem(MbvBlockInit.SPRUCE_BARREL, new Item.Settings());
    public static final BlockItem BIRCH_BARREL_I = new BlockItem(MbvBlockInit.BIRCH_BARREL, new Item.Settings());
    public static final BlockItem JUNGLE_BARREL_I = new BlockItem(MbvBlockInit.JUNGLE_BARREL, new Item.Settings());
    public static final BlockItem ACACIA_BARREL_I = new BlockItem(MbvBlockInit.ACACIA_BARREL, new Item.Settings());
    public static final BlockItem DARK_OAK_BARREL_I = new BlockItem(MbvBlockInit.DARK_OAK_BARREL, new Item.Settings());
    public static final BlockItem MANGROVE_BARREL_I = new BlockItem(MbvBlockInit.MANGROVE_BARREL, new Item.Settings());
    public static final BlockItem CHERRY_BARREL_I = new BlockItem(MbvBlockInit.CHERRY_BARREL, new Item.Settings());
    public static final BlockItem BAMBOO_BARREL_I = new BlockItem(MbvBlockInit.BAMBOO_BARREL, new Item.Settings());
    public static final BlockItem CRIMSON_BARREL_I = new BlockItem(MbvBlockInit.CRIMSON_BARREL, new Item.Settings());
    public static final BlockItem WARPED_BARREL_I = new BlockItem(MbvBlockInit.WARPED_BARREL, new Item.Settings());


    public static void registerItems() {
        registerItem(OAK_BARREL_I, Items.BARREL);
        registerItem(SPRUCE_BARREL_I, OAK_BARREL_I);
        registerItem(BIRCH_BARREL_I, SPRUCE_BARREL_I);
        registerItem(JUNGLE_BARREL_I, BIRCH_BARREL_I);
        registerItem(ACACIA_BARREL_I, JUNGLE_BARREL_I);
        registerItem(DARK_OAK_BARREL_I, ACACIA_BARREL_I);
        registerItem(MANGROVE_BARREL_I, DARK_OAK_BARREL_I);
        registerItem(CHERRY_BARREL_I, MANGROVE_BARREL_I);
        registerItem(BAMBOO_BARREL_I, CHERRY_BARREL_I);
        registerItem(CRIMSON_BARREL_I, BAMBOO_BARREL_I);
        registerItem(WARPED_BARREL_I, CRIMSON_BARREL_I);
    }

    private static void registerItem(BlockItem barrel, Item barrelAfter) {
        Registry.register(Registries.ITEM, MoreBarrelVariants.asId(((MoreBarrelBlock) barrel.getBlock()).barrelType + "_barrel"), barrel);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.addAfter(barrelAfter, barrel));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(barrelAfter,barrel));
    }
}