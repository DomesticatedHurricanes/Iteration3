package controllers.StateControllers;

import State.StateManager;
import State.States.GameOverState;
import State.States.TradeState;
import controllers.Controller;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class TradeController extends Controller{
    StateManager stateManager;
    TradeState state;
    JFrame jFrame;
    public TradeController(StateManager stateManager, TradeState state, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
    }
    public void init() { }

    @Override
    public void addJFrame(JFrame jFrame) {

    }

    @Override
    public void update() {

    }
}
