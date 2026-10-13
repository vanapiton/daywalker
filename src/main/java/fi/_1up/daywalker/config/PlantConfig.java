package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

import static fi._1up.daywalker.Daywalker.MAX_CONFIG;
import static fi._1up.daywalker.Daywalker.MIN_CONFIG;

@SuppressWarnings("CanBeFinal")
public class PlantConfig {
    @ConfigEntry(
        name = "Plants break below level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer plantGrowThresh = 8;

    @ConfigEntry(
        name = "Crops grow above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer cropGrowThresh = 8;

    @ConfigEntry(
        name = "Saplings grow above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer saplingGrowThresh = 8;

    @ConfigEntry(
        name = "Mushrooms grow at or below level",
        description = "Mushrooms are not plants, but §oshh§r...",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer mushroomGrowThresh = 12;
}
