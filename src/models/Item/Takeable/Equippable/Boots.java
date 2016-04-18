package models.Item.Takeable.Equippable;

import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/14/2016.
 */
public class Boots extends Equippable implements TakeableItemVisitor {

    public Boots(String name, StatModifiers statModifiers, int price, BufferedImage bufferedImage){
        super(name, statModifiers, price, bufferedImage);
    }

    @Override
    public void visit(Avatar avatar) {
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipBoots(this);
            statModifiers.apply(avatar.getStats());
        }
    }
}
