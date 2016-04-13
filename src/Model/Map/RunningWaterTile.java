package Model.Map;

import Model.Graphics.GraphicAssets;

/**
 * Created by Michael on 4/7/16.
 * RunningWaterTile has a direction and speed to carry an Entity that goes in it
 */
public class RunningWaterTile extends Tile {

    // private Direction dir
    private int speed;

    public RunningWaterTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.RunningWaterTile;
    }

    public int getSpeed(){
        return speed;
    }



}
