package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.TileEntityShulkerBox.class)
public class MixinTileEntityShulkerBox{

	/**
	* null
	*/
	@Redirect(method = "closeInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_563_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_563.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_563.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_563.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "openInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_562_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_562.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_562.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_562.nextFloat();
			return rand.nextFloat();
		}
	}


}