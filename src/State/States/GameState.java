package State.States;

import State.State;
import View.StateViews.GameStateView;
import controllers.StateControllers.GameStateController;
import models.Interaction.MovementHandler;
import models.Map.Map;

import State.StateManager;
import models.Map.Map3D;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.NPC;
import models.entities.Villager;
import models.entities.occupation.Occupation;
import models.entities.occupation.Smasher;
import utilities.Point3D;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class GameState extends State{

    private GameStateView gameStateView;
    private GameStateController gameStateController;
    private MovementHandler movementHandler;
    private Avatar avatar;

    private Map3D map;

    private Villager villager;
    private ArrayList<Entity> entities;


    public GameState(StateManager stateManager, JFrame jFrame, Occupation occupation){
        super(stateManager, jFrame);
        avatar = new Avatar(occupation);
        avatar.setLocation(new Point3D(1,1,1));

        map = new Map3D(5);


        villager = new Villager();
        villager.setLocation(new Point3D(12,12,1));

        entities = new ArrayList<>();

        entities.add(avatar);
        entities.add(villager);

        //map = new Map(25,25);
        map.getRelevantTile(12,12).insertEntity(villager);


        movementHandler = new MovementHandler(map);
        gameStateView = new GameStateView(map,avatar,entities);
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
