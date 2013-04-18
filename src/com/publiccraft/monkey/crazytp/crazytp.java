package com.publiccraft.monkey.crazytp;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: Monkey
 * Date: 4/17/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public final class crazytp extends JavaPlugin {

    @Override
    public void onEnable() {
            getLogger().info("onEnable has been invoked");

    }

    @Override
    public void onDisable() {
            getLogger().info("onDisable has been invoked");

    }
}
