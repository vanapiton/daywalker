package fi._1up.daywalker.impl.mixin.block;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.MushroomPlantBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(MushroomPlantBlock.class)
public class MushroomPlantBlockMixin {
    @ModifyExpressionValue(method = "canGrow", at = @At(value = "CONSTANT", args = "intValue=13"))
    private int setGrowLevel(int original) {
        return CONFIG.plant.mushroomGrowThresh + 1;
    }
}
