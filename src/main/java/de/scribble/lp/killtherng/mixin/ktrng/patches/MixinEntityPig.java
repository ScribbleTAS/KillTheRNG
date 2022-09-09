package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityPig.class)
public class MixinEntityPig{

	/**
	* How long the pig boosts when riding it with a carrot on a stick
	*/
	@Redirect(method = "boost()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_pigBoostTime_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.pigBoostTime.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.pigBoostTime.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.pigBoostTime.nextInt(i);
			return rand.nextInt(i);
		}
	}


}