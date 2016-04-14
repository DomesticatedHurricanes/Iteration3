package models.effects;

import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
//How to do it without type checking Orienation?
    //One way is to have many linear effects class.  And interface it.  But is there a better way?
public class LinearEffect extends PlanarEffect{
    @Override
    public Queue<Point3D> tileFinder() {
        return null;
    }

    @Override
    public ArrayList<PointNode> getAdjacentPoints(PointNode originPoint) {
        return null;
    }
}
