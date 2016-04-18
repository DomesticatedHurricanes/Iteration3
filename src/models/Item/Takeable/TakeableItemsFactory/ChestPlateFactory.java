package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.Boots;
import models.Item.Takeable.Equippable.ChestPlate;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public class ChestPlateFactory {
    ChestPlateFactory(){

    };


    public Item createBlueChestPlate(){
        return new ChestPlate("Blue Chest Plate", new StatModifiers(StatModifier.makeHardinessModifier(Unit.BLUE * Unit.CHESTPLATE)), 3, GraphicAssets.h1);
    }

    public Item createRedChestPlate(){
        return new ChestPlate("Red Chest Plate", new StatModifiers(StatModifier.makeHardinessModifier(Unit.RED * Unit.CHESTPLATE)), 3, GraphicAssets.h1);
    }

    public Item createGreenChestPlate(){
        return new ChestPlate("Green Chest Plate", new StatModifiers(StatModifier.makeHardinessModifier(Unit.GREEN * Unit.CHESTPLATE)), 3, GraphicAssets.h1);
    }
}
