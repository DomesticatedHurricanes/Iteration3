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
        if(this.checkItem() && avatar.canTraverse()){
            this.insertEntity(avatar);
            applyItems(avatar);
            return true;
        }

        return avatar.canWalk();
    }

    @Override
    public boolean visit(Monster monster) {
        if(this.checkItem() && monster.canTraverse()){
            this.insertEntity(monster);
            return true;
        }

        return monster.canWalk();
    }

    @Override
    public boolean visit(Pet pet) {
        if(this.checkItem() && pet.canTraverse()){
            this.insertEntity(pet);
            return true;
        }

        return pet.canWalk();
    }
}
