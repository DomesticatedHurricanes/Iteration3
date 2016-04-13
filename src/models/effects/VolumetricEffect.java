package models.effects;

import utilities.Point3D;

/**
 * Created by ben on 4/11/16.
 */
public abstract class VolumetricEffect extends Effect{
    public abstract Point3D getAdjacentTiles();
}
