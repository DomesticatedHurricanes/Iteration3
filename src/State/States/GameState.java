package State.States;

import State.State;
import View.StateViews.GameStateView;
import controllers.StateControllers.GameStateController;
import models.Map.Map;

import State.StateManager;
import models.entities.Avatar;
import models.entities.occupation.Smasher;
import utilities.Point3D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class GameState extends State{
    private GameStateView gameStateView;
    private GameStateController gameStateController;
    private Avatar avatar;
    private Map map;


    public GameState(StateManager stateManager, JFrame jFrame){
        super(stateManager, jFrame);


        avatar = new Avatar(new Smasher());
        avatar.setLocation(new Point3D(1,1,1));
        System.out.println("Image: " +  avatar.getEntityImage());
        map = new Map(10,10);

        gameStateView = new GameStateView(map,avatar);
        gameStateController = new GameStateController(this.stateManager,this,jFrame);
    }

    public void setActive(){
        gameStateController.addToJframe();
    }

    public void setInactive(){
        gameStateController.removeFromJframe();
    }
    @Override
    public void init(){
        //gameStateController.init();
    }

    @Override
    protected void addJFrame(JFrame jFrame){
        gameStateController.addJFrame(jFrame);
    }

    @Override
    protected void update() {
        gameStateController.update();
    }

    @Override
    protected void render(Graphics g){
        gameStateView.render(g);
    }



}
