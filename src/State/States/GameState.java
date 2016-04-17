package State.States;

import State.State;
import View.StateViews.GameStateView;
import controllers.StateControllers.GameStateController;
import models.Interaction.MovementHandler;
import models.Map.Map;

import State.StateManager;
import models.entities.Avatar;
import models.entities.occupation.Occupation;
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
    private MovementHandler movementHandler;
    private Avatar avatar;
    private Map map;

    public GameState(StateManager stateManager, JFrame jFrame, Occupation occupation){
        super(stateManager, jFrame);
        avatar = new Avatar(occupation);
        avatar.setLocation(new Point3D(1,1,1));
        map = new Map(10,10);
        movementHandler = new MovementHandler(map);
        gameStateView = new GameStateView(map,avatar);
        gameStateController = new GameStateController(this.stateManager,this,jFrame, movementHandler,avatar);
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
    public void render(Graphics g){
        gameStateView.render(g);
    }



}
