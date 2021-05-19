package net.mpoisv.data.util;

public class StringUtils {
	
	public static String color(String str) {
		return str.replaceAll("&0", "§0")
			.replaceAll("&1", "§1")
			.replaceAll("&2", "§2")
			.replaceAll("&3", "§3")
			.replaceAll("&4", "§4")
			.replaceAll("&5", "§5")
			.replaceAll("&6", "§6")
			.replaceAll("&7", "§7")
			.replaceAll("&8", "§8")
			.replaceAll("&9", "§9")
			.replaceAll("&a", "§a")
			.replaceAll("&b", "§b")
			.replaceAll("&c", "§c")
			.replaceAll("&d", "§d")
			.replaceAll("&e", "§e")
			.replaceAll("&f", "§f")
			.replaceAll("&k", "§k")
			.replaceAll("&l", "§l")
			.replaceAll("&m", "§m")
			.replaceAll("&n", "§n")
			.replaceAll("&o", "§o");
	}
	
	public static String revokeColor(String str) {
		return str.replaceAll("§0", "&0")
			.replaceAll("§1", "&1")
			.replaceAll("§2", "&2")
			.replaceAll("§3", "&3")
			.replaceAll("§4", "&4")
			.replaceAll("§5", "&5")
			.replaceAll("§6", "&6")
			.replaceAll("§7", "&7")
			.replaceAll("§8", "&8")
			.replaceAll("§9", "&9")
			.replaceAll("§a", "&a")
			.replaceAll("§b", "&b")
			.replaceAll("§c", "&c")
			.replaceAll("§d", "&d")
			.replaceAll("§e", "&e")
			.replaceAll("§f", "&f")
			.replaceAll("§k", "&k")
			.replaceAll("§l", "&l")
			.replaceAll("§m", "&m")
			.replaceAll("§n", "&n")
			.replaceAll("§o", "&o");
	}
	
	public static boolean isNumber(String str) {
		try {
			Long.parseLong(str);
			return true;
		}catch(Exception e) {}
		return false;
	}
}
