package net.dan2026.cobblemonhammers.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.dan2026.cobblemonhammers.common.CobblemonHammers;
import net.dan2026.cobblemonhammers.common.items.tools.hammers.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(CobblemonHammers.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<FireStoneHammer> FIRE_STONE_HAMMER =
            ITEMS.register(FireStoneHammer.ID, FireStoneHammer::create);
    public static final RegistrySupplier<WaterStoneHammer> WATER_STONE_HAMMER =
            ITEMS.register(WaterStoneHammer.ID, WaterStoneHammer::create);
    public static final RegistrySupplier<LeafStoneHammer> LEAF_STONE_HAMMER =
            ITEMS.register(LeafStoneHammer.ID, LeafStoneHammer::create);
    public static final RegistrySupplier<ThunderStoneHammer> THUNDER_STONE_HAMMER =
            ITEMS.register(ThunderStoneHammer.ID, ThunderStoneHammer::create);
    public static final RegistrySupplier<MoonStoneHammer> MOON_STONE_HAMMER =
            ITEMS.register(MoonStoneHammer.ID, MoonStoneHammer::create);
    public static final RegistrySupplier<SunStoneHammer> SUN_STONE_HAMMER =
            ITEMS.register(SunStoneHammer.ID, SunStoneHammer::create);
    public static final RegistrySupplier<ShinyStoneHammer> SHINY_STONE_HAMMER =
            ITEMS.register(ShinyStoneHammer.ID, ShinyStoneHammer::create);
    public static final RegistrySupplier<DawnStoneHammer> DAWN_STONE_HAMMER =
            ITEMS.register(DawnStoneHammer.ID, DawnStoneHammer::create);
    public static final RegistrySupplier<DuskStoneHammer> DUSK_STONE_HAMMER =
            ITEMS.register(DuskStoneHammer.ID, DuskStoneHammer::create);
    public static final RegistrySupplier<IceStoneHammer> ICE_STONE_HAMMER =
            ITEMS.register(IceStoneHammer.ID, IceStoneHammer::create);

    public static void register() {
        ITEMS.register();
    }
}