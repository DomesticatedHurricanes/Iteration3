package models.AreaEffect;

import models.entities.Entity;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public abstract class AreaEffect {

    //Methods for all AreaEffects
    public abstract void activate(Entity entity);
    public abstract BufferedImage initImage();
}
