package models.effects;

import com.sun.org.apache.xpath.internal.SourceTree;
import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */

//TODO:Fix HashMap the problem is that the objects state changes which messes with comparison
    //TODO:Alternate solution is to make an arraylist but it is O(n) rather than O(1)
public class RadialEffect extends PlanarEffect{

    public RadialEffect(Point3D point,int range){
        int i = 0;
        origin = point;
        this.range = range;
        Queue queue = tileFinder();
        while(!queue.isEmpty()){
            Point3D currentPoint = (Point3D) queue.poll();//This looks scary
            System.out.println("-------------");
            System.out.print(currentPoint.getX()+" "+currentPoint.getY()+" "+currentPoint.getZ());
            System.out.println();

            i++;
        }

        System.out.println("i is "+i);
    }

    public boolean haveSeen(ArrayList<Point3D> seenList,Point3D newPoint){
        for(int i = 0;i<seenList.size();i++){
            if(seenList.get(i).getX() == newPoint.getX()&&seenList.get(i).getY() == newPoint.getY()){
                return true;
            }
        }
        return false;
    }

    @Override
    public Queue<Point3D> tileFinder() {
        Queue<Point3D> sentQueue = new LinkedList<>();
        Queue<PointNode> bfsQueue = new LinkedList<>();
        ArrayList<Point3D> seenList = new ArrayList<>();

        HashMap<Point3D,PointNode> seenPoints = new HashMap<>();
        //Adds in the roots
        //sentQueue.add(origin);
        PointNode root = new PointNode(origin,0);
        bfsQueue.add(root);
        //bfsQueue.add(origin,0);
        //sentQueue.add(origin);
        int i = 0;
        while(!bfsQueue.isEmpty()){//TODO:put a range condition here but food came I am eating first
            //Gets the pointnode and adds its point3d into the sentQueue
            PointNode current3DPoint = bfsQueue.poll();
            Point3D targetPoint = new Point3D(current3DPoint.target);
            //i++;
            System.out.print(current3DPoint.target.getX()+ " "+current3DPoint.target.getY()+ " "+current3DPoint.target.getZ()+ " ");
            System.out.println("range is "+ current3DPoint.range);
            //System.out.print(current3DPoint.target.getX()+" "+current3DPoint.target.getY()+" "+current3DPoint.target.getZ());
            //System.out.println();
            //sentQueue.add(current3DPoint.target);

            if(range<current3DPoint.range){
                //System.out.println("seen points is "+seenPoints.size());
                /*System.out.println("size is " + sentQueue.size());
                for(Point3D temp:seenPoints.keySet()){
                    int x = temp.getX();
                    int y = temp.getY();
                    String value = seenPoints.get(temp).toString();
                    System.out.println("Key is "+x+"and"+y+ " Value is "+value);
                }*/
                /*for(int j = 0;j<seenList.size();j++){
                    System.out.println("X is "+seenList.get(j).getX()+" Y is "+ seenList.get(j).getY());
                }*/
                System.out.println("It check marked "+ i);
                System.out.println("Array list size is "+seenList.size());
                System.out.println("Final queue size is "+sentQueue.size());
                return sentQueue;
            }
            sentQueue.add(targetPoint);
            //If this pointnode is not already in the hash map
            if(!seenPoints.containsKey(targetPoint)/*||!haveSeen(seenList,current3DPoint.target)*/) {
                System.out.println(!seenPoints.containsKey(current3DPoint.target));
                seenPoints.put(targetPoint, current3DPoint);
                //seenList.add(targetPoint);

                //gets the adjacent points
                for (PointNode pointNode : getAdjacentPoints(current3DPoint)) {
                    //check if point was already seen

                    if (!seenPoints.containsKey(pointNode.target)) {

                        pointNode.range+=1;
                        bfsQueue.offer(pointNode);//sent to the

                        //seenPoints.put(new Point3D(pointNode.target), pointNode);
                    }
                }
            }
            else{
                i++;
            }

        }
        return sentQueue;//In reality, this statment will never be reached since !isEmpty() cond
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
        for(int i = 0;i<adjacentPoints.size();i++){
            int x = adjacentPoints.get(i).target.getX();
            int y = adjacentPoints.get(i).target.getY();
            int z = adjacentPoints.get(i).target.getZ();
            System.out.println("x is "+x+" y is "+y+" z is "+z);
        }
        return adjacentPoints;
    }
}
