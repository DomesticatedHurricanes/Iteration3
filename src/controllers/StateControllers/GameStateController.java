package controllers.StateControllers;

import State.StateManager;
import State.States.GameState;
import controllers.Controller;
import controllers.Listener;
import models.Interaction.InteractionHandler;
import models.Interaction.MovementHandler;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;
import utilities.Settings;

import javax.swing.*;

/**
 * Created by Michael on 4/14/16.
 */
public class GameStateController extends Controller {
    private InteractionHandler interactionHandler;
    private StateManager stateManager;
    private Avatar avatar;
    private GameState state;
    private Pet pet;
    private JFrame jFrame;

    public GameStateController(StateManager stateManager, GameState state, JFrame jFrame, InteractionHandler interactionHandler, Avatar avatar, Pet pet) {
        super(jFrame);
        this.stateManager = stateManager;
        this.state=state;
        this.jFrame=jFrame;
        this.avatar = avatar;
        this.pet = pet;
        this.interactionHandler = interactionHandler;

        getKeyMapping().put(Settings.Up,()->interactionHandler.move(avatar, Entity.Orientation.NORTH));
        getKeyMapping().put(Settings.UpRight,()->interactionHandler.move(avatar, Entity.Orientation.NORTHEAST));
        getKeyMapping().put(Settings.UpLeft,()->interactionHandler.move(avatar, Entity.Orientation.NORTHWEST));
        getKeyMapping().put(Settings.Down,()->interactionHandler.move(avatar, Entity.Orientation.SOUTH));
        getKeyMapping().put(Settings.DownRight,()->interactionHandler.move(avatar, Entity.Orientation.SOUTHEAST));
        getKeyMapping().put(Settings.DownLeft,()->interactionHandler.move(avatar, Entity.Orientation.SOUTHWEST));
        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
        //getKeyMapping().put(Settings.EQUIP, ()->stateManager.changeToEquipmentState());
        getKeyMapping().put(Settings.ESCAPE, ()->stateManager.changeToPauseMenuState());
        getKeyMapping().put(Settings.ATTACK1, ()-> avatar.useSkillNumber(0));
        getKeyMapping().put(Settings.ATTACK2, ()-> avatar.useSkillNumber(1));
        getKeyMapping().put(Settings.ATTACK3, ()-> avatar.useSkillNumber(2));
        getKeyMapping().put(Settings.Z,()->state.vehicleInteraction());



        getKeyMapping().put(Settings.X,()->state.stopViewMove());
        getKeyMapping().put(Settings.R,()->state.moveViewNorthWest());
        getKeyMapping().put(Settings.T,()->state.moveViewNorth());
        getKeyMapping().put(Settings.Y,()->state.moveViewNorthEast());
        getKeyMapping().put(Settings.F,()->state.moveViewSouthWest());
        getKeyMapping().put(Settings.G,()->state.moveViewSouth());
        getKeyMapping().put(Settings.H,()->state.moveViewSouthEast());


        getBindings().add(new Listener(Settings.X,getKeyMapping().get(Settings.X)));

        getBindings().add(new Listener(Settings.R,getKeyMapping().get(Settings.R)));
        getBindings().add(new Listener(Settings.T,getKeyMapping().get(Settings.T)));
        getBindings().add(new Listener(Settings.Y,getKeyMapping().get(Settings.Y)));
        getBindings().add(new Listener(Settings.F,getKeyMapping().get(Settings.F)));
        getBindings().add(new Listener(Settings.G,getKeyMapping().get(Settings.G)));
        getBindings().add(new Listener(Settings.H,getKeyMapping().get(Settings.H)));

        getBindings().add(new Listener(Settings.Up, getKeyMapping().get(Settings.Up)));
        getBindings().add(new Listener(Settings.Down, getKeyMapping().get(Settings.Down)));
        getBindings().add(new Listener(Settings.DownRight, getKeyMapping().get(Settings.DownRight)));

        getBindings().add(new Listener(Settings.UpRight, getKeyMapping().get(Settings.UpRight)));
        getBindings().add(new Listener(Settings.UpLeft, getKeyMapping().get(Settings.UpLeft)));
        getBindings().add(new Listener(Settings.DownLeft, getKeyMapping().get(Settings.DownLeft)));

        getBindings().add(new Listener(Settings.INV, getKeyMapping().get(Settings.INV)));
        getBindings().add(new Listener(Settings.EQUIP, getKeyMapping().get(Settings.EQUIP)));
        getBindings().add(new Listener(Settings.ESCAPE, getKeyMapping().get(Settings.ESCAPE)));
        getBindings().add(new Listener(Settings.ATTACK1, getKeyMapping().get(Settings.ATTACK1)));
        getBindings().add(new Listener(Settings.Z, getKeyMapping().get(Settings.Z)));

    }

    public void init(){
    }

    private void initListeners(){

        getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());
        getKeyMapping().put(Settings.Z,()->state.vehicleInteraction());


        getKeyMapping().put(Settings.Up,()->interactionHandler.move(avatar, Entity.Orientation.NORTH));
        getKeyMapping().put(Settings.UpRight,()->interactionHandler.move(avatar, Entity.Orientation.NORTHEAST));
        getKeyMapping().put(Settings.UpLeft,()->interactionHandler.move(avatar, Entity.Orientation.NORTHWEST));
        getKeyMapping().put(Settings.Down,()->interactionHandler.move(avatar, Entity.Orientation.SOUTH));
        getKeyMapping().put(Settings.DownRight,()->interactionHandler.move(avatar, Entity.Orientation.SOUTHEAST));
        getKeyMapping().put(Settings.DownLeft,()->interactionHandler.move(avatar, Entity.Orientation.SOUTHWEST));

        getKeyMapping().put(Settings.R,()->state.moveViewNorthWest());
        getKeyMapping().put(Settings.T,()->state.moveViewNorth());
        getKeyMapping().put(Settings.Y,()->state.moveViewNorthEast());
        getKeyMapping().put(Settings.F,()->state.moveViewSouthWest());
        getKeyMapping().put(Settings.G,()->state.moveViewSouth());
        getKeyMapping().put(Settings.H,()->state.moveViewSouthEast());


        getKeyMapping().put(Settings.X,()->state.stopViewMove());

         getKeyMapping().put(Settings.INV,()->stateManager.changeToInventoryState());


        getBindings().add(new Listener(Settings.Up, getKeyMapping().get(Settings.Up)));
        getBindings().add(new Listener(Settings.Down, getKeyMapping().get(Settings.Down)));
        getBindings().add(new Listener(Settings.DownRight, getKeyMapping().get(Settings.DownRight)));

        getBindings().add(new Listener(Settings.UpRight, getKeyMapping().get(Settings.UpRight)));
        getBindings().add(new Listener(Settings.UpLeft, getKeyMapping().get(Settings.UpLeft)));
        getBindings().add(new Listener(Settings.DownLeft, getKeyMapping().get(Settings.DownLeft)));
        getBindings().add(new Listener(Settings.Z, getKeyMapping().get(Settings.Z)));

        getBindings().add(new Listener(Settings.X,getKeyMapping().get(Settings.X)));

        getBindings().add(new Listener(Settings.R,getKeyMapping().get(Settings.R)));
        getBindings().add(new Listener(Settings.T,getKeyMapping().get(Settings.T)));
        getBindings().add(new Listener(Settings.Y,getKeyMapping().get(Settings.Y)));
        getBindings().add(new Listener(Settings.F,getKeyMapping().get(Settings.F)));
        getBindings().add(new Listener(Settings.G,getKeyMapping().get(Settings.G)));
        getBindings().add(new Listener(Settings.H,getKeyMapping().get(Settings.H)));


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
