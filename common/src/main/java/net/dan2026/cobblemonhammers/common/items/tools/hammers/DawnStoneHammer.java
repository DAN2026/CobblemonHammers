package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class DawnStoneHammer extends BaseHammer {

    public static final String ID = "dawn_stone_hammer";

    public DawnStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static DawnStoneHammer create() {
        return new DawnStoneHammer(
                ToolTiers.DAWNSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.DAWNSTONE_HAMMER,
                                ToolTiers.DAWNSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.DAWNSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}