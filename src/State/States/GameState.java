package State.States;

import State.State;
import View.StateViews.GameStateView;
import controllers.StateControllers.GameStateController;
import models.AreaEffect.*;
import models.Graphics.GraphicAssets;
import models.Interaction.MovementHandler;
import models.Item.Takeable.Equippable.Boots;
import models.Map.Map;

import State.StateManager;
import models.Map.Map3D;
import models.entities.*;
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

    private Vehicle vehicle;
    private Villager villager;
    private ArrayList<Entity> entities;

    private boolean mounted = false;

    //AreaEffect
    private LevelUp levelUp;
    private Teleport teleport;
    private TakeDamage takeDamage;
    private HealDamage healDamage;
    private InstantDeath instantDeath;
    private Trap trap;

    private ArrayList<AreaEffect> areaEffects;


    public GameState(StateManager stateManager, JFrame jFrame, Occupation occupation){
        super(stateManager, jFrame);
        avatar = new Avatar(occupation);
        avatar.setLocation(new Point3D(1,1,1));

        map = new Map3D(5);


        villager = new Villager();
        villager.setLocation(new Point3D(12,12,1));

        vehicle = new Vehicle(10);
        vehicle.setLocation(new Point3D(4,6,4));



        entities = new ArrayList<>();

        entities.add(avatar);
        entities.add(villager);
        entities.add(vehicle);


        //AreaEffects
        areaEffects = new ArrayList<>();
        teleport = new Teleport(map.getRelevantTile(10,10), map);
        takeDamage = new TakeDamage();
        healDamage = new HealDamage();
        instantDeath = new InstantDeath();
        levelUp = new LevelUp();
        trap = new Trap();

        areaEffects.add(levelUp);
        areaEffects.add(teleport);
        areaEffects.add(takeDamage);
        areaEffects.add(healDamage);
        areaEffects.add(instantDeath);
        areaEffects.add(trap);

        map = new Map3D(5);


        //map = new Map(25,25);
        //Here is where you insert things into the map

        //levelUp.setLocation(map.getRelevantTile(2,2).getPoint3D());
        //teleport.setLocation(map.getRelevantTile());

        map.getRelevantTile(12,12).insertEntity(villager);
        map.getRelevantTile(4,4).insertEntity(vehicle);
        map.getRelevantTile(14,10).insertAreaEffect(levelUp);
        map.getRelevantTile(14,11).insertAreaEffect(teleport);
        map.getRelevantTile(14,12).insertAreaEffect(takeDamage);
        map.getRelevantTile(14,13).insertAreaEffect(healDamage);
        map.getRelevantTile(14,14).insertAreaEffect(instantDeath);
        map.getRelevantTile(14,15).insertAreaEffect(trap);


        movementHandler = new MovementHandler(map);
        gameStateView = new GameStateView(map,avatar,entities,areaEffects);
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

    public void vehicleInteraction(){ // add check that vehicle is nextdoor
      // if((avatar.getLocation() == vehicle.getLocation())
        {
            if (!mounted) {
                mounted = true;
                avatar.rideMount(vehicle);
                System.out.print("Riding mount");

            } else {
                mounted = false;
                avatar.dismount(vehicle);
                System.out.print("Dismounted");
            }
        }
    }


}
