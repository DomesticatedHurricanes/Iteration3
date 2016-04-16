package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.TradeController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class TradeState extends State {
    private TradeController tradeController;

    public TradeState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
    }

    @Override
    public void init(){
        tradeController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    protected void render(Graphics g){

    }
}
