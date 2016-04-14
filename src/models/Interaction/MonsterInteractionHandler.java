package models.Interaction;

import models.Map.Map;
import models.entities.Entity;
import models.entities.Monster;

/**
 * Created by Nicole on 4/14/16.
 */
public class MonsterInteractionHandler extends InteractionHandler{

    public MonsterInteractionHandler(Monster monster, Map map){
        this.entity = monster;
        this.map = map;
    }

    protected void tileInteraction(Entity entity){

    }
}
