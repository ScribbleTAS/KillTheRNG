package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockNewLeaf.class)
public class MixinBlockNewLeaf{

	/**
	* Chance of leaves dropping an apple on leaf break
	*/
	@Redirect(method = "dropApple(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_leafNewDropApple_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.leafNewDropApple.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.leafNewDropApple.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.leafNewDropApple.nextInt(i);
			return rand.nextInt(i);
		}
	}


}