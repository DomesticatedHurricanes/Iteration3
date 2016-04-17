package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.EquipmentController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class EquipmentState extends State {
    private EquipmentController equipmentController;
    public EquipmentState(StateManager stateManager, JFrame jFrame) {
        super(stateManager, jFrame);
        this.equipmentController = new EquipmentController(stateManager, this, jFrame);
    }
    public void setActive(){
        equipmentController.addToJframe();
    }

    public void setInactive(){
        equipmentController.removeFromJframe();
    }
    @Override
    public void init(){
        equipmentController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    public void render(Graphics g){

    }
}
