package models.Item.Takeable.Equippable;

import models.Item.Takeable.TakeableItemVisitor;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class ChestPlate extends Equippable implements TakeableItemVisitor{

    public ChestPlate(String name, StatModifiers statModifiers, int price){
        super(name, statModifiers, price);
    }

    @Override
    public void onUse(Entity entity) {
        Avatar avatar = (Avatar)entity;
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.equipChestPlate(this);
            statModifiers.apply(avatar.getStats());
        }
    }

    @Override
    public void unEquip(Entity entity) {
        Avatar avatar = (Avatar)entity;
        if (avatar.getStats().getLevel() >= lvlReq){
            avatar.unequipChestPlate();
            statModifiers.remove(avatar.getStats());
        }
    }
}
