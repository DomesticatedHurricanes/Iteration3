package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;
import utilities.Point3D;

/**
 * Created by Michael on 4/7/16.
 */
public class GrassTile extends Tile {

    public GrassTile(Point3D point3D){
        super(point3D);
        this.image = GraphicAssets.GrassTile;
    }

    @Override
    public boolean visit(Avatar avatar) {
        if(this.checkItem() && avatar.canWalk()){
            this.insertEntity(avatar);
            applyItems(avatar);
            applyAreaEffect(avatar);
            return true;
        }

        return avatar.canWalk();
    }

    @Override
    public boolean visit(Monster monster) {
        if(this.checkItem() && monster.canWalk()){
            this.insertEntity(monster);
            return true;
        }

        return monster.canWalk();
    }

    @Override
    public boolean visit(Pet pet) {
        if(this.checkItem() && pet.canWalk()){
            this.insertEntity(pet);
            return true;
        }

        return pet.canWalk();
    }
}
