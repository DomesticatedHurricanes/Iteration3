package models.Item;

import models.entities.Entity;

/**
 * Created by mazumderm on 4/13/2016.
 */
public abstract class Item {

    //constructor
    public Item(){

    }

    public abstract boolean onTouch();

    public abstract void apply(Entity entity);
}
