package models.entities;

import models.stats.CharacterStats;
import models.Inventory.Inventory;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */
<<<<<<< HEAD



=======
//This is the shopkeeper
>>>>>>> 12a1b5f4dba8947da469bdc06de05aadb4abdacb
public class Villager extends NPC {

    public Villager() {
        this.inventory = new Inventory(16);
        this.npcStats = new CharacterStats();
    }

<<<<<<< HEAD
=======
    @Override
    public String getType() {
        return "Villager";
    }
>>>>>>> 12a1b5f4dba8947da469bdc06de05aadb4abdacb
}
