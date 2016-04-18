package controllers.StateControllers;

import State.StateManager;
import State.States.GameState;
import controllers.Controller;
import controllers.Listener;
import models.Interaction.MovementHandler;
import models.entities.Avatar;
import models.entities.Entity;
import utilities.Settings;

import javax.swing.*;

/**
 * Created by Michael on 4/14/16.
 */
public class GameStateController extends Controller {
    private MovementHandler movementHandler;
    private StateManager stateManager;
    private Avatar avatar;
    private GameState state;
    private JFrame jFrame;

    public GameStateController(StateManager stateManager, GameState state, JFrame jFrame, MovementHandler movementHandler, Avatar avatar) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
        this.avatar = avatar;
        this.movementHandler = movementHandler;

        initListeners();
    }

    public void init(){
    }

    private void initListeners(){
        getKeyMapping().put(Settings.Up,()->movementHandler.move(avatar, Entity.Orientation.NORTH));
        getKeyMapping().put(Settings.UpRight,()->movementHandler.move(avatar, Entity.Orientation.NORTHEAST));
        getKeyMapping().put(Settings.UpLeft,()->movementHandler.move(avatar, Entity.Orientation.NORTHWEST));
        getKeyMapping().put(Settings.Down,()->movementHandler.move(avatar, Entity.Orientation.SOUTH));
        getKeyMapping().put(Settings.DownRight,()->movementHandler.move(avatar, Entity.Orientation.SOUTHEAST));
        getKeyMapping().put(Settings.DownLeft,()->movementHandler.move(avatar, Entity.Orientation.SOUTHWEST));
        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
        //getKeyMapping().put(Settings.ATTACK1,()->avatar.)


        getBindings().add(new Listener(Settings.Up, getKeyMapping().get(Settings.Up)));
        getBindings().add(new Listener(Settings.Down, getKeyMapping().get(Settings.Down)));
        getBindings().add(new Listener(Settings.DownRight, getKeyMapping().get(Settings.DownRight)));

        getBindings().add(new Listener(Settings.UpRight, getKeyMapping().get(Settings.UpRight)));
        getBindings().add(new Listener(Settings.UpLeft, getKeyMapping().get(Settings.UpLeft)));
        getBindings().add(new Listener(Settings.DownLeft, getKeyMapping().get(Settings.DownLeft)));

        //getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
        //getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
        //getBindings().add(new Listener(Settings.LEFT, getKeyMapping().get(Settings.LEFT)));
        //getBindings().add(new Listener(Settings.RIGHT, getKeyMapping().get(Settings.RIGHT)));
        //getBindings().add(new Listener(Settings.INV, getKeyMapping().get(Settings.INV)));

    }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame =jFrame;
        //System.out.print("jframe : " + jFrame);
        //this.addToJframe();
    }

    public void update(){
        //System.out.println("Game controller tick");

    }
}
