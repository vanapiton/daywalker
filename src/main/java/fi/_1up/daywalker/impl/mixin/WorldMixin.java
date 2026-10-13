package fi._1up.daywalker.impl.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static fi._1up.daywalker.Daywalker.MAX_LIGHT;
import static fi._1up.daywalker.config.RootConfig.CONFIG;
import static fi._1up.daywalker.impl.LerpHelper.lerp;

@Mixin(World.class)
public class WorldMixin {
    @Inject(method = "getAmbientDarkness", at = @At(value = "RETURN"), cancellable = true)
    private void setAmbientDarkness(float partialTicks, CallbackInfoReturnable<Integer> cir, @Local(name = "var3") float fraction) {
        cir.setReturnValue(Math.round(MAX_LIGHT - lerp(CONFIG.sky.sunlight, CONFIG.sky.moonlight, fraction)));
    }

    @ModifyExpressionValue(method = "canMonsterSpawn", at = @At(value = "CONSTANT", args = "intValue=4"))
    private int setUndeadBurnLevel(int original) {
        return MAX_LIGHT - CONFIG.mob.undeadBurnThresh;
    }
}
