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
        ArrayList<Entity> victims = new ArrayList<>();
        for(Point3D currentPoint:tilePoints){
            currentPoint.setX(5);
            currentPoint.setY(5);
            currentPoint.setZ(5);
            System.out.println(currentPoint.getX());
            System.out.println(currentPoint.getY());
            System.out.println(currentPoint.getZ());
            System.out.println(map3D.getTile(currentPoint));
            Tile tile = map3D.getTile(currentPoint);
            if(tile.hasEntity()){
                Entity entity = tile.getEntity();
                victims.add(entity);
            }
        }
        return victims;
    }
}
