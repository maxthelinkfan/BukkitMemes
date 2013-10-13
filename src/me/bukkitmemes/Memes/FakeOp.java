package me.bukkitmemes.Memes;



import me.bukkitmemes.BukkitMemes.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class FakeOp implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public FakeOp(Main plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("fakeop") && sender.hasPermission("bukkitmeme.fakeop")){
			Player target = Bukkit.getServer().getPlayer(args[0]);
		    target.sendMessage(ChatColor.YELLOW + "You are now OP!");
		    target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1, 5));
		    }
		return false;
	


	}
}