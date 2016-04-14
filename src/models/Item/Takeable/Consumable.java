package models.Item.Takeable;

import models.entities.Entity;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Consumable extends Takeable {
    private StatModifiers statModifiers;

    public Consumable(StatModifiers statModifiers, int price){
        super(price);
        this.statModifiers = statModifiers;
    }

    public StatModifiers getStatModifiers() {
        return statModifiers;
    }

    @Override
    public void onUse(Entity entity) {
        statModifiers.apply(entity.getStats());
    }
}
