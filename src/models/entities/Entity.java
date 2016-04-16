package models.entities;



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

    public enum Orientation{
        NORTHWEST,
        NORTH,
        NORTHEAST,
        SOUTHWEST,
        SOUTH,
        SOUTHEAST
    }

    public abstract Stats getStats();
    public BufferedImage getEntityImage(){
        return entityImage;
    }

    public Point3D getLocation() {
        return location;
    }
}
