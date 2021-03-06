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
public class MountainTile extends Tile {

    public MountainTile(Point3D point3D){
        super(point3D);
        this.image = GraphicAssets.MountainTile;
    }

    @Override
    public boolean visit(Avatar avatar) {
        cancelTimer();
        if(this.checkItem() && avatar.canTraverse() && checkEntities() && checkHeightDifferential(avatar)){
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
        cancelTimer();
        if(this.checkItem() && monster.canTraverse() && checkEntities() && checkHeightDifferential(monster)){
            this.insertEntity(monster);
            return true;
        }

        return monster.canTraverse();
    }

    @Override
    public boolean visit(Pet pet) {
        cancelTimer();
        if(this.checkItem() && pet.canTraverse() && checkEntities() && checkHeightDifferential(pet)){
            this.insertEntity(pet);

            return true;
        }

        return pet.canTraverse();
    }

    public String getType(){
        return "Mountain";
    }
}
