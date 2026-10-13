package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigCategory;

public class ConfigFields {

    @ConfigCategory(
        name = "Skylight",
        multiplayerSynced = true
    )
    public SkyConfig sky = new SkyConfig();

    @ConfigCategory(
        name = "Blocklight",
        description = "Blocklight options require a game restart when StationAPI is loaded.",
        multiplayerSynced = true
    )
    public BlockConfig block = new BlockConfig();

    @ConfigCategory(
        name = "Mobs",
        multiplayerSynced = true
    )
    public MobConfig mob = new MobConfig();

    @ConfigCategory(
        name = "Plants",
        multiplayerSynced = true
    )
    public PlantConfig plant = new PlantConfig();

    @ConfigCategory(
        name = "Frost",
        multiplayerSynced = true
    )
    public FrostConfig frost = new FrostConfig();
}
