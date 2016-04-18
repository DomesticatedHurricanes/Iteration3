package State.States;

import State.State;
import State.StateManager;
import View.StateViews.SaveView;
import controllers.StateControllers.SaveController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class SaveState extends State {
    private SaveController saveController;
    private SaveView saveView;
    private int select;

    public SaveState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
        saveView = new SaveView();
        saveController = new SaveController(stateManager, this,jFrame);
    }

    @Override
    public void init(){
        saveController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    public void render(Graphics g){
        saveView.render(g,select);
    }
    public void setActive(){
        saveController.addToJframe();;
    }
    public void setInactive(){
        saveController.removeFromJframe();
    }
    public void up(){
        System.out.println(select);
        select--;
        if(select<0)select = 3;
    }
    public void down(){
        select++;
        if(select>3)select = 0;
    }
    public void enter(){
        //System.out.println("enter");

        if(select==0){
            System.out.println("save slot 1");
            //stateManager.changeToCreationState();
        }
        else if(select==1){
            System.out.println("save slot 2");
            //System.out.println("going to load");
            //stateManager.changeToLoadState();
        }
        else if(select==2){
            System.out.println("save slot 3");
            //System.out.println("exitings");
        }
        else if(select==3){
            System.out.println("back");
            stateManager.changeToPauseMenuState();
        }
    }
    public void escape(){
        //System.out.println("huh");
        stateManager.changeToPauseMenuState();
    }

}
