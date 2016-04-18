package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class TakeDamage extends AreaEffect {
    @Override
    public void activate(Entity entity){
        StatModifier takeDamage = StatModifier.makeCurrentHpModifier(-10);
        Stats entityStats = entity.getStats();
        takeDamage.apply(entityStats);
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.takeDamage;
    }
}
