package models.Interaction;

import models.Map.Tile;
import models.entities.AINpc;
import models.entities.Entity;
import models.entities.NPC;
import utilities.Point3D;

/**
 * Created by david on 4/14/16.
 */
public interface AIObserver {

    void processMove(AINpc npc, Entity.Orientation orientation);
    void processThought(AINpc npc);
}
