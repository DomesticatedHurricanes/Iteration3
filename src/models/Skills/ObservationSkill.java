package models.Skills;

import models.effects.RadialEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.CharacterStats;
import models.stats.Stats;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Breanna on 4/13/16.
 */
public class ObservationSkill extends SearchableSkill implements PassiveSkill{
    private Entity target;

    @Override
    public void activateSkill(Avatar avatar) {
        this.avatar = avatar;
    }

    public ObservationSkill(){
        MANACOST = 0;
    }

    public ArrayList<Stats> useObservation(Avatar avatar){
        ArrayList<Point3D> affectedPoints = search();
        ArrayList<Entity> victims = findVictims(affectedPoints);
        ArrayList<Stats> statsArrayList= new ArrayList<>();
        for(Entity victim:victims){
            Stats victimStats = victim.getStats();
            statsArrayList.add(victimStats);
        }
        return statsArrayList;
    }

    @Override
    public void onUpdate(Avatar avatar) {
        useObservation(avatar);//this returns an arraylist of stats for views
    }

    @Override
    public ArrayList<Point3D> search() {
        Point3D point = new Point3D(0,0,0);
        RadialEffect radialEffect = new RadialEffect(point,3);
        ArrayList<Point3D> affectedPoints;
        affectedPoints=radialEffect.getTilePoints();

        return affectedPoints;
    }


    public CharacterStats sendData() { return new CharacterStats(); }
}
