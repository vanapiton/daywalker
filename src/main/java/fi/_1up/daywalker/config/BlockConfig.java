package fi._1up.daywalker.config;

import net.glasslauncher.mods.gcapi3.api.ConfigCategory;
import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

import static fi._1up.daywalker.Daywalker.MAX_CONFIG;
import static fi._1up.daywalker.Daywalker.MIN_CONFIG;

@SuppressWarnings("CanBeFinal")
public class BlockConfig {
    @ConfigCategory(name = "Redstone", multiplayerSynced = true)
    public RedstoneConfig redstone = new RedstoneConfig();

    @ConfigEntry(
        name = "Lava light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer lava = 15; //Block.BLOCKS_LIGHT_LUMINANCE[Block.LAVA.id];

    @ConfigEntry(
        name = "Fire light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer fire = 15; //Block.BLOCKS_LIGHT_LUMINANCE[Block.FIRE.id];

    @ConfigEntry(
        name = "Glowstone light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer glowstone = 15; //Block.BLOCKS_LIGHT_LUMINANCE[Block.GLOWSTONE.id];

    @ConfigEntry(
        name = "Jack-o'-lantern light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer pumpkin = 15; //Block.BLOCKS_LIGHT_LUMINANCE[Block.JACK_O_LANTERN.id];

    @ConfigEntry(
        name = "Torch light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer torch = 14; //Block.BLOCKS_LIGHT_LUMINANCE[Block.TORCH.id];

    @ConfigEntry(
        name = "Furnace light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer furnace = 13; //Block.BLOCKS_LIGHT_LUMINANCE[Block.LIT_FURNACE.id];

    @ConfigEntry(
        name = "Nether portal light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer portal = 11; //Block.BLOCKS_LIGHT_LUMINANCE[Block.NETHER_PORTAL.id];

    @ConfigEntry(
        name = "Brown mushroom light level",
        minValue = MIN_CONFIG, maxValue = MAX_CONFIG,
        multiplayerSynced = true
    )
    public Integer mushroom = 1; //Block.BLOCKS_LIGHT_LUMINANCE[Block.BROWN_MUSHROOM.id];
}
