package models.entities;



import models.Inventory.Inventory;
import models.stats.StatusEffect;
import utilities.Point3D;
import models.stats.Stats;

import java.awt.image.BufferedImage;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {
    Point3D location;
    BufferedImage entityImage;
    StatusEffect.statusEffect statusEffect;
    public Entity(){
        location =null;
        entityImage = null;
        statusEffect = StatusEffect.statusEffect.NONE;
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

    public abstract String getType();

    public StatusEffect.statusEffect getStatusEffect(){
        return statusEffect;
    }

    public void setStatusEffect(StatusEffect.statusEffect statusEffect){
        this.statusEffect = statusEffect;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public Point3D getLocation() {
        return location;
    }
    public BufferedImage getEntityImage(){
        return entityImage;
    }

}
