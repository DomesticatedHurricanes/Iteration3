package utilities;

/**
 * Created by ben on 4/12/16.
 */
public class Point3D {
    //Can pass in a hard coded Point
    public Point3D(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Can pass in the location
    public Point3D(Point3D location){
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


    public void translate(int x,int y){
        this.x += x;
        this.y += y;
    }
    //I LOVE RING OF OPERATIONS!!!!!
    public void translateNorth(){
        translate(0,-1);
    }

    public void translateSouth(){
        translate(0,1);
    }

    public void translateNorthWest(){
        translate(-1,0);
    }

    public void translateSouthWest(){
        translate(-1,1);
    }

    public void translateSouthEast(){
        translate(1,0);
    }

    public void translateNorthEast(){
        translate(1,-1);
    }

    public void translateUp(){translate(0,0,1);}

    public void translateDown(){translate(0,0,-1);}

    public void translate(int x,int y,int z){
        this.x += x;
        this.y += y;
        this.z += z;
    }

}