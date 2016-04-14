package models.entities;

import models.stats.CharacterStats;
import models.Item.Inventory;

/**
 * Created by Breanna on 4/13/16.
 * Represents a NPC in the game.
 * Superclass for types of NPCs
 */
public abstract class NPC extends Entity {
    protected CharacterStats stats;
    protected Inventory inventory;
}
