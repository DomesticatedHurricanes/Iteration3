package models.AreaEffect;

import models.entities.Entity;
import models.stats.StatModifier;

/**
 * Created by david on 4/12/16.
 */
public class InstantDeath extends AreaEffect {
    @Override
    public void activate(Entity entity){
        StatModifier instantDeath = StatModifier.makeLivesModifier(-1);
        //Pass Stats somehow
    }
}
