package State.States;

import State.State;
import State.StateManager;
import View.StateViews.InventoryStateView;
import controllers.StateControllers.InventoryController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class InventoryState extends State {
    private InventoryStateView inventoryStateView;
    private InventoryController inventoryController;

    public InventoryState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
        inventoryStateView = new InventoryStateView();
        inventoryController = new InventoryController(this.stateManager, this, jFrame);
    }
    public void setActive(){
        inventoryController.addToJframe();
    }

    public void setInactive(){
        inventoryController.removeFromJframe();
    }
    @Override
    public void init(){
        inventoryController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {
        inventoryController.addJFrame(frame);
    }

    @Override
    protected void update() {
        inventoryController.update();
    }

    @Override
    protected void render(Graphics g){
        inventoryStateView.render(g);
    }
}
