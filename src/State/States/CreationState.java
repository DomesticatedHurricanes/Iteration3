package State.States;

import State.State;
import State.StateManager;
import View.StateViews.CreationView;
import controllers.StateControllers.CreationController;
import models.entities.occupation.Smasher;
import models.entities.occupation.Sneak;
import models.entities.occupation.Summoner;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class CreationState extends State {
    //StateManager stateManager;
    CreationController creationController;
    CreationView creationView;
    int select;
    public CreationState(StateManager stateManager, JFrame jFrame) {
        super(stateManager,jFrame);
        this.stateManager=stateManager;
        this.creationController = new CreationController(stateManager,this,jFrame);
        this.creationView = new CreationView();
        //make view
        select = 0;
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
        creationView.render(g,select);
    }
    public void right(){
        System.out.println(select);
        select++;
        if(select>2)select = 0;
    }
    public void left(){
        select--;
        if(select<0)select = 2;
    }
    public void enter(){
        //System.out.println("enter");

        if(select==0){
            stateManager.makeGameState(new Smasher());
            stateManager.changeToGameState();
        }
        else if(select==1){
            stateManager.makeGameState(new Sneak());
            stateManager.changeToGameState();
        }
        else if(select==2){
            stateManager.makeGameState(new Summoner());
            stateManager.changeToGameState();
        }
    }
    public void escape(){
        //System.out.println("huh");
        System.exit(0);
    }
}
