package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class HealDamage extends AreaEffect {
    @Override
    public void activate(Entity entity){
        StatModifier healDamage = StatModifier.makeCurrentHpModifier(10);
        Stats enitityStats = entity.getStats();
        healDamage.apply(enitityStats);
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.healDamage;
    }
}
