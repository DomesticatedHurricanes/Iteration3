package View.StateViews;

import State.State;

import java.awt.*;

/**
 * Created by Michael on 4/16/16.
 */
public abstract class StateView {

    public StateView(){

    }

    protected abstract void init();
    public abstract void render(Graphics g);
}
