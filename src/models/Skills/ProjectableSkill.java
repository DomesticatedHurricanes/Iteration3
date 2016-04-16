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
    public void project(ArrayList<Entity> victims){
        for(Entity vicitim:victims){
            //get stats from victim and them modify it!
            //modify based on projectile!
        }

    }
}
