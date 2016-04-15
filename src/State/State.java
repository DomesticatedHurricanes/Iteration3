package State;

import View.View;
import controllers.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/7/2016.
 */
public abstract class State {
    protected View view;
    protected Controller controller;
    protected StateManager stateManager;

    public State(StateManager stateManager){
        this.stateManager = stateManager;
    }


    protected abstract void update();
    protected abstract void render(Graphics g);
    protected void tick(){

    }
}

