package models.AreaEffect;

import models.stats.StatModifier;

/**
 * Created by david on 4/12/16.
 */
public class TakeDamage extends AreaEffect {
    @Override
    public void activate(){
        StatModifier TakeDamage = StatModifier.makeCurrentHpModifier(-10);
        //Pass Stats somehow
    }
}
