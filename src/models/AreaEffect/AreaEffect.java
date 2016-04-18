package models.AreaEffect;

import models.entities.Avatar;
import models.entities.Entity;
import utilities.Point3D;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public abstract class AreaEffect {
    //Methods for all AreaEffects
    public abstract void activate(Avatar avatar);
    public abstract BufferedImage initImage();
    protected BufferedImage areaEffectImage;
    private Point3D location;


    public AreaEffect(){}
    public Point3D getLocation() {
        return location;
    }
    public void setLocation(Point3D location){
        this.location = location;
    }

    public BufferedImage getAreaEffectImage(){
        return areaEffectImage;
    }
}
