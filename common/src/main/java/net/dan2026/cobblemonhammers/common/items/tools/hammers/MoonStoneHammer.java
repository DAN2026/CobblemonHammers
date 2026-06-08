package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class MoonStoneHammer extends BaseHammer {

    public static final String ID = "moon_stone_hammer";

    public MoonStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static MoonStoneHammer create() {
        return new MoonStoneHammer(
                ToolTiers.MOONSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.MOONSTONE_HAMMER,
                                ToolTiers.MOONSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.MOONSTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}