package models.entities;

import models.Map.Tile;

/**
 * Created by david on 4/13/16.
 */
public interface Movement {
    boolean canWalk();
    boolean canSwim();
    boolean canTraverse();
    boolean canFly();
}
