package models.AreaEffect;

import models.entities.Entity;
import utilities.Point3D;

import java.awt.*;

/**
 * Created by david on 4/12/16.
 */
public class Teleport extends AreaEffect {

    private Point3D dest;

    public Teleport(Point3D destination){
        this.dest = destination;
    }

    @Override
    public void activate(Entity entity){
        entity.setLocation(dest);
    }
}
