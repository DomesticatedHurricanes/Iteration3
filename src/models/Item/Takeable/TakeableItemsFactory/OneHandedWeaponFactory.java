package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.OneHandedWeapon;
import models.stats.StatModifier;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum OneHandedWeaponFactory {
    BLUE_SWORD(new OneHandedWeapon("Blue Chest Plate", new StatModifiers(StatModifier.makeStrengthModifier(3)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-3))), GraphicAssets.h1),
    RED_SWORD(new OneHandedWeapon("Red Chest Plate", new StatModifiers(StatModifier.makeStrengthModifier(3)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-5))), GraphicAssets.h1),
    GREEN_SWORD(new OneHandedWeapon("Green Chest Plate", new StatModifiers(StatModifier.makeStrengthModifier(3)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-7)) ), GraphicAssets.h1);

    private final OneHandedWeapon item;
    private final BufferedImage bufferedImage;

    OneHandedWeaponFactory(OneHandedWeapon item, BufferedImage bufferedImage){
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
