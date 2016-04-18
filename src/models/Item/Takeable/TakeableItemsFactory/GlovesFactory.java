package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Gloves;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum GlovesFactory {
    BLUE_GLOVES(new Gloves("Blue Gloves", new StatModifiers(StatModifier.makeHardinessModifier(Unit.BLUE * Unit.GLOVES)), 3), GraphicAssets.h1),
    RED_GLOVES(new Gloves("Red Gloves", new StatModifiers(StatModifier.makeHardinessModifier(Unit.RED * Unit.GLOVES)), 3), GraphicAssets.h1),
    GREEN_GLOVES(new Gloves("Green Gloves", new StatModifiers(StatModifier.makeHardinessModifier(Unit.GREEN* Unit.GLOVES)), 3), GraphicAssets.h1);

    private final Gloves item;
    private final BufferedImage bufferedImage;

    GlovesFactory(Gloves item, BufferedImage bufferedImage){
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
