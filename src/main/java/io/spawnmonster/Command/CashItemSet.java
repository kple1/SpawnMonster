package io.spawnmonster.Command;

import io.spawnmonster.Utils.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static io.spawnmonster.SpawnMonster.plugin;;

public class CashItemSet implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            Material material = player.getInventory().getItemInMainHand().getType();
            plugin.getConfig().set("설정된 아이템", material.toString());
            plugin.saveConfig();
            player.sendMessage(Color.chat("&c[!] &f해당 아이템이 저장되었습니다!"));
        }
        return false;
    }
}
