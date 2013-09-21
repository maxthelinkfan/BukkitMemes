package me.bukkitmemes.BukkitMemes;

import me.bukkitmemes.Memes.Lol;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	// Define Command Executors
	private Lol executor;	
	
	public void onEnable() {
		getConfig().options().copyDefaults(true);
        saveConfig();
		
		
		executor = new Lol(this);
		getCommand("lol").setExecutor(executor);
	}
}
	

		
	
	
	
	
	