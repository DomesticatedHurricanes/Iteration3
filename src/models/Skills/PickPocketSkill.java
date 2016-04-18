package models.Skills;

import java.util.ArrayList;
import java.util.Queue;

import models.Inventory.Pack;
import models.Item.Item;
import models.effects.LinearEffect;
import models.entities.Avatar;
import models.entities.Entity;
import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 */

public class PickPocketSkill extends SearchableSkill implements ActiveSkill{

    /*public Queue<Point3D> search() {
        //get points from a function side the search handle.  First down cast
        return new Queue<Point3D>();
    }*/

    @Override
    public void activateSkill(Avatar avatar) {
        useSkill(avatar);
    }

    public PickPocketSkill(){MANACOST = 0;}

    @Override
    public void useSkill(Avatar avatar) {
        usePickPocket(avatar);
    }

    public void usePickPocket(Avatar avatar) {
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        steal(victims,avatar);
    }

    public void steal(ArrayList<Entity> victims,Avatar avatar){
        for(Entity victim:victims){
            /*if(victim.getType()==""){

            }
             */
            Pack victimBackpack = victim.getInventory().getPack();
            int maxItemsInPack = victimBackpack.getAmountOfItemsInPack();
            //Randomize the item stolen in an arraylist
            //assume for now it is at index 0
            int indexPack = 0;
            Item item = victimBackpack.getItemAt(indexPack);
            victimBackpack.removeItem(item);
            Pack avatarBackpack = avatar.getInventory().getPack();
            avatarBackpack.addItem(item);

        }
    }

    @Override
    public ArrayList<Point3D> search() {
        Entity.Orientation orientation = getOrientation();
        Point3D point = new Point3D(0,0,0);
        LinearEffect linearEffect= new LinearEffect(point,1,orientation);
        ArrayList<Point3D> affectedPoints;
        affectedPoints=linearEffect.getTilePoints();

        return affectedPoints;
    }



}
