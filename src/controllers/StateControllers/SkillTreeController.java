package controllers.StateControllers;

import State.StateManager;
import State.States.GameOverState;
import State.States.SkillTreeState;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class SkillTreeController extends Controller {

    StateManager stateManager;
    SkillTreeState state;
    JFrame jFrame;
    public SkillTreeController(StateManager stateManager, SkillTreeState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
    public void init() { }

    public void update() { }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame = jFrame;
    }
}
