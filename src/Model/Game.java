package Model;

import Controller.ControllerManager;
import State.StateManager;

/**
 * Created by Dartyx on 4/7/2016.
 */
public class Game implements Runnable {
    boolean alive;
    StateManager stateManager;
    ControllerManager controllerManager;
    public Game(StateManager stateManager,ControllerManager controllerManager){
        this.stateManager=stateManager;
        this.controllerManager=controllerManager;
        alive=false;
    }
    @Override
    public void run(){
        int fps = 60;
        double perTick = 1000000000 / fps;
        double delta = 0;
        long now,then;
        then = System.nanoTime();
        long time = 0;
        int tick = 0;

        while(true){

            now = System.nanoTime();
            delta += (now - then) / perTick;
            time += now - then;
            then = now;

            if( delta>=1 ){System.out.println("tick");
                try{

                }catch(Exception e){

                }
                tick++;
                delta--;
            }

            //currentstateTick

            //catch
            //System.out.println("tick"+tick);
            if(time>1000000000){
                tick = 0;
                time = 0;
            }
        }
    }
    public void start(){
        new Thread(this).start();
    }

}
