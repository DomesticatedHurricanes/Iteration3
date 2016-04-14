package models.Interaction;

import models.Map.Map;
import models.entities.Avatar;
import models.entities.Entity;

/**
 * Created by Nicole on 4/14/16.
 */
public class AvatarInteractionHandler extends InteractionHandler{

    private Avatar avatar;

    public AvatarInteractionHandler(Avatar avatar, Map map){
        this.avatar = avatar;
        this.map = map;
    }

    public void updateAvatarPosition(){

    }

    public void tileInteraction(Entity entity){

    }
}
