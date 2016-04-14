package models.entities;

import models.AI.NPCBrain;
import models.stats.CharacterStats;

/**
 * Created by Breanna on 4/13/16.
 * Represents a non-hostile NPC within the game
 */

public class Villager extends NPC implements Movement{
    private NPCBrain npcBrain;

    public Villager() {
        this.npcBrain = new NPCBrain();
        this.npcStats = new CharacterStats();
    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void traverse() {

    }


}
