package fi._1up.daywalker.impl;

import net.minecraft.world.World;

import static fi._1up.daywalker.Daywalker.MAX_LIGHT;
import static fi._1up.daywalker.Daywalker.MIN_LIGHT;

public class LerpHelper {
    public static float lerpLuminance(float ll, World world) {
        float[] lut = world.dimension.lightLevelToLuminance;

        if (ll <= MIN_LIGHT) return lut[0];
        if (ll >= MAX_LIGHT) return lut[lut.length - 1];

        int i = (int) ll;
        return lerp(lut[i], lut[i + 1], ll - i);
    }

    public static float lerp(float a, float b, float t) {
        return a + t * (b - a);
    }
}
