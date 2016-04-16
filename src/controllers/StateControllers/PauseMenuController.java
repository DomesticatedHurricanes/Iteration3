package controllers.StateControllers;

import State.StateManager;
import controllers.Controller;
import controllers.Listener;
import utilities.Settings;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class PauseMenuController extends Controller {
    public PauseMenuController(JFrame jFrame){
        super(jFrame);
    }

    public PauseMenuController(StateManager stateManager){
        super();
        this.manager = stateManager;
    }

    public void init() {
        getKeyMapping().put(Settings.ESCAPE,()->manager.changeToGameState());
        getBindings().add(new Listener(Settings.ESCAPE, getKeyMapping().get(Settings.ESCAPE)));
    }

    @Override
    public void addJFrame(JFrame jFrame) {

    }

    @Override
    public void update() {

    }
}
