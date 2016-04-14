package models.entities;


import models.Item.Inventory;
import models.Map.Tile;
import models.entities.occupation.Occupation;
import models.stats.CharacterStats;
import models.stats.Stats;


/**
 * Created by Breanna on 4/13/16.
 * This class represents the player controlled Entity in the game
 * Subclass of Entity
 */


public class Avatar extends Entity implements Movement, Attack, EntityVisitable{
    private Occupation occupation;
    private CharacterStats stats;
    private Inventory inventory;


    public Avatar(Occupation occupation){
        this.inventory = new Inventory();
        this.occupation = occupation;
        stats = new CharacterStats();
        occupation.initStats(stats);
    }

    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }

    @Override
    public void attack() {

    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canTraverse() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }


    @Override
    public CharacterStats getStats(){
        return stats;
    }
}
