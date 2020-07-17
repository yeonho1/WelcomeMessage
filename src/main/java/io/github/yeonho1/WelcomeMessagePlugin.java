package io.github.yeonho1;

import io.github.yeonho1.event.JoinOLeaveHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class WelcomeMessagePlugin extends JavaPlugin {
    JoinOLeaveHandler joinleaveHandler;

    @Override
    public void onEnable() {
        getLogger().info("WelcomeMessage by yeonho1 enabled");
        joinleaveHandler = new JoinOLeaveHandler();
        getServer().getPluginManager().registerEvents(joinleaveHandler, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("WelcomeMessage by yeonho1 disabled");
    }
}
