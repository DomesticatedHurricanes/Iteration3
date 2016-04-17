package models.Skills;

import models.effects.LinearEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Monster;
import models.stats.CharacterStats;
import models.stats.StatusEffect;
import utilities.Point3D;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Breanna on 4/13/16.
 */
public class Brawling extends ProjectableSkill implements ActiveSkill, ActiveMonsterSkill{
    public Brawling(){}

    @Override
    public void useSkill(Avatar avatar) {
        useBrawling(avatar);
    }


    @Override
    public void useSkill(Monster monster) {
        useBrawling(monster);
    }

    public void useBrawling(Avatar avatar) {
        //Example of Ring of Operations!
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        projectile = new Projectile(10, StatusEffect.statusEffect.NONE);
        victimize(victims,projectile);
    }

    public void useBrawling(Monster monster) {
        //Example of Ring of Operations!
        //Uses
        //int damage = calculateDamage(monster);
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        projectile = new Projectile(10, StatusEffect.statusEffect.NONE);
        victimize(victims,projectile);
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



    public int calculateDamage(Monster monster){return(monster.getStats().getOffensiveRating());}

    @Override
    public int calculateDamage(Avatar avatar) {
        return(avatar.getStats().getOffensiveRating());
    }
}
