package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityShulker$AIAttack")
public class MixinEntityShulker$AIAttack{

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_941_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_941.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_941.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_941.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_942_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_942.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_942.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_942.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_943_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_943.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_943.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_943.nextFloat();
			return rand.nextFloat();
		}
	}


}