package models.Item;

import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class OneShot extends Item {
    private StatModifiers statModifiers;

    public OneShot(String name, StatModifiers statModifier, BufferedImage bufferedImage){
        super(name, bufferedImage);
        this.statModifiers = statModifier;
    }

    public StatModifiers getModifer(){
        return this.statModifiers;
    }

    public boolean onTouch(){

        return true;
    }

    public void apply(Entity entity){
        getModifer().apply(entity.getStats());
    }

    public void apply(Avatar avatar){

    }

    public void apply(Pet pet){

    }

}
