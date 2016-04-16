package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.SkillTreeController;

import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class SkillTreeState extends State {
    private SkillTreeController skillTreeController;

    public SkillTreeState(StateManager stateManager) {
        super(stateManager);
        skillTreeController = new SkillTreeController(stateManager);
    }

    @Override
    public void init(){
        skillTreeController.init();
    }

    @Override
    protected void update() {
        skillTreeController.update();
    }

    @Override
    protected void render(Graphics g){

    }
}
