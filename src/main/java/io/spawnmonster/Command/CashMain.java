package io.spawnmonster.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CashMain implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {

            if (args.length >= 1) {
                switch (args[0]) {
                    case "선물" -> {
                        CashItemPresentSet cashItemPresentSet = new CashItemPresentSet();
                        cashItemPresentSet.onCommand(sender, command, label, args);
                    }

                    case "아이템설정" -> {
                        CashItemSet cashItemSet = new CashItemSet();
                        cashItemSet.onCommand(sender, command, label, args);
                    }

                    case "선물보내기" -> {
                        CashItemSend cashItemSend = new CashItemSend();
                        cashItemSend.onCommand(sender, List.of(args));
                    }
                }
            }
        }
        return false;
    }
}
