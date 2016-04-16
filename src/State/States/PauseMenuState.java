package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.PauseMenuController;

import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class PauseMenuState extends State {
    private PauseMenuController pauseMenuController;

    public PauseMenuState(StateManager stateManager) { super(stateManager); }

    @Override
    public void init(){
        pauseMenuController.init();
    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
