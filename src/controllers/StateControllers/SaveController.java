package controllers.StateControllers;

import State.StateManager;
import State.States.GameOverState;
import State.States.SaveState;
import controllers.Controller;
import controllers.Listener;
import utilities.Settings;

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
        getKeyMapping().put(Settings.UP,()->state.up());
        getKeyMapping().put(Settings.DOWN,()->state.down());
        getKeyMapping().put(Settings.ENTER,()->state.enter());
        getKeyMapping().put(Settings.ESCAPE,()->state.escape());

        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
        getBindings().add(new Listener(Settings.ENTER, getKeyMapping().get(Settings.ENTER)));
        getBindings().add(new Listener(Settings.ESCAPE, getKeyMapping().get(Settings.ESCAPE)));
    }

    public void init() { }

    @Override
    public void addJFrame(JFrame jFrame) {

    }

    @Override
    public void update() {

    }
}
