package controllers.StateControllers;

import State.StateManager;
import State.States.GameOverState;
import State.States.LoadState;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class LoadController extends Controller {
    StateManager stateManager;
    LoadState state;
    JFrame jFrame;
    public LoadController(StateManager stateManager, LoadState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }

    public void init() { }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame = jFrame;
    }

    @Override
    public void update() {

    }

}
