package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.WorldServer.class)
public class MixinWorldServer{

	/**
	* Lightning aims for an entity in a radius where it's about to strike. If multiple entities are found this random variable selects the entity
	*/
	@Redirect(method = "adjustPosToNearbyEntity(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningAimForEntity_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lightningAimForEntity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lightningAimForEntity.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lightningAimForEntity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_bonusChestPos_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_bonusChestPos_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_bonusChestPos_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_bonusChestPos_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonusChestPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_spawnPos_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_spawnPos_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_spawnPos_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_spawnPos_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Selects the player where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_checkLightPlayer_10(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPlayer.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPlayer.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPlayer.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position, where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_checkLightPosition_11(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position, where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_checkLightPosition_12(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position, where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_checkLightPosition_13(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.checkLightPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The chance of lightning striking during thunderstorm
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningChance_14(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lightningChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lightningChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lightningChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The chance of skeletonRiders spawn on a lightning strike
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_spawnSkeletonRiders_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnSkeletonRiders.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnSkeletonRiders.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnSkeletonRiders.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* If ice and snow form during snow storm
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_addSnowBlocks_16(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.addSnowBlocks.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.addSnowBlocks.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.addSnowBlocks.nextInt(i);
			return rand.nextInt(i);
		}
	}


}