package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Entity;
import utilities.Point3D;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class Teleport extends AreaEffect {



    private Point3D dest;//Probably will throw null pointer since dest
    //is not initialized

    public Teleport(Point3D destination){
        this.areaEffectImage = GraphicAssets.teleport;
        this.dest = destination;
    }

    @Override
    public void activate(Entity entity){
        entity.setLocation(dest);
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.teleport;
    }

}
