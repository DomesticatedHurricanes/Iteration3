package models.AI;

import utilities.Point3D;

import java.util.Random;


/**
 * Created by ben on 4/12/16.
 */
public abstract class AIBrain {

    private Random random;

    public Point3D generateMove(){
        random = new Random();
        int x = random.nextInt(2);
        int y = random.nextInt(2);

        Point3D point = new Point3D(x, y, 0);
        return point;
    }

}