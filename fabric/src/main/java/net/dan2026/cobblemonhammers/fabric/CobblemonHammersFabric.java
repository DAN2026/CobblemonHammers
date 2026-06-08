package net.dan2026.cobblemonhammers.fabric;

import net.dan2026.cobblemonhammers.common.CobblemonHammers;
import net.fabricmc.api.ModInitializer;

public class CobblemonHammersFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        CobblemonHammers.register();

    }

}
