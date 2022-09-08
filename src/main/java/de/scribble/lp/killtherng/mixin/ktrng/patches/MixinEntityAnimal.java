package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityAnimal.class)
public class MixinEntityAnimal{

	/**
	* Xp amount from animals after breeding
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_animalXpDropAmount_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalXpDropAmount.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalXpDropAmount.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalXpDropAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_animalHeartParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_animalHeartParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_animalHeartParticle_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_animalHeartParticle_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_animalHeartParticle_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_animalHeartParticle_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}