package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockChorusFlower.class)
public class MixinBlockChorusFlower{

	/**
	* Random direction a chorus flower grows
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_chorusGrow_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrow.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrow.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrow.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random direction a chorus flower grows
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_chorusGrowDirection_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowDirection.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowDirection.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowDirection.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* WHY IS THIS HEEEEERRRREEEEE ITS SO FUCKING USELESS AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_pointlessness_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.pointlessness.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.pointlessness.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.pointlessness.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for chorus fruit to grow in height
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_chorusGrowHeight_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowHeight.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowHeight.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Something about chorus growing
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_chorusGrowSomething_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowSomething.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowSomething.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.chorusGrowSomething.nextInt(i);
			return rand.nextInt(i);
		}
	}


}