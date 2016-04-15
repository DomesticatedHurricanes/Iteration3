package models.AI;

import utilities.Point3D;

import java.util.Random;


/**
 * Created by ben on 4/12/16.
 */
public abstract class AIBrain {

    private Random random;


    // randomly selects coordinates of direction
    // (0,0) (0,1) (1,0) (1,1) (0,-1), (-1,0) (-1,-1)
    public Point3D changeDirection(){
        random = new Random();
        int x = random.nextInt(2)-random.nextInt(2);
        int y = random.nextInt(2)-random.nextInt(2);

        Point3D point = new Point3D(x, y, 0);
        return point;
    }

}
