package State.States;

import Controller.Controllers.GameOverController;
import Controller.Controllers.StartMenuController;
import State.State;
import State.StateManager;

import javax.jws.Oneway;
import javax.swing.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class StartMenuState extends State {
    StateManager stateManager;
    StartMenuController startMenuController;
    public StartMenuState(StateManager stateManager, JFrame jFrame) {
        super(jFrame);
        this.stateManager=stateManager;
        this.startMenuController = new StartMenuController(stateManager,this,jFrame);
        //make view

        }

    public void setActive(){
        startMenuController.addToJframe();
    }

    public void setInactive(){
        startMenuController.removeFromJframe();
    }
}
