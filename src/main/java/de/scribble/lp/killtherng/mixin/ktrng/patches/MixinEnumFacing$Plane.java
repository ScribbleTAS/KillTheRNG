package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.util.EnumFacing.Plane.class)
public class MixinEnumFacing$Plane{

	/**
	* A random plane direction
	*/
	@Redirect(method = "random(Ljava/util/Random;)Lnet/minecraft/util/EnumFacing;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_randomFacingPlane_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.randomFacingPlane.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.randomFacingPlane.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.randomFacingPlane.nextInt(i);
			return rand.nextInt(i);
		}
	}


}