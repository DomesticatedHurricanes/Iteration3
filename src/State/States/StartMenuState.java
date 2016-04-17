package State.States;

import State.State;
import State.StateManager;
import View.StateViews.StartMenuView;
import controllers.StateControllers.SkillTreeController;
import controllers.StateControllers.StartMenuController;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class StartMenuState extends State {
    private StartMenuController startMenuController;
    private StartMenuView startMenuView;
    private int select;
    public StartMenuState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);
        startMenuController = new StartMenuController(stateManager,this, jFrame);
        startMenuView = new StartMenuView();
        select=0;
    }
    public void setActive(){
        startMenuController.addToJframe();;
    }
    public void setInactive(){
        startMenuController.removeFromJframe();
    }
    @Override
    public void init(){
        startMenuController.init();

    }

    @Override
    protected void addJFrame(JFrame frame) {

    }

    @Override
    protected void update() {
        startMenuController.update();
    }

    @Override
    public void render(Graphics g){
        startMenuView.render(g,select);
        //stateManager.renderMap(g);
    }
    public void up(){
        System.out.println(select);
        select--;
        if(select<0)select = 2;
    }
    public void down(){
        select++;
        if(select>2)select = 0;
    }
    public void enter(){
        //System.out.println("enter");

        if(select==0){
            //System.out.println("game");
            stateManager.changeToCreationState();
        }
        else if(select==1){
            //System.out.println("going to load");
            //stateManager.changeToLoadState();
        }
        else if(select==2){
            //System.out.println("exitings");
            System.exit(0);
        }
    }
    public void escape(){
        //System.out.println("huh");
        System.exit(0);
    }

}
