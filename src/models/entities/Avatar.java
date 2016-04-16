package models.entities;


import models.Inventory.Inventory;
import models.Item.Item;
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
    //private Inventory inventory;


    public Avatar(Occupation occupation){
        this.inventory = new Inventory(16);
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

    public void equipGloves(Gloves gloves){inventory.equipGloves(gloves);}

    //Unequipping functions
    public void unequipHelmet(Helmet helmet){
        inventory.unequipHelmet();
    }

    public void unequipChestPlate(ChestPlate chestPlate) {
        inventory.unequipChestPlate();
    }

    public void unequipOneHandedWeapon(OneHandedWeapon oneHandedWeapon){ inventory.unequipOneHandedWeapon();}

    public void unequipRangedWeapon(Ranged rangedWeapon){
        inventory.unequipRangedWeapon();
    }

    public void unequipSlacks(Slacks slacks){
        inventory.unequipSlacks();
    }

    public void unequipBoots(Boots boots){
        inventory.unequipBoots();
    }

    public void unequipTwoHandedWeapon(TwoHandedWeapon twoHandedWeapon){ inventory.unequipTwoHandedWeapon();}

    public void unequipGloves(Gloves gloves){inventory.unequipGloves();}

    //Pack functions
    public void addItem(Item item){inventory.addItem(item);}

    public void removeItem(Item item){inventory.removeItem(item);}
    
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

    @Override
    public String getType() {
        return "Avatar";
    }
}
