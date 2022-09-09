package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleDragonBreath.class)
public class MixinParticleDragonBreath{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1455_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1455.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1455.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1455.nextFloat();
			return rand.nextFloat();
		}
	}


}