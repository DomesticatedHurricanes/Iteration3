package models.entities;

import models.Map.Tile;
import models.stats.CharacterStats;

/**
 * Created by ben on 4/11/16.
 */
public class Monster extends NPC implements Movement{
    CharacterStats stats;

    @Override
    public boolean canSwim() {return false;}

    @Override
    public boolean canTraverse() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public CharacterStats getStats() {
        return stats;
    }
}

