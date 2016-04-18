package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class TakeDamage extends AreaEffect {
    public TakeDamage(){
        this.areaEffectImage = GraphicAssets.takeDamage;
    }
    @Override
    public void activate(Avatar avatar){
        StatModifier takeDamage = StatModifier.makeCurrentHpModifier(-10);
        Stats entityStats = avatar.getStats();
        takeDamage.apply(entityStats);
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.takeDamage;
    }
}
