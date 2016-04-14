package models.entities;

import models.Map.Tile;

/**
 * Created by ben on 4/11/16.
 */
public class Monster extends NPC implements Movement{
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
}
