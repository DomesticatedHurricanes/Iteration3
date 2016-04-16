package models.entities;


import models.entities.defaultNpcStat.NPCInitialStats;
import models.entities.defaultNpcStat.VillagerStats;
import models.stats.CharacterStats;
import models.Inventory.Inventory;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */

public class Villager extends NPC {
    private NPCInitialStats initialStats;

    public Villager() {
        this.inventory = new Inventory(16);
        this.npcStats = new CharacterStats();
        this.initialStats = new VillagerStats();
        initialStats.initStats(npcStats);
    }

    @Override
    public CharacterStats getStats() {
        return (CharacterStats)npcStats;
    }




}
