package models.effects;

import utilities.Point3D;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
public class PrismEffect extends VolumetricEffect{

    public PrismEffect(Point3D point,int range){
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
        ArrayList<PointNode> adjacentPoints = new ArrayList<>();

        Point3D upPoint = new Point3D(originPoint.target);
        upPoint.translateUp();
        adjacentPoints.add(new PointNode(upPoint,originPoint.range));

        Point3D downPoint = new Point3D(originPoint.target);
        downPoint.translateDown();
        adjacentPoints.add(new PointNode(downPoint,originPoint.range));
        System.out.println("--");
        System.out.println(originPoint.target.getX()+" "+originPoint.target.getY()+" "+originPoint.target.getZ());
        System.out.println(upPoint.getX()+" "+upPoint.getY()+" "+upPoint.getZ());
        System.out.println(downPoint.getX()+" "+downPoint.getY()+" "+downPoint.getZ());


        return adjacentPoints;
    }
}
