package controllers.StateControllers;

import State.StateManager;
import State.States.GameOverState;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class SettingController extends Controller {
    StateManager stateManager;
    GameOverState state;
    JFrame jFrame;
    public SettingController(StateManager stateManager, GameOverState state, JFrame jFrame) {
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
    public void update(){

    }
}
