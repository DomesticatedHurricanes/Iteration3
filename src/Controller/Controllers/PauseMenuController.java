package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.CreationState;
import State.States.PauseMenuState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class PauseMenuController extends Controller{
    StateManager stateManager;
    PauseMenuState state;
    JFrame jFrame;
    public PauseMenuController(StateManager stateManager, PauseMenuState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
