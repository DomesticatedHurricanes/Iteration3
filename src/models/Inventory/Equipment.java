package models.Inventory;

import models.Item.Takeable.Equippable.*;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Equipment {

    Helmet helmet;
    ChestPlate chestPlate;
    //weapon?
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

    //weapon accessors

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

    }

    public void equipTwoHandedWeapon(TwoHandedWeapon twoHandedWeapon){

    }

    public void equipRangedWeapon(Ranged rangedWeapon){

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

    }

    public void unequipTwoHandedWeapon(){

    }

    public void unequipRangedWeapon(){

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
