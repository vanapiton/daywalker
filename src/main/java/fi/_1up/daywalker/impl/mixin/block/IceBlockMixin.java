package fi._1up.daywalker.impl.mixin.block;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.IceBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static fi._1up.daywalker.config.RootConfig.CONFIG;

@Mixin(IceBlock.class)
public class IceBlockMixin {
    @ModifyExpressionValue(method = "onTick", at = @At(value = "CONSTANT", args = "intValue=11"))
    private int setMeltLevel(int original) {
        return CONFIG.frost.iceMeltThresh - 1;
    }
}
