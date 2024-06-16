package com.pnku.mbv;

import com.pnku.mbv.init.MbvBlockInit;
import com.pnku.mbv.init.MbvItemInit;
import com.pnku.mbv.poi.MbvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class MoreBarrelVariants implements ModInitializer {
    public static final String MODID = "lolmbv";

    @Override
    public void onInitialize() {
        MbvBlockInit.registerBlocks();
        MbvItemInit.registerItems();
        MbvPointOfInterestTypes.init();
    }

    public static Identifier asId(String path) {
        return Identifier.of(MODID, path);
    }
}