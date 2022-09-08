package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntitySlime$AISlimeFloat")
public class MixinEntitySlime$AISlimeFloat{

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_855_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_855.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_855.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_855.nextFloat();
			return rand.nextFloat();
		}
	}


}