package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.CreationController;

import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class CreationState extends State {
    private CreationController creationController;

    public CreationState(StateManager stateManager) { super(stateManager); }

    @Override
    public void init(){
        creationController.init();
    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
