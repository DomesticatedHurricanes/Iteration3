package models.AI;

import models.entities.Pet;
import utilities.Point3D;

import java.util.Random;

/**
 * Created by ben on 4/12/16.
 */
public class PetBrain extends AIBrain{

    private boolean isFollowing;
    private Random rand;

    public PetBrain(){
        isFollowing = true;
    }

    public void decideToWander(){
        // Pet will wander off 20% of the time
        rand = new Random();
        boolean chance = rand.nextInt(5) == 0;
        if(chance && isFollowing){   // TODO make sure it doesn't constantly flip-flop; set a time requirement
            isFollowing = false;
        }
        else isFollowing = true;
    }

    // call this function from petInteraction on item encounter
    public boolean decideToSteal(){
        // Pet will try to steal 50% of the time if it encounters an item on the map
        rand = new Random();
        boolean chance = rand.nextInt(2)==0;

        return chance;
    }

    // call this from petInteraction on Monster encounter
    public boolean decideToInstigate(){
        // Pet will instigate 25% of the time if it encounters a monster
        rand = new Random();
        boolean chance = rand.nextInt(4)==0;

        return chance;
    }

    public boolean isFollowing(){
        return isFollowing;
    }

    public void toggleFollow(){
        isFollowing = !isFollowing;
    }

}
