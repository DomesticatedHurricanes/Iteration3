package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;
import utilities.Point3D;

/**
 * Created by Michael on 4/7/16.
 */
public class StillWaterTile extends Tile implements TileVisitor {


    public StillWaterTile(Point3D point3D){
        super(point3D);
        this.image = GraphicAssets.StillWaterTile;
    }

    @Override
    public boolean visit(Avatar avatar) {
        //TODO: Remember to remove avatar from previous tile in interaction handler
        if(this.checkItem() && avatar.canSwim()){
            this.insertEntity(avatar);
            applyItems(avatar);
            applyAreaEffect(avatar);
            return true;
        }

        return avatar.canTraverse();
    }

    @Override
    public boolean visit(Monster monster) {
        if(this.checkItem() && monster.canSwim()){
            this.insertEntity(monster);
            return true;
        }

        return monster.canTraverse();
    }

    @Override
    public boolean visit(Pet pet) {
        if(this.checkItem() && pet.canSwim()){
            this.insertEntity(pet);
            return true;
        }
        return pet.canSwim();
    }
}
