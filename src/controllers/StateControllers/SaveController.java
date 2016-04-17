package controllers.StateControllers;

import State.StateManager;
import State.States.GameOverState;
import State.States.SaveState;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
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

    public void init() { }

    @Override
    public void addJFrame(JFrame jFrame) {

    }

    @Override
    public void update() {

    }
}
