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

    //called when an Avatar uses a skill
    public void useSkill() { }

    //Visitable methods
    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }

    //called when an Avatar does an attack
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

    public void equipOneHandedWeapon(OneHandedWeapon oneHandedWeapon){ inventory.equipOneHandedWeapon(oneHandedWeapon);}

    public void equipRangedWeapon(Ranged rangedWeapon){
        inventory.equipRangedWeapon(rangedWeapon);
    }

    public void equipSlacks(Slacks slacks){
        inventory.equipSlacks(slacks);
    }

    public void equipBoots(Boots boots){
        inventory.equipBoots(boots);
    }

    public void equipTwoHandedWeapon(TwoHandedWeapon twoHandedWeapon){ inventory.equipTwoHandedWeapon(twoHandedWeapon);}

    
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

    @Override
    public boolean canFly() {
        return false;
    }

    //Getters
    @Override
    public CharacterStats getStats(){
        return stats;
    }



}
