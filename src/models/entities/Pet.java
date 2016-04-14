package models.entities;

import models.Map.Tile;
import models.stats.LivingStats;
import models.AI.PetBrain;
import models.stats.Stats;



/**
 * Created by Breanna on 4/13/16.
 * This class represents the Pet in the game.
 */


public class Pet extends Entity implements Movement, TileVisitable {
    private LivingStats stats;
    private PetBrain petBrain;

    public Pet() {
        this.petBrain = new PetBrain();
        this.stats = new LivingStats();
    }
    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }



    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canTraverse() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }


    @Override
    public LivingStats getStats() {
        return stats;
    }
}
