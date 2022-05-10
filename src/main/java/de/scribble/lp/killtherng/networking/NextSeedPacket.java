package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsClient;
import de.scribble.lp.killtherng.URToolsServer;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class NextSeedPacket implements IMessage{

	long seed;
	
	int counter;
	
	public NextSeedPacket() {
		seed=0;
		counter=1;
	}
	
	public NextSeedPacket(long seed) {
		this.seed=seed;
		counter=1;
	}
	
	public NextSeedPacket(int counter) {
		seed=0;
		this.counter=counter;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		seed=buf.readLong();
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
	}
	
	public static class NextSeedPacketHandler implements IMessageHandler<NextSeedPacket, IMessage> {

		@Override
		public IMessage onMessage(NextSeedPacket message, MessageContext ctx) {
			if (ctx.side.isServer()) {
				if (ctx.getServerHandler().player.getUniqueID().equals(KillTheRNG.trackedPlayer.getUniqueID())) {
					long seed=URToolsServer.nextSeed(message.counter);
					KillTheRNG.NETWORK.sendToAll(new NextSeedPacket(seed));
				}
			} else {
				URToolsClient.nextSeedClient(message.seed);
			}
			return null;
		}

	}

}
