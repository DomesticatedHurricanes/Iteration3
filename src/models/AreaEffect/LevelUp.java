package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class LevelUp extends AreaEffect {
    @Override
    public void activate(Entity entity) {
        StatModifier levelUp = StatModifier.makeLevelModifier(1);
        Stats enitityStats = entity.getStats();
        levelUp.apply(enitityStats);
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.levelUp;
    }
}
