package net.bunten.flatxpprogression;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainEntrypoint implements ModInitializer {

	public static final String MOD_ID = "flat-xp-progression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ProgressionConfig.getOrCreate();
		LOGGER.info(MOD_ID + " loaded");
	}
}