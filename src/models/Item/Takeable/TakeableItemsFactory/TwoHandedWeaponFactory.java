package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.OneHandedWeapon;
import models.Item.Takeable.Equippable.TwoHandedWeapon;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public class TwoHandedWeaponFactory {

    TwoHandedWeaponFactory(){

    };


    public Item createBlueKnuckles(){
        return new TwoHandedWeapon("Blue Knuckles", new StatModifiers(StatModifier.makeStrengthModifier(Unit.BLUE * Unit.TWOHANDEDWEAPON)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-3)), GraphicAssets.h1);
    }

    public Item createRedKnuckles(){
        return new TwoHandedWeapon("Red Knuckles", new StatModifiers(StatModifier.makeStrengthModifier(Unit.RED * Unit.TWOHANDEDWEAPON)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)), GraphicAssets.h1);
    }

    public Item createGreenKnuckles(){
        return new TwoHandedWeapon("Red Knuckles", new StatModifiers(StatModifier.makeStrengthModifier(Unit.RED * Unit.TWOHANDEDWEAPON)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)), GraphicAssets.h1);
    }
}
