package fi._1up.daywalker.impl.mixin.block;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.SnowyBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(SnowyBlock.class)
public class SnowyBlockMixin {
    @ModifyExpressionValue(method = "onTick", at = @At(value = "CONSTANT", args = "intValue=11"))
    private int setMeltLevel(int original) {
        return CONFIG.frost.snowMeltThresh - 1;
    }
}
