package net.dan2026.cobblemonhammers.common.items.tools.hammers;

import net.dan2026.cobblemonhammers.common.items.tiers.ToolTiers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class FireStoneHammer extends BaseHammer {

    public static final String ID = "fire_stone_hammer";

    public FireStoneHammer(Tier tier, TagKey<Block> mineableBlocks, Properties properties) {
        super(tier, mineableBlocks, properties);
    }

    public static FireStoneHammer create() {
        return new FireStoneHammer(
                ToolTiers.FIRESTONE_HAMMER,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .rarity(Rarity.EPIC)
                        .attributes(
                        DiggerItem.createAttributes(
                                ToolTiers.FIRESTONE_HAMMER,
                                ToolTiers.FIRESTONE_HAMMER.getAttackDamage(),
                                ToolTiers.FIRESTONE_HAMMER.getAttackSpeed()
                        )
                )
        );
    }
}