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

    private static JFrame jFrame;
    private static StateManager instance;
    private StateManager(JFrame jFrame){
        this.jFrame=jFrame;
        this.states = new ArrayList<>();
    }

    public static synchronized StateManager getInstance(JFrame jFrame){
        if (instance == null){
            instance = new StateManager(jFrame);
            init();
        }
        return instance;
    }

    private static void init(){
        // Create states here
        gameState = new GameState(instance,jFrame);
        inventoryState = new InventoryState(instance, jFrame);

        // Set the current state
        currentState = gameState;
        currentState.setActive();
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

    public void setJframe(JFrame jframe){
        this.jFrame=jframe;
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
        System.out.println("well its changing");
        if (currentState != inventoryState){
            currentState.setInactive();
            System.out.println("Changing to inventorystate");
            currentState = inventoryState;
            currentState.setActive();
        }
    }

    public void changeToGameState(){
        System.out.println("well its changing");

        if (currentState != gameState){
            currentState.setInactive();
            System.out.println("Changing to gamestate");
            currentState = gameState;
            currentState.setActive();
        }
    }

    public State getCurrentState(){
        return currentState;
    }

    public void testFunction(){
        System.out.println("HIII");
    }


}

