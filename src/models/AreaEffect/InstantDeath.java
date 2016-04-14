package models.AreaEffect;

import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.Stats;

/**
 * Created by david on 4/12/16.
 */
public class InstantDeath extends AreaEffect {
    @Override
    public void activate(Entity entity){
        StatModifier instantDeath = StatModifier.makeLivesModifier(-1);
        Stats enitityStats = entity.getStats();
        instantDeath.apply(enitityStats);
    }
}
