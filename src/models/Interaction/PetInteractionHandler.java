package models.Interaction;

import models.Map.Map;
import models.entities.Entity;
import models.entities.Pet;

/**
 * Created by MyMac on 4/14/16.
 */
public class PetInteractionHandler extends InteractionHandler {

    public PetInteractionHandler(Pet pet, Map map){
        entity = pet;

    }

    protected void tileInteraction(Entity entity){

    }

}
