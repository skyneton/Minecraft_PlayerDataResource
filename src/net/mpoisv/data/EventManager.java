package net.mpoisv.data;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import net.mpoisv.data.util.YamlUtils;

public class EventManager implements Listener {
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onLogin(PlayerLoginEvent event) {
		YamlUtils.createFileNotExist(event.getPlayer());
	}
}
