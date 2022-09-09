package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneRepeater.class)
public class MixinBlockRedstoneRepeater{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_450_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_450.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_450.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_450.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_451_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_451.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_451.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_451.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_452_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_452.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_452.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_452.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_453_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_453.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_453.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_453.nextBoolean();
			return rand.nextBoolean();
		}
	}


}