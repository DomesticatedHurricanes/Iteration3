package models.Interaction;

import models.Map.Map;
import models.entities.Avatar;
import models.entities.Entity;

/**
 * Created by Nicole on 4/14/16.
 */
public class AvatarInteractionHandler extends InteractionHandler{


    public AvatarInteractionHandler(Avatar avatar, Map map){
        entity = avatar;
        this.map = map;
    }

    public void tileInteraction(Entity entity){

    }
}
