package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.EquipmentController;

import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class EquipmentState extends State {
    private EquipmentController equipmentController;

    public EquipmentState(StateManager stateManager) { super(stateManager); }

    @Override
    public void init(){
        equipmentController.init();
    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
