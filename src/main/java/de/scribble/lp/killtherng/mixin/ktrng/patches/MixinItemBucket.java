package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemBucket.class)
public class MixinItemBucket{

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_591_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_591.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_591.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_591.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_592_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_592.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_592.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_592.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_23_3() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_23.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_23.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_23.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_24_4() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_24.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_24.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_24.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_25_5() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_25.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_25.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_25.nextDouble();
			return Math.random();
		}
	}


}