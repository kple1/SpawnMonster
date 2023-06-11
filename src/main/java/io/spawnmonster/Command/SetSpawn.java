package io.spawnmonster.Command;

import io.spawnmonster.Utils.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static io.spawnmonster.SpawnMonster.plugin;

public class SetSpawn implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (player.isOp()) {
                plugin.getConfig().set("spawn.world", player.getLocation().getWorld().getName());
                plugin.getConfig().set("spawn.x", player.getLocation().getX());
                plugin.getConfig().set("spawn.y", player.getLocation().getY());
                plugin.getConfig().set("spawn.z", player.getLocation().getZ());
                plugin.saveConfig();
                player.sendMessage(Color.chat("&c[!]&f 스폰 지점을 설정하였습니다"));
            }
        }
        return false;
    }
}
