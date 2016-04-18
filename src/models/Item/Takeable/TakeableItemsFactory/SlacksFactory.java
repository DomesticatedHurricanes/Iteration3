package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.Boots;
import models.Item.Takeable.Equippable.Helmet;
import models.Item.Takeable.Equippable.Slacks;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public class SlacksFactory {

    SlacksFactory() {
    };


    public Item createBlueSlacks(){
        return new Slacks("Blue Slacks", new StatModifiers(StatModifier.makeMovementModifier(Unit.BLUE * Unit.SLACKS)), 3, GraphicAssets.h1);
    }

    public Item createRedSlacks(){
        return new Slacks("Red Slacks", new StatModifiers(StatModifier.makeMovementModifier(Unit.RED * Unit.SLACKS)), 3, GraphicAssets.h1);
    }

    public Item createGreenSlacks(){
        return new Slacks("Green Slacks", new StatModifiers(StatModifier.makeMovementModifier(Unit.GREEN * Unit.SLACKS)), 3, GraphicAssets.h1);
    }
}
