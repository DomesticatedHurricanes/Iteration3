package models.Interaction;

import models.Map.Tile;
import models.entities.NPC;
import utilities.Point3D;

/**
 * Created by david on 4/14/16.
 */
public interface AIObserver {
    void processMove(NPC npc);
    void processThought(NPC npc);
}
