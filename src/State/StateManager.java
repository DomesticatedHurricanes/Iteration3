package State;

import Controller.ControllerManager;
import Controller.Controllers.CreationController;
import Controller.Controllers.StartMenuController;
import State.States.CreationState;
import State.States.GameState;
import State.States.InventoryState;
import State.States.StartMenuState;

import javax.swing.*;

/**
 * Created by Dartyx on 4/9/2016.
 */
public class StateManager {
    JFrame jFrame;
    private CreationState creationState;
    private GameState gameState;
    private StartMenuState startMenuState;
    private State currentState;
    private InventoryState inventoryState;
    public StateManager(JFrame jFrame) {
        this.jFrame=jFrame;
        creationState=new CreationState(this, jFrame);
        gameState = new GameState(this, jFrame);
        startMenuState = new StartMenuState(this, jFrame);
        inventoryState = new InventoryState(this, jFrame);
    }
        public void changeToStartMenuState(){
            if(currentState!=null)currentState.setInactive();
            startMenuState.setActive();
            currentState=startMenuState;
        }
        public void changeToInventoryState(){
        if(currentState!=null)currentState.setInactive();
        inventoryState.setActive();
        currentState=inventoryState;
        }
        public void changeToGameState(){
            if(currentState!=null)currentState.setInactive();
            gameState.setActive();
            currentState=gameState;
        }


}

