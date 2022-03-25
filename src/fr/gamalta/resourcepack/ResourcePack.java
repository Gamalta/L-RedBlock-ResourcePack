package fr.gamalta.resourcepack;

import org.bukkit.plugin.java.JavaPlugin;

import fr.gamalta.lib.config.Configuration;

public class ResourcePack extends JavaPlugin {

	public Configuration settingsCFG = new Configuration(this, "Resource Pack", "Settings");

	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}
}
