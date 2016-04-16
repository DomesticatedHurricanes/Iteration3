package models.entities;


import models.stats.CharacterStats;
import models.Inventory.Inventory;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */
//This is the shopkeeper
public class Villager extends NPC {

    public Villager() {
        this.inventory = new Inventory(16);
        this.npcStats = new CharacterStats();
    }

    @Override
    public String getType() {
        return "Villager";
    }
}
