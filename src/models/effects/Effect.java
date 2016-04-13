package models.effects;

import utilities.Point3D;

import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
//Use Map to get the origin point
    //From origin point find the other tiles and store them into a queue
public abstract class Effect {
    protected Point3D origin;
    protected int range;
    //need to put pathfinder in here make abstract
    public abstract Queue<Point3D> tileFinder();
    class PointNode{
        public Point3D target;
        public int range;

        public PointNode(Point3D point3D,int range){
            target = new Point3D(point3D);
            this.range = range;
        }
    }
}
