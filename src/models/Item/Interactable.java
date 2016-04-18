package models.Item;

import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Interactable extends Item {

    private boolean isActivated;

    public Interactable(String name,BufferedImage bufferedImage){
        super(name, bufferedImage);
    }

    public boolean onTouch(){
        return false;
    }

    public void apply(Entity entity){

    }

    public void apply(Avatar avatar){

    }

    public void apply(Pet pet){

    }



}
