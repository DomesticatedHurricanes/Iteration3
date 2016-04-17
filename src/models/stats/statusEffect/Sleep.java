package models.stats.statusEffect;

import models.entities.Entity;
import models.stats.StatusEffect;

/**
 * Created by ben on 4/17/16.
 */
public class Sleep extends StatusEffect implements statusEffect{
    private Entity entity;
    private int speed;

    public Sleep(Entity entity){
        this.entity = entity;
        this.speed = entity.getStats().getMovement();
        effect();
    }

    @Override
    public void apply(){
        //TODO:An alternate is to impelement a canMove function and set to you cant
        entity.getStats().modifyMovement(-speed);//This should make an entity stop moving
    }

    @Override
    public void unapply(){
        entity.getStats().modifyMovement(speed);
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
                        entity.setStatusEffect(statusEffect.NONE);

                    }
                },
                COOLDOWN
        );
    }
}
