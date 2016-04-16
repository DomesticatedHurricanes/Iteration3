package State;

import State.States.*;

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
    private static CreationState creationState;
    private static StartMenuState startMenuState;
    private static PauseMenuState pauseMenuState;
    private static SaveState saveState;
    private static EquipmentState equipmentState;
    private static GameOverState gameOverState;
    private static LoadState loadState;
    private static SettingState settingState;
    private static SkillTreeState skillTreeState;
    private static TradeState tradeState;

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
        creationState = new CreationState(instance);
        startMenuState = new StartMenuState(instance);
        pauseMenuState = new PauseMenuState(instance);
        saveState = new SaveState(instance);
        equipmentState = new EquipmentState(instance);
        gameOverState = new GameOverState(instance);
        loadState = new LoadState(instance);
        settingState = new SettingState(instance);
        skillTreeState = new SkillTreeState(instance);
        tradeState = new TradeState(instance);

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

    public void changeToPauseMenuState(){
        if (currentState != pauseMenuState){
            System.out.println("Changing to pausemenustate");
            currentState = pauseMenuState;
        }
    }

    public void changeToCreationState(){
        if (currentState != creationState){
            System.out.println("Changing to creationstate");
            currentState = creationState;
        }
    }

    public void changeToStartMenuState(){
        if (currentState != startMenuState){
            System.out.println("Changing to startmenustate");
            currentState = startMenuState;
        }
    }

    public void changeToSaveState(){
        if (currentState != saveState){
            System.out.println("Changing to savestate");
            currentState = saveState;
        }
    }

    public void changeToEquipmentState(){
        if (currentState != equipmentState){
            System.out.println("Changing to equipmentstate");
            currentState = equipmentState;
        }
    }

    public void changeToGameOverState(){
        if (currentState != gameOverState){
            System.out.println("Changing to gameoverstate");
            currentState = gameOverState;
        }
    }

    public void changeToSettingState(){
        if (currentState != settingState){
            System.out.println("Changing to settingstate");
            currentState = settingState;
        }
    }

    public void changeToSkillTreeState(){
        if (currentState != skillTreeState){
            System.out.println("Changing to skilltreestate");
            currentState = skillTreeState;
        }
    }

    public void changeToTradeState(){
        if (currentState != tradeState){
            System.out.println("Changing to tradestate");
            currentState = tradeState;
        }
    }

    public State getCurrentState(){
        return currentState;
    }

    public void testFunction(){
        System.out.println("HIII");
    }


}

