package models.Item.Takeable;

import models.Item.Item;

/**
 * Created by mazumderm on 4/13/2016.
 */
public abstract class Takeable extends Item {
    private int price;

    public Takeable(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void onTouch(){

    }
}

