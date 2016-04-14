package models.entities;

import models.stats.LivingStats;
import models.AI.PetBrain;

/**
 * Created by Breanna on 4/13/16.
 * This class represents the Pet in the game.
 */

public class Pet extends Entity implements Movement {

    private LivingStats petStats;
    private PetBrain petBrain;

    public Pet() {
        this.petBrain = new PetBrain();
        this.petStats = new LivingStats();
    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void traverse() {

    }

    public boolean decideToSteal(){

        return petBrain.decideToSteal();
    }
}
