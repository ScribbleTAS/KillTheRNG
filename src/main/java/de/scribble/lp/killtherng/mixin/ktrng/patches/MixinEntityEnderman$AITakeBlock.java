package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityEnderman$AITakeBlock")
public class MixinEntityEnderman$AITakeBlock{

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_885_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_885.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_885.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_885.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_886_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_886.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_886.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_886.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_887_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_887.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_887.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_887.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_888_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_888.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_888.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_888.nextDouble();
			return rand.nextDouble();
		}
	}


}