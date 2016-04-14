package models.Interaction;

import models.Map.Map;
import models.entities.Entity;

/**
 * Created by Nicole on 4/13/16.
 */
public abstract class InteractionHandler {

    protected Entity entity;
    protected Map map;

    public InteractionHandler() {

    }

    public boolean movementHandling(){
        return true;
    }

    protected abstract void tileInteraction(Entity entity);

}
