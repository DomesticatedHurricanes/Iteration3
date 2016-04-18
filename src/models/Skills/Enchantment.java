package models.Skills;

import models.effects.RadialEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatusEffect;
import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Breanna on 4/13/16.
 */
//Ben got the idea of doing an interface to active skills.  So we can interface the ones we need
    //The problem is do we call a new Enchanment to do it? or just have it as an option
    //and all we do is useSkill?
    //useSkill interface seems good for key presses.
    //I am leaning towards using skills since for the skill viewport we need to activate them somehow
    //In that case when we instantiate skills in occupations the constructor should not instantiate
    //But rather use the interface

public class Enchantment extends ProjectableSkill implements ActiveSkill{

    public Enchantment(){MANACOST = 0;}

    @Override
    public void useSkill(Avatar avatar) {
        useEnchantment(avatar);
    }

    public void useEnchantment(Avatar avatar) {
        //Example of Ring of Operations!
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        projectile = new Projectile(10, StatusEffect.statusEffect.NONE);
        victimize(victims,projectile);
    }

    @Override
    public ArrayList<Point3D> search() {

        Point3D point = new Point3D(0,0,0);
        RadialEffect radialEffect = new RadialEffect(point,3);
        ArrayList<Point3D> affectedPoints;
        affectedPoints=radialEffect.getTilePoints();

        return affectedPoints;
    }



    @Override
    public int calculateDamage(Avatar avatar) {
        return(avatar.getStats().getOffensiveRating());
    }
}
