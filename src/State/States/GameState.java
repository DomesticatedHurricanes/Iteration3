package State.States;

import Controller.Controllers.GameController;
import Controller.Controllers.GameOverController;
import State.State;
import State.StateManager;

import javax.swing.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class GameState extends State{
    StateManager stateManager;
    GameController gameController;
    public GameState(StateManager stateManager, JFrame jFrame) {
        super(jFrame);
        this.stateManager=stateManager;
        this.gameController = new GameController(stateManager,this,jFrame);
        //make view

    }
}
