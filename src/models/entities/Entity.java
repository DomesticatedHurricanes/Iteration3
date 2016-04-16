package models.entities;



import models.Inventory.Inventory;
import utilities.Point3D;
import models.stats.Stats;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {
    Point3D location;

    Inventory inventory;//This needs to be initialized in the specfic implementation details
    public enum Orientation{
        NORTHWEST,
        NORTH,
        NORTHEAST,
        SOUTHWEST,
        SOUTH,
        SOUTHEAST
    }

    public abstract Stats getStats();


}
