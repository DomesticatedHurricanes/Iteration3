package Model.Map;

import Model.Graphics.GraphicAssets;

/**
 * Created by Michael on 4/7/16.
 */
public class StillWaterTile extends Tile {


    public StillWaterTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.StillWaterTile;
    }
}
