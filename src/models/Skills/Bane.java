package models.Skills;

import models.effects.LinearEffect;
import models.effects.RadialEffect;
import models.entities.Entity;
import models.stats.StatusEffect;
import utilities.Point3D;
import models.entities.Avatar;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Breanna on 4/13/16.
 */
public class Bane extends ProjectableSkill implements ActiveSkill{
    public Bane(){}

    @Override
    public void useSkill(Avatar avatar) {
        useBane(avatar);
    }

    public void useBane(Avatar avatar) {
        //Example of Ring of Operations!
        //Used to calculate damage for avatar
        damage = calculateDamage(avatar);
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        //TODO:When ready, replace the number 10 with damage variable
        projectile = new Projectile(10, StatusEffect.statusEffect.NONE);
        victimize(victims,projectile);
    }

    @Override
    public ArrayList<Point3D> search() {
        Entity.Orientation orientation = getOrientation();
        Point3D point = new Point3D(0,0,0);
        LinearEffect linearEffect= new LinearEffect(point,3,orientation);
        ArrayList<Point3D> affectedPoints;
        affectedPoints=linearEffect.getTilePoints();

        return affectedPoints;

    }

    @Override
    public int calculateDamage(Avatar avatar) {
        return (avatar.getStats().getOffensiveRating());
    }
}
