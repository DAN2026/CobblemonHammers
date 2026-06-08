package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class IceStoneHammer extends BaseHammer {

    public static final String ID = "ice_stone_hammer";

    public IceStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static IceStoneHammer create() {
        return new IceStoneHammer(
                ToolTiers.ICESTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.ICESTONE_HAMMER,
                                ToolTiers.ICESTONE_HAMMER.getAttackDamage(),
                                ToolTiers.ICESTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}