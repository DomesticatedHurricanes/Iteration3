package models.Map;

import models.AreaEffect.AreaEffect;
import models.Item.Item;
import models.entities.Entity;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Michael on 3/30/16.
 * Tile represents a single location on the map.
 * It is responsible for holding Entity, Item, AreaEffect, and Projectiles.
 */
public abstract class Tile implements EntityVisitor {

    //Properties of tile
    protected MapPoint mapPoint;
    protected BufferedImage image;
    protected Entity entity;
    protected ArrayList<Item> items = new ArrayList<>();
    protected AreaEffect areaEffect;

    //Methods of a tile
    public Tile(MapPoint mapPoint){
        this.mapPoint = mapPoint;
    }

    public BufferedImage getImage(){
        return image;
    }

    protected void setImage(BufferedImage image){
        this.image = image;
    }

    public MapPoint getMapPoint(){
        return mapPoint;
    }

    public void insertEntity(Entity entity){
        this.entity = entity;
    }


    //Checks if you can pass on the item on the tile.
    public boolean checkItem(){
        for(Item item: items){
            if(!item.onTouch()){
                return false;
            }
        }

        return true;
    }

    public void applyItems(Entity entity){
        for(Item item: items){
            item.apply(entity);
        }
    }

    public void applyAreaEffect(Entity entity){

    }


}
