package io.spawnmonster.Utils;

import io.spawnmonster.SpawnMonster;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TimeBuff extends BukkitRunnable {

    private Player player;
    private List<PotionEffectType> effectTypes;

    public TimeBuff(Player player, PotionEffectType effectType) {
        this.player = player;
        this.effectTypes = Arrays.asList(PotionEffectType.values());
    }

    @Override
    public void run() {
        // 랜덤한 이펙트 타입을 선택합니다.
        Random random = new Random();
        PotionEffectType effectType = effectTypes.get(random.nextInt(effectTypes.size()));

        // 이펙트를 플레이어에게 추가합니다.
        player.addPotionEffect(new PotionEffect(effectType, 7 * 60 * 20, 0));
    }

    // 플러그인 활성화 시 실행되는 메소드
    public void startBuff() {
        runTaskLater(SpawnMonster.getPlugin(), 0);
    }
}
