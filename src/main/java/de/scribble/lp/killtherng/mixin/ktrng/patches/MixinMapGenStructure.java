package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenStructure.class)
public class MixinMapGenStructure{

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_posRotStructure_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_posRotStructure_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_posRotStructure_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_posRotStructure_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_posRotStructure_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_posRotStructure_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of search for nearest structure
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	private static int redirect_posRotStructure_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStructure.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* WHY IS THIS HEEEEERRRREEEEE ITS SO FUCKING USELESS AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_pointlessness_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.pointlessness.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.pointlessness.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.pointlessness.nextInt();
			return rand.nextInt();
		}
	}


}