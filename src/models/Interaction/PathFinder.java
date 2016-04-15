package models.Interaction;

import models.Map.Tile;
import models.entities.Avatar;
import models.entities.NPC;
import utilities.Point3D;

import java.util.List;

/**
 * Created by Nicole on 4/15/16.
 *
 * This class is responsible for generating shortest paths that NPCs will take in trying to reach the Avatar.
 * e.g. Monster heading for Avatar, Pet going to Avatar
 *
 */
public class PathFinder {

    private Tile tile;
    private List<Point3D> path;
    private NPC npc;

    public PathFinder(NPC npc, Avatar avatar){
        // TODO initialize this stuff in PetInteraction and MonsterInteraction
    }

}
