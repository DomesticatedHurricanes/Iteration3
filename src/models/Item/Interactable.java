package models.Item;

import models.entities.Entity;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Interactable extends Item {

    private boolean isActivated;

    public Interactable(){

    }

    public boolean onTouch(){
        return false;
    }

    public void apply(Entity entity){

    }
}
