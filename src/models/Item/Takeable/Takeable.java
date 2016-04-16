package models.Item.Takeable;

import models.Item.Item;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;
import models.entities.TakeableItemVisitable;

/**
 * Created by mazumderm on 4/13/2016.
 */
public abstract class Takeable extends Item{
    private int price;

    public Takeable(String name, int price){
        super(name);
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

