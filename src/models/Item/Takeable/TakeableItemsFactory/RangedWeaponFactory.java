package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Ranged;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum RangedWeaponFactory {
    RangedWeaponFactory(){

    };


    public Item createBlueBow(){
        return new Ranged("Blue Bow and Arrow", new StatModifiers(StatModifier.makeAgilityModifier(Unit.BLUE * Unit.RANGEDWEAPON)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-3)), GraphicAssets.h1);
    }

    public Item createRedBow(){
        return new Ranged("Red Bow and Arrow", new StatModifiers(StatModifier.makeAgilityModifier(Unit.RED * Unit.RANGEDWEAPON)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)), GraphicAssets.h1);
    }

    public Item createGreenBow(){
        return new Ranged("Green Bow and Arrow", new StatModifiers(StatModifier.makeAgilityModifier(Unit.GREEN * Unit.RANGEDWEAPON)), 3,
                new StatModifiers(StatModifier.makeCurrentHpModifier(-5)), GraphicAssets.h1);
    }

}
