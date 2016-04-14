package State.States;

import Controller.Controllers.EquipmentController;
import State.State;
import State.StateManager;

import javax.swing.*;

/**
 * Created by Dartyx on 4/14/2016.
 */
public class EquipmentState extends State{
    StateManager stateManager;
    EquipmentController equipmentController;
    public EquipmentState(StateManager stateManager, JFrame jFrame) {
        super(jFrame);
        this.equipmentController = new EquipmentController(stateManager,this,jFrame);
        //make view

    }
}
