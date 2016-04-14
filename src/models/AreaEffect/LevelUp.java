package models.AreaEffect;

import models.entities.Entity;
import models.stats.StatModifier;

/**
 * Created by david on 4/12/16.
 */
public class LevelUp extends AreaEffect {
    @Override
    public void activate(Entity entity) {
        StatModifier levelUP = StatModifier.makeLevelModifier(1);
        //Pass Stats somehow
    }
}
