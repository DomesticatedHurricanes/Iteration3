package models.Skills;

import java.util.ArrayList;

import java.util.Queue;

import models.Map.Map;
import models.effects.Effect;
import models.entities.Entity;
import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 */
public abstract class SearchableSkill extends Skill {
    protected Effect effect;
    protected Map map;//Currently map is null since it is not connected to anything
    //map is in interaction? Skill inherits from Interaction? Or has its own map its passed when init?
    public abstract Queue<Point3D> search();

    public ArrayList<Entity> findVictims(ArrayList<Point3D> tilePoints){
        ArrayList<Entity> victims = new ArrayList<>();
        for(Point3D currentPoint:tilePoints){
            //Pseudocode
            //Tile tile = map.getTileAt(currentPoint);
            //if(tile.hasEntity)
            // {Entity entity = tile.getEntity;
            //victims.add(entity)
        }
        return victims;
    }
}
