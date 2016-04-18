package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;
import models.entities.Avatar;
import models.entities.Entity;
import utilities.Point3D;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class Teleport extends AreaEffect {


    private Map3D map3D;
    private Tile dest;//Probably will throw null pointer since dest
    //is not initialized

    public Teleport(Tile destination, Map3D map3D){
        this.areaEffectImage = GraphicAssets.teleport;
        this.dest = destination;
        this.map3D = map3D;
    }

    @Override
    public void activate(Avatar avatar){
        Tile origin = map3D.getRelevantTile(avatar.getLocation().getX(), avatar.getLocation().getY());
        dest.insertEntity(avatar);
        origin.removeEntity();
        avatar.accept(dest);
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.teleport;
    }

}
