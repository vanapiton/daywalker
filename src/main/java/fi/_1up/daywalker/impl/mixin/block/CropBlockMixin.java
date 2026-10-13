package fi._1up.daywalker.impl.mixin.block;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.CropBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(CropBlock.class)
public class CropBlockMixin {
    @ModifyExpressionValue(method = "onTick", at = @At(value = "CONSTANT", args = "intValue=9"))
    private int setGrowLevel(int original) {
        return CONFIG.plant.cropGrowThresh + 1;
    }
}
