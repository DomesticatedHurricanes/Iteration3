package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.InventoryController;

import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class InventoryState extends State {
    private InventoryController inventoryController;

    public InventoryState(StateManager stateManager) { super(stateManager); }

    @Override
    public void init(){
        inventoryController.init();
    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
