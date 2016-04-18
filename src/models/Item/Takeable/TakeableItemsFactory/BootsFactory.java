package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.Boots;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public class BootsFactory {
    BootsFactory(){

    }

    public Item createBlueBoots(){
        return new Boots("Blue Boots", new StatModifiers(StatModifier.makeMovementModifier(Unit.BLUE * Unit.BOOTS)), 3, GraphicAssets.h1);
    }

    public Item createRedBoots(){
        return new Boots("Red Boots", new StatModifiers(StatModifier.makeMovementModifier(Unit.RED * Unit.BOOTS)), 3, GraphicAssets.h1);
    }

    public Item createGreenBoots(){
        return new Boots("Green Boots", new StatModifiers(StatModifier.makeMovementModifier(Unit.GREEN * Unit.BOOTS)), 3, GraphicAssets.h1);
    }
}
