package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityWitch.class)
public class MixinEntityWitch{

	/**
	* If the witch should consider throwing a weakness potion
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_witchWeaknessPotion_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchWeaknessPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the witch should consider throwing a weakness potion
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_witchWeaknessPotion_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchWeaknessPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_witchDrinkPotion_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_witchDrinkPotion_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_witchDrinkPotion_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_witchDrinkPotion_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_witchDrinkPotion_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_witchDrinkPotion_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.witchDrinkPotion.nextFloat();
			return rand.nextFloat();
		}
	}


}