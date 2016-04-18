package models.Item.Takeable.Equippable;

import models.stats.StatModifiers;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Weapon extends Equippable {

    StatModifiers enemyEffect;
    public Weapon(String name, StatModifiers statModifiers, int price, StatModifiers enemyEffect, BufferedImage bufferedImage){
        super(name, statModifiers, price, bufferedImage);
        this.enemyEffect = enemyEffect;
    }

    public StatModifiers getEnemyEffect(){
        return this.enemyEffect;
    }
}
