package models.Item.Takeable.Equippable;

import models.stats.StatModifiers;

/**
 * Created by mazumderm on 4/15/2016.
 */
public class Weapon extends Equippable {

    StatModifiers enemyEffect;
    public Weapon(String name, StatModifiers statModifiers, int price, StatModifiers enemyEffect){
        super(name, statModifiers, price);
        this.enemyEffect = enemyEffect;
    }

    public StatModifiers getEnemyEffect(){
        return this.enemyEffect;
    }
}
