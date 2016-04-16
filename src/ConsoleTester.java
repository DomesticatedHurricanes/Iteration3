
import models.Item.Takeable.Consumable;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Helmet;
import models.Item.Takeable.Takeable;
import models.effects.AngularEffect;

import models.Map.Map3D;

import models.effects.HemiConicalEffect;
import models.effects.LinearEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.occupation.Smasher;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){

        /**
        Point3D point = new Point3D(0,0,0);
        HemiConicalEffect hemiConicalEffect= new HemiConicalEffect(point,3, Entity.Orientation.NORTH);
        ArrayList<Point3D> arrayList = hemiConicalEffect.getTilePoints();
        for(Point3D i:arrayList){
            System.out.println(i.getX()+ " "+ i.getY()+" "+i.getZ());
        }

        Map3D map3D = new Map3D(5);
        map3D.testMap();
         **/


        Avatar testing = new Avatar(new Smasher());
        StatModifier agilityMod = StatModifier.makeAgilityModifier(5);
        StatModifier strMod = StatModifier.makeStrengthModifier(5);
        StatModifier health = StatModifier.makeCurrentHpModifier(-5);
        StatModifiers mods = new StatModifiers(agilityMod, strMod);
        Helmet helmet = new Helmet("Gold Helmet", mods, 5);
        Helmet helmet2 = new Helmet("Silver Helmet", new StatModifiers(strMod), 10 );
        Consumable consumable = new Consumable("Potion", new StatModifiers(health), 5);
        ChestPlate c1 = new ChestPlate("Gold Ch", mods, 5);
        ChestPlate c2 = new ChestPlate("Silver Ch", new StatModifiers(strMod), 10 );

        //equipiing and requipping in same spot helmet
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());
        testing.equipHelmet(helmet);
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());
        testing.equipHelmet(helmet2);
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());

        //equipiing and requipping in same spot helmet
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());
        testing.equipChestPlate(c1);
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());
        testing.equipChestPlate(c2);
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());

        //unequip
        testing.unequipHelmet();
        testing.unequipChestPlate();
        testing.getInventory().getEquipment().printInventoryContents();
        System.out.println(testing.getInventory().getPack().getPackContents());

        //add to pack until full
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);
        testing.addItem(consumable);

        //remove item
        testing.removeItem(consumable);
        testing.removeItem(helmet);
        System.out.println(testing.getInventory().getPack().getPackContents());

    }
}
