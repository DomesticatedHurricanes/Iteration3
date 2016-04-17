package models.AreaEffect;

import models.entities.Entity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by MyMac on 4/17/16.
 */
public class Trap extends AreaEffect{

    private Timer timer;
    private boolean removed;
    private boolean displayed;  // displayed only after first encounter

    public Trap(){
        timer = new Timer();
        removed = false;
        displayed = false;
    }

    public void removeTrap(){
        removed = true;
        displayed = false;
    }

    // TODO need to take into account Sneak's detect and remove skill
    public void activate(Entity entity){
        if (removed == false) {
            displayed = true;
            entity.setTrapped(true);
            timer.schedule(new TimedTrap(entity), 3000);  // gets frozen for 3 seconds
            entity.setTrapped(false);
        }

    }

    private class TimedTrap extends TimerTask {

        private Entity en;

        public TimedTrap(Entity e){
            this.en = e;
        }

        @Override
        public void run() {
            removeTrap();
        }
    }

}


