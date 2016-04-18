package models.Item.Takeable;

import models.entities.Avatar;
import models.entities.Entity;
import models.entities.TakeableItemVisitable;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Consumable extends Takeable {
    private StatModifiers statModifiers;


    public Consumable(String name, StatModifiers statModifiers, int price, BufferedImage bufferedImage){
        super(name, price, bufferedImage);
        this.statModifiers = statModifiers;
    }

    public StatModifiers getStatModifiers() {
        return statModifiers;
    }

    @Override
    public void onUse(Entity entity) {
        statModifiers.apply(entity.getStats());
    }

    public void apply(Avatar avatar){}
}


