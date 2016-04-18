package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;
import utilities.Point3D;

/**
 * Created by david on 4/15/16.
 */
public class AirTile extends Tile {

    public AirTile(Point3D point3D){
        super(point3D);
        //Add or don't an image to AirTile
    }

    @Override
    public boolean visit(Avatar avatar) {
        cancelTimer();
        //TODO: Remember to remove avatar from previous tile in interaction handler
        if(this.checkItem() && avatar.canSwim() && checkEntities() && checkHeightDifferential(avatar) && (avatar.isTrapped()==false)){
            this.insertEntity(avatar);
            applyItems(avatar);
            applyAreaEffect(avatar);
            return true;
        }
        return avatar.canFly();
    }

    @Override
    public boolean visit(Monster monster) {
        cancelTimer();
        if(this.checkItem() && monster.canFly() && checkEntities() && checkHeightDifferential(monster) && (monster.isTrapped()==false)){
            this.insertEntity(monster);
            return true;
        }

        return monster.canFly();
    }

    @Override
    public boolean visit(Pet pet) {
        cancelTimer();
        if(this.checkItem() && pet.canFly() && checkEntities() && checkHeightDifferential(pet) && (pet.isTrapped()==false)){
            this.insertEntity(pet);
            return true;
        }
        return pet.canFly();
    }

    public String getType(){
        return "Air";
    }
}
