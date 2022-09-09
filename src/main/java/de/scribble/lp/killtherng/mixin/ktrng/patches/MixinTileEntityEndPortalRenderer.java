package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.tileentity.TileEntityEndPortalRenderer.class)
public class MixinTileEntityEndPortalRenderer{

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1468_1(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1468.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1468.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1469_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1469.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1469.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1469.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1470_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1470.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1470.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1470.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1471_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1471.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1471.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1471.nextFloat();
			return rand.nextFloat();
		}
	}


}