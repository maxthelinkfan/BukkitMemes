package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GoodFight implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public GoodFight(Main plugin) {
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	  if(cmd.getName().equalsIgnoreCase("gf") && sender.hasPermission("bukkitmeme.gf"));
	    if(args.length == 1){
	      Player target = Bukkit.getServer().getPlayer(args[0]);
	        Bukkit.broadcastMessage(ChatColor.GOLD + "[GF] " + sender.getName() + " had a good fight with " + target.getName());
	    
	    } else {
	        sender.sendMessage("Please specify the target.");
	    }
		return false;
	}
}