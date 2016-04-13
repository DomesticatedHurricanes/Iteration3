package Model.Map;

import Model.Graphics.GraphicAssets;

/**
 * Created by Michael on 4/7/16.
 */
public class GrassTile extends Tile {

    public GrassTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.GrassTile;
    }
}
