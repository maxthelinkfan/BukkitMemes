package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BMInfo implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public BMInfo(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("bminfo")) {
        	Player p = (Player) sender;
        	p.sendMessage(ChatColor.GOLD + "[BukkitMemes]" + ChatColor.RED + " You are running BukkitMemes version 1.5");
        }
		return false;
	}
}