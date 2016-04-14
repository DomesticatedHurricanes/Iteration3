package models.Map;

import models.entities.Entity;

import java.awt.image.BufferedImage;

/**
 * Created by Michael on 3/30/16.
 * Tile represents a single location on the map.
 * It is responsible for holding Entity, Item, AreaEffect, and Projectiles.
 */
public abstract class Tile implements EntityVisitor {
    protected MapPoint mapPoint;
    protected BufferedImage image;

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


}
