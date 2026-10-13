package fi._1up.daywalker;

import fi._1up.daywalker.impl.BlockLightRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Daywalker implements ModInitializer {
    public static final int MIN_LIGHT = 0;
    public static final int MAX_LIGHT = 15;
    public static final int MAX_CONFIG = MAX_LIGHT + 1;
    public static final int MIN_CONFIG = MIN_LIGHT - 1;

    public static final Logger LOGGER = LogManager.getFormatterLogger("Daywalker");

    private static boolean initialized = false;

    public static boolean isInitialized() {return initialized;}

    @Override
    public void onInitialize() {
        BlockLightRegistry.sync();
        initialized = true;
    }
}
