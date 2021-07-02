package de.jumpingpxl.fabric.nobob;

import net.fabricmc.api.ModInitializer;
import de.jumpingpxl.fabric.nobob.listener.EndTickListener;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class NoBob implements ModInitializer {

	@Override
	public void onInitialize() {
		ClientTickEvents.END_CLIENT_TICK.register(new EndTickListener());
	}
}
