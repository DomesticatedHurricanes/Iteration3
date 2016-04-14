package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.PauseMenuState;
import State.States.SaveState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class SaveController extends Controller {
    StateManager stateManager;
    SaveState state;
    JFrame jFrame;
    public SaveController(StateManager stateManager, SaveState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
