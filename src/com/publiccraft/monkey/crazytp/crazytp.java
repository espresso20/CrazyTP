package com.publiccraft.monkey.crazytp;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: Monkey
 * Date: 4/17/13
 * Time: 3:55 PM
 */
public class crazytp extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft");
	
    public void onEnable()
    {
        logger.info("CrazyTP Enabled");
    }

    public void onDisable()
    {
        logger.info("CrazyTP Disabled");
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
    	// /pc heal
    	
    	if(commandLabel.equalsIgnoreCase("pc"))
    	{
    		if (args.length == 0 || args.length > 1)
    		{
    			sender.sendMessage(ChatColor.DARK_RED + "Incorrect number of arguments!");
    		}
    		else
    		{
    			if(args[0].equalsIgnoreCase("heal"))
    			{
    				if(!(sender instanceof Player))
    				{
    					sender.sendMessage("This Command is only available to players!");
    				}
    				else
    				{
    					Player player = (Player) sender;
    					
    					player.setHealth(20);
                        player.setFoodLevel(5);
    					player.sendMessage(ChatColor.GREEN + "The Great Monkey has healed you!");
    				}
    			}
    			else
    			{
    				sender.sendMessage(ChatColor.RED + "Unknown Command!");
    			}
    		}
    		
    		
    		return true;
    	}
    	
    	return false;
    }
    
}
