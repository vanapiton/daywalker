package fi._1up.daywalker.impl.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;
import static fi._1up.daywalker.impl.LerpHelper.lerpLuminance;

@Mixin({ZombieEntity.class, SkeletonEntity.class})
public class UndeadEntityMixin {
    @ModifyExpressionValue(method = "tickMovement", at = @At(value = "CONSTANT", args = "floatValue=0.5"))
    private float scaleFloatValue(float original) {
        return lerpLuminance(CONFIG.mob.undeadBurnThresh - 0.5f, ((Entity) (Object) this).world);
    }
}
