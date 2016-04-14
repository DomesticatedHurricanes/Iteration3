package State.States;

import Controller.Controllers.CreationController;
import Controller.Controllers.EquipmentController;
import Controller.Controllers.GameOverController;
import State.StateManager;

import javax.swing.*;

/**
 * Created by Dartyx on 4/14/2016.
 */
public class GameOverState {
    StateManager stateManager;
    GameOverController gameOverController;
    public GameOverState(StateManager stateManager, JFrame jFrame) {
        this.stateManager=stateManager;
        this.gameOverController = new GameOverController(stateManager,this,jFrame);
        //make view

    }
}
