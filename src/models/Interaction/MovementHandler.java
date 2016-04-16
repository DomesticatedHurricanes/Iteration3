package models.Interaction;

import models.Map.Map;
import models.Map.Tile;
import models.entities.Entity;
import utilities.Point3D;

/**
 * Created by ben on 4/15/16.
 */
//This class lets entity an entity check if something is there
public class MovementHandler {
    Point3D origin;
    Point3D destination;
    Map map;
    Entity entity;//currently null
    private int heightRange;


    public MovementHandler(Map map){
        this.map = map;
    }

    public void setDestination(Point3D origin){
        this.origin = origin;
        this.destination = origin;
    }
    //gets the height range for the z axis
    public boolean canJump(){
        heightRange = entity.getStats().getJumpHeight();
        //need to get the topoligcal highest height
        //this is going to be a function called from map
        //pseudo code
        //if(map.getToplogicalHeight()>heightrange{return false}
        //else {return true}
        return true;
    }

    public boolean canMoveNorth(Point3D origin){
        //Need to check if the true/false stuff somehow
        setDestination(origin);
        destination.translateNorth();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getTile(destination.getX(),destination.getY());
        if(!destinationTile.hasEntity()&&canJump()){
            return true;
        }
        return false;
    }

    public boolean canMoveNorthEast(Point3D origin){
        //Need to check if the true/false stuff somehow
        setDestination(origin);
        destination.translateNorthEast();//Possible error.  origin and dest are linked together?
        Tile destinationTile = map.getTile(destination.getX(),destination.getY());
        if(!destinationTile.hasEntity()&&canJump()){
            return true;
        }
        return false;
    }
    public boolean canMoveSouthEast(Point3D origin){
        //Need to check if the true/false stuff somehow
        setDestination(origin);
        destination.translateSouthEast();
        Tile destinationTile = map.getTile(destination.getX(),destination.getY());
        if(!destinationTile.hasEntity()&&canJump()){
            return true;
        }
        return false;
    }
    public boolean canMoveSouthWest(Point3D origin){
        //Need to check if the true/false stuff somehow
        setDestination(origin);
        destination.translateSouthWest();
        Tile destinationTile = map.getTile(destination.getX(),destination.getY());
        if(!destinationTile.hasEntity()&&canJump()){
            return true;
        }
        return false;
    }
    public boolean canMoveNorthWest(Point3D origin){
        //Need to check if the true/false stuff somehow
        setDestination(origin);
        destination.translateNorthWest();
        Tile destinationTile = map.getTile(destination.getX(),destination.getY());
        if(!destinationTile.hasEntity()&&canJump()){
            return true;
        }
        return false;
    }

}
