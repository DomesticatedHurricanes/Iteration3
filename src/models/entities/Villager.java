package models.entities;

<<<<<<< HEAD
=======

>>>>>>> ea585cf5ba3caaac7cfe11f751c1c0bc8ac30e6d
import models.stats.CharacterStats;
import models.stats.Stats;
import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */
<<<<<<< HEAD


public class Villager extends NPC{

    public Villager() {
        this.npcStats = new CharacterStats();
    }

=======


public class Villager extends Entity {
    private CharacterStats stats;

    public Villager() {

        this.stats = new CharacterStats();
    }

    @Override
    public Stats getStats() {
        return stats;
    }


>>>>>>> ea585cf5ba3caaac7cfe11f751c1c0bc8ac30e6d
}
