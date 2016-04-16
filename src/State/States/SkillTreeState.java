package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.SkillTreeController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class SkillTreeState extends State {
    private SkillTreeController skillTreeController;

    public SkillTreeState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
        skillTreeController = new SkillTreeController(stateManager);
    }

    @Override
    public void init(){
        skillTreeController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {
        skillTreeController.update();
    }

    @Override
    protected void render(Graphics g){

    }
}
