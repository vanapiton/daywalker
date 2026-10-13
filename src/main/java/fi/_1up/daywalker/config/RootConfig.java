package fi._1up.daywalker.config;

import fi._1up.daywalker.Daywalker;
import fi._1up.daywalker.impl.BlockLightRegistry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;
import net.glasslauncher.mods.gcapi3.api.PreConfigSavedListener;
import net.glasslauncher.mods.gcapi3.impl.GlassYamlFile;

@SuppressWarnings("CanBeFinal")
public class RootConfig implements PreConfigSavedListener {
    @ConfigRoot(value = "config", nameKey = "options.daywalker.name", visibleName = "Daywalker Config")
    public static final ConfigFields CONFIG = new ConfigFields();

    @Override
    public void onPreConfigSaved(int source, GlassYamlFile oldValues, GlassYamlFile newValues) {
        if (Daywalker.isInitialized()) BlockLightRegistry.sync();
    }
}
