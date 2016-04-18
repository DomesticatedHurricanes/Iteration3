package models.Item.Takeable.TakeableItemsFactory;

import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Item.Takeable.Consumable;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Gloves;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Unit;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/17/2016.
 */
public enum ConsumableFactory {
    HEALTH_POTION(new Consumable("Health Potion", new StatModifiers(StatModifier.makeCurrentHpModifier(5)), 3), GraphicAssets.h1),
    MANA_POTION(new Consumable("Mana Potion", new StatModifiers(StatModifier.makeManaModifier(5)), 3), GraphicAssets.h1);


    private final Consumable item;
    private final BufferedImage bufferedImage;

    ConsumableFactory(Consumable item, BufferedImage bufferedImage){
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
