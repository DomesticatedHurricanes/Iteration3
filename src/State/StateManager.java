package State;

import Controller.ControllerManager;
import Controller.Controllers.CreationController;
import Controller.Controllers.StartMenuController;
import State.States.CreationState;
import State.States.GameState;
import State.States.StartMenuState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/9/2016.
 */
public class StateManager {
    JFrame jFrame;
    private CreationState creationState;
    private GameState gameState;
    private StartMenuState startMenuState;
    public StateManager(JFrame jFrame) {
        this.jFrame=jFrame;
        //creationState=new CreationState(JFrame);
        //gameState = new GameState(Jframe);
        startMenuState = new StartMenuState(jFrame);
    }



}

