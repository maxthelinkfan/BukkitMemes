package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Lol implements CommandExecutor {
	private Main plugin;
	public Lol(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("lol") && sender.hasPermission("bukkitmeme.lol")) {
        	String lol = plugin.getConfig().getString("lolmsg");
    Bukkit.broadcastMessage(ChatColor.BLUE + "[Lol] " + sender.getName() + " " + lol);
        }
		return false;
	}
}