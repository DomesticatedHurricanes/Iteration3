
import Controller.ControllerManager;
import Model.Game;
import State.StateManager;
import View.ViewPort;

import javax.sound.midi.ControllerEventListener;
import javax.swing.*;

/**
 * Created by Dartyx on 4/7/2016.
 */
public class Main {

    public static void main(String args[]){
        //initialize graphics
        //make stateManager
        JFrame jFrame = new JFrame();
        StateManager stateManager = new StateManager(jFrame);
        //make start menu state
        //make ControllerMananger
        //ControllerManager controllerManager = new ControllerManager();
        //create gameThread
        Game gameThread = new Game(stateManager,null);

        //create viewThread
        ViewPort viewPort = new ViewPort(stateManager,null);

        //initialize stuff

        //make stateManager

        //new state
        //make ControllerMananger



        System.out.println("start" );
        //start threads
        stateManager.changeToStartMenuState();
        gameThread.start();
        viewPort.start();
    }
}
