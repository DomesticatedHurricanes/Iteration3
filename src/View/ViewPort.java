package View;

import controllers.ControllerManager;
import State.StateManager;

import javax.swing.*;

/**
 * Created by Dartyx on 4/7/2016.
 */
public abstract class ViewPort implements Runnable {
    boolean alive=false;
    StateManager stateManager;
    ControllerManager controllerManager;
    public ViewPort(){}
    public ViewPort(StateManager stateManager, ControllerManager controllerManager){
        JFrame jFrame = new JFrame();
        //JPanel startMenu
        this.stateManager=stateManager;
        this.controllerManager=controllerManager;
        //controllerManager.setCurrentPanel(jFrame);
        alive=false;
    }
    @Override
    public void run(){
        while(true){
            long startingTime = System.currentTimeMillis();

            //currentStateRender()

            long finishingTime = System.currentTimeMillis();

            double delta = startingTime-finishingTime;
            if(delta<40){
                try {
                    Thread.sleep(((long) (40 - delta)));
                } catch(InterruptedException exception){

                }
            }
            else{
                System.out.println("something fucked up , call the police! (view)");
            }
        }
    }
    public void start(){
        System.out.println("got here");
        new Thread(this).start();
        System.out.println("and here");
    }
}
