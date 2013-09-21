package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Rage implements CommandExecutor {
	private Main plugin;
	public Rage(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("rage") && sender.hasPermission("bukkitmeme.rage")) {
        	String ragem = plugin.getConfig().getString("ragemsg");
    Bukkit.broadcastMessage(ChatColor.RED + "[Rage] " + sender.getName() + " " + ragem);
        }
		return false;
	}
}