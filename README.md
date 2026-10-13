![Daywalker Icon](/src/main/resources/assets/daywalker/icon.png)

# Daywalker

Daywalker is a mod for Minecraft Beta 1.7.3 that adds options to control
sunlight, moonlight, blocklight, the spawning and burning of mobs, and light level related block behavior.

## Dependencies

This mod requires the following in order to function:

- [Babric](https://github.com/babric/prism-instance)
- Optionally, to edit the options in-game:
  - [Glass Config API](https://modrinth.com/mod/rFeWTq4G)
  - [Mod Menu Babric](https://modrinth.com/mod/vf3X9pHM)

## Installation

1. Ensure **Babric** is installed for Minecraft Beta 1.7.3.
2. Download the `daywalker-x.x.x.jar` file.
3. Place the `.jar` file into your instance's `mods` directory.
4. Launch the instance.

## Compatibility

Mixes into `World`, `CropBlock`, `IceBlock`, `MushroomPlantBlock`, `PlantBlock`, `SaplingBlock`, `SnowyBlock`, `AnimalEntity`, `CreeperEntity`, `MonsterEntity`, `SpiderEntity`, `ZombieEntity`, `SkeletonEntity`.

Writes to `Block.BLOCKS_LIGHT_LUMINANCE`.

### Known issues

Blocks don't update to reflect their new light values.\
**Solution:** Place or break a block to cause a lighting update. If StationAPI is loaded, restart the game first.
