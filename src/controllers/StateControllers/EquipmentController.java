package controllers.StateControllers;

import State.StateManager;
import State.States.EquipmentState;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class EquipmentController extends Controller {
    StateManager stateManager;
    EquipmentState state;
    JFrame jFrame;
    public EquipmentController(StateManager stateManager, EquipmentState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }

    public void init() { }
    @Override
    public void addJFrame(JFrame jFrame) {

    }

    @Override
    public void update() {

    }
}
