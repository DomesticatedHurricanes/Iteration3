package models.entities;

import models.Map.Tile;

/**
 * Created by ben on 4/11/16.
 */
public class Avatar extends Entity implements Movement, Attack, EntityVisitable{

    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }

    @Override
    public void attack() {

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
