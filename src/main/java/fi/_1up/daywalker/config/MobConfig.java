package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

import static fi._1up.daywalker.Daywalker.MAX_CONFIG;
import static fi._1up.daywalker.Daywalker.MIN_CONFIG;

@SuppressWarnings("CanBeFinal")
public class MobConfig {
    @ConfigEntry(
        name = "Monsters spawn below level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer monsterSpawnThresh = 8;

    @ConfigEntry(
        name = "Monsters only spawn on stone",
        multiplayerSynced = true
    )
    public Boolean monstersSpawnOnStone = false;

    @ConfigEntry(
        name = "Animals spawn above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer animalSpawnThresh = 8;

    @ConfigEntry(
        name = "Animals only spawn on grass",
        multiplayerSynced = true
    )
    public Boolean animalsSpawnOnGrass = true;

    @ConfigEntry(
        name = "Spiders are hostile below level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer spiderPassiveThresh = 12;

    @ConfigEntry(
        name = "Undead burn at or above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer undeadBurnThresh = 12;

    @ConfigEntry(
        name = "Creepers burn at or above level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer creeperBurnThresh = 16;
}
