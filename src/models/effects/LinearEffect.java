package models.effects;

import models.entities.Entity;
import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
//How to do it without type checking Orienation?
    //One way is to have many linear effects class.  And interface it.  But is there a better way?
public class LinearEffect extends PlanarEffect{

    public LinearEffect(Point3D point, int range, Entity.Orientation orientation){
        int i = 0;
        origin = point;
        this.range = range;
        this.orientation = orientation;
        Queue queue = tileFinder();
        /*while(!queue.isEmpty()){
            Point3D currentPoint = (Point3D) queue.poll();//This looks scary
            System.out.println("-------------");
            System.out.print(currentPoint.getX()+" "+currentPoint.getY()+" "+currentPoint.getZ());
            System.out.println();
            i++;
        }*/

        System.out.println("i is "+i);
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
        ArrayList<PointNode> adjacentPoints = new ArrayList<>();

        if(orientation == Entity.Orientation.NORTH){
            Point3D northPoint = new Point3D(originPoint.target);
            northPoint.translateNorth();//This is arbitrary for now
            adjacentPoints.add(new PointNode(northPoint,originPoint.range));

        }else if(orientation == Entity.Orientation.NORTHEAST){
            Point3D northeastPoint = new Point3D(originPoint.target);
            northeastPoint.translateNorthEast();//This is arbitrary for now
            adjacentPoints.add(new PointNode(northeastPoint,originPoint.range));

        }else if(orientation == Entity.Orientation.SOUTHEAST){
            Point3D southeastPoint = new Point3D(originPoint.target);
            southeastPoint.translateSouthEast();//This is arbitrary for now
            adjacentPoints.add(new PointNode(southeastPoint,originPoint.range));

        }else if(orientation == Entity.Orientation.SOUTH){
            Point3D southPoint = new Point3D(originPoint.target);
            southPoint.translateSouth();//This is arbitrary for now
            adjacentPoints.add(new PointNode(southPoint,originPoint.range));

        }else if(orientation == Entity.Orientation.SOUTHWEST){
            Point3D southwestPoint = new Point3D(originPoint.target);
            southwestPoint.translateSouthWest();//This is arbitrary for now
            adjacentPoints.add(new PointNode(southwestPoint,originPoint.range));

        }else if(orientation == Entity.Orientation.NORTHWEST){
            Point3D northwestPoint = new Point3D(originPoint.target);
            northwestPoint.translateNorthWest();//This is arbitrary for now
            adjacentPoints.add(new PointNode(northwestPoint,originPoint.range));

        }else{
            System.out.println("HOW DID YOU GET HERE");
        }
        return adjacentPoints;
    }
}
