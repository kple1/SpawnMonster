package io.spawnmonster.Command;

import io.spawnmonster.Utils.Color;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static io.spawnmonster.SpawnMonster.plugin;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            String worldName = plugin.getConfig().getString("spawn.world");
            double x = plugin.getConfig().getDouble("spawn.x");
            double y = plugin.getConfig().getDouble("spawn.y");
            double z = plugin.getConfig().getDouble("spawn.z");

            World world = Bukkit.getWorld(worldName);
            Location spawnLocation = new Location(world, x, y, z);

            player.teleport(spawnLocation);
            player.sendMessage(Color.chat("&c[!] &f스폰으로 이동되었습니다"));

        }
        return false;
    }
}
