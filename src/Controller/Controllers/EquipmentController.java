package Controller.Controllers;

import Controller.Controller;
import State.StateManager;
import State.States.CreationState;
import State.States.EquipmentState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class EquipmentController extends Controller{
    StateManager stateManager;
    EquipmentState state;
    JFrame jFrame;
    public EquipmentController(StateManager stateManager, EquipmentState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
}
