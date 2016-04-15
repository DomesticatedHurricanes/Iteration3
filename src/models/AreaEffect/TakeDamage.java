package models.AreaEffect;

import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.Stats;

/**
 * Created by david on 4/12/16.
 */
public class TakeDamage extends AreaEffect {
    @Override
    public void activate(Entity entity){
        StatModifier takeDamage = StatModifier.makeCurrentHpModifier(-10);
        Stats enitityStats = entity.getStats();
        takeDamage.apply(enitityStats);
    }
}