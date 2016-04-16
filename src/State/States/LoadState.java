package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.LoadController;


import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class LoadState extends State {
    private LoadController loadController;

    public LoadState(StateManager stateManager) { super(stateManager); }

    @Override
    public void init(){
        loadController.init();
    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
