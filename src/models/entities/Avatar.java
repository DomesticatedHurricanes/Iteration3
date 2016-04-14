package models.entities;

import models.Item.Inventory;
import models.Map.Tile;
import models.entities.occupation.Occupation;
import models.stats.CharacterStats;
import models.stats.Stats;

/**
 * Created by ben on 4/11/16.
 */
public class Avatar extends Entity implements Movement, Attack, EntityVisitable{

    CharacterStats stats;
    Inventory inventory;

    public Avatar(Occupation occupation){
        inventory = new Inventory();
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
