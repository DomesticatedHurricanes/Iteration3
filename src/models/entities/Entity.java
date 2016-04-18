package models.entities;



import com.sun.org.apache.xpath.internal.operations.Or;
import models.Direction.Direction;
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
    Orientation orientation;
    private boolean isTrapped = false;  // used for trap areaEffect


    public Entity(){
        location =null;
        entityImage = null;
        orientation = Orientation.SOUTH;
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

    public void setTrapped(boolean trap){
        isTrapped = trap;
    }

    public boolean isTrapped(){
        return isTrapped;
    }

    public abstract Stats getStats();

    //public abstract String getType();

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
