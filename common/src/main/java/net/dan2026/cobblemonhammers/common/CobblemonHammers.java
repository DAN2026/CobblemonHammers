package net.dan2026.cobblemonhammers.common;

import net.dan2026.cobblemonhammers.common.registry.CreativeTabRegistry;
import net.dan2026.cobblemonhammers.common.registry.ItemRegistry;
import net.dan2026.cobblemonhammers.common.events.HammerEvents;

public final class CobblemonHammers {

    public static final String MOD_ID = "cobblemonhammers";

    public static void register() {
        ItemRegistry.register();
        CreativeTabRegistry.register();
        HammerEvents.register();
    }
}