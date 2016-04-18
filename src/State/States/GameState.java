package State.States;

import State.State;
import View.StateViews.GameStateView;
import controllers.StateControllers.GameStateController;
import models.AreaEffect.*;
import models.Interaction.InteractionHandler;
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
import java.util.*;
import java.util.Timer;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class GameState extends State{

    private GameStateView gameStateView;
    private GameStateController gameStateController;
    private InteractionHandler interactionHandler;
    private MovementHandler movementHandler;
    private Avatar avatar;

    private long startTime;
    private long endTime;
    private Map3D map;

    private Villager villager;
    private ArrayList<Entity> entities;
    private ArrayList<AINpc> aiNpcs;

    //AreaEffect
    private LevelUp levelUp;
    private Teleport teleport;
    private TakeDamage takeDamage;
    private HealDamage healDamage;
    private InstantDeath instantDeath;
    private Trap trap;

    private ArrayList<AreaEffect> areaEffects;


    public Avatar getAvatar() {
        return avatar;
    }

    public GameState(StateManager stateManager, JFrame jFrame, Occupation occupation){
        super(stateManager, jFrame);
        avatar = new Avatar(occupation);
        startTime = System.currentTimeMillis();
        avatar.setLocation(new Point3D(1,1,1));

        map = new Map3D(5);



        villager = new Villager();
        villager.setLocation(new Point3D(12,12,1));


        Pet pet = new Pet();
        pet.setLocation(map.getRelevantTile(15, 15).getPoint3D());


        entities = new ArrayList<>();


        entities.add(avatar);
        entities.add(villager);
        entities.add(pet);


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
        map.getRelevantTile(15,15).insertEntity(pet);
        map.getRelevantTile(14,10).insertAreaEffect(levelUp);
        map.getRelevantTile(14,11).insertAreaEffect(teleport);
        map.getRelevantTile(14,12).insertAreaEffect(takeDamage);
        map.getRelevantTile(14,13).insertAreaEffect(healDamage);
        map.getRelevantTile(14,14).insertAreaEffect(instantDeath);
        map.getRelevantTile(14,15).insertAreaEffect(trap);



        interactionHandler = new InteractionHandler(map);
        interactionHandler.subscribeToAI(pet);
        gameStateView = new GameStateView(map,avatar,entities,areaEffects);
        gameStateController = new GameStateController(this.stateManager,this,jFrame, interactionHandler,avatar);
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
        endTime = System.currentTimeMillis();
        //System.out.println("START TIME: " + startTime);
        //System.out.println("Sdad");
        //System.out.println("END TIME: " + endTime);
        if(endTime - startTime > 5000){
            for(AINpc aiNpc: aiNpcs){
                //System.out.println("New start time");
                aiNpc.makeMove();
                startTime = System.currentTimeMillis();
            }
        }
        gameStateController.update();
    }

    @Override
    public void render(Graphics g){
        gameStateView.render(g);
    }

    public void moveViewNorth(){
        gameStateView.moveViewNorth();
    }

    public void moveViewNorthEast(){
        gameStateView.moveViewNorthEast();
    }

    public void moveViewNorthWest(){
        gameStateView.moveViewNorthWest();
    }

    public void moveViewSouth(){
        gameStateView.moveViewSouth();
    }

    public void moveViewSouthEast(){
        gameStateView.moveViewSouthEast();
    }

    public void moveViewSouthWest(){
        gameStateView.moveViewSouthWest();
    }

    public void stopViewMove(){
        gameStateView.stopViewMove();
    }


}
