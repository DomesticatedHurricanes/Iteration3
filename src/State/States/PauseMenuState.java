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


    public PauseMenuState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);

        pauseMenuStateView = new PauseMenuStateView();
        pauseMenuController = new PauseMenuController(this.stateManager, this, jFrame);
    }

    @Override
    public void init(){
        pauseMenuController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {
        pauseMenuController.addJFrame(frame);
    }

    @Override
    protected void update() {
        pauseMenuController.update();
    }

    @Override
    protected void render(Graphics g){
        pauseMenuStateView.render(g);
    }
}
