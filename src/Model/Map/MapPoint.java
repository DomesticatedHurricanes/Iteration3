package Model.Map;

/**
 * Created by Michael on 4/6/16.
 * MapPoint represents a 3d point on the map: x,y,z.
 */
public class MapPoint {

    private int x;
    private int y;
    private int z;

    public MapPoint(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }
}
