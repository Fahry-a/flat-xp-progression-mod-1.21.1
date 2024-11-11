package net.bunten.flatxpprogression.mixin;

import net.bunten.flatxpprogression.ProgressionConfig;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

	@Inject(at = @At("HEAD"), method = "getNextLevelExperience", cancellable = true)
	private void getNextLevelExperience(CallbackInfoReturnable<Integer> info) {
		if (!ProgressionConfig.getOrCreate().DISABLE_MOD) {
			info.setReturnValue(ProgressionConfig.getOrCreate().XP_PER_LEVEL);
		}
	}
}