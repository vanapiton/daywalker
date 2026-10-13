package fi._1up.daywalker.impl;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static fi._1up.daywalker.Daywalker.LOGGER;
import static fi._1up.daywalker.config.RootConfig.CONFIG;

public class BlockLightRegistry {
    private static final Map<Integer, Supplier<@NotNull Integer>> REGISTRY = new HashMap<>();

    static {
        REGISTRY.put(Block.LIT_REDSTONE_ORE.id, () -> CONFIG.block.redstone.ore);
        REGISTRY.put(Block.POWERED_REPEATER.id, () -> CONFIG.block.redstone.repeater);
        REGISTRY.put(Block.LIT_REDSTONE_TORCH.id, () -> CONFIG.block.redstone.torch);

        REGISTRY.put(Block.LAVA.id, () -> CONFIG.block.lava);
        REGISTRY.put(Block.FIRE.id, () -> CONFIG.block.fire);
        REGISTRY.put(Block.GLOWSTONE.id, () -> CONFIG.block.glowstone);
        REGISTRY.put(Block.JACK_O_LANTERN.id, () -> CONFIG.block.pumpkin);
        REGISTRY.put(Block.TORCH.id, () -> CONFIG.block.torch);
        REGISTRY.put(Block.LIT_FURNACE.id, () -> CONFIG.block.furnace);
        REGISTRY.put(Block.NETHER_PORTAL.id, () -> CONFIG.block.portal);
        REGISTRY.put(Block.BROWN_MUSHROOM.id, () -> CONFIG.block.mushroom);
    }

    public static void sync() {
        LOGGER.info("Syncing block light registry...");
        boolean isDevEnv = FabricLoader.getInstance().isDevelopmentEnvironment();

        REGISTRY.forEach((id, supplier) -> {
            Integer level = supplier.get();

            if (isDevEnv) {
                LOGGER.info("%s: %d -> %d", Block.BLOCKS[id].getTranslationKey(), Block.BLOCKS_LIGHT_LUMINANCE[id], level);
            }

            Block.BLOCKS_LIGHT_LUMINANCE[id] = level;
        });
    }
}
