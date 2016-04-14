package models.entities;

import models.stats.CharacterStats;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */


public class Villager extends NPC{

    public Villager() {
        this.npcStats = new CharacterStats();
    }

}
