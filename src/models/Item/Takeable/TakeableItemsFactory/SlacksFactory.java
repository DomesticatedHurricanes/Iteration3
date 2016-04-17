package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.Boots;
import models.Item.Takeable.Equippable.Slacks;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum SlacksFactory {
    BLUE_SLACKS(new Slacks("Blue Slacks", new StatModifiers(StatModifier.makeMovementModifier(Unit.BLUE * Unit.SLACKS)), 3), GraphicAssets.h1),
    RED_SLACKS(new Slacks("Red Slacks", new StatModifiers(StatModifier.makeMovementModifier(Unit.RED * Unit.SLACKS)), 3), GraphicAssets.h1),
    GREEN_SLACKS(new Slacks("Green Slacks", new StatModifiers(StatModifier.makeMovementModifier(Unit.GREEN * Unit.SLACKS)), 3), GraphicAssets.h1);

    private final Slacks item;
    private final BufferedImage bufferedImage;

    SlacksFactory(Slacks item, BufferedImage bufferedImage){
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
