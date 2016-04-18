package models.effects;

import models.Map.Tile;
import models.entities.Entity;
import utilities.Point3D;

import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
//Use Map to get the origin point
    //From origin point find the other tiles and store them into a queue
import utilities.Point3D;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
//Use Map to get the origin point
//From origin point find the other tiles and store them into a queue
public abstract class Effect {
    protected Point3D origin;
    protected int range;
    protected ArrayList<Point3D> tilePoints = new ArrayList<>();
    protected Entity.Orientation orientation;
    //need to put pathfinder in here make abstract
    public abstract Queue<Point3D> tileFinder();

    public boolean haveSeen(ArrayList<Point3D> seenList, Point3D newPoint) {
        for (int i = 0; i < seenList.size(); i++) {
            if (seenList.get(i).getX() == newPoint.getX() && seenList.get(i).getY() == newPoint.getY() && seenList.get(i).getZ() == newPoint.getZ()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Point3D> getTilePoints() {
        return tilePoints;
    }

    public ArrayList<Point3D> getDistinctPoints(Queue<Point3D> queue) {

        while (!queue.isEmpty()) {
            Point3D currentPoint = queue.poll();
            if (!haveSeen(tilePoints, currentPoint)) {
                tilePoints.add(currentPoint);
            }
        }
        System.out.println("THE OFFICAL SIZE IS " + tilePoints.size());
        return null;
    }

    class PointNode {
        public Point3D target;
        public int range;
        //public Tile tile;
        public PointNode(Point3D point3D, int range) {
            target = new Point3D(point3D);
            this.range = range;
        }
    }
}
