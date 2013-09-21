package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RageQuit implements CommandExecutor {
	private Main plugin;
	public RageQuit(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("ragequit") && sender.hasPermission("bukkitmeme.ragequit")) {
        	//Define Variables
        	Player p = (Player) sender;
       
        	// Get String in Config
        	String rageqbroad = plugin.getConfig().getString("ragequitbroadcastmsg");
        	String rageq = plugin.getConfig().getString("ragequitkickmsg");
        	
        	// Broadcast Message
    Bukkit.broadcastMessage(ChatColor.RED + "[Ragequit] " + sender.getName() + " " + rageqbroad);
    
    // Kick Player (only for Ragequit)
    p.kickPlayer(ChatColor.RED + " " + rageq);
        }
		return false;
	}
}