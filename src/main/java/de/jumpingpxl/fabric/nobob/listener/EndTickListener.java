package de.jumpingpxl.fabric.nobob.listener;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

import java.util.Objects;

public class EndTickListener implements ClientTickEvents.EndTick {

	@Override
	public void onEndTick(MinecraftClient minecraft) {
		if(Objects.nonNull(minecraft.player)) {
			minecraft.player.horizontalSpeed = 0.0F;
		}
	}
}
