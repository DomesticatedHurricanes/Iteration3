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
        if(this.checkItem() && avatar.canTraverse()){
            this.insertEntity(avatar);
            applyItems(avatar);
            applyAreaEffect(avatar);
            return true;
        }

        return avatar.canTraverse();
    }

    @Override
    public boolean visit(Monster monster) {
        if(this.checkItem() && monster.canTraverse()){
            this.insertEntity(monster);
            return true;
        }

        return monster.canTraverse();
    }

    @Override
    public boolean visit(Pet pet) {
        if(this.checkItem() && pet.canTraverse()){
            this.insertEntity(pet);

            return true;
        }

        return pet.canTraverse();
    }
}
