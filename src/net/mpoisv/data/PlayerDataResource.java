package net.mpoisv.data;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.mpoisv.data.util.YamlUtils;

public class PlayerDataResource extends JavaPlugin {
	public static PlayerDataResource instance;
	@Override
	public void onEnable() {
		initalize();
	}
	
	private void initalize() {
		instance = this;
		getDataFolder().mkdirs();
		
		Bukkit.getPluginManager().registerEvents(new EventManager(), this);
		
		for(Player player : Bukkit.getOnlinePlayers()) {
			YamlUtils.createFileNotExist(player);
		}
	}
	
	public static YamlUtils getYamlUtils() {
		return null;
	}
}
