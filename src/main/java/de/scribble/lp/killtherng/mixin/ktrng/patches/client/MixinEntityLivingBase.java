package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.EntityLivingBase.class)
public class MixinEntityLivingBase{

	/**
	* Pitch of the death sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entityDeathSound_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityDeathSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityDeathSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityDeathSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the death sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_entityDeathSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityDeathSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityDeathSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityDeathSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the shield break sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_entityShieldBreakSound_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityShieldBreakSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityShieldBreakSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityShieldBreakSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the shield block sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_entityShieldBlockSound_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityShieldBlockSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityShieldBlockSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityShieldBlockSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the thorns hit sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_entityThornsSound_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityThornsSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityThornsSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityThornsSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the thorns hit sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_entityThornsSound_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityThornsSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityThornsSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityThornsSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_entityHurtSound_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityHurtSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityHurtSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityHurtSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_entityHurtSound_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityHurtSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityHurtSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityHurtSound.nextFloat();
			return rand.nextFloat();
		}
	}


}