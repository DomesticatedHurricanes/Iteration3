package models.effects;

import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ben on 4/11/16.
 */
public abstract class PlanarEffect extends Effect{
    public abstract ArrayList<PointNode> getAdjacentPoints(PointNode originPoint);
}
