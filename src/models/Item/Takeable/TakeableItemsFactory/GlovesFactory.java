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
public class GlovesFactory {
        GlovesFactory(){

        }

        public Item createBlueGloves(){
        return new Gloves("Blue Gloves", new StatModifiers(StatModifier.makeHardinessModifier(Unit.BLUE * Unit.GLOVES)), 3, GraphicAssets.h1);
        }

       public Item createRedGloves(){
        return new Gloves("Red Gloves", new StatModifiers(StatModifier.makeHardinessModifier(Unit.RED * Unit.GLOVES)), 3, GraphicAssets.h1);
        }

       public Item createGreenGloves(){
        return new Gloves("Green Gloves", new StatModifiers(StatModifier.makeHardinessModifier(Unit.GREEN* Unit.GLOVES)), 3, GraphicAssets.h1);
        }
}
