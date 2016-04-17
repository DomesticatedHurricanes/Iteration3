package models.Interaction;

import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;
import models.entities.Entity;
import models.entities.TileVisitable;
import utilities.Point3D;

/**
 * Created by ben on 4/15/16.
 */
//This class lets entity an entity check if something is there
public class MovementHandler {

    Point3D origin;
    Point3D destination;
    Map3D map;
    private Map map2;


    public MovementHandler(Map3D map){
        this.map = map;
    }

    public void setDestination(Point3D origin){
        this.origin = origin;
        this.destination = origin;
    }

    public MovementHandler(Map map){this.map2 = map;}

    public void moveSouth(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;
        setDestination(entityTemp.getLocation());
        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
        destination.translateSouth();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
        if(entity.accept(destinationTile)){
            originTile.removeEntity();
        }
    }

    public void moveSouthWest(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;
        setDestination(entityTemp.getLocation());
        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
        destination.translateSouthWest();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
        if(entity.accept(destinationTile)){
            originTile.removeEntity();
        }
    }

    public void moveSouthEast(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;
        setDestination(entityTemp.getLocation());
        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
        destination.translateSouthEast();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
        if(entity.accept(destinationTile)){
            originTile.removeEntity();
        }
    }
    public void moveNorth(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;
        setDestination(entityTemp.getLocation());
        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
        destination.translateNorth();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
        if(entity.accept(destinationTile)){
            originTile.removeEntity();
            System.out.println("Success");
        }
        else{
            System.out.println(destinationTile.getType());
        }
    }

    public void moveNorthWest(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;
        setDestination(entityTemp.getLocation());
        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
        destination.translateNorthWest();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
        if(entity.accept(destinationTile)){
            entityTemp.setLocation(destination);
            originTile.removeEntity();
        }
    }

    public void moveNorthEast(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;
        setDestination(entityTemp.getLocation());
        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
        destination.translateNorthEast();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
        if(entity.accept(destinationTile)){
            originTile.removeEntity();
        }
    }

}
