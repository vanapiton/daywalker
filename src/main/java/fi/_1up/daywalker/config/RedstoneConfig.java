package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

import static fi._1up.daywalker.Daywalker.MAX_CONFIG;
import static fi._1up.daywalker.Daywalker.MIN_CONFIG;

@SuppressWarnings("CanBeFinal")
public class RedstoneConfig {
    @ConfigEntry(
        name = "Redstone ore light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer ore = 9; //Block.BLOCKS_LIGHT_LUMINANCE[Block.LIT_REDSTONE_ORE.id];

    @ConfigEntry(
        name = "Redstone repeater light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer repeater = 9; //Block.BLOCKS_LIGHT_LUMINANCE[Block.POWERED_REPEATER.id];

    @ConfigEntry(
        name = "Redstone torch light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer torch = 7; //Block.BLOCKS_LIGHT_LUMINANCE[Block.LIT_REDSTONE_TORCH.id];
}
