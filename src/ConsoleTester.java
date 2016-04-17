
import models.AreaEffect.AreaEffect;
import models.AreaEffect.Teleport;
import models.AreaEffect.Trap;
import models.Interaction.MovementHandler;
import models.Item.Takeable.Consumable;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Helmet;
import models.Item.Takeable.Takeable;
import models.effects.AngularEffect;

import models.Map.Map3D;

import models.effects.HemiConicalEffect;
import models.effects.LinearEffect;
import models.entities.*;
import models.entities.occupation.Smasher;
import models.stats.*;
import utilities.Point3D;

import java.awt.geom.Area;
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

        /**
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
         **/
        

        Map3D map3D = new Map3D(10);
        Avatar avatar = new Avatar(new Smasher());
        avatar.setLocation(new Point3D(1,1,1));
        MovementHandler movementHandler = new MovementHandler(map3D);
        map3D.insertEnitity(avatar, 1, 1);
        movementHandler.moveNorthWest(avatar);

        // For testing trap and teleport
//        avatar = new Avatar(new Smasher());
//        avatar.setLocation(new Point3D(0,0,0));
//        AreaEffect trap = new Trap();
//        AreaEffect teleport = new Teleport(new Point3D(1,1,1));
//
        // not really sure if trap is working because there's no pause in between trap and move
//        System.out.println(avatar.getLocation());
//        teleport.activate(avatar);
//        System.out.println("hello");
//        System.out.println(avatar.getLocation());
//        trap.activate(avatar);
//        System.out.println("should be stuck for 3 seconds...");
//        movementHandler.moveNorth(avatar);
//        System.out.println(avatar.getLocation());

    }
}
