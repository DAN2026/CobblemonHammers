package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class LeafStoneHammer extends BaseHammer {

    public static final String ID = "leaf_stone_hammer";

    public LeafStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static LeafStoneHammer create() {
        return new LeafStoneHammer(
                ToolTiers.LEAFSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.LEAFSTONE_HAMMER,
                                ToolTiers.LEAFSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.LEAFSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}