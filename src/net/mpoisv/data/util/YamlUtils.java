package net.mpoisv.data.util;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import net.mpoisv.data.PlayerDataResource;

public class YamlUtils {
	public static boolean createFileNotExist(Player player) {
		File file = new File(PlayerDataResource.instance.getDataFolder(), player.getUniqueId().toString()+".yml");
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(Exception e) {
				return false;
			}
		}
		
		return true;
	}
	
	public static YamlConfiguration getYamlConfiguration(Player player) {
		File file = new File(PlayerDataResource.instance.getDataFolder(), player.getUniqueId().toString()+".yml");
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch(Exception e) {
				return null;
			}
		}
		
		return YamlConfiguration.loadConfiguration(file);
	}
	
	public static boolean saveYamlConfiguration(Player player, YamlConfiguration yml) {
		File file = new File(PlayerDataResource.instance.getDataFolder(), player.getUniqueId().toString()+".yml");
		try {
			yml.save(file);
		}catch(Exception e) {
			return false;
		}
		
		return true;
	}
}
