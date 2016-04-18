package models.Inventory;

import models.Item.Item;

import java.util.ArrayList;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Pack {
    ArrayList<Item> items;
    int money;
    int sizeOfPack;

    public Pack(int sizeOfPack){
        items = new ArrayList<>();
        this.sizeOfPack = sizeOfPack;
        this.money = 100;
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

    public boolean isEmpty(){return (items.size()==0);}

    public void removeItem(Item item){
       items.remove(item);
    }

    public Item getItemAt(int i){return getPackContents().get(i);}

    public ArrayList<Item> getPackContents(){
        return items;
    }

    public int getAmountOfItemsInPack(){return getPackContents().size();}

    public int getMoney(){
        return this.money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void addMoney(int addAmount){
        this.money = this.money + addAmount;
    }

    public void deductMoney(int deductAmount){
        this.money = this.money - deductAmount;
    }
}
