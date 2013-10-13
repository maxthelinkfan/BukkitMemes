package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Rofl implements CommandExecutor {
	private Main plugin;
	public Rofl(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("rofl") && sender.hasPermission("bukkitmeme.rofl")) {
        	String rofl = plugin.getConfig().getString("roflmsg");
    Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "[Rofl] " + sender.getName() + " " + rofl);
        }
		return false;
	}
}