package net.dan2026.cobblemonhammers.common.items.tiers;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ToolTiers implements Tier {

    FIRESTONE_HAMMER(1250, 6.0f, 2.0f, 14, BlockTags.INCORRECT_FOR_IRON_TOOL, cobblemon("fire_stone"), 6.0f, -3.2f),
    WATERSTONE_HAMMER(1250, 6.0f, 2.0f, 14, BlockTags.INCORRECT_FOR_IRON_TOOL, cobblemon("water_stone"), 6.0f, -3.2f),
    LEAFSTONE_HAMMER(1250, 6.0f, 2.0f, 14, BlockTags.INCORRECT_FOR_IRON_TOOL, cobblemon("leaf_stone"), 6.0f, -3.2f),
    ICESTONE_HAMMER(1250, 6.0f, 2.0f, 14, BlockTags.INCORRECT_FOR_IRON_TOOL, cobblemon("ice_stone"), 6.0f, -3.2f),
    THUNDERSTONE_HAMMER(1250, 6.0f, 2.0f, 14, BlockTags.INCORRECT_FOR_IRON_TOOL, cobblemon("thunder_stone"), 6.0f, -3.2f),

    MOONSTONE_HAMMER(7805, 7.0f, 2.0f, 10, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, cobblemon("moon_stone"), 6.5f, -3.2f),
    SUNSTONE_HAMMER(7805, 7.0f, 2.0f, 10, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, cobblemon("sun_stone"), 6.5f, -3.2f),
    SHINYSTONE_HAMMER(7805, 7.0f, 2.0f, 10, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, cobblemon("shiny_stone"), 6.5f, -3.2f),

    DUSKSTONE_HAMMER(10155, 8.0f, 2.0f, 15, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, cobblemon("dusk_stone"), 7.0f, -3.2f),
    DAWNSTONE_HAMMER(10155, 8.0f, 2.0f, 15, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, cobblemon("dawn_stone"), 7.0f, -3.2f);

    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final TagKey<Block> incorrectBlocksForDrops;
    private final Supplier<Ingredient> repairIngredient;
    private final float attackDamage;
    private final float attackSpeed;

    ToolTiers(
            int uses,
            float speed,
            float attackDamageBonus,
            int enchantmentValue,
            TagKey<Block> incorrectBlocksForDrops,
            Supplier<Ingredient> repairIngredient,
            float attackDamage,
            float attackSpeed
    ) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.repairIngredient = repairIngredient;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
        return incorrectBlocksForDrops;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    private static Supplier<Ingredient> cobblemon(String stone) {
        return () -> Ingredient.of(BuiltInRegistries.ITEM.get(
                ResourceLocation.fromNamespaceAndPath("cobblemon", stone)
        ));
    }
}