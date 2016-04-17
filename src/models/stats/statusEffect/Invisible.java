package models.stats.statusEffect;

import models.entities.Entity;
import models.stats.StatusEffect;

/**
 * Created by ben on 4/17/16.
 */
public class Invisible extends StatusEffect implements statusEffect{
    private int SPEEDCONST= 3;
    private Entity entity;
    private int speed;
    public Invisible(Entity entity){
        this.entity = entity;
        this.speed = entity.getStats().getMovement();
        effect();
    }

    @Override
    public void apply(){
        entity.getStats().modifyMovement(-SPEEDCONST);
    }

    @Override
    public void unapply(){
        entity.getStats().modifyMovement(SPEEDCONST);
    }

    @Override
    public void effect(){
        apply();
        reset();
    }

    @Override
    public void reset(){
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        unapply();
                        entity.setStatusEffect(StatusEffect.statusEffect.NONE);

                    }
                },
                COOLDOWN
        );
    }

}
