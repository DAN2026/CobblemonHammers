package net.dan2026.cobblemonhammers.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.dan2026.cobblemonhammers.common.CobblemonHammers;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(CobblemonHammers.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> COBBLEMON_HAMMERS_TAB =
            TABS.register(new ResourceLocation(CobblemonHammers.MOD_ID, "cobblemon_hammers_tab"), () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.cobblemonhammers.cobble_hammers_tab"))
                    .icon(() -> new ItemStack(ItemRegistry.DUSK_STONE_HAMMER.get()))
                    .displayItems((params, output) -> {
                        output.accept(ItemRegistry.FIRE_STONE_HAMMER.get());
                        output.accept(ItemRegistry.WATER_STONE_HAMMER.get());
                        output.accept(ItemRegistry.LEAF_STONE_HAMMER.get());
                        output.accept(ItemRegistry.ICE_STONE_HAMMER.get());
                        output.accept(ItemRegistry.THUNDER_STONE_HAMMER.get());
                        output.accept(ItemRegistry.MOON_STONE_HAMMER.get());
                        output.accept(ItemRegistry.SUN_STONE_HAMMER.get());
                        output.accept(ItemRegistry.SHINY_STONE_HAMMER.get());
                        output.accept(ItemRegistry.DUSK_STONE_HAMMER.get());
                        output.accept(ItemRegistry.DAWN_STONE_HAMMER.get());
                    })
                    .build()
            );

    public static void register() {
        TABS.register();
    }
}