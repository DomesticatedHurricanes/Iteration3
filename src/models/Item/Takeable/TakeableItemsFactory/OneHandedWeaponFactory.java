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
public class OneHandedWeaponFactory {

    OneHandedWeaponFactory(){

    }

    public Item createBlueSword(){
        return new OneHandedWeapon("Blue Sword", new StatModifiers(StatModifier.makeStrengthModifier(Unit.BLUE * Unit.ONEHANDEDWEAPON * Unit.SWORD)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-3)), GraphicAssets.blueSword);
    }

    public Item createRedSword(){
        return new OneHandedWeapon("Red Sword", new StatModifiers(StatModifier.makeStrengthModifier(Unit.RED * Unit.ONEHANDEDWEAPON * Unit.SWORD)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)), GraphicAssets.redSword);
    }

    public Item createGreenSword(){
        return new OneHandedWeapon("Green Sword", new StatModifiers(StatModifier.makeStrengthModifier(Unit.GREEN * Unit.ONEHANDEDWEAPON * Unit.SWORD)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-7)), GraphicAssets.greenSword);
    }
}
