package io.github.yeonho1.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinOLeaveHandler implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.GOLD + "" + ChatColor.BOLD + event.getPlayer().getDisplayName() + ChatColor.RESET + "님이 들어오셨습니다");
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.GOLD + "" + ChatColor.BOLD + event.getPlayer().getDisplayName() + ChatColor.RESET + "님이 나가셨습니다");
    }
}
