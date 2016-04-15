package models.effects;

import utilities.Point3D;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by ben on 4/11/16.
 */
public class HemiConicalEffect extends VolumetricEffect{
    @Override
    public Queue<Point3D> tileFinder() {
        return null;
    }

    @Override
    public ArrayList<PointNode> getAdjacentPoints(PointNode originPoint) {
        return null;
    }
}
