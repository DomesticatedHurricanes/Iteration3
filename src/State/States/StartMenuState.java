package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.StartMenuController;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class StartMenuState extends State {
    private StartMenuController startMenuController;

    public StartMenuState(StateManager stateManager){
        super(stateManager);
    }

    @Override
    public void init(){
        startMenuController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {
        startMenuController.update();
    }

    @Override
    protected void render(Graphics g){

    }
}
