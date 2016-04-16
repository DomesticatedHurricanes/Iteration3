package controllers.StateControllers;

import State.StateManager;
import State.States.InventoryState;
import controllers.Controller;
import controllers.Listener;
import utilities.Settings;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class InventoryController extends Controller {
    public InventoryController(JFrame jFrame){
        super(jFrame);
    }

    StateManager stateManager;
    InventoryState state;
    JFrame jFrame;
    public InventoryController(StateManager stateManager, InventoryState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
        getKeyMapping().put(Settings.UP,()->stateManager.changeToGameState());
        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
    }


    public void init() {

        //getKeyMapping().put(Settings.UP,()->stateManager.changeToGameState());
        //getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
    }

    @Override
    public void addJFrame(JFrame jFrame) {
        this.jFrame = jFrame;
        //this.addToJframe();
    }

    @Override
    public void update(){

    }
}
