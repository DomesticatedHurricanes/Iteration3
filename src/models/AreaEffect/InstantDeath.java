package models.AreaEffect;

import models.stats.StatModifier;

/**
 * Created by david on 4/12/16.
 */
public class InstantDeath extends AreaEffect {
    @Override
    public void activate(){
        StatModifier instantDeath = StatModifier.makeLivesModifier(-1);
        //Pass Stats somehow
    }
}
