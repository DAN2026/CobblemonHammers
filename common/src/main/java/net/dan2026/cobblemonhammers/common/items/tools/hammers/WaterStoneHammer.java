package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class WaterStoneHammer extends BaseHammer {

    public static final String ID = "water_stone_hammer";

    public WaterStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static WaterStoneHammer create() {
        return new WaterStoneHammer(
                ToolTiers.WATERSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.WATERSTONE_HAMMER,
                                ToolTiers.WATERSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.WATERSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}