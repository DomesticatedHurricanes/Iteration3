package State.States;

import State.State;
import State.StateManager;
import View.StateViews.LoadView;
import controllers.StateControllers.LoadController;


import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class LoadState extends State {
    private LoadController loadController;
    private LoadView loadView;
    private int select;
    public LoadState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
        loadView = new LoadView();
        loadController = new LoadController(stateManager,this,jFrame);
        select = 0;
    }

    @Override
    public void init(){
        loadController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {

    }

    @Override
    public
    void render(Graphics g){
        loadView.render(g,select);
    }
    public void setActive(){
        loadController.addToJframe();;
    }
    public void setInactive(){
        loadController.removeFromJframe();
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
            System.out.println("load slot 1");
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
