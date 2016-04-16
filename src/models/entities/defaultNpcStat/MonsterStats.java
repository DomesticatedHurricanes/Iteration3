package models.entities.defaultNpcStat;

import models.stats.StatModifier;
import models.stats.StatModifiers;
import models.stats.Stats;
/**
 * Created by Breanna on 4/16/16.
 * This class is used to initialize the default stats for Monsters
 */
public class MonsterStats implements NPCInitialStats {
    public void initStats(Stats stats) {
        //Create all the individual StatModifier classes
        StatModifier initMovement = StatModifier.makeMovementModifier(3);
        StatModifier initMaxHP = StatModifier.makeMaxHpModifier(15);
        StatModifier initCurrentHp = StatModifier.makeCurrentHpModifier(15);
        StatModifier initStrength = StatModifier.makeStrengthModifier(10);
        StatModifier initHardiness = StatModifier.makeHardinessModifier(5);
        StatModifier initLives = StatModifier.makeStrengthModifier(1);
        StatModifier initAgility = StatModifier.makeAgilityModifier(10);
        StatModifier initIntellect = StatModifier.makeIntellectModifier(10);
        StatModifier initLevel = StatModifier.makeStrengthModifier(1);
        StatModifier initMana = StatModifier.makeManaModifier(10);

        //Create a StatModifiers
        StatModifiers initialStats = new StatModifiers(initMovement, initMaxHP,
                initCurrentHp, initStrength, initHardiness, initLives,
                initAgility, initIntellect, initLevel, initMana);

        //Apply all StatModifiers to Stat
        initialStats.apply(stats);
    }
}
