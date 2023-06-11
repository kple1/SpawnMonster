package io.spawnmonster.Command;

import io.spawnmonster.SpawnEntity.Entity;
import io.spawnmonster.Utils.Buff;
import io.spawnmonster.Utils.Color;
import io.spawnmonster.Utils.TimeBuff;
import org.bukkit.*;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import java.util.List;
import java.util.Random;

import static io.spawnmonster.SpawnMonster.plugin;

public class CashItemSend {

    private Random random = new Random();

    public void removeItemsFromMainHand(Player player, int amountToRemove) {
        ItemStack itemToRemove = player.getInventory().getItemInMainHand().clone(); // 클론을 생성하여 원본 아이템에 영향을 주지 않도록 합니다.
        itemToRemove.setAmount(amountToRemove); // 삭제하고자 하는 아이템의 수량을 지정합니다.

        player.getInventory().removeItem(itemToRemove);
    }


    public void onCommand(CommandSender sender, List<String> args) {
        if (sender instanceof Player player) {
            String playerName = args.get(1);
            Player targetPlayer = Bukkit.getPlayerExact(String.valueOf(playerName));
            String design = Color.chat("&c&l[!]&f ");

            Material baked = Material.BAKED_POTATO;
            int amount = 20;
            ItemStack bakedPotato = new ItemStack(baked, amount);
            Entity entity = new Entity();

            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

            int amountToRemove = 1;

            if (targetPlayer != null) {
                ItemStack heldItem = player.getInventory().getItemInMainHand();

                if (heldItem != null && heldItem.hasItemMeta() && heldItem.getItemMeta().hasDisplayName()) {
                    String displayName = heldItem.getItemMeta().getDisplayName();

                    if (displayName.equals("기능 0")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        targetPlayer.getInventory().addItem(bakedPotato);

                        player.sendMessage(design + "구운감자 20개가" + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "구운감자 20개가" + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 700원도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 700);
                    }

                    if (displayName.equals("기능 1")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        entity.summonZombie(targetPlayer);

                        player.sendMessage(design + "좀비 1마리가 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "좀비 1마리가 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 3,500캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 3500);
                    }

                    if (displayName.equals("기능 2")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        if (random.nextBoolean()) {
                            entity.twoSummonZombie(targetPlayer);
                        } else {
                            entity.summonCreeper(targetPlayer);
                        }

                        player.sendMessage(design + "좀비 2마리가 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "좀비 2마리가 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 7,000캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 7000);
                    }

                    if (displayName.equals("기능 3")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        if (random.nextBoolean()) {
                            entity.threeSummonZombie(targetPlayer);
                        } else {
                            entity.threeSummonSkeleton(targetPlayer);
                        }

                        player.sendMessage(design + "좀비 3마리가 or 스켈레톤 3마리가 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "좀비 3마리가 or 스켈레톤 3마리가 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 8,400캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 8400);
                    }

                    if (displayName.equals("기능 4")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        PotionEffectType effectType = PotionEffectType.SPEED;
                        Buff buff = new Buff(targetPlayer, effectType);
                        buff.startBuff();

                        player.sendMessage(design + "랜덤버프 5분이 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "랜덤버프 5분이 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 10,500캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 10500);
                    }

                    if (displayName.equals("기능 5")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        PotionEffectType effectType = PotionEffectType.SPEED;
                        TimeBuff timebuff = new TimeBuff(targetPlayer, effectType);
                        timebuff.startBuff();

                        player.sendMessage(design + "랜덤버프 7분이 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "랜덤버프 7분이 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 11,900캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 11900);
                    }

                    if (displayName.equals("기능 6")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        if (random.nextBoolean()) {
                            entity.summonEnderMan(targetPlayer);
                        } else {
                            entity.summonRavager(targetPlayer);
                        }

                        player.sendMessage(design + "파괴수 1마리 or 엔더맨 3마리가 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "파괴수 1마리 or 엔더맨 3마리가 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 14,000캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 14000);
                    }

                    if (displayName.equals("기능 7")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        String worldName = plugin.getConfig().getString("spawn.world");
                        double x = plugin.getConfig().getDouble("spawn.x");
                        double y = plugin.getConfig().getDouble("spawn.y");
                        double z = plugin.getConfig().getDouble("spawn.z");

                        World world = Bukkit.getWorld(worldName);
                        Location spawnLocation = new Location(world, x, y, z);

                        targetPlayer.teleport(spawnLocation);

                        player.sendMessage(design + "스폰장소로 이동이 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "스폰장소로 이동이 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 70,000캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 70000);
                    }

                    if (displayName.equals("기능 8")) {
                        removeItemsFromMainHand(player, amountToRemove);

                        targetPlayer.setHealth(0);

                        player.sendMessage(design + "즉사가 " + playerName + "님께 전달되었습니다.");
                        targetPlayer.sendMessage(design + "즉사가 " + player.getName() + "으로부터 도착하였습니다");
                        targetPlayer.sendMessage(design + "보낸금액의 70% 700,000캐시도 같이 왔습니다.");
                        Bukkit.dispatchCommand(console, "캐시 지급 " + targetPlayer.getName() + " " + 700000);
                    }
                } else {
                    player.sendMessage(design + "손에 아이템을 들고 있지 않거나, 아이템에 displayName이 없습니다.");
                }
            } else {
                player.sendMessage(design + "해당 플레이어를 찾을 수 없습니다.");
            }
        }
    }
}
