package models.entities.occupation;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by ben on 4/11/16.
 */
public class Smasher implements Occupation{
    @Override
    public void initStats(Stats stats) {
        //Create all the individual StatModifier classes
        StatModifier initMovement = StatModifier.makeMovementModifier(5);
        StatModifier initMaxHP = StatModifier.makeMaxHpModifier(20);
        StatModifier initCurrentHp = StatModifier.makeCurrentHpModifier(10);
        StatModifier initStrength = StatModifier.makeStrengthModifier(10);
        StatModifier initHardiness = StatModifier.makeHardinessModifier(10);
        StatModifier initLives = StatModifier.makeLivesModifier(10);
        StatModifier initAgility = StatModifier.makeAgilityModifier(10);
        StatModifier initIntellect = StatModifier.makeIntellectModifier(10);
        StatModifier initLevel = StatModifier.makeLevelModifier(1);
        StatModifier initMana = StatModifier.makeManaModifier(20);

        //Create a StatModifiers
        StatModifiers initialStats = new StatModifiers(initMovement, initMaxHP,
                initCurrentHp, initStrength, initHardiness, initLives,
                initAgility, initIntellect, initLevel, initMana);

        //Apply all StatModifiers to Stat
        initialStats.apply(stats);
    }

    @Override
    public void initSkills(Avatar avatar) {

    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.smasher;
    }
}
