package models.Map;

import models.AreaEffect.AreaEffect;
import models.Item.Item;
import models.entities.Entity;
import utilities.Point3D;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Michael on 3/30/16.
 * Tile represents a single location on the map.
 * It is responsible for holding Entity, Item, AreaEffect, and Projectiles.
 */
public abstract class Tile implements TileVisitor {

    //Properties of tile
    protected Point3D point3D;
    protected BufferedImage image;
    protected Entity entity;
    protected ArrayList<Item> items = new ArrayList<>();
    protected AreaEffect areaEffect;

    //Methods of a tile
    public Tile(Point3D point3D){
        this.point3D = point3D;
    }

    public BufferedImage getImage(){
        return image;
    }

    protected void setImage(BufferedImage image){
        this.image = image;
    }

    public Point3D getPoint3D(){
        return this.point3D;
    }

    public Entity getEntity(){ return entity; }

    public void insertEntity(Entity entity){
        this.entity = entity;
    }


    //Checks if you can pass on the item on the tile.
    public boolean checkItem(){
        for(Item item: items){
            if(!item.onTouch())
                return false;
        }
        return true;
    }

    public void applyItems(Entity entity){
        for(Item item: items){
            item.apply(entity);
        }
    }

    public void applyAreaEffect(Entity entity){
        this.areaEffect.activate(entity);
    }

    public int getDepth(){
        return point3D.getZ();
    }

    public abstract String getType();


}
