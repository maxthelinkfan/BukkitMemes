package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FakeOp implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public FakeOp(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("fakeop") && sender.hasPermission("bukkitmeme.fakeop")){
			if(args.length == 0){
				sender.sendMessage(ChatColor.RED + "Please specify a player!");
				return true;
			}
			if(args.length == 1){
				Player target2 = Bukkit.getServer().getPlayer(args[0]);
				if(target2 == null){
					sender.sendMessage(ChatColor.RED + "That player is offline!");
					return true;
				}
				
			}
			if(args.length == 1) {
			Player target = Bukkit.getServer().getPlayer(args[0]);
		    target.sendMessage(ChatColor.YELLOW + "You are now OP!");
		    sender.sendMessage(ChatColor.GREEN + "FakeOP message sent.");
		    }
	


	}
		return true;
}
}