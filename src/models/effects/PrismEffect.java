package models.effects;

import utilities.Point3D;

import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
public class PrismEffect extends VolumetricEffect{
    @Override
    public Queue<Point3D> tileFinder() {
        return null;
    }

    @Override
    public Point3D getAdjacentTiles() {
        return null;
    }
}
