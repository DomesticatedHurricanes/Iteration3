package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.CreationState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class CreationController extends Controller {
    StateManager stateManager;
    CreationState state;
    JFrame jFrame;
    public CreationController(StateManager stateManager, CreationState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
