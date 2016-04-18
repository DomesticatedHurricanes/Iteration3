package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.NPC;
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
        cancelTimer();
        //TODO: Remember to remove avatar from previous tile in interaction handler
        if(this.checkItem() && avatar.canSwim() || (avatar.getIsRiding()) && checkEntities() && checkHeightDifferential(avatar)){
            this.insertEntity(avatar);
            applyItems(avatar);
            applyAreaEffect(avatar);
            return true;
        }
        else if(!checkEntities()){
            NPC npc = (NPC)(getEntity());
            npc.onInteract(avatar);
            return false;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean visit(Monster monster) {
        timer.cancel();
        if(this.checkItem() && monster.canSwim() && checkEntities() && checkHeightDifferential(monster)){
            this.insertEntity(monster);
            return true;
        }


        return monster.canTraverse();
    }

    @Override
    public boolean visit(Pet pet) {
        timer.cancel();
        if(this.checkItem() && pet.canSwim() && checkEntities() && checkHeightDifferential(pet)){
            this.insertEntity(pet);
            return true;
        }
        return pet.canSwim();
    }

    public String getType(){
        return "Water";
    }
}
