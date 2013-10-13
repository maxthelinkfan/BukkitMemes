package me.bukkitmemes.Memes;

import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ILT implements CommandExecutor {
	private Main plugin;
	public ILT(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("iliketrains") && sender.hasPermission("bukkitmeme.trains"));
        	String iliketrains = plugin.getConfig().getString("iliketrainsmsg");
    Bukkit.broadcastMessage(ChatColor.GRAY + "[Trains] " + sender.getName() + " " + iliketrains);
	return false;
        }
	{
	}
}
