package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Jk implements CommandExecutor {
	private Main plugin;
	public Jk(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("jk") && sender.hasPermission("bukkitmeme.jk")) {
        	String jk = plugin.getConfig().getString("jkmsg");
    Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[Jk] " + sender.getName() + " " + jk);
        }
		return false;
	}
}
