package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseLandingApproach.class)
public class MixinPhaseLandingApproach{

	/**
	* Random increment in movement while navigating to the next path
	*/
	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseLandingApproachMoveToLocation_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseLandingApproachMoveToLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseLandingApproachMoveToLocation.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseLandingApproachMoveToLocation.nextFloat();
			return rand.nextFloat();
		}
	}


}