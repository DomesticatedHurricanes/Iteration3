package models.Item.Takeable.Equippable;

import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Helmet extends Equippable implements TakeableItemVisitor{

    public Helmet(StatModifiers statModifiers, int price){
        super(statModifiers, price);
    }

    @Override
    public void visit(Avatar avatar) {
        if(avatar.getStats().getLevel() >= lvlReq)
            avatar.equipHelmet(this);
            statModifiers.apply(avatar.getStats());
    }
}
