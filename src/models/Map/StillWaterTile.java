package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Monster;
import models.entities.Pet;

/**
 * Created by Michael on 4/7/16.
 */
public class StillWaterTile extends Tile implements EntityVisitor {


    public StillWaterTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.StillWaterTile;
    }

    @Override
    public boolean visit(Avatar avatar) {
        return avatar.canSwim();
    }

    @Override
    public boolean visit(Monster monster) {
        return monster.canSwim();
    }

    @Override
    public boolean visit(Pet pet) {
        return pet.canSwim();
    }
}
