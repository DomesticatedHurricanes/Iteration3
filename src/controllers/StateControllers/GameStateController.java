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
        super();
        this.manager = stateManager;
    }

    public void init(){
        //getKeyMapping().put(Settings.UP,()->System.out.println("up"));
        getKeyMapping().put(Settings.DOWN,()->System.out.println("down"));
        getKeyMapping().put(Settings.LEFT,()->System.out.println("left"));
        getKeyMapping().put(Settings.RIGHT,()->System.out.println("right"));
//        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
//        System.out.println("StateManager: " + manager);
//        System.out.println("Current state: " + manager.getCurrentState());
        getKeyMapping().put(Settings.ESCAPE,()->manager.changeToInventoryState());
        getKeyMapping().put(Settings.P,()->manager.changeToPauseMenuState());
        getKeyMapping().put(Settings.UP,()->manager.testFunction());


        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
        getBindings().add(new Listener(Settings.LEFT, getKeyMapping().get(Settings.LEFT)));
        getBindings().add(new Listener(Settings.RIGHT, getKeyMapping().get(Settings.RIGHT)));
        //getBindings().add(new Listener(Settings.INV, getKeyMapping().get(Settings.INV)));
        getBindings().add(new Listener(Settings.ESCAPE, getKeyMapping().get(Settings.ESCAPE)));
        getBindings().add(new Listener(Settings.P, getKeyMapping().get(Settings.P)));
//        System.out.println("bindings: " + getBindings());

    }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame =jFrame;
        //System.out.print("jframe : " + jFrame);
        this.addToJframe();
    }

    public void update(){
        //System.out.println("Game controller tick");

    }
}
