package models.effects;

import utilities.Point3D;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
public class HemiSphericalEffect extends VolumetricEffect{

    public HemiSphericalEffect(Point3D point,int range){
        origin = point;
        this.range=range;
        Queue queue = tileFinder();

        getDistinctPoints(queue);
    }

    @Override
    public Queue<Point3D> tileFinder() {
        Queue<Point3D> sentQueue = new LinkedList<>();
        Queue<PointNode> bfsQueue = new LinkedList<>();
        //ArrayList<Point3D> seenList = new ArrayList<>();

        HashMap<Point3D,PointNode> seenPoints = new HashMap<>();
        PointNode root = new PointNode(origin,0);
        bfsQueue.add(root);

        while(!bfsQueue.isEmpty()){
            PointNode current3DPoint = bfsQueue.poll();
            Point3D targetPoint = new Point3D(current3DPoint.target);
            if(range<current3DPoint.range){
                System.out.println("It EXCEEDS THE RANGE");
                System.out.println("QUEUE SIZE IS "+sentQueue.size());
                return sentQueue;
            }
            sentQueue.add(targetPoint);

            if(!seenPoints.containsKey(targetPoint)){
                seenPoints.put(new Point3D(targetPoint),current3DPoint);
                //seenList.add(targetPoint);

                for(PointNode pointNode: getAdjacentPoints(current3DPoint)){
                    if(!seenPoints.containsKey(pointNode)){
                        System.out.println("DO I GO HERE?");
                        pointNode.range += 1;
                        bfsQueue.offer(pointNode);
                    }
                }
            }

        }

        return sentQueue;
    }

    @Override
    public ArrayList<PointNode> getAdjacentPoints(PointNode originPoint) {
        //TODO:Implement a boundary checker
        ArrayList<PointNode> adjacentPoints = new ArrayList<>();

        Point3D northPoint = new Point3D(originPoint.target);
        northPoint.translateNorth();//This is arbitrary for now
        adjacentPoints.add(new PointNode(northPoint,originPoint.range));

        Point3D northeastPoint = new Point3D(originPoint.target);
        northeastPoint.translateNorthEast();//This is arbitrary for now
        adjacentPoints.add(new PointNode(northeastPoint,originPoint.range));

        Point3D southeastPoint = new Point3D(originPoint.target);
        southeastPoint.translateSouthEast();//This is arbitrary for now
        adjacentPoints.add(new PointNode(southeastPoint,originPoint.range));

        Point3D southPoint = new Point3D(originPoint.target);
        southPoint.translateSouth();//This is arbitrary for now
        adjacentPoints.add(new PointNode(southPoint,originPoint.range));

        Point3D southwestPoint = new Point3D(originPoint.target);
        southwestPoint.translateSouthWest();//This is arbitrary for now
        adjacentPoints.add(new PointNode(southwestPoint,originPoint.range));

        Point3D northwestPoint = new Point3D(originPoint.target);
        northwestPoint.translateNorthWest();//This is arbitrary for now
        adjacentPoints.add(new PointNode(northwestPoint,originPoint.range));

        Point3D upPoint = new Point3D(originPoint.target);
        upPoint.translateUp();
        adjacentPoints.add(new PointNode(upPoint,originPoint.range));

        Point3D downPoint = new Point3D(originPoint.target);
        downPoint.translateDown();
        adjacentPoints.add(new PointNode(downPoint,originPoint.range));

        return adjacentPoints;
    }
}