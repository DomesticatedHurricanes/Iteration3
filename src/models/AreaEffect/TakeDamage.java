package models.AreaEffect;

import models.entities.Entity;
import models.stats.StatModifier;

/**
 * Created by david on 4/12/16.
 */
public class TakeDamage extends AreaEffect {
    @Override
    public void activate(Entity entity){
        StatModifier TakeDamage = StatModifier.makeCurrentHpModifier(-10);

        //Pass Stats somehow
    }
}
