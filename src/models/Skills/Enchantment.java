package models.Skills;

import models.effects.RadialEffect;
import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Breanna on 4/13/16.
 */
public class Enchantment extends ProjectableSkill {

    public Enchantment(){
        search();
    }
    public void useEnchantment() {

    }

    @Override
    public Queue<Point3D> search() {
        Point3D pointe = new Point3D(0,0,0);
        RadialEffect radialEffect = new RadialEffect(pointe,3);
        Queue<Point3D> queue = new LinkedList<>();
        ArrayList<Point3D> affectedPoints;
        affectedPoints=radialEffect.getTilePoints();
        /*for(int i = 0;i<affectedPoints.size();i++){
            queue.add(affectedPoints.get(i));
        }*/
        for(Point3D point:affectedPoints){
            queue.add(point);
            System.out.println(point.getX());
        }

        return null;
    }
}
