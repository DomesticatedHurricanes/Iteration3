package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Monster;
import models.entities.NPC;
import models.entities.Pet;
import models.stats.StatModifier;
import utilities.Point3D;

/**
 * Created by Michael on 4/7/16.
 */
public class GrassTile extends Tile {

    public GrassTile(Point3D point3D){
        super(point3D);
        this.image = GraphicAssets.GrassTile2;
    }

    @Override
    public boolean visit(Avatar avatar) {
        System.out.println("grass visit called");
        cancelTimer();
        // Temporarily commented out to test basic movement
        if(checkHeightDifferential(avatar) && this.checkItem() && avatar.canWalk() && checkEntities()){
            avatar.setLocation(this.point3D);

            this.insertEntity(avatar);
            applyItems(avatar);
            applyAreaEffect(avatar);
            int heightDiff = this.point3D.getZ() - avatar.getLocation().getZ();
            if( heightDiff < -1){
                StatModifier fallDamage = StatModifier.makeCurrentHpModifier(heightDiff * 5);
                fallDamage.apply(avatar.getStats());
            }
            return true;
        }
        else if(getEntity() instanceof NPC){
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
        if(this.checkItem() && monster.canWalk() && checkEntities() && checkHeightDifferential(monster)){
            this.insertEntity(monster);
            return true;
        }

        return monster.canWalk();
    }

    @Override
    public boolean visit(Pet pet) {
        cancelTimer();
        if(this.checkItem() && pet.canWalk() && checkEntities() && checkHeightDifferential(pet)){
            this.insertEntity(pet);
            return true;
        }

        return pet.canWalk();
    }


    public String getType(){
        return "Grass";
    }
}
