package models.Interaction;

import models.Map.Map;
import models.entities.Entity;
import models.entities.Pet;

/**
 * Created by Nicole on 4/14/16.
 */
public class PetInteractionHandler extends InteractionHandler {

    public PetInteractionHandler(Pet pet, Map map){
        entity = pet;
        this.map = map;
    }

    protected void tileInteraction(Entity entity){

    }

}