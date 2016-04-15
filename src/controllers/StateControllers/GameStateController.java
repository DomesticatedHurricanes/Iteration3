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

    public GameStateController(StateManager stateManager){

//        getKeyMapping().put(Settings.UP,()->System.out.println("up"));
//        getKeyMapping().put(Settings.UP,()->System.out.println("left"));
//        getKeyMapping().put(Settings.UP,()->System.out.println("right"));
//        getKeyMapping().put(Settings.UP,()->System.out.println("down"));
//        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
        System.out.println("StateManager: " + stateManager);
       System.out.println("Current state: " + stateManager.getCurrentState());
//       getKeyMapping().put(Settings.ENTER,()->stateManager.changeToGameState());


//        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
//        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
//        getBindings().add(new Listener(Settings.LEFT, getKeyMapping().get(Settings.LEFT)));
//        getBindings().add(new Listener(Settings.RIGHT, getKeyMapping().get(Settings.RIGHT)));
        //getBindings().add(new Listener(Settings.INV, getKeyMapping().get(Settings.INV)));
        //getBindings().add(new Listener(Settings.ENTER, getKeyMapping().get(Settings.ENTER)));
    }

    public void update(){
        //System.out.println("Game controller tick");

    }
}
