package me.biquaternions.chlorophyll;

import net.j4c0b3y.api.config.ConfigHandler;
import net.j4c0b3y.api.config.StaticConfig;
import java.io.File;

@StaticConfig.Header({
    "",
    "Chlorophyll Configuration \uD83D\uDC1F",
    "This project restores vanilla behavior, including all its exploits, here be dragons~",
    "",
    "Configurations marked with:",
    " \uD83D\uDD25 Support hot reload with /chlorophyll reload",
    " \uD83D\uDD03 Require a server restart to apply",
    " ⚠️ Preferably use a clean new world unless you know how to properly adapt your current one",
    ""
})
public class ChlorophyllConfig extends StaticConfig {

    @Ignore
    public static final ConfigHandler HANDLER = new ConfigHandler();

    @Ignore
    public static ChlorophyllConfig INSTANCE;

    public ChlorophyllConfig() {
        super(new File("chlorophyll.yml"), HANDLER);
        INSTANCE = this;

        String configs = System.getProperty("spark.serverconfigs.extra", "");
        System.setProperty("spark.serverconfigs.extra", configs.isBlank() ? "chlorophyll.yml" : configs + ",chlorophyll.yml");

    }

    @Priority(1)
    @SuppressWarnings("unused")
    public static class INFO {
        public static String VERSION = "1.0";
    }

    @Priority(1)
    public static class TOGGLES {

        public static class PUFFERFISH {

            public static boolean PROJECTILE_CHUNK_LOADING_OPTIMIZATION = false;

            public static boolean BLOCK_GOAL_CHUNK_LOADING_OPTIMIZATION = false;

        }

        public static class PAPER {

            public static boolean VILLAGER_VOID_TRADING_FIX = false;

            public static boolean SPIGOT_ENTITY_TRACKING = false;

            public static boolean SHARED_ENTITY_RANDOM = false;

            public static boolean PREVENT_LEVEL_CONSTRUCTOR_RANDOM = false;

            public static boolean BREAK_REDSTONE_ON_TRAPDOOR_EARLY = false;

        }

    }

    @Override
    public void afterLoad() {
        if (initialized) init();
        else {
            // Configs
        }
    }

    @Ignore
    private static boolean initialized = false;
    public static void init() {
        initialized = true;
    }

}
