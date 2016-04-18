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
    public BootsFactory(){

    }

    public Item createBoots(){
        return new Boots("Boots", new StatModifiers(StatModifier.makeMovementModifier(Unit.BLUE * Unit.BOOTS)), 3, GraphicAssets.boots);
    }


}
