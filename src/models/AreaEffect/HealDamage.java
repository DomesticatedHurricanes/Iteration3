package models.AreaEffect;

import models.stats.StatModifier;

/**
 * Created by david on 4/12/16.
 */
public class HealDamage extends AreaEffect {
    @Override
    public void activate(){
        StatModifier healDamage = StatModifier.makeHpModifier(10);
        //Pass Stats somehow
    }
}
