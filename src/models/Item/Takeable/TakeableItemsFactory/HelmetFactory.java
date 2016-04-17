package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Helmet;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum HelmetFactory {
    BLUE_HELMET(new Helmet("Blue Helmet", new StatModifiers(StatModifier.makeHardinessModifier(Unit.BLUE * Unit.HELMET)), 3), GraphicAssets.h1),
    RED_HELMET(new Helmet("Red Helmet", new StatModifiers(StatModifier.makeHardinessModifier(Unit.RED * Unit.HELMET)), 3), GraphicAssets.h1),
    GREEN_HELMET(new Helmet("Green Helmet", new StatModifiers(StatModifier.makeHardinessModifier(Unit.GREEN * Unit.HELMET)), 3), GraphicAssets.h1);

    private final Helmet item;
    private final BufferedImage bufferedImage;

    HelmetFactory(Helmet item, BufferedImage bufferedImage){
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
