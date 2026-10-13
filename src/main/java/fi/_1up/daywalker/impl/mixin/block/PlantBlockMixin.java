package fi._1up.daywalker.impl.mixin.block;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.PlantBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(PlantBlock.class)
public class PlantBlockMixin {
    @ModifyExpressionValue(method = "canGrow", at = @At(value = "CONSTANT", args = "intValue=8"))
    private int setGrowLevel(int original) {
        return CONFIG.plant.plantGrowThresh;
    }
}
