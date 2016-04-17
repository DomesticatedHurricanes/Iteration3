package models.Skills;

import models.effects.LinearEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatusEffect;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Breanna on 4/13/16.
 */
public class CreepSkill extends ProjectableSkill implements ActiveSkill{

    @Override
    public void useSkill(Avatar avatar) {
//If not invisible use invisible
        useCreep(avatar);
        //else use back stab
    }


    public void useCreep(Avatar avatar){
        if(avatar.getStatusEffect() != StatusEffect.statusEffect.INVISIBLE){
            useBackStab(avatar);
        }
        else{
            useInvisible(avatar);
        }
    }

    public void useBackStab(Avatar avatar) {
        damage = calculateDamage(avatar);
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        projectile = new Projectile(damage, StatusEffect.statusEffect.NONE);
        victimize(victims,projectile);

        avatar.setStatusEffect(StatusEffect.statusEffect.NONE);//become visible
    }

    public void useInvisible(Avatar avatar) {
        avatar.setStatusEffect(StatusEffect.statusEffect.INVISIBLE);
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

    @Override
    public int calculateDamage(Avatar avatar) {
        return (avatar.getStats().getOffensiveRating()*2);
    }
}
