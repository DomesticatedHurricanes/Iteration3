package models.Item.Takeable.Equippable;

import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class TwoHandedWeapon extends Weapon implements TakeableItemVisitor {

    public TwoHandedWeapon(String name, StatModifiers statModifiers, int price){
        super(name, statModifiers, price);
    }

    @Override
    public void visit(Avatar avatar) {
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipTwoHandedWeapon(this);
            statModifiers.apply(avatar.getStats());
        }
    }
}
