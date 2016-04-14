package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.CreationState;
import State.States.GameOverState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class GameOverController extends Controller{
    StateManager stateManager;
    GameOverState state;
    JFrame jFrame;
    public GameOverController(StateManager stateManager, GameOverState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
