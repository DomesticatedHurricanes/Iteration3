package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.GameOverController;

import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class GameOverState extends State {
    private GameOverController gameOverController;

    public GameOverState(StateManager stateManager) { super(stateManager); }

    @Override
    public void init(){
        gameOverController.init();
    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }

}
