package controllers.StateControllers;

import State.StateManager;
import controllers.Controller;
import controllers.Listener;
import utilities.Settings;

import javax.swing.*;

/**
 * Created by Michael on 4/14/16.
 */
public class GameStateController extends Controller {
    private StateManager manager;

    public GameStateController(StateManager stateManager){
        super();
        this.manager = stateManager;
    }

    public void init(){
//        getKeyMapping().put(Settings.UP,()->System.out.println("up"));
//        getKeyMapping().put(Settings.UP,()->System.out.println("left"));
//        getKeyMapping().put(Settings.UP,()->System.out.println("right"));
//        getKeyMapping().put(Settings.UP,()->System.out.println("down"));
//        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
//        System.out.println("StateManager: " + manager);
//        System.out.println("Current state: " + manager.getCurrentState());
      getKeyMapping().put(Settings.ENTER,()->manager.changeToGameState());


//        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
//        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
//        getBindings().add(new Listener(Settings.LEFT, getKeyMapping().get(Settings.LEFT)));
//        getBindings().add(new Listener(Settings.RIGHT, getKeyMapping().get(Settings.RIGHT)));
        //getBindings().add(new Listener(Settings.INV, getKeyMapping().get(Settings.INV)));
        getBindings().add(new Listener(Settings.ENTER, getKeyMapping().get(Settings.ENTER)));
        System.out.println("bindings: " + getBindings());
        //this.addToJframe();
    }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame =jFrame;
        this.addToJframe();
    }

    public void update(){
        //System.out.println("Game controller tick");

    }
}
