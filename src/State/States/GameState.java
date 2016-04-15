package State.States;

import State.State;
import View.StateViews.GameStateView;
import controllers.StateControllers.GameStateController;
import models.Map.Map;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 4/13/2016.
 */
public class GameState extends State{
    private GameStateView gameStateView;
    private GameStateController gameStateController;
    private Map map;

    public GameState(JFrame jFrame, Map map){
        super(jFrame);
        this.map = map;
        //gameStateView = new GameStateView(map, Graphics g);
        gameStateController = new GameStateController(jFrame);
    }

    @Override
    protected void update() {
        gameStateView.update();
        gameStateController.update();
    }


    public void tick(){

    }

    public void render(Graphics g){

    }
}
