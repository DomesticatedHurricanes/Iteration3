package State.States;

import Controller.Controllers.CreationController;
import Controller.Controllers.EquipmentController;
import State.State;
import State.StateManager;

import javax.swing.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class CreationState extends State{
    StateManager stateManager;
    CreationController creationController;
    public CreationState(StateManager stateManager, JFrame jFrame) {
        super(jFrame);
        this.stateManager=stateManager;
        this.creationController = new CreationController(stateManager,this,jFrame);
        //make view

    }

    public void setActive(){
        creationController.addToJframe();
    }

    public void setInactive(){
        creationController.removeFromJframe();
    }
}
