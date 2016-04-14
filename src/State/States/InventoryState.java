package State.States;

import Controller.Controllers.GameOverController;
import Controller.Controllers.InventoryController;
import State.State;
import State.StateManager;

import javax.swing.*;

/**
 * Created by Dartyx on 4/14/2016.
 */
public class InventoryState extends State{
    StateManager stateManager;
    InventoryController inventoryController;
    public InventoryState(StateManager stateManager, JFrame jFrame) {
        super(jFrame);
        this.stateManager=stateManager;
        this.inventoryController = new InventoryController(stateManager,this,jFrame);
        //make view

    }
}
