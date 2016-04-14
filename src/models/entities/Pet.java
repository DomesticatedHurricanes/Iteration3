package models.entities;

import models.Map.Tile;
import models.stats.LivingStats;

/**
 * Created by ben on 4/11/16.
 */
public class Pet extends Entity implements Movement, EntityVisitable {
    private LivingStats petStats;

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
}
