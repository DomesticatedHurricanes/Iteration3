package models.Map;

import models.Graphics.GraphicAssets;
import models.Interaction.MovementHandler;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;
import models.Direction.Direction;
import utilities.Point3D;

/**
 * Created by Michael on 4/7/16.
 * RunningWaterTile has a direction and speed to carry an Entity that goes in it
 */
public class RunningWaterTile extends Tile {

    private Direction dir;
    private int speed;

    public RunningWaterTile(Point3D point3D, int speed){
        super(point3D);
        this.image = GraphicAssets.RunningWaterTile;
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }


    @Override
    public boolean visit(Avatar avatar) {
        if(this.checkItem() && avatar.canSwim() && checkEntities() && checkHeightDifferential(avatar) && (avatar.isTrapped()==false)){
            this.insertEntity(avatar);
            if(avatar.getStats().getMovement() - speed > 0) {

            }
            avatar.setLocation(this.point3D.getTranslateSouth());
           // applyItems(avatar);
            //applyAreaEffect(avatar);
            return true;
        }

        return avatar.canSwim();
    }

    @Override
    public boolean visit(Monster monster) {
        if(this.checkItem() && monster.canSwim() && checkEntities() && checkHeightDifferential(monster) && (monster.isTrapped()==false)){
            this.insertEntity(monster);
            return true;
        }

        return monster.canSwim();
    }

    @Override
    public boolean visit(Pet pet) {
        if(this.checkItem() && pet.canSwim() && checkEntities() && checkHeightDifferential(pet) && (pet.isTrapped()==false)){
            this.insertEntity(pet);
            return true;
        }

        return pet.canSwim();
    }

    @Override
    public String getType() {
        return "Running";
    }
}
