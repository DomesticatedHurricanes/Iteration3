package models.entities.defaultNpcStat;

import models.stats.StatModifier;
import models.stats.StatModifiers;
import models.stats.Stats;
/**
 * Created by Breanna on 4/16/16.
 */
public class PetStats implements NPCInitialStats {
    public void initStats(Stats stats) {
        //Create all the individual StatModifier classes
        StatModifier initMovement = StatModifier.makeMovementModifier(5);
        StatModifier initMaxHP = StatModifier.makeMaxHpModifier(10);
        StatModifier initCurrentHp = StatModifier.makeCurrentHpModifier(10);
        StatModifier initStrength = StatModifier.makeStrengthModifier(1);
        StatModifier initHardiness = StatModifier.makeHardinessModifier(5);
        StatModifier initLives = StatModifier.makeLivesModifier(1);

        //Create a StatModifiers
        StatModifiers initialStats = new StatModifiers(initMovement, initMaxHP,
                initCurrentHp, initStrength, initHardiness, initLives);

        //Apply all StatModifiers to Stat
        initialStats.apply(stats);
    }
}
