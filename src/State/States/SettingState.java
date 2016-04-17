package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.SettingController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */

public class SettingState extends State {
    private SettingController settingController;

    public SettingState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);}

    @Override
    public void init(){
        settingController.init();
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
