package State.States;

import State.State;
import State.StateManager;
import controllers.StateControllers.CreationController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class CreationState extends State {
    //StateManager stateManager;
    CreationController creationController;
    public CreationState(StateManager stateManager, JFrame jFrame) {
        super(stateManager,jFrame);
        this.stateManager=stateManager;
        this.creationController = new CreationController(stateManager,this,jFrame);
        //make view

    }

    public void setActive(){
        creationController.addToJframe();
    }

    public void setInactive(){
        creationController.removeFromJframe();
    }
    @Override
    public void init(){
        creationController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    public void render(Graphics g){

    }
}
