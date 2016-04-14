package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;

/**
 * Created by Michael on 4/7/16.
 */
public class GrassTile extends Tile {

    public GrassTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.GrassTile;
    }

    @Override
    public boolean visit(Avatar avatar) {
        return avatar.canWalk();
    }

    @Override
    public boolean visit(Monster monster) {
        return monster.canWalk();
    }

    @Override
    public boolean visit(Pet pet) {
        return pet.canWalk();
    }
}
