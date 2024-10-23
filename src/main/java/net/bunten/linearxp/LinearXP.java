package net.bunten.linearxp;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinearXP implements ModInitializer {

	public static final String MOD_ID = "linear-xp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID + " loaded");
	}
}