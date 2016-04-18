package models.entities;



import com.sun.org.apache.xpath.internal.operations.Or;
import models.Direction.Direction;
import models.Inventory.Inventory;
import models.Map.Map3D;
import models.Map.Tile;
import models.stats.StatusEffect;
import utilities.Point3D;
import models.stats.Stats;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Breanna on 4/13/16.
 */

public abstract class Entity {

    Point3D location;
    ArrayList<BufferedImage> entityImages;
    BufferedImage entityImage;
    HashMap<Orientation, BufferedImage> orientationImages;

    StatusEffect.statusEffect statusEffect;
    StatusEffect statusEffects;
    Orientation orientation;
    Map3D map;
    public Entity() {
        location = null;
        entityImage = null;
        entityImages = null;
        statusEffect = StatusEffect.statusEffect.NONE;
        orientation = Orientation.SOUTH;
        orientationImages = new HashMap<>();
        //Orientation orientation;
        //private boolean isTrapped = false;  // used for trap areaEffect
    }

    public void obtainMap(Map3D map){
        this.map = map;
    }
    public Map3D getMap(){
        return map;
    }

    /*public Entity(){
        location =null;
        entityImage = null;
        orientation = Orientation.SOUTH;

    }*/
    public void initImages(){
//        orientationImages.put(Orientation.SOUTH,entityImages.get(0));
 //       orientationImages.put(Orientation.SOUTHEAST,entityImages.get(1));
   //     orientationImages.put(Orientation.SOUTHWEST,entityImages.get(2));
     //   orientationImages.put(Orientation.NORTH,entityImages.get(3));
     //   orientationImages.put(Orientation.NORTHEAST,entityImages.get(4));
     //   orientationImages.put(Orientation.NORTHWEST,entityImages.get(5));
    }

    Inventory inventory;//This needs to be initialized in the specfic implementation details
    public enum Orientation{
        NORTHWEST {
            public Point3D translate(Point3D point3D) {
                return point3D.getTranslateNorthWest();
            }
        } ,
        NORTH {
            public Point3D translate(Point3D point3D) {
                return point3D.getTranslateNorth();
            }
        }  ,
        NORTHEAST {
            public Point3D translate(Point3D point3D){
                return point3D.getTranslateNorthEast();
            }
        } ,
        SOUTHWEST{
            public Point3D translate(Point3D point3D){
                return point3D.getTranslateSouthWest();
            }
        },
        SOUTH{
            public Point3D translate(Point3D point3D){
                return point3D.getTranslateSouth();
            }
        },
        SOUTHEAST{
            public Point3D translate(Point3D point3D){
                return point3D.getTranslateSouthEast();
            }
        };

        public abstract Point3D translate(Point3D point3D);
    }


    public abstract Stats getStats();

    //public abstract String getType();

    public StatusEffect.statusEffect getStatusEffect(){
        return statusEffect;
    }

    public void setStatusEffect(StatusEffect.statusEffect statusEffect){
        this.statusEffect = statusEffect;
        //Not sure if this is going to work
        statusEffects.applyStatusEffect(this);
    }

    public void setEntityImage(Orientation orientation){
        this.entityImage = orientationImages.get(orientation);
    }

    public Inventory getInventory(){
        return inventory;
    }


    public Orientation getOrientation() { return orientation; }


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
