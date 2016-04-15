package models.entities;


import models.stats.CharacterStats;
import models.stats.Stats;
import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */

public class Villager extends Entity {
    private CharacterStats stats;

    public Villager() {

        this.stats = new CharacterStats();
    }

    @Override
    public Stats getStats() {
        return stats;
    }


}
