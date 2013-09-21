package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Facepalm implements CommandExecutor {
	private Main plugin;
	public Facepalm(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("facepalm") && sender.hasPermission("bukkitmeme.facepalm")) {
        	String facepalm = plugin.getConfig().getString("facepalmmsg");
    Bukkit.broadcastMessage(ChatColor.DARK_AQUA + "[Facepalm] " + sender.getName() + " " + facepalm);
        }
		return false;
	}
}