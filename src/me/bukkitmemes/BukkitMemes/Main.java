package me.bukkitmemes.BukkitMemes;

import me.bukkitmemes.Memes.BMInfo;
import me.bukkitmemes.Memes.Facepalm;
import me.bukkitmemes.Memes.FakeOp;
import me.bukkitmemes.Memes.GoodFight;
import me.bukkitmemes.Memes.Haha;
import me.bukkitmemes.Memes.ILT;
import me.bukkitmemes.Memes.Jk;
import me.bukkitmemes.Memes.Lol;
import me.bukkitmemes.Memes.Odns;
import me.bukkitmemes.Memes.Rage;
import me.bukkitmemes.Memes.RageQuit;
import me.bukkitmemes.Memes.Rofl;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	// Define Command Executors
	private Lol executor;
	private Rage executor1;
	private RageQuit executor2;
	private BMInfo executor3;
	private Facepalm executor4;
	private GoodFight executor5;
	private Haha executor6;
	private ILT executor7;
	private Jk executor8;
	private Rofl executor9;
	private Odns executor10;
	private FakeOp executor11;
	
	
	
	
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
		
		executor5 = new GoodFight(this);
		getCommand("gf").setExecutor(executor5);
		
		executor6 = new Haha(this);
		getCommand("haha").setExecutor(executor6);
		
		executor7 = new ILT(this);
		getCommand("iliketrains").setExecutor(executor7);
		
		executor8 = new Jk(this);
		getCommand("jk").setExecutor(executor8);
		
		executor9 = new Rofl(this);
		getCommand("rofl").setExecutor(executor9);
		
		executor10 = new Odns(this);
		getCommand("odns").setExecutor(executor10);
		
		executor11 = new FakeOp(this);
		getCommand("fakeop").setExecutor(executor11);
		
	}
}
	

		
	
	
	
	
	