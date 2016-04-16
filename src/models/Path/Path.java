package models.Path;

import models.models;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Michael on 4/15/16.
 */
public class Path {
    private ArrayList<Point3D> points = new ArrayList<>();

    public Path() {

    }
    public int getLength() {
        return points.size();
    }

    public  Point3D getPoint(int index) {
        return points.get(index);
    }

    public int getX(int index) {
        return points.get(index).getX();
    }

    public int getY(int index) {
        return points.get(index).getY();
    }

    public int getZ(int index) { return points.get(index).getZ(); }

    public void appendStep(int x, int y, int z) {
        points.add(new Point3D(x,y,z));
    }

    public void prependStep(int x, int y, int z) {
        points.add(0, new Point3D(x, y,z));
    }

    public boolean contains(int x, int y, int z) {
        return points.contains(new Point3D(x,y,z));
    }

}
