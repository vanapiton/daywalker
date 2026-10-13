package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

import static fi._1up.daywalker.Daywalker.MAX_CONFIG;
import static fi._1up.daywalker.Daywalker.MIN_CONFIG;

public class FrostConfig {
    @ConfigEntry(
        name = "Ice melts at or above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer iceMeltThresh = 12;

    @ConfigEntry(
        name = "Snow melts at or above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer snowMeltThresh = 12;
}
