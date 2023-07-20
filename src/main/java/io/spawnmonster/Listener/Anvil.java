package io.spawnmonster.Listener;

import io.spawnmonster.Utils.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static io.spawnmonster.SpawnMonster.plugin;

public class Anvil implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        Inventory inventory = event.getClickedInventory();
        if (inventory != null && inventory.getType() == InventoryType.ANVIL) {
            ItemStack clickedItem = event.getCurrentItem();
            String item = plugin.getConfig().getString("설정된 아이템");
            if (item != null) {
                Material material = Material.matchMaterial(item);
                player.sendMessage(Color.chat("&c[!] &f해당 아이템은 모루사용이 불가능합니다!"));

                if (clickedItem != null && clickedItem.getType() == material) {
                    event.setCancelled(true);
                }
            }
        }
    }
}
