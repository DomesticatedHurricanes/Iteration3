package models.stats;


import models.entities.Avatar;
import models.entities.Entity;
import models.stats.statusEffect.Invisible;
import models.stats.statusEffect.Sleep;
import utilities.Unit;

import java.util.HashMap;

/**
 * Created by ben on 4/16/16.
 */

//For status effects if a status effect is applied it creates a new object for that status effect
    //when it is done it will reset it within an object that is interfaced
public class StatusEffect {

    protected final int COOLDOWN = 3 * Unit.SECOND;

    public enum statusEffect{
        SLEEP,
        INVISIBLE,
        NONE
    }

    public StatusEffect(){

    }

    public void applyStatusEffect(Entity entity){
        statusEffect status = entity.getStatusEffect();
        if(status==statusEffect.NONE){
            return;//does nothing
        }else if(status == statusEffect.SLEEP){
            new Sleep(entity);
        }else if(status == statusEffect.INVISIBLE){
            new Invisible(entity);
        }else{
            System.out.println("How did you get here?");
        }

    }
    //Do the actual affect of sleeping.
    /*public void applySleep(Entity entity,int speed){
        //TODO:An alternate is to impelement a canMove function and set to you cant
        entity.getStats().modifyMovement(-speed);//This should make an entity stop moving
    }

    public void unapplySleep(Entity entity, int speed){
        entity.getStats().modifyMovement(speed);
    }

    public void sleepEffect(Entity entity){
        int speed = entity.getStats().getMovement();
        applySleep(entity,speed);
        resetSleepStatusEffect(entity,speed);
    }



    public void resetSleepStatusEffect(Entity entity,int speed){
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        unapplySleep(entity,speed);
                        entity.setStatusEffect(statusEffect.NONE);

                    }
                },
                COOLDOWN
        );
    }*/

    public void normalizeEffects(){
        //used to normalize statusEffects
    }
}
