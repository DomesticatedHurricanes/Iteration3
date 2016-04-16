package models.Skills;

import models.effects.Effect;
import models.stats.StatusEffect;

/**
 * Created by Breanna on 4/13/16.
 */
public class Projectile {
    private int damage;
    private StatusEffect.statusEffect status;
    //TODO:Make a statusEffects class unrelated to effects/searcher class
    public Projectile(int damage, StatusEffect.statusEffect status) {
        this.damage = damage;
        this.status = status;

    }
    public int getDamage(){
        return damage;
    }

    public StatusEffect.statusEffect getStatus(){
        return status;
    }
}
