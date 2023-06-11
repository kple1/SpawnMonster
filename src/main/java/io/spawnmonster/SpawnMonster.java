package io.spawnmonster;

import io.spawnmonster.Command.CashMain;
import io.spawnmonster.Command.SetSpawn;
import io.spawnmonster.Command.Spawn;
import io.spawnmonster.Listener.Anvil;
import io.spawnmonster.Listener.KillSpawn;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnMonster extends JavaPlugin {

    public static SpawnMonster plugin;

    @Override
    public void onEnable() {
        plugin = this;
        this.getLogger().info("SpawnMonster 플러그인을 활성화 합니다. / Ver : " + this.getDescription().getVersion());
        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();
        saveConfig();
        /* Listener */
        Bukkit.getPluginManager().registerEvents(new KillSpawn(), this);
        Bukkit.getPluginManager().registerEvents(new Anvil(), this);
        /* Command */
        Bukkit.getPluginCommand("cashItem").setExecutor(new CashMain());
        Bukkit.getPluginCommand("setSpawn").setExecutor(new SetSpawn());
        Bukkit.getPluginCommand("spawn").setExecutor(new Spawn());
    }

    @Override
    public void onDisable() {
        saveDefaultConfig();
    }

    public static SpawnMonster getPlugin() {
        return plugin;
    }
}
