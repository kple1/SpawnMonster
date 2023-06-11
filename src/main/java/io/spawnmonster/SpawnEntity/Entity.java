package io.spawnmonster.SpawnEntity;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class Entity {

    public void summonZombie(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (netherWorld != null) {
            org.bukkit.entity.Entity netherZombie = netherWorld.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) netherZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endZombie = endWorld.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) endZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }

    public void twoSummonZombie(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (netherWorld != null) {
            org.bukkit.entity.Entity netherZombie = netherWorld.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) netherZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endZombie = endWorld.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) endZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }

    public void threeSummonZombie(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (netherWorld != null) {
            org.bukkit.entity.Entity netherZombie = netherWorld.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) netherZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endZombie = endWorld.spawnEntity(location, EntityType.ZOMBIE);

            LivingEntity livingEntity = (LivingEntity) endZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }

    public void threeSummonSkeleton(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.SKELETON);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.SKELETON);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity zombie = world.spawnEntity(location, EntityType.SKELETON);

            LivingEntity livingEntity = (LivingEntity) zombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (netherWorld != null) {
            org.bukkit.entity.Entity netherZombie = netherWorld.spawnEntity(location, EntityType.SKELETON);

            LivingEntity livingEntity = (LivingEntity) netherZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endZombie = endWorld.spawnEntity(location, EntityType.SKELETON);

            LivingEntity livingEntity = (LivingEntity) endZombie;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }

    public void summonCreeper(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity creeper = world.spawnEntity(location, EntityType.CREEPER);

            LivingEntity livingEntity = (LivingEntity) creeper;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }


        if (netherWorld != null) {
            org.bukkit.entity.Entity netherCreeper = netherWorld.spawnEntity(location, EntityType.CREEPER);

            LivingEntity livingEntity = (LivingEntity) netherCreeper;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endCreeper = endWorld.spawnEntity(location, EntityType.CREEPER);

            LivingEntity livingEntity = (LivingEntity) endCreeper;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }

    public void summonRavager(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity ravager = world.spawnEntity(location, EntityType.RAVAGER);

            LivingEntity livingEntity = (LivingEntity) ravager;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }


        if (netherWorld != null) {
            org.bukkit.entity.Entity netherRavager = netherWorld.spawnEntity(location, EntityType.RAVAGER);

            LivingEntity livingEntity = (LivingEntity) netherRavager;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endRavager = endWorld.spawnEntity(location, EntityType.RAVAGER);

            LivingEntity livingEntity = (LivingEntity) endRavager;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }

    public void summonEnderMan(Player player) {
        Location location = player.getLocation();

        World world = Bukkit.getWorld("world");
        World netherWorld = Bukkit.getWorld("world_nether");
        World endWorld = Bukkit.getWorld("world_the_end");

        if (world != null) {
            org.bukkit.entity.Entity enderMan = world.spawnEntity(location, EntityType.ENDERMAN);

            LivingEntity livingEntity = (LivingEntity) enderMan;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity enderMan = world.spawnEntity(location, EntityType.ENDERMAN);

            LivingEntity livingEntity = (LivingEntity) enderMan;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (world != null) {
            org.bukkit.entity.Entity enderMan = world.spawnEntity(location, EntityType.ENDERMAN);

            LivingEntity livingEntity = (LivingEntity) enderMan;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }


        if (netherWorld != null) {
            org.bukkit.entity.Entity netherEnderMan = netherWorld.spawnEntity(location, EntityType.ENDERMAN);

            LivingEntity livingEntity = (LivingEntity) netherEnderMan;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }

        if (endWorld != null) {
            org.bukkit.entity.Entity endEnderMan = endWorld.spawnEntity(location, EntityType.ENDERMAN);

            LivingEntity livingEntity = (LivingEntity) endEnderMan;
            livingEntity.setAI(true);
            livingEntity.setRemoveWhenFarAway(true);
        }
    }
}
