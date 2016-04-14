package models.entities;

import models.stats.Stats;

/**
 * Created by ben on 4/11/16.
 */
public class Villager extends NPC {
    @Override
    public Stats getStats() {
        return stats;
    }
}
