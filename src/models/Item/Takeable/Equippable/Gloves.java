package models.Item.Takeable.Equippable;

import models.Item.Takeable.Takeable;
import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Gloves extends Equippable implements TakeableItemVisitor{

    public Gloves(String name, StatModifiers statModifiers, int price,BufferedImage bufferedImage ){
        super(name, statModifiers, price, bufferedImage);
    }

    @Override
    public void visit(Avatar avatar) {
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipGloves(this);
            statModifiers.apply(avatar.getStats());
        }
    }
}
