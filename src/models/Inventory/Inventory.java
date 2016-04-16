package models.Inventory;

import models.Item.Item;
import models.Item.Takeable.Equippable.*;

/**
 * Created by david on 4/14/16.
 */
public class Inventory {
    Pack pack;
    Equipment equipment;

    //constructor
    public Inventory(int sizeOfInventory){
        pack = new Pack(sizeOfInventory - 6);
        equipment = new Equipment();
    }

    //accessor
    public Pack getPack(){
        return this.pack;
    }

    public Equipment getEquipment(){
        return this.equipment;
    }

    //equipping methods
    public void equipHelmet(Helmet helmet){
        equipment.equipHelmet(helmet);
    }

    public void equipChestPlate(ChestPlate chestPlate){
        equipment.equipChestPlate(chestPlate);
    }

    public void equipOneHandedWeapon(OneHandedWeapon oneHandedWeapon){
        equipment.equipOneHandedWeapon(oneHandedWeapon);
    }

    public void equipTwoHandedWeapon(TwoHandedWeapon twoHandedWeapon){
        equipment.equipTwoHandedWeapon(twoHandedWeapon);
    }

    public void equipRangedWeapon(Ranged rangedWeapon){
        equipment.equipRangedWeapon(rangedWeapon);
    }

    public void equipSlacks(Slacks slacks){
        equipment.equipSlacks(slacks);
    }

    public void equipBoots(Boots boots){
        equipment.equipBoots(boots);
    }

    public void equipGloves(Gloves gloves){
        equipment.equipGloves(gloves);
    }

    //unequipip
    public void unequipHelmet(){
        equipment.unequipHelmet();
    }

    public void unequipChestPlate(){
        equipment.unequipChestPlate();
    }

    public void unequipOneHandedWeapon(){
        equipment.unequipOneHandedWeapon();
    }

    public void unequipTwoHandedWeapon(){
        equipment.unequipTwoHandedWeapon();
    }

    public void unequipRangedWeapon(){
        equipment.unequipRangedWeapon();
    }

    public void unequipSlacks(){
        equipment.unequipSlacks();
    }

    public void unequipBoots(){
        equipment.unequipBoots();
    }

    public void unequipGloves(){
       equipment.unequipGloves();
    }

    //pack related methods
    public void addItem(Item item){
        pack.addItem(item);
    }

    public void removeItem(Item item){
       pack.removeItem(item);
    }
}
