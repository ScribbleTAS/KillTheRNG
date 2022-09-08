package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockNewLeaf.class)
public class MixinBlockNewLeaf{

	/**
	* null
	*/
	@Redirect(method = "dropApple(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_530_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_530.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_530.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_530.nextInt(i);
			return rand.nextInt(i);
		}
	}


}