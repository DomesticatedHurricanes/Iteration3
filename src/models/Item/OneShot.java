package models.Item;

import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;
import models.stats.StatModifier;
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
        bufferedImage = null;
        return true;
    }


    public void apply(Avatar avatar){
        StatModifier healDamage = StatModifier.makeCurrentHpModifier(avatar.getStats().getMaxHp());
        System.out.println(avatar.getStats().getCurrentHp());
        healDamage.apply(avatar.getStats());
        System.out.println(avatar.getStats().getCurrentHp());
    }

    public void apply(Entity entity){}

    public void apply(Pet pet){

    }

}
