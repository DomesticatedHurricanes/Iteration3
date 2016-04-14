package models.Item.Takeable.Equippable;

import models.Item.Takeable.Takeable;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Equippable extends Takeable {
    private StatModifiers statModifier;

    public Equippable(StatModifiers statModifier, int price){
        super(price);
        this.statModifier = statModifier;
    }

    public StatModifiers getModifier(){
        return this.statModifier;
    }

    @Override
    public void onUse(Entity entity) {

    }
}
