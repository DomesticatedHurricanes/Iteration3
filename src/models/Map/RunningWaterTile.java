package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;

/**
 * Created by Michael on 4/7/16.
 * RunningWaterTile has a direction and speed to carry an Entity that goes in it
 */
public class RunningWaterTile extends Tile {

    // private Direction dir
    private int speed;

    public RunningWaterTile(MapPoint mapPoint){
        super(mapPoint);
        this.image = GraphicAssets.RunningWaterTile;
    }

    public int getSpeed(){
        return speed;
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
