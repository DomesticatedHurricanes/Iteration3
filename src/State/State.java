package State;

import javax.swing.*;

/**
 * Created by Dartyx on 4/7/2016.
 */
public abstract class State {
    JFrame jFrame;
    public State(JFrame jFrame) {
        this.jFrame=jFrame;
    }
    public void setActive(){}
    public void setInactive(){}
}
