package models.entities;


import models.AI.AIBrain;
import models.Interaction.AIObserver;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Breanna on 4/16/16.
 */
public abstract class AINpc extends NPC {

    private AIBrain aiBrain;
    protected ArrayList<AIObserver> observers = new ArrayList<>();

    public void makeMove(){
        notifyMove(this, aiBrain.changeDirection());
        for(AIObserver aiObserver: observers){
            aiObserver.processMove(this, aiBrain.changeDirection());
        }
    }

    //Add Observer
    public void addObserver(AIObserver observer){
        observers.add(observer);
    }
    public abstract void notifyMove(AINpc aiNpc, Orientation orientation);
    public abstract void notifyThought(AINpc aiNpc);
}
