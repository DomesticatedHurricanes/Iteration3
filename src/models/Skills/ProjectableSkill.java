package models.Skills;

import models.Map.Tile;
import models.entities.Entity;
import utilities.Point3D;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Breanna on 4/13/16.
 */
public abstract class ProjectableSkill extends SearchableSkill{
    protected Projectile projectile;
    //protected ArrayList<Entity> affectedentityArrayList;
    public void project(Queue<Point3D> queue,Tile tile){
        Queue<Entity> entityQueue = new LinkedList<>();
        while(!queue.isEmpty()){
            Point3D point = queue.poll();
            //How do I get the tile from the point?
            //Here it looks like I am going from point to map
            //Solution? I need map!

            //Algorithm
            //After getting the point.  Get the tile from map when the function is impleented
            //From map get the tile and check if it has entity


        }

    }
}
