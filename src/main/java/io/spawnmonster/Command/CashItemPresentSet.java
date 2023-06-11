package io.spawnmonster.Command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import static io.spawnmonster.SpawnMonster.plugin;

public class CashItemPresentSet implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (!player.isOp()) {
                return true;
            }

            String configItem = plugin.getConfig().getString("설정된 아이템");
            Material material = Material.getMaterial(configItem);
            ItemStack itemStack = new ItemStack(material);
            ItemMeta meta = itemStack.getItemMeta();

            if (args[1].equals("0")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 0");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("1")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 1");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("2")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 2");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("3")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 3");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("4")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 4");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("5")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 5");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("6")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 6");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("7")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 7");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
            if (args[1].equals("8")) {
                if (player.getInventory().getItemInMainHand().equals(itemStack)) {
                    meta.setDisplayName("기능 8");
                    itemStack.setItemMeta(meta);
                    player.getInventory().setItemInMainHand(itemStack);
                }
            }
        }
        return false;
    }
}
