package models.entities;



import utilities.Point3D;
import models.stats.Stats;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {

    Point3D point3D;

    public abstract Stats getStats();

    public Point3D getCurrentLocation(){
        return point3D;
    }
}
