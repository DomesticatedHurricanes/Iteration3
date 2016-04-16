package controllers.StateControllers;

import State.StateManager;
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

    public InventoryController(StateManager stateManager){
        super();
        this.manager = stateManager;
    }


    public void init() {

        getKeyMapping().put(Settings.UP,()->manager.changeToGameState());
        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
    }

    @Override
    public void addJFrame(JFrame jFrame) {
        this.jFrame = jFrame;
        this.addToJframe();
    }

    @Override
    public void update(){

    }
}
