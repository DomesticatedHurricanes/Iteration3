package models.Item.Takeable.Equippable;

import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Ranged extends Equippable implements TakeableItemVisitor {

    public Ranged(StatModifiers statModifiers, int price){
        super(statModifiers, price);
    }

    @Override
    public void visit(Avatar avatar) {
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipRangedWeapon(this);
            statModifiers.apply(avatar.getStats());
        }
    }
}
