package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.Stats;

import java.awt.image.BufferedImage;

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

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.takeDamage;
    }
}
