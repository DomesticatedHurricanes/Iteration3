package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Equippable.Boots;
import models.stats.StatModifier;
import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum BootsFactory {
    BLUE_BOOTS(new Boots("Blue Boots", new StatModifiers(StatModifier.makeMovementModifier(3)), 3), GraphicAssets.h1),
    RED_BOOTS(new Boots("Red Boots", new StatModifiers(StatModifier.makeMovementModifier(3)), 3), GraphicAssets.h1),
    GREEN_BOOTS(new Boots("Green Boots", new StatModifiers(StatModifier.makeMovementModifier(3)), 3), GraphicAssets.h1);

    private final Boots item;
    private final BufferedImage bufferedImage;

    BootsFactory(Boots item, BufferedImage bufferedImage){
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
