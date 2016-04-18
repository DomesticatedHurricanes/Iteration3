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
public class OneHandedWeapon extends Weapon implements TakeableItemVisitor{

    public OneHandedWeapon(String name, StatModifiers statModifiers, int price, StatModifiers enemyEffect){
        super(name, statModifiers, price, enemyEffect);
    }

    @Override
    public void onUse(Entity entity) {
        Avatar avatar = (Avatar)entity;
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipWeapon(this);
            statModifiers.apply(avatar.getStats());
        }
    }

    @Override
    public void unEquip(Entity entity) {
        Avatar avatar = (Avatar)entity;
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.unequipWeapon();
            statModifiers.remove(avatar.getStats());
        }
    }
}
