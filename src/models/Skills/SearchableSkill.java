package models.Skills;

import java.util.ArrayList;

import java.util.Queue;

import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;
import models.effects.Effect;
import models.entities.Entity;
import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 */
public abstract class SearchableSkill extends Skill {
    //protected Effect effect;
    protected Map3D map3D;


    //Currently map is null since it is not connected to anything
    //map is in interaction? Skill inherits from Interaction? Or has its own map its passed when init?
    public abstract ArrayList<Point3D> search();
    public ArrayList<Entity> findVictims(ArrayList<Point3D> tilePoints){
        System.out.println(map3D);
        System.out.println("HH");
        if(map3D==null){
            //System.out.println("PLEASE WORK");
        }
        map3D = avatar.getMap();

        ArrayList<Entity> victims = new ArrayList<>();
        for(Point3D currentPoint:tilePoints){
            System.out.println("333333");
            Tile tile = map3D.getTile(currentPoint.getX(),currentPoint.getY(),currentPoint.getZ());
            if(tile.hasEntity()){
                Entity entity = tile.getEntity();
                victims.add(entity);
            }
        }
        return victims;
    }
}
