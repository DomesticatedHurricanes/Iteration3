package State;

import State.States.CreationState;
import State.States.GameState;
import State.States.InventoryState;
import State.States.StartMenuState;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Dartyx on 4/9/2016.
 */
public class StateManager {
    private static ArrayList<State> states;
    private static State currentState;


    private static GameState gameState;
    private static InventoryState inventoryState;
    private CreationState creationState;
    private StartMenuState startMenuState;

    private static StateManager instance;
    private StateManager(){
        this.states = new ArrayList<>();
    }

    public static synchronized StateManager getInstance(){
        if (instance == null){
            instance = new StateManager();
            init();
        }
        return instance;
    }

    private static void init(){
        // Create states here
        gameState = new GameState(instance);
        inventoryState = new InventoryState(instance);

        // Set the current state
        currentState = gameState;

        // Add states to the list
        states.add(gameState);
        states.add(inventoryState);

        //Initialize the states
        initStates();
    }

    private static void initStates(){
        for(State s: states){
            s.init();
        }
    }

    public void updateCurrentState(){
        currentState.update();
    }

    public void renderCurrentState(Graphics g){
        currentState.render(g);
    }

    public void addJFrameToCurrentState(JFrame frame){
        currentState.addJFrame(frame);
    }

    public void changeToInventoryState(){
        if (currentState != inventoryState){
            System.out.println("Changing to inventorystate");
            currentState = inventoryState;
        }
    }

    public void changeToGameState(){
        if (currentState != gameState){
            System.out.println("Changing to gamestate");
            currentState = gameState;
        }
    }

    public State getCurrentState(){
        return currentState;
    }

    public void testFunction(){
        System.out.println("HIII");
    }


}

