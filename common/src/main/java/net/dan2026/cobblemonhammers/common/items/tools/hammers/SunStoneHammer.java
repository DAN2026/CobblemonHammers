package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class SunStoneHammer extends BaseHammer {

    public static final String ID = "sun_stone_hammer";

    public SunStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static SunStoneHammer create() {
        return new SunStoneHammer(
                ToolTiers.SUNSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.SUNSTONE_HAMMER,
                                ToolTiers.SUNSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.SUNSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}