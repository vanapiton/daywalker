package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

import static fi._1up.daywalker.Daywalker.MAX_CONFIG;
import static fi._1up.daywalker.Daywalker.MIN_CONFIG;

public class SkyConfig {
    @ConfigEntry(
        name = "Sunlight level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer sunlight = 15;

    @ConfigEntry(
        name = "Moonlight level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer moonlight = 4;
}
