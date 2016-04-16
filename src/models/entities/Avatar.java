package models.entities;
import models.entities.occupation.Occupation;
import models.stats.CharacterStats;
import models.Inventory.Inventory;
import models.Item.Item;
import models.Item.Takeable.Equippable.*;
import models.Item.Takeable.TakeableItemVisitor;
import models.Map.Tile;


import java.awt.image.BufferedImage;

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
        occupation.initImage(entityImage);
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

    public void equipWeapon(Weapon weapon){inventory.equipWeapon(weapon);   }

    public void equipSlacks(Slacks slacks){
        inventory.equipSlacks(slacks);
    }

    public void equipBoots(Boots boots){
        inventory.equipBoots(boots);
    }

    public void equipGloves(Gloves gloves){inventory.equipGloves(gloves);}

    //Unequipping functions
    public void unequipHelmet(){
        inventory.unequipHelmet();
    }

    public void unequipChestPlate() {
        inventory.unequipChestPlate();
    }

    public void unequipWeapon(){ inventory.unequipWeapon();}

    public void unequipSlacks(){
        inventory.unequipSlacks();
    }

    public void unequipBoots(){
        inventory.unequipBoots();
    }

    public void unequipGloves(){inventory.unequipGloves();}

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


    public Inventory getInventory(){return inventory;}


}
