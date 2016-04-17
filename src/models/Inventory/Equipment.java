package models.Inventory;

import models.Item.Takeable.Equippable.*;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Equipment {

    Helmet helmet;
    ChestPlate chestPlate;
    Weapon weapon;
    Slacks slacks;
    Boots boots;
    Gloves gloves;

    public Equipment(){

    }

    //accesors
    public Helmet getHelmet(){
        return this.helmet;
    }

    public ChestPlate getChestPlate(){
        return this.chestPlate;
    }

    public Weapon getWeapon(){return this.weapon;}

    public Slacks getSlacks(){
        return this.slacks;
    }

    public Boots getBoots(){
        return this.boots;
    }

    public Gloves getGloves(){
        return this.gloves;
    }

    //equipping
    public void equipHelmet(Helmet helmet){
        this.helmet = helmet;
    }

    public void equipChestPlate(ChestPlate chestPlate){
        this.chestPlate = chestPlate;
    }

    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void equipSlacks(Slacks slacks){
        this.slacks = slacks;
    }

    public void equipBoots(Boots boots){
        this.boots = boots;
    }

    public void equipGloves(Gloves gloves){
        this.gloves = gloves;
    }

    //unequipping
    public void unequipHelmet(){
        this.helmet = null;
    }

    public void unequipChestPlate(){
        this.chestPlate = null;
    }

    public void unequipWeapon(){
        this.weapon = null;
    }

    public void unequipSlacks(){
        this.slacks = null;
    }

    public void unequipBoots(){
        this.boots = null;
    }

    public void unequipGloves(){
        this.gloves = null;
    }

    //print methods
    public void printInventoryContents(){
        System.out.println("Helmet: " + helmet);
        System.out.println("Chest Plate: " + chestPlate);
        System.out.println("Weapon: " + weapon);
        System.out.println("Slacks: " + slacks);
        System.out.println("Boots: " + boots);
        System.out.println("Gloves: " + gloves);
    }
}
