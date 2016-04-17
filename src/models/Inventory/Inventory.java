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
        pack = new Pack(sizeOfInventory - 7);
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
        if(equipment.getHelmet() == null){
            equipment.equipHelmet(helmet);
        }
        else{
            Helmet tmp = equipment.getHelmet();
            equipment.equipHelmet(helmet);
            pack.addItem(tmp);
        }
    }

    public void equipChestPlate(ChestPlate chestPlate){
        if(equipment.getChestPlate() == null){
            equipment.equipChestPlate(chestPlate);
        }
        else{
            ChestPlate tmp = equipment.getChestPlate();
            equipment.equipChestPlate(chestPlate);
            pack.addItem(tmp);
        }
    }

    public void equipWeapon(Weapon weapon){
        equipment.equipWeapon(weapon);
    }

    public void equipSlacks(Slacks slacks){
        if(equipment.getSlacks() == null){
            equipment.equipSlacks(slacks);
        }
        else{
            Slacks tmp = equipment.getSlacks();
            equipment.equipSlacks(slacks);
            pack.addItem(tmp);
        }
    }

    public void equipBoots(Boots boots){
        if(equipment.getBoots() == null){
            equipment.equipBoots(boots);
        }
        else{
            Boots tmp = equipment.getBoots();
            equipment.equipBoots(boots);
            pack.addItem(tmp);
        }
    }

    public void equipGloves(Gloves gloves){
        if(equipment.getGloves() == null){
            equipment.equipGloves(gloves);
        }
        else{
            Gloves tmp = equipment.getGloves();
            equipment.equipGloves(gloves);
            pack.addItem(tmp);
        }
    }

    //unequip
    public void unequipHelmet(){
        Helmet helmet = equipment.getHelmet();
        equipment.unequipHelmet();
        pack.addItem(helmet);
    }

    public void unequipChestPlate(){
        ChestPlate chestPlate = equipment.getChestPlate();
        equipment.unequipChestPlate();
        pack.addItem(chestPlate);
    }

    public void unequipWeapon(){
        Weapon weapon = equipment.getWeapon();
        equipment.unequipWeapon();
        pack.addItem(weapon);
    }

    public void unequipSlacks(){
        Slacks slacks = equipment.getSlacks();
        equipment.unequipSlacks();
        pack.addItem(slacks);
    }

    public void unequipBoots(){
        Boots boots = equipment.getBoots();
        equipment.unequipBoots();
        pack.addItem(boots);
    }

    public void unequipGloves(){
        Gloves gloves = equipment.getGloves();
        equipment.unequipGloves();
        pack.addItem(gloves);
    }

    //pack related methods
    public void addItem(Item item){
        pack.addItem(item);
    }

    public void removeItem(Item item){
       pack.removeItem(item);
    }


}
