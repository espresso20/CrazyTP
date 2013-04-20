package com.publiccraft.monkey.crazytp;

import org.bukkit.event.EventPriority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: Monkey
 * Date: 4/17/13
 * Time: 3:55 PM
 */
public class crazytp extends JavaPlugin{

    public void onEnable()
    {
        getLogger().info("onEnable has been invoked");
        System.out.println("CrazyTP Enabled");

    }

    public void onDisable()
    {
        getLogger().info("onDisable has been invoked");
        System.out.println("CrazyTP Disabled");

    }
}
