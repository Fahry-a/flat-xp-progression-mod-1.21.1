package net.bunten.flatxpprogression;

import java.util.Objects;

import static net.bunten.flatxpprogression.MainEntrypoint.MOD_ID;

public class ProgressionConfig {

    public SimpleConfig CONFIG = SimpleConfig.of( MOD_ID ).provider( this::provider ).request();

    public String provider(String filename) {
        return """
                # Config for Flat XP Progression
                
                # The amount of XP necessary to level up.
                # (Default: 50)
                xpPerLevel=50
                
                # (Default: false)
                disableMod=false
                """;
    }

    public final int XP_PER_LEVEL = CONFIG.getOrDefault( "xpPerLevel", 50 );
    public final boolean DISABLE_MOD = CONFIG.getOrDefault( "disableMod", false );

    private static ProgressionConfig config;

    public static ProgressionConfig getOrCreate() {
        return Objects.requireNonNullElseGet(config, () -> config = new ProgressionConfig());
    }
}