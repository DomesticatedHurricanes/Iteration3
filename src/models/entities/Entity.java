package models.entities;



import models.Inventory.Inventory;
import utilities.Point3D;
import models.stats.Stats;

import java.awt.image.BufferedImage;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {

    Point3D location;
    BufferedImage entityImage;
    public Entity(){
        location =null;
        entityImage = null;
    }

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

    //public abstract String getType();

    public Inventory getInventory(){
        return inventory;
    }

    public void setLocation(Point3D point3D){
        location = point3D;
    }

    public Point3D getLocation() {
        return location;
    }
    public BufferedImage getEntityImage(){
        return entityImage;
    }

}
