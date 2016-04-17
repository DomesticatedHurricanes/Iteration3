package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.OneHandedWeapon;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum OneHandedWeaponFactory {
    BLUE_SWORD(new OneHandedWeapon("Blue Sword", new StatModifiers(StatModifier.makeStrengthModifier(Unit.BLUE * Unit.ONEHANDEDWEAPON * Unit.SWORD)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-3))), GraphicAssets.blueSword),
    RED_SWORD(new OneHandedWeapon("Red Sword", new StatModifiers(StatModifier.makeStrengthModifier(Unit.RED * Unit.ONEHANDEDWEAPON * Unit.SWORD)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-5))), GraphicAssets.redSword),
    GREEN_SWORD(new OneHandedWeapon("Green Sword", new StatModifiers(StatModifier.makeStrengthModifier(Unit.GREEN * Unit.ONEHANDEDWEAPON * Unit.SWORD)), 3,
            new StatModifiers(StatModifier.makeCurrentHpModifier(-7)) ), GraphicAssets.greenSword);

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
