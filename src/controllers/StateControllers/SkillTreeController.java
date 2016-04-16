package controllers.StateControllers;

import State.StateManager;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class SkillTreeController extends Controller {

    public SkillTreeController(StateManager stateManager){
        this.manager = stateManager;
    }

    public void init() { }

    public void update() { }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame = jFrame;
    }
}
