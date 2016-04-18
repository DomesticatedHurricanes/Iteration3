package State.States;

import State.State;
import State.StateManager;
import View.StateViews.PauseMenuStateView;
import controllers.StateControllers.PauseMenuController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class PauseMenuState extends State {
    private PauseMenuStateView pauseMenuStateView;
    private PauseMenuController pauseMenuController;
    private int select;

    public PauseMenuState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
        select = 0;
        pauseMenuStateView = new PauseMenuStateView();
        pauseMenuController = new PauseMenuController(this.stateManager, this, jFrame);
    }

    @Override
    public void init(){
        pauseMenuController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {
        pauseMenuController.addJFrame(frame);
    }

    @Override
    protected void update() {
        pauseMenuController.update();
    }

    @Override
    public void render(Graphics g){
        stateManager.renderMap(g);
        pauseMenuStateView.render(g,select);
    }
    public void setActive(){
        pauseMenuController.addToJframe();;
    }
    public void setInactive(){
        pauseMenuController.removeFromJframe();
    }
    public void up(){
        System.out.println(select);
        select--;
        if(select<0)select = 5;
    }
    public void down(){
        select++;
        if(select>5)select = 0;
    }
    public void enter(){
        //System.out.println("enter");

        if(select==0){
            System.out.println("Resume Game");
            stateManager.changeToGameState();
        }
        else if(select==1){
            System.out.println("Setting");
            stateManager.changeToSettingState();
            //stateManager.changeToLoadState();
        }
        else if(select==2){
            System.out.println("Save Game");
            stateManager.changeToSaveState();
        }
        else if(select==3){
            System.out.println("Load Game");
            stateManager.changeToLoadState();
        }
        else if(select==4){
            System.out.println("Exit to Main Menu");
            stateManager.changeToStartMenuState();
        }
        else if(select==5){
            System.out.println("Exit Game");
            System.exit(0);

        }
    }
    public void escape(){
        //System.out.println("huh");
        stateManager.changeToGameState();
    }
}
