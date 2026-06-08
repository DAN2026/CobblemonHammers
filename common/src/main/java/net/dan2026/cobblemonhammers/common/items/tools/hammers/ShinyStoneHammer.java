package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class ShinyStoneHammer extends BaseHammer {

    public static final String ID = "shiny_stone_hammer";

    public ShinyStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static ShinyStoneHammer create() {
        return new ShinyStoneHammer(
                ToolTiers.SHINYSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.SHINYSTONE_HAMMER,
                                ToolTiers.SHINYSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.SHINYSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}