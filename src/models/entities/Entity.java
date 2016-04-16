package models.entities;



import utilities.Point3D;
import models.stats.Stats;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {
    Point3D location;

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
