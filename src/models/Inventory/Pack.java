package models.Inventory;

import models.Item.Item;

import java.util.ArrayList;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Pack {
    ArrayList<Item> items;
    int sizeOfPack;

    public Pack(int sizeOfPack){
        items = new ArrayList<>();
        this.sizeOfPack = sizeOfPack;
    }

    public boolean isNotFull(){
        return (items.size() < sizeOfPack);
    }

    public void addItem(Item item){
        if(isNotFull()){ //if pack is already full you cannot add the item to the pack
            items.add(item);
        }
        else{
            System.out.println("Full");
        }
        //go to interaction handler  to drop an item
    }

    public void removeItem(Item item){
       items.remove(item);
    }

    public ArrayList<Item> getPackContents(){
        return items;
    }
}
