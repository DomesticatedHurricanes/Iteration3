package State;


import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/7/2016.
 */
public abstract class State {
    protected StateManager stateManager;
    protected JFrame jFrame;
    public State(StateManager stateManager, JFrame jFrame){
        this.stateManager = stateManager;
        this.jFrame = jFrame;
    }

    public abstract void init();
    protected abstract void addJFrame(JFrame frame);
    protected abstract void update();
    protected abstract void render(Graphics g);
    public void setActive(){}
    public void setInactive(){}


}


