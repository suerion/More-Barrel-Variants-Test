package com.pnku.mblv;

import com.pnku.mblv.init.MblvBlockInit;
import com.pnku.mblv.init.MblvItemInit;
import com.pnku.mblv.poi.MblvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class MoreBarrelVariants implements ModInitializer {
    public static final String MODID = "lolmblv";

    @Override
    public void onInitialize() {
        MblvBlockInit.registerBlocks();
        MblvItemInit.registerItems();
        MblvPointOfInterestTypes.init();
    }

    public static Identifier asId(String path) {
        return new Identifier(MODID, path);
    }
}