package models.AI;

import models.entities.Entity;
import utilities.Point3D;

import java.util.Random;


/**
 * Created by ben on 4/12/16.
 */
public abstract class AIBrain {

    private Random random;


    // randomly selects coordinates of direction
    // (0,0) (0,1) (1,0) (1,1) (0,-1), (-1,0) (-1,-1)
    public Entity.Orientation changeDirection() {
        random = new Random();
        int orientationInt = random.nextInt(5);
        Entity.Orientation orientation = Entity.Orientation.SOUTH;
        switch (orientationInt) {
            case 0:
                orientation = Entity.Orientation.SOUTH;
                return orientation;
            case 1:
                orientation = Entity.Orientation.SOUTHWEST;
                return orientation;
            case 2:
                orientation = Entity.Orientation.SOUTHEAST;
                return orientation;
            case 3:
                orientation = Entity.Orientation.NORTH;
                return orientation;
            case 4:
                orientation = Entity.Orientation.NORTHEAST;
                return orientation;
            case 5:
                orientation = Entity.Orientation.NORTHWEST;
                return orientation;
        }
        return orientation;
    }

}
