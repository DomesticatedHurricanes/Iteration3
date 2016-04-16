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

    public InventoryState(StateManager stateManager){
        super(stateManager);
        inventoryStateView = new InventoryStateView();
        inventoryController = new InventoryController(this.stateManager);
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
