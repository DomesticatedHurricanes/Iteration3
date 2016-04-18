package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Gloves;
import models.Item.Takeable.Equippable.Helmet;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum HelmetFactory {

    HelmetFactory(){

    };


    public Item createBlueHelmet(){
        return new Helmet("Blue Helmet", new StatModifiers(StatModifier.makeHardinessModifier(Unit.BLUE * Unit.HELMET)), 3, GraphicAssets.h1);
    }

    public Item createRedHelmet(){
        return new Helmet("Red Helmet", new StatModifiers(StatModifier.makeHardinessModifier(Unit.RED * Unit.HELMET)), 3, GraphicAssets.h1);
    }

    public Item createGreenHelmet(){
        return new Helmet("Green Helmet", new StatModifiers(StatModifier.makeHardinessModifier(Unit.GREEN * Unit.HELMET)), 3, GraphicAssets.h1);
    }
}
