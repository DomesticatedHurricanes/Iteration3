package State.States;

import State.State;
import State.StateManager;
import View.StateViews.SkillTreeView;
import controllers.StateControllers.SkillTreeController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class SkillTreeState extends State {
    private SkillTreeController skillTreeController;
    private int select;
    private SkillTreeView skillTreeView;
    public SkillTreeState(StateManager stateManager, JFrame jFrame,int ayy){
        super(stateManager, jFrame);
        skillTreeController = new SkillTreeController(stateManager,this, jFrame);
        skillTreeView = new SkillTreeView(ayy);

    }

    @Override
    public void init(){
        skillTreeController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {

    }
    public void setActive(){
        skillTreeController.addToJframe();;
    }
    public void setInactive(){
        skillTreeController.removeFromJframe();
    }
    @Override
    protected void update() {
        skillTreeController.update();
    }


    @Override
    public void render(Graphics g){
        skillTreeView.render(g,select);
        //stateManager.renderMap(g);
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
