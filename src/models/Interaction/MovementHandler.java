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

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map2.getTile(((Entity) entity).getLocation().getX(),((Entity) entity).getLocation().getY());

        // Get the destination point to check if valid
        Point3D dest = entityTemp.getLocation().getTranslateSouth();
        // Check the destination tile
        Tile destinationTile = map2.getTile(dest.getX(),dest.getY());

        // If the entity can move to that tile
        if(entity.accept(destinationTile)){
            // Set the entities location to the new location
            destination.translateSouth();

            // Remove the entity from the previous tile
            originTile.removeEntity();
        }
    }

    public void moveSouthWest(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map2.getTile(((Entity) entity).getLocation().getX(),((Entity) entity).getLocation().getY());

        // Get the destination point to check if valid
        Point3D dest = entityTemp.getLocation().getTranslateSouthWest();
        // Check the destination tile
        Tile destinationTile = map2.getTile(dest.getX(),dest.getY());

        // If the entity can move to that tile
        if(entity.accept(destinationTile)){
            // Set the entities location to the new location
            destination.translateSouthWest();

            // Remove the entity from the previous tile
            originTile.removeEntity();
        }
    }

    public void moveSouthEast(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map2.getTile(((Entity) entity).getLocation().getX(),((Entity) entity).getLocation().getY());

        // Get the destination point to check if valid
        Point3D dest = entityTemp.getLocation().getTranslateSouthEast();
        // Check the destination tile
        Tile destinationTile = map2.getTile(dest.getX(),dest.getY());

        // If the entity can move to that tile
        if(entity.accept(destinationTile)){
            // Set the entities location to the new location
            destination.translateSouthEast();

            // Remove the entity from the previous tile
            originTile.removeEntity();
        }
    }
    public void moveNorth(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map2.getTile(((Entity) entity).getLocation().getX(),((Entity) entity).getLocation().getY());

        // Get the destination point to check if valid
        Point3D dest = entityTemp.getLocation().getTranslateNorth();
        // Check the destination tile
        Tile destinationTile = map2.getTile(dest.getX(),dest.getY());

        // If the entity can move to that tile
        if(entity.accept(destinationTile)){
            // Set the entities location to the new location
            destination.translateNorth();

            // Remove the entity from the previous tile
            originTile.removeEntity();

            //David's Code
//        setDestination(entityTemp.getLocation());
//        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
//        destination.translateNorth();//Possible error.  origin and dest are linked together?
//        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
//        if(entity.accept(destinationTile)){
//            originTile.removeEntity();
//            System.out.println("Success");
//        }
//        else{
//            System.out.println(destinationTile.getType());
//>>>>>>> master
        }
    }

    public void moveNorthWest(TileVisitable entity){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity)entity;

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map2.getTile(((Entity) entity).getLocation().getX(),((Entity) entity).getLocation().getY());

        // Get the destination point to check if valid
        Point3D dest = entityTemp.getLocation().getTranslateNorthWest();
        // Check the destination tile
        Tile destinationTile = map2.getTile(dest.getX(),dest.getY());

        // If the entity can move to that tile
        if(entity.accept(destinationTile)){
            // Set the entities location to the new location
            destination.translateNorthWest();

            // Remove the entity from the previous tile
            originTile.removeEntity();

//         David's Code
//        setDestination(entityTemp.getLocation());
//        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
//        destination.translateNorthWest();//Possible error.  origin and dest are linked together?
//        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
//        if(entity.accept(destinationTile)){
//            entityTemp.setLocation(destination);

        }
    }


    public void moveNorthEast(TileVisitable entity) {
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity) entity;

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map2.getTile(((Entity) entity).getLocation().getX(), ((Entity) entity).getLocation().getY());

        // Get the destination point to check if valid
        Point3D dest = entityTemp.getLocation().getTranslateNorthEast();
        // Check the destination tile
        Tile destinationTile = map2.getTile(dest.getX(), dest.getY());

        // If the entity can move to that tile
        if (entity.accept(destinationTile)) {
            // Set the entities location to the new location
            destination.translateNorthEast();

            // Remove the entity from the previous tile
            originTile.removeEntity();
        }

    }

    public void move(TileVisitable entity, Entity.Orientation orientation){
        //Need to check if the true/false stuff somehow
        Entity entityTemp = (Entity) entity;

        // Set the destination tile
        setDestination(entityTemp.getLocation());

        // Get the original tile
        Tile originTile = map.getRelevantTile(((Entity) entity).getLocation().getY(),((Entity) entity).getLocation().getX());

        // Get the destination point to check if valid
        Point3D dest = orientation.translate(entityTemp.getLocation());
        // Check the destination tile
        Tile destinationTile = map.getRelevantTile(dest.getY(),dest.getX());

        // If the entity can move to that tile
        if (entity.accept(destinationTile)) {
            // Set the entities location to the new location
            entityTemp.setLocation(orientation.translate(destination));

            // Remove the entity from the previous tile
            originTile.removeEntity();
        }
    }

//        David's code
//        setDestination(entityTemp.getLocation());
//        Tile originTile = map.getRelevantTile(entityTemp.getLocation().getX(), entityTemp.getLocation().getY());
//        destination.translateNorthEast();//Possible error.  origin and dest are linked together?
//        Tile destinationTile = map.getRelevantTile(destination.getX(),destination.getY());
//        if(entity.accept(destinationTile)){
//            originTile.removeEntity();
//        }
}

