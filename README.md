# Auto Plugin Download in Server
```java
	@Override
	public void onEnable() {
		if(Bukkit.getPluginManager().getPlugin("PlayerDataResource") == null) {
			File playerDataResourceJar = updatePlayerDataResource();
			if(playerDataResourceJar == null) {
				Bukkit.getConsoleSender().sendMessage("§cPlayerDataResource Cant load.");
				Bukkit.getPluginManager().disablePlugin(this);
			}else {
				try {
					Plugin plugin = Bukkit.getPluginManager().loadPlugin(playerDataResourceJar);
					plugin.onLoad();
					Bukkit.getPluginManager().enablePlugin(plugin);
				}catch(Exception e) {
					Bukkit.getConsoleSender().sendMessage("§cPlayerDataResource Cant load.");
					Bukkit.getPluginManager().disablePlugin(this);
				}
			}
		}
	}

	public static File updatePlayerDataResource() {
		File playerDataResourceJar = new File("plugins/PlayerDataResource.jar");
		if(Bukkit.getPluginManager().getPlugin("PlayerDataResource") != null) {
			Bukkit.getPluginManager().disablePlugin(Bukkit.getPluginManager().getPlugin("PlayerDataResource"));
		}
		
		if(!playerDataResourceJar.exists()) {
			try {
				playerDataResourceJar.createNewFile();
			}catch(Exception e) {
				return null;
			}
		}
		
		try {
			URL url = new URL("https://github.com/skyneton/Minecraft_PlayerDataResource/releases/latest/download/PlayerDataResource.jar");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			InputStream input = conn.getInputStream();
			Files.copy(input, playerDataResourceJar.toPath(), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return playerDataResourceJar;
	}
```

# plugin.yml
```softdepend: [PlayerDataResource]```

# How To Use
```java
YamlUtils.getYamlConfiguration(Player or String uuid); //Get YamlConfiguration from player
//or
PlayerDataResource.getYamlUtils().getYamlConfiguration(Player or String uuid);
```
## if ∧ is null
```java
YamlUtils.createFileNotExist(Player or String uuid); //Create File plugin/PlayerDataResource/uid.yml
//or
PlayerDataResource.getYamlUtils().createFileNotExist(Player or String uuid);
// (result false = error, true = success)
// when player connect auto create - default
```
## Save
```java
YamlUtils.saveYamlConfiguration(Player or String uuid, YamlConfiguration yml); //Save Yaml
//or
PlayerDataResource.getYamlUtils().saveYamlConfiguration(Player or String uuid, YamlConfiguration yml);
// (result false = error, true = success)
```
