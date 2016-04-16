package State;

import State.States.CreationState;
import State.States.GameState;
import State.States.StartMenuState;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Dartyx on 4/9/2016.
 */
public class StateManager {
    private ArrayList<State> states;
    private State currentState;

    private CreationState creationState;
    private GameState gameState;
    private StartMenuState startMenuState;

    private static StateManager instance;
    private StateManager(){
        this.states = new ArrayList<>();
        this.gameState = new GameState(instance);

        // initialize the list of states
        init();

        // set the current state
        this.currentState = gameState;

    }

    public static synchronized StateManager getInstance(){
        if (instance == null){
            instance = new StateManager();
        }
        return instance;
    }



    private void init(){
        states.add(gameState);
    }

    public void updateCurrentState(){
        currentState.update();
    }

    public void renderCurrentState(Graphics g){
        currentState.render(g);
    }

    public void changeToInventoryState(){
        currentState = null;
    }

    public void changeToGameState(){
        currentState = null;
    }





}

