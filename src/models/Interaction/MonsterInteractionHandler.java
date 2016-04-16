package models.Interaction;

import models.Map.Map;
import models.entities.Entity;
import models.entities.Monster;

/**
 * Created by Nicole on 4/14/16.
 */
public class MonsterInteractionHandler extends InteractionHandler{

    private Monster monster;
    private PathFinder PF;

    public MonsterInteractionHandler(Monster monster, Map map){
        this.monster = monster;
        this.map = map;
       // PF = new PathFinder(monster, avatar); // fix this as soon as we figure out how to get the avatar as a parameter
    }

    public void updateMonster(){

    }

    @Override
    protected void tileInteraction(Entity entity){
    }

    public boolean isPursuingAvatar(){

        if(monster.getAggression() == 5){
            return true;
        }
        else return false;
    }
}
