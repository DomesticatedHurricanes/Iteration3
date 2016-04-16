package models.AI;

import models.entities.Monster;
import utilities.Point3D;

import java.awt.*;
import java.util.Random;

/**
 * Created by ben on 4/12/16.
 */
public class MonsterBrain extends AIBrain{

    private boolean isIgnoringAvatar;
    private int aggression;

    public MonsterBrain(){
        isIgnoringAvatar = false;
        // aggression level determines how much the monster seeks out and attacks the Avatar
        aggression = 5; //[1-10]
    }

//     this would be used if Sneak were in creep mode
    public void ignoreAvatar(){
        isIgnoringAvatar = true;
    }
    public void stopIgnoringAvatar(){
        isIgnoringAvatar = false;
    }
    public boolean getIsIgnoringAvatar(){
        return isIgnoringAvatar;
    }

    public void setAggression(int newAggressionLevel){
        // checks that aggression is [1, 10]
        if(newAggressionLevel>=1 && newAggressionLevel<=10){
            aggression = newAggressionLevel;}
        else throw new IndexOutOfBoundsException("Assigned aggression level must belong in range [1, 10].");
    }

    // call this function if Monster is instigated or attacked
    public void incrAggression(){
        if(aggression != 10){
            aggression++;
        }
    }

    public int getAggression(){
        return aggression;
    }

    // based on aggression, this determines if the monster will attack the Avatar
    // True->Will attack
    public boolean decideToAttack(){
        if(!isIgnoringAvatar) {
            Random random = new Random();
            boolean chance = random.nextInt(aggression) == 0;
            return !chance;
        }
        else return false;
    }

}
