package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class DuskStoneHammer extends BaseHammer {

    public static final String ID = "dusk_stone_hammer";

    public DuskStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static DuskStoneHammer create() {
        return new DuskStoneHammer(
                ToolTiers.DUSKSTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.DUSKSTONE_HAMMER,
                                ToolTiers.DUSKSTONE_HAMMER.getAttackDamage(),
                                ToolTiers.DUSKSTONE_HAMMER.getAttackSpeed()
                        )

                )
        );
    }
}