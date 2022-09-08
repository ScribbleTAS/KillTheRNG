package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockDeadBush.class)
public class MixinBlockDeadBush{

	/**
	* Quantity of dead bush drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_deadBushDrop_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}


}