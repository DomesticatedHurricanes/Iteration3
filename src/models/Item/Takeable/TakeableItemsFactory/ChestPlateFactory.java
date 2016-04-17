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
public enum ChestPlateFactory {
    BLUE_CHEST_PLATE(new ChestPlate("Blue Chest Plate", new StatModifiers(StatModifier.makeHardinessModifier(Unit.BLUE * Unit.CHESTPLATE)), 3), GraphicAssets.h1),
    RED_CHEST_PLATE(new ChestPlate("Red Chest Plate", new StatModifiers(StatModifier.makeHardinessModifier(Unit.RED * Unit.CHESTPLATE)), 3), GraphicAssets.h1),
    GREEN_CHEST_PLATE(new ChestPlate("Green Chest Plate", new StatModifiers(StatModifier.makeHardinessModifier(Unit.GREEN * Unit.CHESTPLATE)), 3), GraphicAssets.h1);

    private final ChestPlate item;
    private final BufferedImage bufferedImage;

    ChestPlateFactory(ChestPlate item, BufferedImage bufferedImage){
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
