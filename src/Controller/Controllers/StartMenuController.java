package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.PauseMenuState;
import State.States.StartMenuState;
import Utilities.Settings;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class StartMenuController extends Controller{
    StateManager stateManager;
    StartMenuState state;
    JFrame jFrame;
    public StartMenuController(StateManager stateManager, StartMenuState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
        getKeyMapping().put(Settings.UP,()->System.out.println("up"));
        getKeyMapping().put(Settings.UP,()->System.out.println("left"));
        getKeyMapping().put(Settings.UP,()->System.out.println("right"));
        getKeyMapping().put(Settings.UP,()->System.out.println("down"));
        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
        getKeyMapping().put(Settings.ENTER,()->stateManager.changeToGameState());


        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
        getBindings().add(new Listener(Settings.LEFT, getKeyMapping().get(Settings.LEFT)));
        getBindings().add(new Listener(Settings.RIGHT, getKeyMapping().get(Settings.RIGHT)));
        getBindings().add(new Listener(Settings.INV, getKeyMapping().get(Settings.INV)));
        getBindings().add(new Listener(Settings.ENTER, getKeyMapping().get(Settings.ENTER)));
    }


}
