package models.Item.Takeable.Equippable;

import models.Item.Takeable.Takeable;
import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.stats.StatModifier;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class OneHandedWeapon extends Weapon implements TakeableItemVisitor{

    public OneHandedWeapon(String name, StatModifiers statModifiers, int price, StatModifiers enemyEffect, BufferedImage bufferedImage){
        super(name, statModifiers, price, enemyEffect, bufferedImage);
    }

    @Override
    public void visit(Avatar avatar) {
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipWeapon(this);
            statModifiers.apply(avatar.getStats());
        }
    }
}
