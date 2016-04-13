package Model.Map;

import Model.Graphics.GraphicAssets;

/**
 * Created by Michael on 4/7/16.
 */
public class MountainTile extends Tile {

    public MountainTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.MountainTile;
    }
}
