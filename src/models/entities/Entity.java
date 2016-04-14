package models.entities;



import models.stats.Stats;
import utilities.Point3D;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {
    Point3D point3D;


    public abstract Stats getStats();


}
