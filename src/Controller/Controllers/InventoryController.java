package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.CreationState;
import State.States.InventoryState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class InventoryController extends Controller{
    StateManager stateManager;
    InventoryState state;
    JFrame jFrame;
    public InventoryController(StateManager stateManager, InventoryState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
