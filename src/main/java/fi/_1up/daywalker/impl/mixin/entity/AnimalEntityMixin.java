package fi._1up.daywalker.impl.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.AnimalEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(AnimalEntity.class)
public class AnimalEntityMixin {
    @ModifyExpressionValue(method = "canSpawn", at = @At(value = "CONSTANT", args = "intValue=8"))
    private int setSpawnLevel(int original) {
        return CONFIG.mob.animalSpawnThresh;
    }

    @ModifyExpressionValue(method = "canSpawn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getBlockId(III)I"))
    private int bypassGrassCheck(int original) {
        return CONFIG.mob.animalsSpawnOnGrass ? original : Block.GRASS_BLOCK.id;
    }
}
