package models.entities;

import models.Item.Inventory;
import models.Item.Takeable.Equippable.*;
import models.Item.Takeable.TakeableItemVisitor;
import models.Map.Tile;
import models.entities.occupation.Occupation;
import models.stats.CharacterStats;

/**
 * Created by ben on 4/11/16.
 */
public class Avatar extends Entity implements Movement, Attack, TileVisitable, TakeableItemVisitable{

    CharacterStats stats;
    Inventory inventory;

    public Avatar(Occupation occupation){
        inventory = new Inventory();
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

    public void equipChestPlate(ChestPlate chestPlate){
        inventory.equipChestPlate(chestPlate);
    }

    public void equipOneHandedWeapon(OneHandedWeapon oneHandedWeapon){
        inventory.equipOneHandedWeapon(oneHandedWeapon);
    }

    public void equipTwoHandedWeapon(TwoHandedWeapon twoHandedWeapon){
        inventory.equipTwoHandedWeapon(twoHandedWeapon);
    }

    public void equipRangedWeapon(Ranged rangedWeapon){
        equipRangedWeapon(rangedWeapon);
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
