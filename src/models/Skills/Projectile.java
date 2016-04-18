package models.Skills;

import models.effects.Effect;
import models.stats.StatusEffect;

import java.awt.image.BufferedImage;

/**
 * Created by Breanna on 4/13/16.
 */
public class Projectile {
    private int damage;
    private StatusEffect.statusEffect status;
    private BufferedImage bufferedImage;
    //TODO:Make a statusEffects class unrelated to effects/searcher class
    public Projectile(int damage, StatusEffect.statusEffect status) {
        this.damage = damage;
        this.status = status;

    }

    public Projectile(int damage, StatusEffect.statusEffect status, BufferedImage bufferedImage){
        this.damage = damage;
        this.status = status;
        this.bufferedImage = bufferedImage;
    }
    public int getDamage(){
        return damage;
    }

    public StatusEffect.statusEffect getStatus(){
        return status;
    }

    public BufferedImage getProjectileImage(){
        return bufferedImage;
    }

}
