package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;

/**
 * Created by Michael on 4/7/16.
 */
public class MountainTile extends Tile {

    public MountainTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.MountainTile;
    }

    @Override
    public boolean visit(Avatar avatar) {
        return avatar.canTraverse();
    }

    @Override
    public boolean visit(Monster monster) {
        return monster.canTraverse();
    }

    @Override
    public boolean visit(Pet pet) {
        return pet.canTraverse();
    }
}
