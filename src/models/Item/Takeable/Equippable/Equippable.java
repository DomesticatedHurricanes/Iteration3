package models.Item.Takeable.Equippable;

import models.Item.Takeable.Takeable;
import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Equippable extends Takeable implements TakeableItemVisitor {
    protected StatModifiers statModifiers;
    protected int lvlReq;

    public Equippable(String name, StatModifiers statModifiers, int price){
        super(name, price);
        this.statModifiers = statModifiers;
    }

    public StatModifiers getModifier(){
        return this.statModifiers;
    }

    @Override
    public void onUse(Entity entity) {

    }


    @Override
    public void unEquip(Entity entity) {

    }
}
