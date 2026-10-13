package fi._1up.daywalker.impl.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MonsterEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;
import static fi._1up.daywalker.impl.LerpHelper.lerpLuminance;

@Mixin(MonsterEntity.class)
public abstract class MonsterEntityMixin {
    @ModifyExpressionValue(method = {
        "tickMovement",
        "getPathfindingFavor"
    }, at = @At(value = "CONSTANT", args = "floatValue=0.5"))
    private float scaleFloatValue(float original) {
        return lerpLuminance(CONFIG.mob.undeadBurnThresh - 0.5f, ((Entity) (Object) this).world);
    }

    @ModifyExpressionValue(method = "canSpawn", at = @At(value = "CONSTANT", args = "intValue=8"))
    private int setSpawnLevel(int original) {
        return CONFIG.mob.monsterSpawnThresh;
    }
}
