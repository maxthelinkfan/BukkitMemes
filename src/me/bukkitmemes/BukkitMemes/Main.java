package me.bukkitmemes.BukkitMemes;

import me.bukkitmemes.Memes.BMInfo;
import me.bukkitmemes.Memes.Facepalm;
import me.bukkitmemes.Memes.Lol;
import me.bukkitmemes.Memes.Rage;
import me.bukkitmemes.Memes.RageQuit;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	// Define Command Executors
	private Lol executor;
	private Rage executor1;
	private RageQuit executor2;
	private BMInfo executor3;
	private Facepalm executor4;
	
	public void onEnable() {
		getConfig().options().copyDefaults(true);
        saveConfig();
		
		
		executor = new Lol(this);
		getCommand("lol").setExecutor(executor);
		
		executor1 = new Rage(this);
		getCommand("rage").setExecutor(executor1);
		
		executor2 = new RageQuit(this);
		getCommand("ragequit").setExecutor(executor2);
		
		executor3 = new BMInfo(this);
		getCommand("bminfo").setExecutor(executor3);
		
		executor4 = new Facepalm(this);
		getCommand("facepalm").setExecutor(executor4);
		
	}
}
	

		
	
	
	
	
	