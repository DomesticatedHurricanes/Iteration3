package State;


import java.awt.*;

/**
 * Created by Dartyx on 4/7/2016.
 */
public abstract class State {
    protected StateManager stateManager;

    public State(StateManager stateManager){
        this.stateManager = stateManager;
    }

    public abstract void init();
    protected abstract void update();
    protected abstract void render(Graphics g);

}


