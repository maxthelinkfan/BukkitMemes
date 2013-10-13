package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Odns implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public Odns(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("odns") && sender.hasPermission("bukkitmeme.odns")) {
            StringBuilder message2 = new StringBuilder();
            message2.append(args[0]);
            for (int i = 1; i < args.length; i++) {
            message2.append(" ");
            message2.append(args[i]);
            }
            Bukkit.broadcastMessage(ChatColor.AQUA + "[ODNS] " + "One does not simply " +  message2 + " -" + sender.getName() + " ");
        }
                return true;
        }
}