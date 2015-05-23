package com.MorcCrafak.pcore;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
//imhracort org.bukkit.event.EventHandler;
//imhracort org.bukkit.event.hraclayer.hraclayerInteractEvent;

public class core extends JavaPlugin{
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args){
		
		Player hraclayer = (Player) sender; // nastavi hraclayer instanciu na kick atd...
		  if(commandlabel.equalsIgnoreCase("swahrac")){ // zistuje ci hrac nahracisal hracrikaz
			  if(hraclayer.hasPermission("MorcCrafak.swahrac")){
			  if(args.length == 0) {
				  hraclayer.sendMessage("Too few arguments!");
			  	}else if(args.length == 1) {
				  Player victim = hraclayer.getServer().getPlayer(args[0]);
				  Location loc0 = victim.getLocation();
				  Location loc1 = hraclayer.getLocation();
				  victim.teleport(loc1);
				  hraclayer.teleport(loc0);
			  	}else{
					hraclayer.sendMessage(ChatColor.RED + "hraclayer not online!");
				}
			  	}else{
					hraclayer.sendMessage(ChatColor.RED + "You don't have hracermission for this!");
				}
			  
			  	if(commandlabel.equalsIgnoreCase("invisible")){ // zistuje ci hrac nahracisal hracrikaz
			  	   Player plr = (Player) sender;
			  	   if(plr.hasPermission("MorcCrafak.invis")){
				  if(args.length == 0) {
					  plr.sendMessage("Too few arguments!");
				  }else if(args.length == 1) {
					  Player victim = plr.getServer().getPlayer(args[0]);
					  victim.hidePlayer(victim);
					  victim.setPlayerListName("");
				  }

				  }else{
					  hraclayer.sendMessage(ChatColor.RED + "You don't have hracermission for this!");
				  }
			  	  }
				  
				  if (commandlabel.equalsIgnoreCase("cc")) {
                      Player hrac = (Player)sender;
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");
                      Bukkit.broadcastMessage(" ");

                      hrac.sendMessage(ChatColor.GREEN + "Vymazal si všetok text v chate!");
                      Bukkit.broadcastMessage(ChatColor.GREEN + "Hráč " + hrac.getName() + " vyclearoval text v chate.");

              }
              if (commandlabel.equalsIgnoreCase("hraccc")) {
                      Player hrac = (Player)sender;
                     
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
                      hrac.sendMessage(" ");
         

                      hrac.sendMessage(ChatColor.GREEN + "Vymazal si všetok text v svojom chate!");
              }
		   	  
		  }
		  return false;
		  }
	
	
}
