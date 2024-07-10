package net.herrobriam.nostructures;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoMoreStructures implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("no-more-structures");

	@Override
	public void onInitialize() {
		LOGGER.info("Removing Non-Essential Structures...");
	}
}