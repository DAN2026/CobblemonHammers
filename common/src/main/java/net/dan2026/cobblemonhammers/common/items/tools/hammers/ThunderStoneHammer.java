package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class ThunderStoneHammer extends BaseHammer {

    public static final String ID = "thunder_stone_hammer";

    public ThunderStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static ThunderStoneHammer create() {
        return new ThunderStoneHammer(
                ToolTiers.THUNDERSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.THUNDERSTONE_HAMMER,
                                ToolTiers.THUNDERSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.THUNDERSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}