package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.CreationState;
import State.States.GameOverState;
import State.States.GameState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class GameController extends Controller{
    StateManager stateManager;
    GameState state;
    JFrame jFrame;
    public GameController(StateManager stateManager, GameState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
