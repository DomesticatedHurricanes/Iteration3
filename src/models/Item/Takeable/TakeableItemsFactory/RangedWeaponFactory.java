package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Ranged;
import models.stats.StatModifier;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum RangedWeaponFactory {
    BLUE_BOWANDARROW(new Ranged("Blue Bow and Arrow", new StatModifiers(StatModifier.makeAgilityModifier(3)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-3)) ), GraphicAssets.h1),
    RED_BOWANDARROW(new Ranged("Red Bow and Arrow", new StatModifiers(StatModifier.makeAgilityModifier(3)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)) ), GraphicAssets.h1),
    GREEN_BOWANDARROW(new Ranged("Green Bow and Arrow", new StatModifiers(StatModifier.makeAgilityModifier(3)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)) ), GraphicAssets.h1);

    private final Ranged item;
    private final BufferedImage bufferedImage;

    RangedWeaponFactory(Ranged item, BufferedImage bufferedImage){
        this.item = item;
        this.bufferedImage = bufferedImage;
    }

    public Item getItem(){
        return item;
    }

    public BufferedImage getBufferedImage(){
        return bufferedImage;
    }
}
