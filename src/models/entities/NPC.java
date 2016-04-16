 package models.entities;
 import models.stats.CharacterStats;
 import models.Inventory.Inventory;
 import models.stats.Stats;


/**
 * Created by Breanna on 4/13/16.
 * Represents a NPC in the game.
 * Superclass for types of NPCs
 */
public abstract class NPC extends Entity {

    protected Stats npcStats;
    protected Inventory inventory;

    @Override
    public Stats getStats() {
        return npcStats;
    }
}

