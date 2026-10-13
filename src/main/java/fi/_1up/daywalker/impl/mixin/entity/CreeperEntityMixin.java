package fi._1up.daywalker.impl.mixin.entity;

import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static fi._1up.daywalker.Daywalker.MAX_LIGHT;
import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(CreeperEntity.class)
public class CreeperEntityMixin {
    @Inject(method = "tick", at = @At("HEAD"))
    private void burn(CallbackInfo ci) {
        if (CONFIG.mob.creeperBurnThresh > MAX_LIGHT - 1) return;

        CreeperEntity me = (CreeperEntity) (Object) this;
        World world = me.world;

        if (!world.canMonsterSpawn()) return;

        int x = MathHelper.floor(me.x);
        int y = MathHelper.floor(me.y);
        int z = MathHelper.floor(me.z);

        if (
            world.getLightLevel(x, y, z) > CONFIG.mob.creeperBurnThresh
                && world.hasSkyLight(x, y, z)
                && world.random.nextInt(20) == 0
        ) {
            me.fireTicks = 300;
        }
    }
}
