package models.Inventory;

import models.Item.Takeable.Equippable.*;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Equipment {

    Helmet helmet;
    ChestPlate chestPlate;
    //weapon?
    Weapon leftHand;
    Weapon rightHand;
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

    public Weapon getLeftHandWeapon(){return this.leftHand;}

    public Weapon getRightHandWeapon(){return this.rightHand;}

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

    public void equipOneHandedWeapon(OneHandedWeapon oneHandedWeapon){
        this.rightHand = oneHandedWeapon;
    }

    public void equipTwoHandedWeapon(TwoHandedWeapon twoHandedWeapon){
        this.leftHand = twoHandedWeapon;
        this.rightHand = twoHandedWeapon;
    }

    public void equipRangedWeapon(Ranged rangedWeapon){
        this.leftHand = rangedWeapon;
        this.rightHand = rangedWeapon;
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

    public void unequipOneHandedWeapon(){
        this.rightHand = null;
    }

    public void unequipTwoHandedWeapon(){
        this.leftHand = null;
        this.rightHand = null;
    }

    public void unequipRangedWeapon(){
        this.leftHand = null;
        this.rightHand = null;
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
}
