package models.AreaEffect;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.LivingStats;
import models.stats.StatModifier;
import models.stats.Stats;

import java.awt.image.BufferedImage;

/**
 * Created by david on 4/12/16.
 */
public class HealDamage extends AreaEffect {
    public HealDamage(){
        this.areaEffectImage = GraphicAssets.healDamage;
    }
    @Override
    public void activate(Avatar avatar){
        StatModifier healDamage = StatModifier.makeCurrentHpModifier(10);
        System.out.println(avatar.getStats().getCurrentHp());
        healDamage.apply(avatar.getStats());
        System.out.println(avatar.getStats().getCurrentHp());
    }

    @Override
    public BufferedImage initImage() {
        return GraphicAssets.healDamage;
    }
}
