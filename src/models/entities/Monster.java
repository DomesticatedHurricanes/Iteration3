package models.entities;


import models.AI.MonsterBrain;

import models.Map.Tile;

import models.stats.CharacterStats;

/**
 * Created by Breanna on 4/13/16.
 * Monster is a hostile NPC in the game
 */

public class Monster extends NPC implements Movement{
    private MonsterBrain monsterBrain;

    public Monster() {
        this.monsterBrain = new MonsterBrain();
        this.stats = new CharacterStats();
    }
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

