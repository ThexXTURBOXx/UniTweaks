package net.danygames2014.unitweaks;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.ConfigCategory;
import net.glasslauncher.mods.api.gcapi.api.ConfigName;

public class Config {
    public static class GeneralConfig {
        @ConfigName(value = "General Config Value")
        public Integer test2 = 0;
    }

    public static class RecipesConfig {
        @ConfigName("Enable Recipe Tweaks")
        @Comment("Acts as a master switch for all recipe tweaks")
        public Boolean enableRecipes = true;

        @ConfigCategory("Modern")
        public ModernRecipesConfig modern = new ModernRecipesConfig();

        public static class ModernRecipesConfig {
            @ConfigName("Shapeless Flint and Steel")
            public Boolean shapelessFlintAndSteel = true;
        }
    }
}
