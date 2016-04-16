package models.Item.Takeable.Equippable;

import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/14/2016.
 */
public class Slacks extends Equippable implements TakeableItemVisitor {

    public Slacks(String name, StatModifiers statModifiers, int price){
        super(name, statModifiers, price);
    }

    @Override
    public void visit(Avatar avatar) {
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipSlacks(this);
            statModifiers.apply(avatar.getStats());
        }
    }
}
