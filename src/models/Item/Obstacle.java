package models.Item;

import models.entities.Entity;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Obstacle extends Item {

    public Obstacle(){

    }

    public boolean onTouch(){
        return false;
    }

    public void apply(Entity entity){

    }
}
