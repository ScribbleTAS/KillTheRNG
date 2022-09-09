package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureVillagePieces.House4Garden.class)
public class MixinStructureVillagePieces$House4Garden{

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeVillage_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextBoolean();
			return rand.nextBoolean();
		}
	}


}