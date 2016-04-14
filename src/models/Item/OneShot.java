package models.Item;

import models.entities.Entity;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class OneShot extends Item {
    private StatModifiers statModifiers;

    public OneShot(StatModifiers statModifier){
        this.statModifiers = statModifier;
    }

    public StatModifiers getModifer(){
        return this.statModifiers;
    }

    public boolean onTouch(){
        return true;
    }

    public void apply(Entity entity){

    }

}
