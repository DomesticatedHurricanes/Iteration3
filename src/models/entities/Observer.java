package models.entities;

import models.Map.Tile;
import utilities.Point3D;

/**
 * Created by david on 4/14/16.
 */
public interface Observer {
    void processMove(NPC npc, Point3D point3D);
    void processThought(NPC npc);
}
