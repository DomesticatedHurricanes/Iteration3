package models.Interaction;

import models.Map.Map;
import models.Map.Map3D;
import models.entities.AINpc;
import models.entities.Entity;

import java.util.ArrayList;

/**
 * Created by Nicole on 4/13/16.
 */
public abstract class InteractionHandler implements AIObserver {

    ArrayList<AINpc> aiNpcs = new ArrayList<>();
    protected Map map;
    protected Map3D map3D;
    protected MovementHandler movementHandler;
    public InteractionHandler() {
        movementHandler = new MovementHandler(map3D);
    }

    public void subscribeToAI(AINpc aiNpc){
        aiNpc.addObserver(this);
        aiNpcs.add(aiNpc);
    }

    public boolean movementHandling(){
        return true;
    }

    protected abstract void tileInteraction(Entity entity);

}
