package models.AreaEffect;

import com.sun.org.apache.bcel.internal.generic.IXOR;
import models.Graphics.GraphicAssets;
import models.entities.Entity;
import models.stats.StatModifier;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class InstantDeath extends AreaEffect {
    public InstantDeath(){
        this.areaEffectImage = GraphicAssets.takeDamage;
    }
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
