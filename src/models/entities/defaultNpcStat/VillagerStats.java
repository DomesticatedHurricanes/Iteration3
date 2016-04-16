package models.entities.defaultNpcStat;

import models.stats.StatModifier;
import models.stats.StatModifiers;
import models.stats.Stats;

/**
 * Created by Breanna on 4/16/16.
 */
public class VillagerStats implements NPCInitialStats {
    public void initStats(Stats stats) {
        //Create all the individual StatModifier classes
        StatModifier initMovement = StatModifier.makeMovementModifier(0);
        StatModifier initMaxHP = StatModifier.makeMaxHpModifier(5);
        StatModifier initCurrentHp = StatModifier.makeCurrentHpModifier(5);
        StatModifier initStrength = StatModifier.makeStrengthModifier(1);
        StatModifier initHardiness = StatModifier.makeHardinessModifier(1);
        StatModifier initLives = StatModifier.makeStrengthModifier(1);
        StatModifier initAgility = StatModifier.makeAgilityModifier(1);
        StatModifier initIntellect = StatModifier.makeIntellectModifier(1);
        StatModifier initLevel = StatModifier.makeStrengthModifier(1);
        StatModifier initMana = StatModifier.makeManaModifier(1);

        //Create a StatModifiers
        StatModifiers initialStats = new StatModifiers(initMovement, initMaxHP,
                initCurrentHp, initStrength, initHardiness, initLives,
                initAgility, initIntellect, initLevel, initMana);

        //Apply all StatModifiers to Stat
        initialStats.apply(stats);
    }
}
