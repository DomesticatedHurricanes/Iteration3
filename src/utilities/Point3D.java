package utilities;

/**
 * Created by ben on 4/12/16.
 */
public class Point3D {
//Can pass in a hard coded Point
    Point3D(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
//Can pass in the location
    Point3D(Point3D location){
        this.x = location.x;
        this.y = location.y;
        this.z = location.z;
    }
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
