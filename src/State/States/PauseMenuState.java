package State.States;

import State.State;
import State.StateManager;
import View.StateViews.PauseMenuStateView;
import controllers.StateControllers.PauseMenuController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class PauseMenuState extends State {
    private PauseMenuStateView pauseMenuStateView;
    private PauseMenuController pauseMenuController;

    public PauseMenuState(StateManager stateManager) {
        super(stateManager);
        pauseMenuStateView = new PauseMenuStateView();
        pauseMenuController = new PauseMenuController(this.stateManager);
    }

    @Override
    public void init(){
        pauseMenuController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
