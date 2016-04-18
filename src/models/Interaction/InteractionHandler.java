package models.Interaction;

import models.Map.Map;
import models.Map.Map3D;
import models.entities.AINpc;
import models.entities.Entity;
import models.entities.TileVisitable;

import java.util.ArrayList;

/**
 * Created by Nicole on 4/13/16.
 */
public class InteractionHandler implements AIObserver {

    ArrayList<AINpc> aiNpcs = new ArrayList<>();
    protected Map map;
    protected Map3D map3D;
    protected MovementHandler movementHandler;
    public InteractionHandler(Map3D map3D) {
        this.map3D = map3D;
        movementHandler = new MovementHandler(map3D);
    }

    public void subscribeToAI(AINpc aiNpc){
        aiNpc.addObserver(this);
        aiNpcs.add(aiNpc);
    }

    @Override
    public void processMove(AINpc npc, Entity.Orientation orientation) {
        TileVisitable aiNPC = (TileVisitable)npc;
        movementHandler.move(aiNPC, orientation);
    }

    @Override
    public void processThought(AINpc npc) {

    }

    public void move(TileVisitable entity, Entity.Orientation orientation){
        movementHandler.move(entity, orientation);
    }

    public boolean movementHandling(){
        return true;
    }

}
