package models.Item.Takeable;

import models.Item.Item;
import models.entities.Entity;

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

    public boolean onTouch(){
        return false;
    }

    public void apply(Entity entity){

    }

    public abstract void onUse(Entity entity);

}

