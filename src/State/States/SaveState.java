package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.SaveController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class SaveState extends State {
    SaveController saveController;

    public SaveState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
    }

    @Override
    public void init(){
        saveController.init();
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
