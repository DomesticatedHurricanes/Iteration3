package models.Item.Takeable;

import models.Item.Item;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;
import models.entities.TakeableItemVisitable;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public abstract class Takeable extends Item{
    private int price;

    public Takeable(String name, int price, BufferedImage bufferedImage){
        super(name, bufferedImage);
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean onTouch(){
        return true;
    }

    public void apply(Entity entity){
        System.out.print("Applying item");
        Avatar avatar = (Avatar)entity;
        avatar.addItem(this);
    }

    public abstract void onUse(Entity entity);

}

