package models.Item;

import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;

/**
 * Created by mazumderm on 4/13/2016.
 */
public abstract class Item {

    String name;

    //constructor
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract boolean onTouch();

    public abstract void apply(Entity entity);
}
