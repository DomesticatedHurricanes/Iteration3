package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.LoadController;


import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class LoadState extends State {
    private LoadController loadController;

    public LoadState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);}

    @Override
    public void init(){
        loadController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    public
    void render(Graphics g){

    }
}
