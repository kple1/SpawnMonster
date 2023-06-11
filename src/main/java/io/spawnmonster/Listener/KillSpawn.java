package io.spawnmonster.Listener;

import io.spawnmonster.Utils.Color;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import static io.spawnmonster.SpawnMonster.plugin;

public class KillSpawn implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        String worldName = plugin.getConfig().getString("spawn.world");
        double x = plugin.getConfig().getDouble("spawn.x");
        double y = plugin.getConfig().getDouble("spawn.y");
        double z = plugin.getConfig().getDouble("spawn.z");
        World world = Bukkit.getWorld(worldName);
        if (world == null) {
            player.sendMessage(Color.chat("&c[!] &f월드가 존재 하지 않거나 적절하지 않습니다"));
            return;
        }
        Location spawnLocation = new Location(world, x, y, z);
        player.teleport(spawnLocation);
    }
}
