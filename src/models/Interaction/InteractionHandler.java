package models.Interaction;

import models.Map.Map;
import models.entities.Entity;

/**
 * Created by MyMac on 4/13/16.
 */
public abstract class InteractionHandler {

    protected Entity entity;
    protected Map map;

    public InteractionHandler(Entity entity, Map map){
        this.entity = entity;
        this.map = map;
    }

    public boolean movementHandling(){
        return true;
    }

    protected abstract void tileInteraction(Entity entity);

}
