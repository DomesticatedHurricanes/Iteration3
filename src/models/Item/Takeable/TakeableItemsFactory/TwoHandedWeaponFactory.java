package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.OneHandedWeapon;
import models.Item.Takeable.Equippable.TwoHandedWeapon;
import models.stats.StatModifier;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum TwoHandedWeaponFactory {
    BLUE_KNUCKLES(new TwoHandedWeapon("Blue Knuckles", new StatModifiers(StatModifier.makeStrengthModifier(3)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-3))), GraphicAssets.h1),
    RED_KNUCKLES(new TwoHandedWeapon("Red Knuckles", new StatModifiers(StatModifier.makeStrengthModifier(3)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-5))), GraphicAssets.h1),
    GREEN_KNUCKLES(new TwoHandedWeapon("Green Knuckles", new StatModifiers(StatModifier.makeStrengthModifier(3)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-7)) ), GraphicAssets.h1);

    private final TwoHandedWeapon item;
    private final BufferedImage bufferedImage;

    TwoHandedWeaponFactory(TwoHandedWeapon item, BufferedImage bufferedImage){
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
