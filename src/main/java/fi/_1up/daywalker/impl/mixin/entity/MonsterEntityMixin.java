package fi._1up.daywalker.impl.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MonsterEntity;
import net.minecraft.util.math.MathHelper;
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

    @ModifyReturnValue(method = "canSpawn", at = @At("RETURN"))
    private boolean requireStoneBlock(boolean original) {
        if (!CONFIG.mob.monstersSpawnOnStone) return original;
        if (!original) return false;

        MonsterEntity me = (MonsterEntity) (Object) this;

        int x = MathHelper.floor(me.x);
        int y = MathHelper.floor(me.boundingBox.minY + 0.5);
        int z = MathHelper.floor(me.z);

        return me.world.getBlockId(x, y - 1, z) == Block.STONE.id;
    }
}
