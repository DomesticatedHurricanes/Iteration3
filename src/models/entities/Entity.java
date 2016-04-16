package models.entities;



import utilities.Point3D;
import models.stats.Stats;

import java.awt.image.BufferedImage;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {
    Point3D point3D;
    BufferedImage entityImage;
    public Entity(){
        point3D =null;
        entityImage = null;
    }
    public abstract Stats getStats();
    public BufferedImage getEntityImage(){
        return entityImage;
    }


}
