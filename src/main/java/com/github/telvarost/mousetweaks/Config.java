package com.github.telvarost.mousetweaks;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.ConfigName;
import net.glasslauncher.mods.api.gcapi.api.GConfig;

public class Config {

    @GConfig(value = "config", visibleName = "MouseTweaks Config")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

        @ConfigName("[Right-Click + Drag] over existing slots")
        public static Boolean RMBTweak = true;

        @ConfigName("[Left-Click + Drag] to pick up items")
        @Comment("Hold [Shift] to [Shift-Click] items instead")
        public static Boolean LMBTweakWithItem = true;

        @ConfigName("Empty-hand [Shift + Left-Click + Drag]")
        @Comment("[Shift-Click] items of any type")
        public static Boolean LMBTweakWithoutItem = true;
    }
}
