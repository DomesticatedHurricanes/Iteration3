package models.entities;

import models.Item.Inventory;
import models.Item.Takeable.Equippable.*;
import models.Item.Takeable.TakeableItemVisitor;
import models.Map.Tile;
import models.entities.occupation.Occupation;
import models.stats.CharacterStats;

/**
 * Created by Breanna on 4/13/16.
 * This class represents the player controlled Entity in the game
 * Subclass of Entity
 */



public class Avatar extends Entity implements Movement, Attack, TileVisitable, TakeableItemVisitable{
    private Occupation occupation;
    private CharacterStats stats;
    private Inventory inventory;


    public Avatar(Occupation occupation){
        this.inventory = new Inventory();
        this.occupation = occupation;
        stats = new CharacterStats();
        occupation.initStats(stats);
    }

    //Visitable methods
    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }

    @Override
    public void accept(TakeableItemVisitor takeableItemVisitor) {
        takeableItemVisitor.visit(this);
    }

    //Attacking method
    @Override
    public void attack() {

    }

    //Equipping functions
    public void equipHelmet(Helmet helmet){
        inventory.equipHelmet(helmet);
    }

    public void equipChestPlate(ChestPlate chestPlate) {
        inventory.equipChestPlate(chestPlate);
    }


    //Movement booleans
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

    //Getters
    @Override
    public CharacterStats getStats(){
        return stats;
    }



}
