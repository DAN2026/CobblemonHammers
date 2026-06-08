package net.dan2026.cobblemonhammers.common.events;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.BlockEvent;
import dev.architectury.utils.value.IntValue;
import net.dan2026.cobblemonhammers.common.items.tools.hammers.BaseHammer;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class HammerEvents {

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    public static void register() {
        BlockEvent.BREAK.register(HammerEvents::onBlockBreak);
    }

    private static EventResult onBlockBreak(LevelAccessor level, BlockPos pos, BlockState state, Player player, IntValue xp) {

        if (player.isCrouching()) return EventResult.pass();

        ItemStack mainHandItem = player.getMainHandItem();

        if (mainHandItem.getItem() instanceof BaseHammer hammer && player instanceof ServerPlayer serverPlayer) {

            if (!hammer.isCorrectToolForDrops(mainHandItem, state)) return EventResult.pass();

            if (HARVESTED_BLOCKS.contains(pos)) return EventResult.pass();

            for (BlockPos destroyPos : BaseHammer.getDestroyableBlocks(1, pos, serverPlayer)) {
                if (destroyPos.equals(pos) || !hammer.isCorrectToolForDrops(mainHandItem, level.getBlockState(destroyPos))) {
                    continue;
                }
                HARVESTED_BLOCKS.add(destroyPos);
                serverPlayer.gameMode.destroyBlock(destroyPos);
                HARVESTED_BLOCKS.remove(destroyPos);
            }
        }

        return EventResult.pass();
    }
}