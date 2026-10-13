package fi._1up.daywalker.impl.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.SpiderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;
import static fi._1up.daywalker.impl.LerpHelper.lerpLuminance;

@Mixin(SpiderEntity.class)
public class SpiderEntityMixin {
    @ModifyExpressionValue(method = {
        "getTargetInRange",
        "attack"
    }, at = @At(value = "CONSTANT", args = "floatValue=0.5", ordinal = 0))
    private float scaleFloatValue(float original) {
        return lerpLuminance(CONFIG.mob.spiderPassiveThresh - 0.5f, ((Entity) (Object) this).world);
    }
}
